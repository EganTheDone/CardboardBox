/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboardbox.rollers;

/**
 *
 * @author egand
 */
public class D20Roller implements Roller{
    public Dice diceRoll(){
        Dice diceRoll = new Dice();
        return diceRoll;
    }
    public int[] roll(int dice){
        int[] res = new int[1];
        res[0]=this.diceRoll().roll(dice);
        return res;
    }
}
