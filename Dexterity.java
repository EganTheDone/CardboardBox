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
public class Dexterity implements Serializable{
    private int acrobatics;
    private int sneak;
    private int sleight;
    private int ply;
    private int rank;
    public Dexterity(){
        
    }
    public Dexterity(int[] array){
        this.acrobatics = array[0];
        this.sneak = array[1];
        this.sleight = array[2];
        this.ply = array[3];
        this.rank = array[4];
    }
    public Dexterity clear(){
        return new Dexterity();
    }
    public Dexterity exportSkill(){
        return this;
    }

    /**
     * @return the acrobatics
     */
    public int getAcrobatics() {
        return acrobatics;
    }

    /**
     * @param acrobatics the acrobatics to set
     */
    public void setAcrobatics(int acrobatics) {
        this.acrobatics = acrobatics;
    }

    /**
     * @return the sneak
     */
    public int getSneak() {
        return sneak;
    }

    /**
     * @param sneak the sneak to set
     */
    public void setSneak(int sneak) {
        this.sneak = sneak;
    }

    /**
     * @return the sleight
     */
    public int getSleight() {
        return sleight;
    }

    /**
     * @param sleight the sleight to set
     */
    public void setSleight(int sleight) {
        this.sleight = sleight;
    }

    /**
     * @return the ply
     */
    public int getPly() {
        return ply;
    }

    /**
     * @param ply the ply to set
     */
    public void setPly(int ply) {
        this.ply = ply;
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
