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
public class Wisdom implements Serializable{

    private int survey;
    private int insight;
    private int gather;
    private int triage;
    private int rank;

    public Wisdom() {
    }

    public Wisdom(int[] array) {
        this.survey = array[0];
        this.insight = array[1];
        this.gather = array[2];
        this.triage = array[3];
        this.rank = array[4];
    }

    public Wisdom exportSkill() {
        return this;
    }

    public Wisdom clear() {
        return new Wisdom();
    }

    /**
     * @return the survey
     */
    public int getSurvey() {
        return survey;
    }

    /**
     * @param survey the survey to set
     */
    public void setSurvey(int survey) {
        this.survey = survey;
    }

    /**
     * @return the insight
     */
    public int getInsight() {
        return insight;
    }

    /**
     * @param insight the insight to set
     */
    public void setInsight(int insight) {
        this.insight = insight;
    }

    /**
     * @return the gather
     */
    public int getGather() {
        return gather;
    }

    /**
     * @param gather the gather to set
     */
    public void setGather(int gather) {
        this.gather = gather;
    }

    /**
     * @return the triage
     */
    public int getTriage() {
        return triage;
    }

    /**
     * @param triage the triage to set
     */
    public void setTriage(int triage) {
        this.triage = triage;
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
