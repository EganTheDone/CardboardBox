/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author egand
 */
public class Connector {

    public static void main(String[] args) throws SQLException {
        Scanner s = new Scanner(System.in);
        Connection con = null;
        Statement st = null;
        try {
            String host = "jdbc:mysql://localhost:3306/cardboard_test";
            System.out.println("User: ");
            String uName = s.nextLine();
            System.out.println("Password: ");
            String uPassword = s.nextLine();
            con = DriverManager.getConnection(host, uName, uPassword);
            st = con.createStatement();
            String drop = "DROP TABLE Characters";
            String sql = "SELECT * FROM Characters";
            ResultSet rs;
            try{
            rs = st.executeQuery(sql);
            System.out.println("Accessed table.");
            st.executeUpdate(drop);
            System.out.println("Dropped table.");
            }            
            catch(Exception e){
                String sqla = "CREATE TABLE Characters (name VARCHAR(20), level INTEGER)";
                st.executeUpdate(sqla);
                System.out.println("Created table");
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            if(st!=null){
                con.close();
            }
            if(con!=null){
                con.close();
            }
        }
    }

}
