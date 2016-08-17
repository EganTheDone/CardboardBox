/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author egand
 */
public class cbServInitializer {

    public void initDB(String user, String pass, int accessed) {
        Connection con = null;
        Statement st = null;
        if (accessed < 2) {
            try {
                String host = "jdbc:mysql://localhost:3306/cardboard_db";
                con = DriverManager.getConnection(host, user, pass);
                st = con.createStatement();
                ArrayList<String> i = new ArrayList<>();
                try {
                    String uInit = "CREATE TABLE Users("
                            + "ID INT PRIMARY KEY,"
                            + " Username varchar(30),"
                            + " Player LONGBLOB,"
                            + " Permissions bit NOT NULL DEFAULT 0"
                            + ")";
                    st.executeUpdate(uInit);
                    String pInit = "CREATE TABLE Player("
                            + "ID INT PRIMARY KEY, "
                            + "Users INT, "
                            + "FOREIGN KEY(Users) REFERENCES Users(ID), "
                            + "Turn TINYINT(1) NOT NULL DEFAULT 0, "
                            + "Initiative TINYINT"
                            + ")";
                    st.executeUpdate(pInit);
                    String bioInit = "CREATE TABLE Biography("
                            + "Player INT, "
                            + "FOREIGN KEY(Player) REFERENCES Player(ID), "
                            + "Name varchar(255), "
                            + "Age INT, "
                            + "Job varchar(255), "
                            + "Race varchar(255), "
                            + "Height varchar(255), "
                            + "Weight varchar(255), "
                            + "Morality varchar(255))";
                    st.executeUpdate(bioInit);
                    String healthInit = "CREATE TABLE HealthState("
                            + "Player INT, "
                            + "FOREIGN KEY(Player) REFERENCES Player(ID), "
                            + "Health INT, "
                            + "Will INT, "
                            + "Status TINYINT(2)"
                            + ")";
                    st.executeUpdate(healthInit);
                    
                    String charisma = "CREATE TABLE Charisma ("
                            + "Player INT, "
                            + "FOREIGN KEY(Player) REFERENCES Player(ID), "
                            + "Rank TINYINT(3) NOT NULL DEFAULT 0, "
                            + "Hustle TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Intimidate TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Speech TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Perform TINYINT(12) NOT NULL DEFAULT 0"
                            + ")";
                    st.executeUpdate(charisma);
                    String combat = "CREATE TABLE Combat ("
                            + "Player INT, "
                            + "FOREIGN KEY(Player) REFERENCES Player(ID), "
                            + "Rank TINYINT(3) NOT NULL DEFAULT 0, "
                            + "Magic TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Runekaasting TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Placeholder TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Defense TINYINT(12) NOT NULL DEFAULT 0"
                            + ")";
                    st.executeUpdate(combat);
                    String constitution = "CREATE TABLE Constitution ("
                            + "Player INT, "
                            + "FOREIGN KEY(Player) REFERENCES Player(ID), "
                            + "Rank TINYINT(3) NOT NULL DEFAULT 0, "
                            + "Travel TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Ride TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Survival TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Recover TINYINT(12) NOT NULL DEFAULT 0"
                            + ")";
                    st.executeUpdate(constitution);
                    String dexterity = "CREATE TABLE Dexterity ("
                            + "Player INT, "
                            + "FOREIGN KEY(Player) REFERENCES Player(ID), "
                            + "Rank TINYINT(3) NOT NULL DEFAULT 0, "
                            + "Acrobatics TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Sneak TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Sleight TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Ply TINYINT(12) NOT NULL DEFAULT 0"
                            + ")";
                    st.executeUpdate(dexterity);
                    String intelligence = "CREATE TABLE Intelligence ("
                            + "Player INT, "
                            + "FOREIGN KEY(Player) REFERENCES Player(ID), "
                            + "Rank TINYINT(3) NOT NULL DEFAULT 0, "
                            + "Investigate TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Gadgetry TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Knowledge TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Reason TINYINT(12) NOT NULL DEFAULT 0"
                            + ")";
                    st.executeUpdate(intelligence);
                    String melee = "CREATE TABLE Melee ("
                            + "Player INT, "
                            + "FOREIGN KEY(Player) REFERENCES Player(ID), "
                            + "Rank TINYINT(3) NOT NULL DEFAULT 0, "
                            + "Assault TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Rush TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Shift TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Bait TINYINT(12) NOT NULL DEFAULT 0"
                            + ")";
                    st.executeUpdate(melee);
                    String ranged = "CREATE TABLE Ranged ("
                            + "Player INT, "
                            + "FOREIGN KEY(Player) REFERENCES Player(ID), "
                            + "Rank TINYINT(3) NOT NULL DEFAULT 0, "
                            + "Fire TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Hamper TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Disengage TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Mark TINYINT(12) NOT NULL DEFAULT 0"
                            + ")";
                    st.executeUpdate(ranged);
                    String strength = "CREATE TABLE Strength ("
                            + "Player INT, "
                            + "FOREIGN KEY(Player) REFERENCES Player(ID), "
                            + "Rank TINYINT(3) NOT NULL DEFAULT 0, "
                            + "Strongarm TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Athletics TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Break TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Haul TINYINT(12) NOT NULL DEFAULT 0"
                            + ")";
                    st.executeUpdate(strength);
                    String wisdom = "CREATE TABLE Wisdom ("
                            + "Player INT, "
                            + "FOREIGN KEY(Player) REFERENCES Player(ID), "
                            + "Rank TINYINT(3) NOT NULL DEFAULT 0, "
                            + "Survey TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Insight TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Gather TINYINT(12) NOT NULL DEFAULT 0, "
                            + "Triage TINYINT(12) NOT NULL DEFAULT 0"
                            + ")";
                    st.executeUpdate(wisdom);
                    String charInit = "CREATE TABLE CharacterState ("
                            + "Player INT, "
                            + "FOREIGN KEY(Player) REFERENCES Player(ID), "
                            + "TotalEXP INT, "
                            + "CurrentEXP INT, "
                            + "SpentEXP INT, "
                            + "Level INT, "
                            + "Threshold INT, "
                            + "Class varchar(255)"
                            + ")";
                    st.executeUpdate(charInit);
                    String rollInit = "CREATE TABLE Roll ("
                            + "Player INT, "
                            + "FOREIGN KEY(Player) REFERENCES Player(ID), "
                            + "DiceArray varchar(60) DEFAULT '0', "
                            + "Successes TINYINT DEFAULT 0, "
                            + "Fumbles TINYINT DEFAULT 0, "
                            + "Neutrals TINYINT DEFAULT 0, "
                            + "Time DATETIME"
                            + ")";
                    st.executeUpdate(rollInit);
                    String spellDBInit = "CREATE TABLE SpellDatabase ("
                            + "SpellID INT PRIMARY KEY,"
                            + "Name varchar(255), "
                            + "ShortDescription TEXT, "
                            + "FullDescription LONGTEXT, "
                            + "Cost SMALLINT"
                            + ")";
                    st.executeUpdate(spellDBInit);
                    String featDBInit = "CREATE TABLE FeatsDatabase ("
                            + "FeatID INT PRIMARY KEY, "
                            + "Name varchar(255), "
                            + "Cost INT, "
                            + "LongDESC LONGTEXT, "
                            + "ShortDESC TEXT, "
                            + "Category varchar(255)"
                            + ")";
                    st.executeUpdate(featDBInit);
                    String featTable = "CREATE TABLE PlayerFeats("
                            + "Player INT, "
                            + "FeatID INT, "
                            + "Name varchar(255), "
                            + "Description TEXT, "
                            + "Category varchar(255), "
                            + "FOREIGN KEY(Player) REFERENCES Player(ID), "
                            + "FOREIGN KEY(FeatID) REFERENCES FeatsDatabase(FeatID)"
                            + ")";
                    st.executeUpdate(featTable);
                    String spellbookInit = "CREATE TABLE Spellbook ("
                            + "Player INT, "
                            + "SpellID INT, "
                            + "Name varchar(255), "
                            + "Description TEXT, "
                            + "FOREIGN KEY(Player) REFERENCES Player(ID), "
                            + "FOREIGN KEY(SpellID) REFERENCES SpellDatabase(SpellID)"
                            + ")";
                    st.executeUpdate(spellbookInit);
                    System.out.println("Successfully Created Table!");
                } catch (Exception e) {
                    System.out.println("Error occurred.");
                    e.printStackTrace();
                    System.out.println("Clearing DB.");
                    String ex = "DROP DATABASE cardboard_db";
                    st.executeUpdate(ex);
                    System.out.println("Creating new DB.");
                    String cr = "CREATE DATABASE cardboard_db";
                    st.executeUpdate(cr);
                }
            } catch (SQLException e) {
                
            }
        }
    }

}
