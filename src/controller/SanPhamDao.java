/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static common.Connecdb.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SanPham;

/**
 *
 * @author Admin
 */
public class SanPhamDao {

    public Vector getListSP() {
        Connection conn = connect();
        ResultSet rs = null;
        Vector list = new Vector();
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from SANPHAM");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Vector list2 = new Vector();
                list2.add(rs.getString(1));
                list2.add(rs.getString(2));
                list2.add(rs.getString(3));
                list2.add(rs.getInt(4));
                list2.add(rs.getString(5));
                list2.add(rs.getString(6));
                list2.add(rs.getString(7));

                list.add(list2);

            }

        } catch (SQLException e) {
            System.out.println("loi");
        }

        return list;

    }

    public Vector<SanPham> getListMASP_DM(String madm) {
        Connection conn = connect();
        ResultSet rs = null;
        Vector<SanPham> list = new Vector<SanPham>();
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from SANPHAM where MaDM=?");
            stmt.setString(1, madm);
            rs = stmt.executeQuery();
            while (rs.next()) {

                list.add(new SanPham(rs.getString(1), rs.getString(3)));

            }

        } catch (SQLException e) {
            System.out.println("loi");
        }

        return list;

    }

    public Vector<SanPham> getListMASP() {
        Connection conn = connect();
        ResultSet rs = null;
        Vector<SanPham> list = new Vector<SanPham>();
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from SANPHAM");
            rs = stmt.executeQuery();

            while (rs.next()) {

                list.add(new SanPham(rs.getString(1), rs.getString(3)));

            }

        } catch (SQLException e) {
            System.out.println("loi");
        }

        return list;

    }

    //them khach hang
    public boolean addSP(SanPham k) {
        Connection conn = connect();

        try {
            PreparedStatement pr = conn.prepareStatement("insert into SANPHAM values(?,?,?,?,?,?,?)");
            pr.setString(1, k.getMaSP());
            pr.setString(2, k.getMaDM());
            pr.setString(3, k.getTenSP());
            pr.setInt(4, k.getGia());
            pr.setString(5, k.getDuongan());
            pr.setString(6, k.getMoTa());
            pr.setBoolean(7, k.getNoiBat());
            int rs = pr.executeUpdate();
            if (rs == 1) {
                return true;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }

        return false;

    }

    // sua khach hang
    public boolean changeSP(SanPham k) {
        Connection conn = connect();
        try {
            PreparedStatement pr = conn.prepareStatement("Update  SANPHAM set Gia=?,TenSP=?,MoTa=?,NoiBat=?,DuongDanAnh=?, MaDM=? where MaSP=?");

            pr.setInt(1, k.getGia());
            pr.setString(2, k.getTenSP());
            pr.setString(3, k.getMoTa());
            pr.setBoolean(4, k.getNoiBat());
            pr.setString(5, k.getDuongan());
            pr.setString(6, k.getMaDM());
            pr.setString(7, k.getMaSP());
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
    public boolean deleteSP(String masp) {
        Connection conn = connect();
        try {
            PreparedStatement pr = conn.prepareCall("delete from SANPHAM where MaSP=?");
            pr.setString(1, masp);
            pr.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("loi");
            return false;

        }

    }
}
