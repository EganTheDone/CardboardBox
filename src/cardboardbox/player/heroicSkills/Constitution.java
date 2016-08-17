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
public class Constitution implements Serializable{
    private int travel;
    private int ride;
    private int survival;
    private int recover;
    private int rank;
    public Constitution(){
        
    }
    public Constitution(int[] array){
        this.travel = array[0];
        this.ride = array[1];
        this.survival = array[2];
        this.recover = array[3];
        this.rank = array[4];
    }
    public Constitution clear(){
        return new Constitution();
    }
    public Constitution exportSkill(){
        return this;
    }

    /**
     * @return the travel
     */
    public int getTravel() {
        return travel;
    }

    /**
     * @param travel the travel to set
     */
    public void setTravel(int travel) {
        this.travel = travel;
    }

    /**
     * @return the ride
     */
    public int getRide() {
        return ride;
    }

    /**
     * @param ride the ride to set
     */
    public void setRide(int ride) {
        this.ride = ride;
    }

    /**
     * @return the survival
     */
    public int getSurvival() {
        return survival;
    }

    /**
     * @param survival the survival to set
     */
    public void setSurvival(int survival) {
        this.survival = survival;
    }

    /**
     * @return the recover
     */
    public int getRecover() {
        return recover;
    }

    /**
     * @param recover the recover to set
     */
    public void setRecover(int recover) {
        this.recover = recover;
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
