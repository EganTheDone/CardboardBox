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
public class Dice {
    protected int roll(int die){
        return ((int)((Math.random()*die)+1));
    }    
}
