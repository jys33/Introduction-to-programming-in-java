/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TimeZone;

/**
 *
 * @author Julio-Cesar
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            // America/Buenos_Aires | UTC
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/app?serverTimezone=" + TimeZone.getDefault().getID(), "root", "");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM user");

            while (rs.next()) {
                int userId = rs.getInt("user_id");
                String lastName = rs.getString("last_name");
                String firstName = rs.getString("first_name");
                System.out.println("El id es: " + userId + "| el nombre es: " + lastName + "| el apellido es: " + firstName);
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String Clean(String str) {
        str = str.trim();
        str = str.replaceAll("\\s\\s+", " ");
        return str;
    }
}
