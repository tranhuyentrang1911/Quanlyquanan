/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static common.Connecdb.connect;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Admin;
import model.NhanVien;

/**
 *
 * @author Admin
 */
public class NhanVienDao {
    //danh sach khach hang

    public Vector getListNV() {
        Connection conn = connect();
        ResultSet rs = null;
        Vector list = new Vector();
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from NHANVIEN");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Vector list2 = new Vector();
                list2.add(rs.getString(1).trim());
                list2.add(rs.getString(2).trim());
                list2.add(rs.getString(3).trim());
                list2.add(rs.getString(4).trim());
                list2.add(rs.getString(5).trim());
                list2.add(rs.getString(6).trim().equals("1") ? "Đầu bếp" : rs.getString(6).trim().equals("2") ? "Order" : "Thu ngân");
                list2.add(common.validate.chuyenGioiTinh(rs.getString(7).trim()));
                list2.add(common.validate.chuyenkieu_Date_to_String(rs.getString(8).trim()));
                list2.add(common.validate.chuyenkieu_Date_to_String(rs.getString(9).trim()));
                list2.add(rs.getString(10) != null ? rs.getString(10) : "khong co");
                list.add(list2);

            }

        } catch (SQLException e) {
            System.out.println("loi");
        }

        return list;

    }

    //them khach hang
    public boolean addNV(NhanVien k) {
        Connection conn = connect();

        try {
            PreparedStatement pr = conn.prepareStatement("insert into NHANVIEN values(?,?,?,?,?,?,?,?,?,?,?)");
            pr.setString(1, k.getMaNV());
            pr.setString(2, k.getTenNV());
            pr.setString(3, k.getDiaChi());
            pr.setString(4, k.getSdt());
            pr.setString(5, k.getEmail());
            pr.setString(6, k.getChucVu());
            pr.setString(7, k.getGioitinh());
            pr.setDate(8, common.validate.chuyenkieudate_sqldate(k.getNgaysinh()));
            pr.setDate(9, common.validate.chuyenkieudate_sqldate(k.getNgayvaolam()));
            pr.setString(10, k.getGhichu());
            pr.setString(11, k.getMatKhau());
            int rs = pr.executeUpdate();
            if (rs == 1) {
                return true;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;

    }

    // sua khach hang
    public boolean changeNV(NhanVien k) {
        Connection conn = connect();
        try {
            PreparedStatement pr = conn.prepareStatement("Update  NHANVIEN set HoVaTen=?,DiaChi=?,Sdt=?,Email=?,ChucVu=?,GioiTinh=?,NgaySinh=?,NgayVaoLam=?,GhiChu=? where MaNV=?");

            pr.setString(1, k.getTenNV());
            pr.setString(2, k.getDiaChi());
            pr.setString(3, k.getSdt());
            pr.setString(4, k.getEmail());
            pr.setString(5, k.getChucVu());
            pr.setString(6, k.getGioitinh());
            pr.setDate(7, common.validate.chuyenkieudate_sqldate(k.getNgaysinh()));
            pr.setDate(8, common.validate.chuyenkieudate_sqldate(k.getNgayvaolam()));
            pr.setString(9, k.getGhichu());
            pr.setString(10, k.getMaNV());
            int rs = pr.executeUpdate();
            if (rs == 1) {
                return true;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("loi");
            return false;
        }

        return false;

    }

    //xoa khach hang
    public boolean deleteNV(String manv) {
        Connection conn = connect();
        try {
            PreparedStatement pr = conn.prepareCall("delete from NHANVIEN where MaNV=?");
            pr.setString(1, manv);
            pr.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("loi");
            return false;
        }

    }

    public NhanVien login(String manv, String mk) {
        Connection conn = connect();

        try {
            PreparedStatement pr = conn.prepareStatement("select *from  NHANVIEN  where MaNV=? and MatKhau=?");
            pr.setString(1, manv);
            pr.setString(2, mk);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                return new NhanVien(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("loi");
            return null;
        }

        return null;
    }

    public Admin loginADmin(String manv, String mk) {
        Connection conn = connect();

        try {
            PreparedStatement pr = conn.prepareStatement("select *from  QUANLY  where username=? and pass=?");
            pr.setString(1, manv);
            pr.setString(2, mk);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                return new Admin(rs.getString(1),
                        rs.getString(2)
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("loi");
            return null;
        }

        return null;
    }
}
