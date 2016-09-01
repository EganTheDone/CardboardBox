/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboardbox.player;

import java.io.Serializable;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author egand
 */
public class HeroicSkills implements Serializable {

    private int hustle;
    private int intimidate;
    private int speech;
    private int perform;
    private int charRank;

    private int magic;
    private int runeK;
    private int defense;
    private int placeHolder; //does nothing, find good replacement
    private int combRank;
  
    private int travel;
    private int ride;
    private int survival;
    private int recover;
    private int conRank;
  
    private int acrobatics;
    private int sneak;
    private int sleight;
    private int ply;
    private int dexRank;

    private int investigate;
    private int gadgetry;
    private int knowledge;
    private int reason;
    private int intRank;
 
    private int assault;
    private int rush;
    private int shift;
    private int bait;
    private int meleeRank;

    private int fire;
    private int hamper;
    private int disengage;
    private int mark;
    private int rangeRank;

    private int strongarm;
    private int athletics;
    private int breakSkill;
    private int haul;
    private int strRank;

    private int survey;
    private int insight;
    private int gather;
    private int triage;
    private int wisRank;
    private int[] skillThresholds;

    public HeroicSkills() {

    }
    public HeroicSkills(Connection con){
        
    }

    public HeroicSkills(ArrayList<int[]> array) {
        initialize(array);
    }

    private void initialize(ArrayList<int[]> array) {
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

    private int thrh(double num) {
        int n = (int) num;
        if (n > 10) {
            n = (n / 10);
            n = (n * 10);
        }
        return n;
    }

    public void setCharisma(int[] array) {
        this.setHustle(array[0]);
        this.setIntimidate(array[1]);
        this.setSpeech(array[2]);
        this.setPerform(array[3]);
        this.setCharRank(array[4]);
    }

    public void setCombat(int[] array) {
        this.setMagic(array[0]);
        this.setRuneK(array[1]);
        this.setDefense(array[2]);
        this.setPlaceHolder(array[3]);
        this.setCombRank(array[4]);
    }

    public void setConstitution(int[] array) {
        this.setTravel(array[0]);
        this.setRide(array[1]);
        this.setSurvival(array[2]);
        this.setRecover(array[3]);
        this.setConRank(array[4]);
    }

    public void setDexterity(int[] array) {
        this.setAcrobatics(array[0]);
        this.setSneak(array[1]);
        this.setSleight(array[2]);
        this.setPly(array[3]);
        this.setDexRank(array[4]);
    }

    public void setIntelligence(int[] array) {
        this.setInvestigate(array[0]);
        this.setGadgetry(array[1]);
        this.setKnowledge(array[2]);
        this.setReason(array[3]);
        this.setIntRank(array[4]);
    }

    public void setMelee(int[] array) {
        this.setAssault(array[0]);
        this.setRush(array[1]);
        this.setShift(array[2]);
        this.setBait(array[3]);
        this.setMeleeRank(array[4]);
    }

    public void setRanged(int[] array) {
        this.setFire(array[0]);
        this.setHamper(array[1]);
        this.setDisengage(array[2]);
        this.setMark(array[3]);
        this.setRangeRank(array[4]);
    }

    public void setStrength(int[] array) {
        this.setStrongarm(array[0]);
        this.setAthletics(array[1]);
        this.setBreakSkill(array[2]);
        this.setHaul(array[3]);
        this.setStrRank(array[4]);
    }

    public void setWisdom(int[] array) {
        this.setSurvey(array[0]);
        this.setInsight(array[1]);
        this.setGather(array[2]);
        this.setTriage(array[3]);
        this.setWisRank(array[4]);
    }

    /**
     * @return the hustle
     */
    public int getHustle() {
        return hustle;
    }

    /**
     * @return the intimidate
     */
    public int getIntimidate() {
        return intimidate;
    }

    /**
     * @return the speech
     */
    public int getSpeech() {
        return speech;
    }

    /**
     * @return the perform
     */
    public int getPerform() {
        return perform;
    }

    /**
     * @return the charRank
     */
    public int getCharRank() {
        return charRank;
    }

    /**
     * @return the magic
     */
    public int getMagic() {
        return magic;
    }

    /**
     * @return the runeK
     */
    public int getRuneK() {
        return runeK;
    }

    /**
     * @return the defense
     */
    public int getDefense() {
        return defense;
    }

    /**
     * @return the placeHolder
     */
    public int getPlaceHolder() {
        return placeHolder;
    }

    /**
     * @return the combRank
     */
    public int getCombRank() {
        return combRank;
    }

    /**
     * @return the travel
     */
    public int getTravel() {
        return travel;
    }

    /**
     * @return the ride
     */
    public int getRide() {
        return ride;
    }

    /**
     * @return the survival
     */
    public int getSurvival() {
        return survival;
    }

    /**
     * @return the recover
     */
    public int getRecover() {
        return recover;
    }

    /**
     * @return the conRank
     */
    public int getConRank() {
        return conRank;
    }

    /**
     * @return the acrobatics
     */
    public int getAcrobatics() {
        return acrobatics;
    }

    /**
     * @return the sneak
     */
    public int getSneak() {
        return sneak;
    }

    /**
     * @return the sleight
     */
    public int getSleight() {
        return sleight;
    }

    /**
     * @return the ply
     */
    public int getPly() {
        return ply;
    }

    /**
     * @return the dexRank
     */
    public int getDexRank() {
        return dexRank;
    }

    /**
     * @return the investigate
     */
    public int getInvestigate() {
        return investigate;
    }

    /**
     * @return the gadgetry
     */
    public int getGadgetry() {
        return gadgetry;
    }

    /**
     * @return the knowledge
     */
    public int getKnowledge() {
        return knowledge;
    }

    /**
     * @return the reason
     */
    public int getReason() {
        return reason;
    }

    /**
     * @return the intRank
     */
    public int getIntRank() {
        return intRank;
    }

    /**
     * @return the assault
     */
    public int getAssault() {
        return assault;
    }

    /**
     * @return the rush
     */
    public int getRush() {
        return rush;
    }

    /**
     * @return the shift
     */
    public int getShift() {
        return shift;
    }

    /**
     * @return the bait
     */
    public int getBait() {
        return bait;
    }

    /**
     * @return the meleeRank
     */
    public int getMeleeRank() {
        return meleeRank;
    }

    /**
     * @return the fire
     */
    public int getFire() {
        return fire;
    }

    /**
     * @return the hamper
     */
    public int getHamper() {
        return hamper;
    }

    /**
     * @return the disengage
     */
    public int getDisengage() {
        return disengage;
    }

    /**
     * @return the mark
     */
    public int getMark() {
        return mark;
    }

    /**
     * @return the rangeRank
     */
    public int getRangeRank() {
        return rangeRank;
    }

    /**
     * @return the strongarm
     */
    public int getStrongarm() {
        return strongarm;
    }

    /**
     * @return the athletics
     */
    public int getAthletics() {
        return athletics;
    }

    /**
     * @return the breakSkill
     */
    public int getBreakSkill() {
        return breakSkill;
    }

    /**
     * @return the haul
     */
    public int getHaul() {
        return haul;
    }

    /**
     * @return the strRank
     */
    public int getStrRank() {
        return strRank;
    }

    /**
     * @return the survey
     */
    public int getSurvey() {
        return survey;
    }

    /**
     * @return the insight
     */
    public int getInsight() {
        return insight;
    }

    /**
     * @return the gather
     */
    public int getGather() {
        return gather;
    }

    /**
     * @return the triage
     */
    public int getTriage() {
        return triage;
    }

    /**
     * @return the wisRank
     */
    public int getWisRank() {
        return wisRank;
    }

    /**
     * @return the skillThresholds
     */
    public int[] getSkillThresholds() {
        return skillThresholds;
    }

    /**
     * @param hustle the hustle to set
     */
    public void setHustle(int hustle) {
        this.hustle = hustle;
    }

    /**
     * @param intimidate the intimidate to set
     */
    public void setIntimidate(int intimidate) {
        this.intimidate = intimidate;
    }

    /**
     * @param speech the speech to set
     */
    public void setSpeech(int speech) {
        this.speech = speech;
    }

    /**
     * @param perform the perform to set
     */
    public void setPerform(int perform) {
        this.perform = perform;
    }

    /**
     * @param charRank the charRank to set
     */
    public void setCharRank(int charRank) {
        this.charRank = charRank;
    }

    /**
     * @param magic the magic to set
     */
    public void setMagic(int magic) {
        this.magic = magic;
    }

    /**
     * @param runeK the runeK to set
     */
    public void setRuneK(int runeK) {
        this.runeK = runeK;
    }

    /**
     * @param defense the defense to set
     */
    public void setDefense(int defense) {
        this.defense = defense;
    }

    /**
     * @param placeHolder the placeHolder to set
     */
    public void setPlaceHolder(int placeHolder) {
        this.placeHolder = placeHolder;
    }

    /**
     * @param combRank the combRank to set
     */
    public void setCombRank(int combRank) {
        this.combRank = combRank;
    }

    /**
     * @param travel the travel to set
     */
    public void setTravel(int travel) {
        this.travel = travel;
    }

    /**
     * @param ride the ride to set
     */
    public void setRide(int ride) {
        this.ride = ride;
    }

    /**
     * @param survival the survival to set
     */
    public void setSurvival(int survival) {
        this.survival = survival;
    }

    /**
     * @param recover the recover to set
     */
    public void setRecover(int recover) {
        this.recover = recover;
    }

    /**
     * @param conRank the conRank to set
     */
    public void setConRank(int conRank) {
        this.conRank = conRank;
    }

    /**
     * @param acrobatics the acrobatics to set
     */
    public void setAcrobatics(int acrobatics) {
        this.acrobatics = acrobatics;
    }

    /**
     * @param sneak the sneak to set
     */
    public void setSneak(int sneak) {
        this.sneak = sneak;
    }

    /**
     * @param sleight the sleight to set
     */
    public void setSleight(int sleight) {
        this.sleight = sleight;
    }

    /**
     * @param ply the ply to set
     */
    public void setPly(int ply) {
        this.ply = ply;
    }

    /**
     * @param dexRank the dexRank to set
     */
    public void setDexRank(int dexRank) {
        this.dexRank = dexRank;
    }

    /**
     * @param investigate the investigate to set
     */
    public void setInvestigate(int investigate) {
        this.investigate = investigate;
    }

    /**
     * @param gadgetry the gadgetry to set
     */
    public void setGadgetry(int gadgetry) {
        this.gadgetry = gadgetry;
    }

    /**
     * @param knowledge the knowledge to set
     */
    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    /**
     * @param reason the reason to set
     */
    public void setReason(int reason) {
        this.reason = reason;
    }

    /**
     * @param intRank the intRank to set
     */
    public void setIntRank(int intRank) {
        this.intRank = intRank;
    }

    /**
     * @param assault the assault to set
     */
    public void setAssault(int assault) {
        this.assault = assault;
    }

    /**
     * @param rush the rush to set
     */
    public void setRush(int rush) {
        this.rush = rush;
    }

    /**
     * @param shift the shift to set
     */
    public void setShift(int shift) {
        this.shift = shift;
    }

    /**
     * @param bait the bait to set
     */
    public void setBait(int bait) {
        this.bait = bait;
    }

    /**
     * @param meleeRank the meleeRank to set
     */
    public void setMeleeRank(int meleeRank) {
        this.meleeRank = meleeRank;
    }

    /**
     * @param fire the fire to set
     */
    public void setFire(int fire) {
        this.fire = fire;
    }

    /**
     * @param hamper the hamper to set
     */
    public void setHamper(int hamper) {
        this.hamper = hamper;
    }

    /**
     * @param disengage the disengage to set
     */
    public void setDisengage(int disengage) {
        this.disengage = disengage;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(int mark) {
        this.mark = mark;
    }

    /**
     * @param rangeRank the rangeRank to set
     */
    public void setRangeRank(int rangeRank) {
        this.rangeRank = rangeRank;
    }

    /**
     * @param strongarm the strongarm to set
     */
    public void setStrongarm(int strongarm) {
        this.strongarm = strongarm;
    }

    /**
     * @param athletics the athletics to set
     */
    public void setAthletics(int athletics) {
        this.athletics = athletics;
    }

    /**
     * @param breakSkill the breakSkill to set
     */
    public void setBreakSkill(int breakSkill) {
        this.breakSkill = breakSkill;
    }

    /**
     * @param haul the haul to set
     */
    public void setHaul(int haul) {
        this.haul = haul;
    }

    /**
     * @param strRank the strRank to set
     */
    public void setStrRank(int strRank) {
        this.strRank = strRank;
    }

    /**
     * @param survey the survey to set
     */
    public void setSurvey(int survey) {
        this.survey = survey;
    }

    /**
     * @param insight the insight to set
     */
    public void setInsight(int insight) {
        this.insight = insight;
    }

    /**
     * @param gather the gather to set
     */
    public void setGather(int gather) {
        this.gather = gather;
    }

    /**
     * @param triage the triage to set
     */
    public void setTriage(int triage) {
        this.triage = triage;
    }

    /**
     * @param wisRank the wisRank to set
     */
    public void setWisRank(int wisRank) {
        this.wisRank = wisRank;
    }

    /**
     * @param skillThresholds the skillThresholds to set
     */
    public void setSkillThresholds(int[] skillThresholds) {
        this.skillThresholds = skillThresholds;
    }
}
