/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KopiKodam.Dao;

import KopiKodam.Koneksi.Koneksi;
import KopiKodam.Model.Barang;
import java.sql.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.swing.AbstractButton;

/**
 *
 * @author ASUS ID
 */
public class BarangDaoImp {
//    private Connection k = Koneksi.getKoneksi();
    ResultSet rs;
    Statement stat;
    PreparedStatement ps;
    private String SQL_INSERT = "INSERT INTO barang VALUES(null, ?, ?, ?, now())";
    private String SQL_UPDATE = "UPDATE barang SET nama_barang=?, satuan=?, jumlah_stok=?, tanggal_masuk=? WHERE id_barang=?";
    private String SQL_DELETE = "DELETE FROM barang WHERE id_barang=?";
    private String SQL_GETALL = "SELECT * FROM barang";
    private String SQL_GETBYID = "SELECT * FROM barang WHERE id_barang=?";
    

    private Connection connection;
 
    



//    public BarangDaoImp() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    
    public void insert(Connection con, Barang barang) throws SQLException {
        ps = null;
        rs= null;
        try {
            ps = con.prepareStatement(SQL_INSERT);
            ps.setString(1, barang.getNamaBarang());
            ps.setString(2, barang.getSatuan());
            ps.setInt(3, barang.getJumlah());
            ps.executeUpdate();
        } catch (SQLException e) {
        } 
    }

    
    public void update(Connection con, Barang barang) throws SQLException {
        ps = null;
        rs= null;
        try {
            ps = con.prepareStatement(SQL_UPDATE);
            ps.setString(1, barang.getNamaBarang());
            ps.setString(2, barang.getSatuan());
            ps.setInt(3, barang.getJumlah());
            ps.setString(4, barang.getTgl_masuk());
            ps.setInt(5, barang.getIdBarang());
            ps.executeUpdate();
        } catch (SQLException e) {
        } 
    }

   
    public void delete(Connection con, Barang barang) throws SQLException {
        ps = null;
        rs= null;
        try {
            ps = con.prepareStatement(SQL_DELETE);
            ps.setInt(1, barang.getIdBarang());
            ps.executeUpdate();
        } catch (SQLException e) {
        } 
    }
    public void select(Connection con, Barang barang) throws SQLException{
        ps = null;
        rs = null;
        try{
            ps = con.prepareStatement(SQL_GETALL);
        }catch(SQLException e){
        }
    }

   
    public Barang getBarang(String kode) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    public List<Barang> getAllBarang(Connection koneksi) throws SQLException {
        ps = null;
        rs = null;
//        try {
//            List<Barang> list = new ArrayList<Barang>();
//            ps = connection.prepareStatement(SQL_GETALL);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                Barang barang = new Barang(view.getTxtNamaBarang().getText(), (Enumeration<AbstractButton>) view.getCBSatuan().getSelectedItem(), Integer.parseInt(view.getTXTJumlah().getText()));
//                barang.setIdBarang(rs.getInt("id_barang"));
//                barang.setNamaBarang(rs.getString("nama_barang"));
//                barang.setSatuan(rs.getString("satuan"));
//                barang.setJumlah(rs.getInt("jumlah_stok"));
//                barang.setTgl_masuk(rs.getString("tanggal_masuk"));
//                list.add(barang);
//            }
//            return list;
//        } catch (SQLException e) {
//            throw e;
//        } 
return null;
    }

//    public List<Barang> getAllBarang(Connection koneksi) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
