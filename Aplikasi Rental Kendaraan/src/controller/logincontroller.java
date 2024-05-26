/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.login;
import koneksi.connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author ACER
 */
public class logincontroller {
     public boolean authenticate(String username, String password) {
        Connection con = connector.connection();
        
            try {
                String query = "SELECT * FROM login WHERE username = ? AND password = ?";
                PreparedStatement statement = con.prepareStatement(query);
                statement.setString(1, username);
                statement.setString(2, password);

                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        
        return false;
    }
}
