/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboardbox.player;

import cardboardbox.player.heroicSkills.*;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author egand
 */
public class HeroicSkills implements Serializable{
    private Charisma charisma;
    private Combat combat;
    private Constitution constitution;
    private Dexterity dexterity;
    private Intelligence intelligence;
    private Melee melee;
    private Ranged ranged;
    private Strength strength;
    private Wisdom wisdom;
    private int[] skillThresholds;
    public HeroicSkills(){
        
    }
    public HeroicSkills(ArrayList<int[]> array){
        initialize(array);
    }
    private void initialize(ArrayList<int[]> array){
        this.setCharisma(array.get(0));
        this.setCombat(array.get(1));
        this.setConstitution(array.get(2));
        this.setDexterity(array.get(3));
        this.setIntelligence(array.get(4));
        this.setMelee(array.get(5));
        this.setRanged(array.get(6));
        this.setStrength(array.get(7));
        this.setWisdom(array.get(8));


    }
    private int thrh(double num){
        int n=(int)num;
        if(n>10){
            n=(n/10);
            n=(n*10);
        }
        return n;
    }
    /**
     * @return the charisma
     */
    public Charisma getCharisma() {
        return charisma;
    }

    /**
     * @param charisma the charisma to set
     */
    public void setCharisma(Charisma charisma) {
        this.charisma = charisma;
    }
    public void setCharisma(int[] array){
        this.charisma = new Charisma(array);
    }

    /**
     * @return the combat
     */
    public Combat getCombat() {
        return combat;
    }

    /**
     * @param combat the combat to set
     */
    public void setCombat(Combat combat) {
        this.combat = combat;
    }
    public void setCombat(int[] array){
        this.combat = new Combat(array);
    }

    /**
     * @return the constitution
     */
    public Constitution getConstitution() {
        return constitution;
    }

    /**
     * @param constitution the constitution to set
     */
    public void setConstitution(Constitution constitution) {
        this.constitution = constitution;
    }
    public void setConstitution(int[] array){
        this.constitution = new Constitution(array);
    }

    /**
     * @return the dexterity
     */
    public Dexterity getDexterity() {
        return dexterity;
    }

    /**
     * @param dexterity the dexterity to set
     */
    public void setDexterity(Dexterity dexterity) {
        this.dexterity = dexterity;
    }
    public void setDexterity(int[] array){
        this.dexterity = new Dexterity(array);
    }

    /**
     * @return the intelligence
     */
    public Intelligence getIntelligence() {
        return intelligence;
    }

    /**
     * @param intelligence the intelligence to set
     */
    public void setIntelligence(Intelligence intelligence) {
        this.intelligence = intelligence;
    }
    public void setIntelligence(int[] array){
        this.intelligence = new Intelligence(array);
    }

    /**
     * @return the melee
     */
    public Melee getMelee() {
        return melee;
    }

    /**
     * @param melee the melee to set
     */
    public void setMelee(Melee melee) {
        this.melee = melee;
    }
    public void setMelee(int[] array){
        this.melee = new Melee(array);
    }

    /**
     * @return the ranged
     */
    public Ranged getRanged() {
        return ranged;
    }

    /**
     * @param ranged the ranged to set
     */
    public void setRanged(Ranged ranged) {
        this.ranged = ranged;
    }
    public void setRanged(int[] array){
        this.ranged = new Ranged(array);
    }

    /**
     * @return the strength
     */
    public Strength getStrength() {
        return strength;
    }

    /**
     * @param strength the strength to set
     */
    public void setStrength(Strength strength) {
        this.strength = strength;
    }
    public void setStrength(int[] array){
        this.strength = new Strength(array);
    }

    /**
     * @return the wisdom
     */
    public Wisdom getWisdom() {
        return wisdom;
    }

    /**
     * @param wisdom the wisdom to set
     */
    public void setWisdom(Wisdom wisdom) {
        this.wisdom = wisdom;
    }
    public void setWisdom(int[] array){
        this.wisdom = new Wisdom(array);
    }    
}