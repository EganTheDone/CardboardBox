/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;
import java.io.*;
import cardboardbox.player.*;
import javax.swing.JFrame;
/**
 *
 * @author egand
 */
public class SheetManager {
    public void savePlayer(Player player){
        String charName = player.getInfo().getName();
        if(charName==null){
            charName = "NULLNAME";
        }
        try{
            FileOutputStream fout = new FileOutputStream("C:\\cardboard box\\"+charName+".sheet");
            try (ObjectOutputStream oos = new ObjectOutputStream(fout)) {
                oos.writeObject(player);
            }
            System.out.println("Saved");
        }
        catch(Exception e){
        }
    }
    
    public Player loadPlayer(String name){
        Player player;
        
        try{
            FileInputStream fin = new FileInputStream(name);
            ObjectInputStream ois = new ObjectInputStream(fin);
            player = (Player) ois.readObject();
            return player;
        }
        catch(IOException | ClassNotFoundException e){
            return null;
        }
    }
    
    public Player loadPlayer(File file){
        Player player;
        try{
            FileInputStream fin = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fin);
            player = (Player) ois.readObject();
            if(player != null){
                System.out.println("Player loaded");
            }
            else{
                System.out.println("Player not loaded");
            }
            return player;
        }
        catch(IOException | ClassNotFoundException e){
            return null;
        }
        
    }
    
    public void loadSheet(Player player, JFrame frame){
        System.out.println("loading");
    }

}
