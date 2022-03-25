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
public class NhanVien {

    private String maNV, tenNV, chucVu, diaChi, Sdt, email, gioitinh, ngaysinh, ngayvaolam, ghichu, matKhau;

    public NhanVien(String maNV) {
        this.maNV = maNV;
    }

    public NhanVien() {
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public NhanVien(String maNV, String tenNV, String diaChi, String Sdt, String email, String chucVu, String gioitinh, String ngaysinh, String ngayvaolam, String ghichu, String matKhau) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.chucVu = chucVu;
        this.diaChi = diaChi;
        this.Sdt = Sdt;
        this.email = email;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.ngayvaolam = ngayvaolam;
        this.ghichu = ghichu;
        this.matKhau = matKhau;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getNgayvaolam() {
        return ngayvaolam;
    }

    public void setNgayvaolam(String ngayvaolam) {
        this.ngayvaolam = ngayvaolam;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    @Override
    public String toString() {
        return maNV;
    }
}
