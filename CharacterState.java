/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboardbox.player;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author egand
 */
public class CharacterState implements Serializable{
    private int totalExp;
    private int currentExp;
    private int spentExp;
    private int level;
    private int threshold;
    private String charClass;
    private ArrayList<Feats> feats;
    public CharacterState(){
        this.currentExp = 0;
        this.spentExp = 0;
        this.threshold = 100;//placeholder value;
        tot();
        this.level = 1;
        this.charClass = "Undetermined";
    }
    public void construct(int curr, int spent, int level, int threshold, String job, ArrayList<Feats> feats){
        this.currentExp = curr;
        this.spentExp = spent;
        tot();
        this.level = level;
        this.threshold = threshold;
        this.charClass = job;
        this.feats = feats;        
    }
    private void tot(){
        this.totalExp=(this.getCurrentExp()+this.getSpentExp());
    }
    public int addExp(int gain){
        this.currentExp+=gain;
        tot();
        if(getTotalExp()>getThreshold()){
            level++;
            threshold+=((int)Math.pow(getThreshold(), 1.1));
        }
        return getTotalExp();
    }
    public ArrayList<Feats> getFeats(){
        return this.feats;
    }
    public void addFeat(Feats feat){
        this.feats.add(feat);
    }

    /**
     * @return the totalExp
     */
    public int getTotalExp() {
        return totalExp;
    }

    /**
     * @return the currentExp
     */
    public int getCurrentExp() {
        return currentExp;
    }

    /**
     * @return the spentExp
     */
    public int getSpentExp() {
        return spentExp;
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @return the threshold
     */
    public int getThreshold() {
        return threshold;
    }

    /**
     * @return the charClass
     */
    public String getCharClass() {
        return charClass;
    }

    
}
