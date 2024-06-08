/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KopiKodam.Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS ID
 */
public class Koneksi {
    private static String url = "jdbc:mysql://localhost/db_kodamkopi";
    private static String username = "root";
    private static String password = "";
    Connection con;
    
    public static Connection getKoneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            return con;
        } catch (Exception e) {
            return null;
        }
    }
//    public static void main(String[] args){
//        Koneksi k = new Koneksi();
//        k.getKoneksi();
//        JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
//    }
}
//public class Koneksi {
//    private String url = "jdbc:mysql://localhost/db_kodamkopi";
//    private String username = "root";
//    private String password = "";
//    
//    public Connection getKoneksi() throws ClassNotFoundException, SQLException{
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con = DriverManager.getConnection(url, username, password);
//                return con;
//    }
//    public static void main(String[] args){
//        Koneksi k = new Koneksi();
//        try {
//            k.getKoneksi();
//            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
//        } catch (ClassNotFoundException ex) {
//            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
//        }
//    }
//}
