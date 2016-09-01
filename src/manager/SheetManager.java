/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.io.*;
import cardboardbox.player.*;
import javax.swing.JFrame;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author egand
 */
public class SheetManager {

    /*TODO encrypt Player to prevent modification*/
    public void savePlayer(Player player) {
        String charName = player.getInfo().getName();
        if (charName == null) {
            charName = "NULLNAME";
        }
        try {
            FileOutputStream fout = new FileOutputStream("C:\\cardboard box\\" + charName + ".sheet");
            try (ObjectOutputStream oos = new ObjectOutputStream(fout)) {
                oos.writeObject(player);
            }
            System.out.println("Saved");
        } catch (Exception e) {
        }
    }

    //Placeholder values
    /*TODO replace placeholders with variables from Player object
      Might remove entirely. Deciding on local player save vs. server side*/
    public void savePlayer(Player player, Connection con, String username, int userID) {
        try {
            String charName = player.getInfo().getName();
        } catch (NullPointerException e) {
            String charName = "GENERIC_CHAR_TEST_NAME";
        }
        try {
            Statement sk = con.createStatement();
            try {
                sk.addBatch("INSERT INTO users(ID, Username, Permissions)"
                        + "VALUES(" + userID + ",'" + username + "', 0)");
                sk.addBatch("INSERT INTO Player(ID, Users, Turn, Initiative) VALUES(77, 1, 0, 0);");
                sk.addBatch("INSERT INTO Healthstate(Player, Health, Will, Status)"
                        + "VALUES(77, 120, 50, 2)");

                sk.addBatch("INSERT INTO Biography"
                        + "(Player, Name, Age, Job, Race, Height, Weight, Morality)"
                        + "VALUES(77, 'Alessandro Draconis', 43, 'Emperor', 'Human - Dragonblooded',"
                        + "'2.1 meters', '110 KG', 'Benevolent Authoritarian')");

                sk.addBatch("INSERT INTO Charisma(Player, Rank, Hustle, Intimidate, Speech, Perform) VALUES(77, 1, 7, 12, 12, 5);");
                sk.addBatch("INSERT INTO Combat(Player, Rank, Magic, Runekaasting, Placeholder, Defense) VALUES(77, 0, 6, 2, 0, 8);");
                sk.addBatch("INSERT INTO Constitution(Player, Rank, Travel, Ride, Survival, Recover) VALUES(77, 0, 12, 5, 3, 6);");
                sk.addBatch("INSERT INTO Dexterity(Player, Rank, Acrobatics, Sneak, Sleight, Ply) VALUES(77, 2, 12, 12, 12, 12);");
                sk.addBatch("INSERT INTO Intelligence(Player, Rank, Investigate, Gadgetry, Knowledge, Reason) VALUES(77, 0, 8, 1, 9, 5);");
                sk.addBatch("INSERT INTO Melee(Player, Rank, Assault, Rush, Shift, Bait) VALUES(77, 0, 4, 6, 8, 11);");
                sk.addBatch("INSERT INTO Ranged(Player, Rank, Fire, Hamper, Disengage, Mark) VALUES(77, 2, 12, 12, 12, 12);");
                sk.addBatch("INSERT INTO Strength(Player, Rank, Strongarm, Athletics, Break, Haul) VALUES(77, 0, 10, 12, 11, 9);");
                sk.addBatch("INSERT INTO Wisdom(Player, Rank, Survey, Insight, Gather, Triage) VALUES(77, 0, 6, 12, 3, 6);");
                sk.addBatch("INSERT INTO Characterstate(Player, TotalEXP, CurrentEXP, SpentEXP, Level, Threshold, Class)"
                        + "VALUES(77, 10000, 0, 10000, 40, 25000, 'Bravado')");
                sk.executeBatch();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (NullPointerException e) {
            System.out.println("Connection is null, check connection validity");
        } catch (SQLException ex) {
            Logger.getLogger(SheetManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Player loadPlayer(String name) {
        Player player;

        try {
            FileInputStream fin = new FileInputStream(name);
            ObjectInputStream ois = new ObjectInputStream(fin);
            player = (Player) ois.readObject();
            return player;
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
    }

    public Player loadPlayer(File file) {
        Player player;
        try {
            FileInputStream fin = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fin);
            player = (Player) ois.readObject();
            if (player != null) {
                System.out.println("Player loaded");
            } else {
                System.out.println("Player not loaded");
            }
            return player;
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }

    }

    /*TODO Load function for bringing values in to JFrame sheet*/
}
