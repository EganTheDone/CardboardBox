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
public class Combat implements Serializable{
    private int magic;
    private int runeK;
    private int defense;
    private int placeHolder; //does nothing
    private int rank;
    public Combat(){
    }
    public Combat(int[] array){
        //placeholder int values
        this.magic = array[0];
        this.runeK = array[1];
        this.defense = array[2];
        this.placeHolder = array[3];
        this.rank = array[4];
    }
    public Combat clear(){
        return new Combat();
    }
    public Combat exportSkill(){
        return this;
    }

    /**
     * @return the magic
     */
    public int getMagic() {
        return magic;
    }

    /**
     * @param magic the magic to set
     */
    public void setMagic(int magic) {
        this.magic = magic;
    }

    /**
     * @return the runeK
     */
    public int getRuneK() {
        return runeK;
    }

    /**
     * @param runeK the runeK to set
     */
    public void setRuneK(int runeK) {
        this.runeK = runeK;
    }

    /**
     * @return the defense
     */
    public int getDefense() {
        return defense;
    }

    /**
     * @param defense the defense to set
     */
    public void setDefense(int defense) {
        this.defense = defense;
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
