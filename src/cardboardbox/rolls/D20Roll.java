/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboardbox.rolls;

/**
 *
 * @author egand
 */
public class D20Roll {
    private int modifier;
    private int associatedStat;
    private int diceRoll;
    
    public D20Roll(){
    }
    public D20Roll(int mod, int stat, int roll){
        this.modifier = mod;
        this.associatedStat = stat;
        this.diceRoll = roll;
    }    
}
