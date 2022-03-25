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
public class NhapHang {
    private String ma, maNCC;
    private String ngayLap;
    private int tongTien ;

    public NhapHang(String ma, String maNCC, String ngayLap, int tongTien) {
        this.ma = ma;
        this.maNCC = maNCC;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
    
    
}
