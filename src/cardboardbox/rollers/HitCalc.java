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

public class HitCalc {
    
    public int[] HeroicCalc(int[] roll, int stat){
        int x;
        int bp = (5-stat);
        int[] hitArray = new int[3];
        int hit=0, fumble=0,neutral=0;
        for(int i=0;i<roll.length;i++){
            x = roll[i];
            if(x==1){
                fumble++;
            }
            else if(x >= bp){
                hit++;
            }
            else{
                neutral++;
            }
        }
        hitArray[0]=fumble;hitArray[1]=neutral;hitArray[2]=hit;
        return hitArray;
    }
    public int D20Calc(int roll, int mod, int stat){
        return (roll+mod+stat);
    }
    
}
