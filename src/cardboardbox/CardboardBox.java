/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboardbox;

import cardboardbox.player.*;
import manager.*;
import java.util.Scanner;


/**
 *
 * @author egand
 */
public class CardboardBox {

    public StringBuilder log;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SheetManager mg = new SheetManager();
        cbServInitializer serv= new cbServInitializer();
        String name = "Alessandro Draconis";
        Player player = mg.loadPlayer("C:\\cardboard box\\"+name+".sheet");
        String user = "root";
        String password = "0269";       
        serv.initDB(user, password, 0);
        HeroicSkills sk = player.getSkills();
        player.getHeroicRoll().newRoll(sk.getStrength().getRank(), sk.getStrength().getStrongarm());
        //player.getHeroicRoll().dumpRoll();
        mg.savePlayer(player);

    }

}
/*
int suc = 0, fum=0, neu=0;
        int y = 1000;
for(int z=y;z>0;z--){
        
        player.getHeroicRoll().newRoll(skill, stat);
        
        
        suc+=player.getHeroicRoll().getSuccesses();
        fum+=player.getHeroicRoll().getFumbles();
        neu+=player.getHeroicRoll().getNeutrals();
        }
        long perc = (long)((skill+2)*y);
        System.out.print("Successes: "+suc+" | ");
        System.out.println(" "+(((double)suc)/perc)*100+"%");
        System.out.print("Neutral:   "+neu+" | ");
        System.out.println(" "+(((double)neu)/perc)*100+"%");
        System.out.print("Fumbles:   "+fum+" | ");
        System.out.println(" "+(((double)fum)/perc)*100+"%");
        System.out.println((long)(suc+fum+neu));  
 */
