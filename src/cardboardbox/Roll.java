/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboardbox;

import cardboardbox.rollers.*;
import cardboardbox.rolls.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author egand
 */
public class Roll extends CardboardBox{

protected D20Roll d20DiceObject(int dice, int num, int mod, int stat){
    HitCalc calc = new HitCalc();
    D20Roller roller = new D20Roller();
    int[] hits = roller.roll(dice);
    D20Roll roll = new D20Roll(mod, stat, hits[0]);  
    return roll;
}

}
