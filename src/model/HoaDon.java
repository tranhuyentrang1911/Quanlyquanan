/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class HoaDon {

    private int MaDH;
    private String MaNV;
    private String NgayLap;
    private int TongTien;

    public HoaDon() {
    }

    public HoaDon(int MaDH, String MaNV, String NgayLap, int TongTien) {
        this.MaDH = MaDH;
        this.MaNV = MaNV;
        this.NgayLap = NgayLap;
        this.TongTien = TongTien;
    }

    public int getMaDH() {
        return MaDH;
    }

    public void setMaDH(int MaDH) {
        this.MaDH = MaDH;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(String NgayLap) {
        this.NgayLap = NgayLap;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }

   

   
}
