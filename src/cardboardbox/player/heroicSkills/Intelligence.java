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
public class Intelligence implements Serializable{
    private int investigate;
    private int gadgetry;
    private int knowledge;
    private int reason;
    private int rank;
    public Intelligence(){
        
    }
    public Intelligence(int[] array){
        this.investigate = array[0];
        this.gadgetry = array[1];
        this.knowledge = array[2];
        this.reason = array[3];
        this.rank = array[4];
    }
    public Intelligence clear(){
        return new Intelligence();
    }
    public Intelligence exportSkill(){
        return this;
    }

    /**
     * @return the investigate
     */
    public int getInvestigate() {
        return investigate;
    }

    /**
     * @param investigate the investigate to set
     */
    public void setInvestigate(int investigate) {
        this.investigate = investigate;
    }

    /**
     * @return the gadgetry
     */
    public int getGadgetry() {
        return gadgetry;
    }

    /**
     * @param gadgetry the gadgetry to set
     */
    public void setGadgetry(int gadgetry) {
        this.gadgetry = gadgetry;
    }

    /**
     * @return the knowledge
     */
    public int getKnowledge() {
        return knowledge;
    }

    /**
     * @param knowledge the knowledge to set
     */
    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    /**
     * @return the reason
     */
    public int getReason() {
        return reason;
    }

    /**
     * @param reason the reason to set
     */
    public void setReason(int reason) {
        this.reason = reason;
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
