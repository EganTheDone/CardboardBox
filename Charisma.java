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
public class Charisma implements Serializable{
    private int hustle;
    private int intimidate;
    private int speech;
    private int perform;
    private int rank;
    public Charisma(){
        
    }
    public Charisma(int[] array){
        this.hustle = array[0];
        this.intimidate = array[1];
        this.speech = array[2];
        this.perform = array[3];
        this.rank = array[4];
    }
    public Charisma clear(){
        return new Charisma();
    }
    public Charisma exportSkill(){
        return this;
    }

    /**
     * @return the hustle
     */
    public int getHustle() {
        return hustle;
    }

    /**
     * @param hustle the hustle to set
     */
    public void setHustle(int hustle) {
        this.hustle = hustle;
    }

    /**
     * @return the intimidate
     */
    public int getIntimidate() {
        return intimidate;
    }

    /**
     * @param intimidate the intimidate to set
     */
    public void setIntimidate(int intimidate) {
        this.intimidate = intimidate;
    }

    /**
     * @return the speech
     */
    public int getSpeech() {
        return speech;
    }

    /**
     * @param speech the speech to set
     */
    public void setSpeech(int speech) {
        this.speech = speech;
    }

    /**
     * @return the perform
     */
    public int getPerform() {
        return perform;
    }

    /**
     * @param perform the perform to set
     */
    public void setPerform(int perform) {
        this.perform = perform;
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
