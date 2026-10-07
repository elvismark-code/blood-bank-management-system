/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blood_bank_and_blood_donation_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class DBConnection {
     
    private static final String URL = "jdbc:mysql://localhost:3306/blood_bank_db";
    private static final String USER = "root";
    private static final String PASS = "Justelvis123?!";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASS);
    }
    
    

}
