/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboardbox.player;

import java.io.Serializable;
import static java.lang.String.valueOf;


/**
 *
 * @author egand
 */
public class Feats implements Serializable{
    private final String name;
    private final String description;
    private final int cost;
    private final String category;
    public Feats(String name, String description, int cost, String category){
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.category = category;
    }
    public String FITS(){
        StringBuilder buffer = new StringBuilder();
        buffer.append("Feat: ").append(this.name);
        buffer.append("\nDescription: ").append(this.description);
        buffer.append("\nExperience Cost: ").append(this.cost);
        buffer.append("\nCategory: ").append(this.category);
        return buffer.toString();
    }
    public String[] rawFF(){
        String arr[] = {this.name, this.description, valueOf(this.cost), this.category};  
        return arr;
    }
    public String getSimple(){
        String feat = this.name.concat(": "+this.description);
        return feat;
    }
    
}
