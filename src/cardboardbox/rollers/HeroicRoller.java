/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboardbox.rollers;


public class HeroicRoller implements Roller {
    @Override
    public Dice diceRoll(){
        Dice diceRoll = new Dice();
        return diceRoll;
    }
    @Override
    public int[] roll(int num){
        int[] res = new int[num+2];
        for(int i = 0;i<res.length;i++){
            res[i] = (this.diceRoll().roll(6));
        }
        return res;
    }
    
}
