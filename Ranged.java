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
public class Ranged implements Serializable{
    private int fire;
    private int hamper;
    private int disengage;
    private int mark;
    private int rank;
    public Ranged(){
        
    }
    public Ranged(int[] array){
        this.fire = array[0];
        this.hamper = array[1];
        this.disengage = array[2];
        this.mark = array[3];
        this.rank = array[4];
    }
    public Ranged clear(){
        return new Ranged();
    }
    public Ranged exportSkill(){
        return this;
    }

    /**
     * @return the fire
     */
    public int getFire() {
        return fire;
    }

    /**
     * @param fire the fire to set
     */
    public void setFire(int fire) {
        this.fire = fire;
    }

    /**
     * @return the hamper
     */
    public int getHamper() {
        return hamper;
    }

    /**
     * @param hamper the hamper to set
     */
    public void setHamper(int hamper) {
        this.hamper = hamper;
    }

    /**
     * @return the disengage
     */
    public int getDisengage() {
        return disengage;
    }

    /**
     * @param disengage the disengage to set
     */
    public void setDisengage(int disengage) {
        this.disengage = disengage;
    }

    /**
     * @return the mark
     */
    public int getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(int mark) {
        this.mark = mark;
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
