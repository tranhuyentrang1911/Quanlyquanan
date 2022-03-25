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
public class ChiTietHD {
    private int ma;
    private int maDH;
    private  String maSP;
    private int soLuong;
    private int tongTien;

    public ChiTietHD() {
    }

    public ChiTietHD(int ma, int maDH, String maSP, int soLuong, int tongTien) {
        this.ma = ma;
        this.maDH = maDH;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

   

    public int getMaDH() {
        return maDH;
    }

    public void setMaDH(int maDH) {
        this.maDH = maDH;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

   

   
}
