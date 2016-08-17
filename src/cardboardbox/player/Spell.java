/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboardbox.player;

import java.io.Serializable;

/**
 *
 * @author egand
 */
public class Spell implements Serializable{
    private int id;
    private String name;
    private String description;
    private int cost;
    public Spell(){
    }
    public Spell(int id, String name, String description, int cost){
        this.id = id;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public int getExpCost(){
        return this.cost;
    }
    public int getID(){
        return this.id;
    }

    
}
