/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboardbox.rolls;

import cardboardbox.rollers.HeroicRoller;
import cardboardbox.rollers.HitCalc;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author egand
 */
public class HeroicRoll implements Serializable{

    private int[] diceArray;
    private int rollSuccesses;
    private int rollFumbles;
    private int rollNeutrals; //I shouldn't need neutrals actually
    private LocalDateTime rollTime;

    public HeroicRoll() {
    }
    public int[] getDiceArray() {
        return this.diceArray;
    }

    public int getSuccesses() {
        return this.rollSuccesses;
    }

    public int getFumbles() {
        return this.rollFumbles;
    }

    public int getNeutrals() {
        return this.rollNeutrals;
    }

    public LocalDateTime getTime() {
        return this.rollTime;
    }

    public void newRoll(int skill, int stat) {
        HeroicRoller roller = new HeroicRoller();
        HitCalc calc = new HitCalc();
        int[] dice = roller.roll(skill);
        int[] hits = calc.HeroicCalc(dice, stat);
        this.diceArray = dice;
        this.rollSuccesses = hits[2];
        this.rollFumbles = hits[0];
        this.rollNeutrals = hits[1];
        this.rollTime = LocalDateTime.now();
    }

    public HeroicRoll exportRoll(){
        return this;
    }
    public void dumpRoll(){
        System.out.print("Dice Array: ");
        for(int i : this.diceArray){
            System.out.print(i+" ");
        }
        System.out.print("\n Successes: "+this.rollSuccesses);
        System.out.print("\n Neutrals: "+this.rollNeutrals);
        System.out.print("\n Fumbles: "+this.rollFumbles);
        System.out.print("\n Time: "+this.rollTime);
        System.out.println();
    }

}
