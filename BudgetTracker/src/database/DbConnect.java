/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package database;
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConnect {
    public static Connection con;
    public static Statement stmt;
    static {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spendingdb"+"?useSSL = false","root","Tanu@123#!#");
            stmt = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
