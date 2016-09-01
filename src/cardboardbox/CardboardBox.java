/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboardbox;

import cardboardbox.player.*;
import java.sql.*;
import manager.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        cbServInitializer serv = new cbServInitializer();

        /*TODO password security*/
        String user = in.next();
        String password = in.next();
        
        /*TODO remove clunky initialzer with faster install process*/
        serv.initDB(user, password, 0);
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardboard_db", user, password);
        } catch (SQLException ex) {
            Logger.getLogger(CardboardBox.class.getName()).log(Level.SEVERE, null, ex);
        }
        Player player = new Player();

        mg.savePlayer(player, con, "root", 1);

    }

}

