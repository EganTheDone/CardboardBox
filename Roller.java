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
public interface Roller {
    int[] roll(int num);
    Dice diceRoll();
}


//rules unimplemented
class D100Roller implements Roller{
    private String blocker;
    public Dice diceRoll(){
        return null;
    }
    public int[] roll(int dice){
        return null;
    }
}
