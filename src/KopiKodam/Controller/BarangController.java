/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KopiKodam.Controller;

import KopiKodam.Dao.BarangDaoImp;
import KopiKodam.Koneksi.Koneksi;
import KopiKodam.Model.Barang;
import KopiKodam.View.BarangForm;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS ID
 */
public class BarangController {
    BarangForm view;
    Barang model;
    BarangDaoImp dao;
    Koneksi k;
    
    
    public BarangController(BarangForm view) {
        this.view = view;
    }
    
    public void clearForm(){
        
    }
    
//    public void getData(){
//        List<Barang> barang = new ArrayList<Barang>();
//        try {
//            dao = new BarangDaoImp(k.getKoneksi());
//            k = new Koneksi();
//            barang = dao.getAllBarang();
//            Object data[][] = new Object[barang.size()][5];
//            int x = 0;
//            for (Barang databarang : barang) {
//                data[x][0] = databarang.getIdbarang();
//                data[x][1] = databarang.getNamaBarang();
//                data[x][2] = databarang.getSatuan();
//                data[x][3] = databarang.getJumlah();
//                data[x][4] = databarang.getTgl_masuk();
//                ++x;
//            }
//            // model.addRow(data);
//            String[] header = { "Id Barang", "Nama Barang", "Satuan", "Jumlah", "Tanggal Masuk" };
// 
//            barang.setModel(new DefaultTableModel(data, nakol));
// 
//            TableColumn col1 = tabel.getColumnModel().getColumn(0);
// 
//            TableColumn col2 = tabel.getColumnModel().getColumn(1);
// 
//            TableColumn col3 = tabel.getColumnModel().getColumn(2);
// 
//            TableColumn col4 = tabel.getColumnModel().getColumn(3);
// 
//            TableColumn col5 = tabel.getColumnModel().getColumn(4);
// 
//        } catch (Exception e) {
// 
//            JOptionPane.showMessageDialog(null, &quot;Kesalahan Di &quot; + e.getMessage());
// 
//        }
//    }
    
    public void insert(){
        model = new Barang(
                view.getTxtNamaBarang().getText(), 
                (Enumeration<AbstractButton>) view.getCBSatuan().getSelectedItem(),
                Integer.parseInt(view.getTXTJumlah().getText())
        );
        k = new Koneksi();
        
        
        try {
//            dao = new BarangDaoImp(k.getKoneksi());
            dao.insert(k.getKoneksi(), model);
            JOptionPane.showMessageDialog(view, "Insert OK");
       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, "Insert Gagal");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(BarangController.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
//    
//    public void delete(){
//        model = new Barang(view.getTxtNamaBarang().getText(), view.getTxtSatuan().getText(), view.getTxtJumlah().getText(),
//                           view.getTxtTglmasuk().getText());
//        dao = new BarangDao();
//        k = new Koneksi();
//        try {
//            dao.delete(k.getKoneksi(), model);
//            JOptionPane.showMessageDialog(view, "Delete OK");
//        } catch (ClassNotFoundException ex) {
//            JOptionPane.showMessageDialog(view, "Delete Gagal");
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(view, "Delete Gagal");
//        }
//    }
//    
//    public void update(){
//        model = new Barang(view.getTxtNamaBarang().getText(), view.getBnSatuan().getElements(), Integer.parseInt(view.getTXTJumlah().getText()),
//                           view.getTxtTglMasuk().getText());
//        k = new Koneksi();
//        try {
//            dao.update(k.getKoneksi(), model);
//            JOptionPane.showMessageDialog(view, "Update OK");
//        } catch (ClassNotFoundException ex) {
//            JOptionPane.showMessageDialog(view, ex.getMessage());
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(view, ex.getMessage());
//        }
//    }
    
//    public void viewTable() {
//        DefaultTableModel tableModel = (DefaultTableModel) view.getTBarang().getModel();
//        tableModel.setRowCount(0);
//        
//        dao = new BarangDaoImp();
//        k = new Koneksi();
//        int i=1;
//        List<Barang> list;
//        try {
//            list = dao.getAllBarang(k.getKoneksi());
//            for(Barang b : list){
//                Object data []= {
//                    i++,
//                    b.getNamaBarang(),
//                    b.getSatuan(),
//                    b.getJumlah(),
//                    b.getTgl_masuk()
//                };
//                tableModel.addRow(data);
//            }
//        } catch (Exception e) {
//        }
    
//    public void viewTable() {
//        DefaultTableModel tableModel = (DefaultTableModel) view.getTBarang().getModel();
//        tableModel.setRowCount(0);
//        
//        dao = new BarangDaoImp();
//        k = new Koneksi();
//        int i=1;
//        
//        try {
//            List<Barang> List = dao.getAllBarang(k.getKoneksi());
//            for(Barang b : List){
//                Object data []= {
//                    i++,
//                    b.getIdBarang(),
//                    b.getNamaBarang(),
//                    b.getSatuan(),
//                    b.getJumlah(),
//                    b.getTgl_masuk()
//                };
//                tableModel.addRow(data);
//            }
//        } catch (Exception e) {
//        }
//    }
}
}
