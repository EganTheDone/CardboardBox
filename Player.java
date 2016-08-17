/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboardbox.player;

import cardboardbox.rolls.*;
import java.io.Serializable;

/**
 *
 * @author egand
 */
public class Player implements Serializable{
    private HeroicRoll heroicRoll;
    private D20Roll d20Roll;
    private HealthState healthState;
    private Biography info;
    private Spellbook abilities;
    private HeroicSkills skills;
    private CharacterState characterState;
    private boolean turn;
    
    public Player(){
    }
    public Player(HeroicRoll roll, HealthState health, Biography bio, Spellbook spells, HeroicSkills skill){
        this.heroicRoll = roll;
        this.healthState = health;
        this.info = bio;
        this.abilities = spells;
        this.skills = skill;
    }

    /**
     * @return the heroicRoll
     */
    public HeroicRoll getHeroicRoll() {
        return heroicRoll;
    }

    /**
     * @param heroicRoll the heroicRoll to set
     */
    public void setHeroicRoll(HeroicRoll heroicRoll) {
        this.heroicRoll = heroicRoll;
    }

    /**
     * @return the d20Roll
     */
    public D20Roll getD20Roll() {
        return d20Roll;
    }

    /**
     * @param d20Roll the d20Roll to set
     */
    public void setD20Roll(D20Roll d20Roll) {
        this.d20Roll = d20Roll;
    }

    /**
     * @return the healthState
     */
    public HealthState getHealthState() {
        return healthState;
    }

    /**
     * @param healthState the healthState to set
     */
    public void setHealthState(HealthState healthState) {
        this.healthState = healthState;
    }

    /**
     * @return the info
     */
    public Biography getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(Biography info) {
        this.info = info;
    }

    /**
     * @return the abilities
     */
    public Spellbook getAbilities() {
        return abilities;
    }

    /**
     * @param abilities the abilities to set
     */
    public void setAbilities(Spellbook abilities) {
        this.abilities = abilities;
    }

    /**
     * @return the skills
     */
    public HeroicSkills getSkills() {
        return skills;
    }

    /**
     * @param skills the skills to set
     */
    public void setSkills(HeroicSkills skills) {
        this.skills = skills;
    }

    /**
     * @return the turn
     */
    public boolean isTurn() {
        return turn;
    }

    /**
     * @param turn the turn to set
     */
    public void setTurn(boolean turn) {
        this.turn = turn;
    }
    public CharacterState getCharState(){
        return this.characterState;
    }
    public void setCharState(CharacterState state){
        this.characterState = state;
    }
    
    
    
}
