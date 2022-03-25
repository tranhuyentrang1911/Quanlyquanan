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
public class SanPham {

    private String maSP, maDM;
    private String tenSP;
    private int gia;
    private String duongan, moTa;
    private Boolean noiBat;

    public SanPham() {
    }

    public SanPham(String tenSP) {
        this.tenSP = tenSP;
    }

    public void show() {
        System.out.println("SanPham{" + "maSP=" + maSP + ", maDM=" + maDM +  ", tenSP=" + tenSP + ", gia=" + gia + ", duongan=" + duongan + ", moTa=" + moTa + ", noiBat=" + noiBat + '}');
    }

    @Override
    public String toString() {
        return maSP + "-" + tenSP;
    }

    public SanPham(String maSP, String TenSP) {
        this.maSP = maSP;
        this.tenSP = TenSP;
    }

    public SanPham(String maSP, String maDM, String tenSP, int gia, String duongan, String moTa, Boolean noiBat) {
        this.maSP = maSP;
        this.maDM = maDM;
        this.tenSP = tenSP;
        this.gia = gia;
        this.duongan = duongan;
        this.moTa = moTa;
        this.noiBat = noiBat;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getMaDM() {
        return maDM;
    }

    public void setMaDM(String maDM) {
        this.maDM = maDM;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getDuongan() {
        return duongan;
    }

    public void setDuongan(String duongan) {
        this.duongan = duongan;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Boolean getNoiBat() {
        return noiBat;
    }

    public void setNoiBat(Boolean noiBat) {
        this.noiBat = noiBat;
    }

   

}
