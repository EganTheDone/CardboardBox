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
public class Strength implements Serializable{

    private int strongarm;
    private int athletics;
    private int breakSkill;
    private int haul;
    private int rank;

    public Strength() {

    }

    public Strength(int[] array) {
        this.strongarm = array[0];
        this.athletics = array[1];
        this.breakSkill = array[2];
        this.haul = array[3];
        this.rank = array[4];
    }

    public Strength exportSkill() {
        return this;
    }

    public Strength clear() {
        return new Strength();
    }
    /**
     * @return the strongarm
     */
    public int getStrongarm() {
        return strongarm;
    }

    /**
     * @param strongarm the strongarm to set
     */
    public void setStrongarm(int strongarm) {
        this.strongarm = strongarm;
    }

    /**
     * @return the athletics
     */
    public int getAthletics() {
        return athletics;
    }

    /**
     * @param athletics the athletics to set
     */
    public void setAthletics(int athletics) {
        this.athletics = athletics;
    }

    /**
     * @return the breakSkill
     */
    public int getBreakSkill() {
        return breakSkill;
    }

    /**
     * @param breakSkill the breakSkill to set
     */
    public void setBreakSkill(int breakSkill) {
        this.breakSkill = breakSkill;
    }

    /**
     * @return the haul
     */
    public int getHaul() {
        return haul;
    }

    /**
     * @param haul the haul to set
     */
    public void setHaul(int haul) {
        this.haul = haul;
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
