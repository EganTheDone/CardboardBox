/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboardbox.player.heroicSkills;

import java.io.Serializable;

/**
 *
 * @author egand
 */
public class Melee implements Serializable{
    private int assault;
    private int rush;
    private int shift;
    private int bait;
    private int rank;
    
    public Melee(){
        
    }
    public Melee(int[] array){
        this.assault = array[0];
        this.rush = array[1];
        this.shift = array[2];
        this.bait = array[3];
        this.rank = array[4];
    }
    public Melee clear(){
        return new Melee();
    }
    public Melee exportSkill(){
        return this;
    }

    /**
     * @return the assault
     */
    public int getAssault() {
        return assault;
    }

    /**
     * @param assault the assault to set
     */
    public void setAssault(int assault) {
        this.assault = assault;
    }

    /**
     * @return the rush
     */
    public int getRush() {
        return rush;
    }

    /**
     * @param rush the rush to set
     */
    public void setRush(int rush) {
        this.rush = rush;
    }

    /**
     * @return the shift
     */
    public int getShift() {
        return shift;
    }

    /**
     * @param shift the shift to set
     */
    public void setShift(int shift) {
        this.shift = shift;
    }

    /**
     * @return the bait
     */
    public int getBait() {
        return bait;
    }

    /**
     * @param bait the bait to set
     */
    public void setBait(int bait) {
        this.bait = bait;
    }

    /**
     * @return the rank
     */
    public int getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(int rank) {
        this.rank = rank;
    }
}
