/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KopiKodam.Model;

import java.util.Enumeration;
import javax.swing.AbstractButton;

/**
 *
 * @author ASUS ID
 */
public class Barang {
    private String namaBarang;
    private String satuan;
    private int jumlah, idBarang;
    private String tgl_masuk;

    public Barang(String namaBarang, String satuan, int jumlah, int idBarang, String tgl_masuk) {
        this.namaBarang = namaBarang;
        this.satuan = satuan;
        this.jumlah = jumlah;
        this.idBarang = idBarang;
        this.tgl_masuk = tgl_masuk;
    }

    public Barang(String text, Enumeration<AbstractButton> elements, int parseInt, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Barang(String text, Enumeration<AbstractButton> par, int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(int idBarang) {
        this.idBarang = idBarang;
    }

    public String getTgl_masuk() {
        return tgl_masuk;
    }

    public void setTgl_masuk(String tgl_masuk) {
        this.tgl_masuk = tgl_masuk;
    }
    
    
}