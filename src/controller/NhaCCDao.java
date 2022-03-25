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
import model.NhaCC;

/**
 *
 * @author Admin
 */
public class NhaCCDao {

    public Vector getListNCC2() {
        Connection conn = connect();
        ResultSet rs = null;
        Vector list = new Vector();
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from NHACUNGCAP");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Vector list2 = new Vector();
                list2.add(rs.getString(1));
                list2.add(rs.getString(2));
                list2.add(rs.getString(3));
                list2.add(rs.getString(4));
                list2.add(rs.getString(5));
                list2.add(rs.getString(6));
                list.add(list2);

            }

        } catch (SQLException e) {
            System.out.println("loi");
        }

        return list;

    }

    public Vector getListMANCC() {
        Connection conn = connect();
        ResultSet rs = null;
        Vector list = new Vector();
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from NHACUNGCAP");
            rs = stmt.executeQuery();
            while (rs.next()) {

                list.add(new NhaCC(rs.getString(1), rs.getString(2)));

            }

        } catch (SQLException e) {
            System.out.println("loi");
        }

        return list;

    }

    public boolean addKH(NhaCC k) {
        Connection conn = connect();

        try {
            PreparedStatement pr = conn.prepareStatement("insert into NHACUNGCAP values(?,?,?,?,?,?)");
            pr.setString(1, k.getMaNCC());
            pr.setString(2, k.getTenNCC());
            pr.setString(3, k.getDiaChi());
            pr.setString(4, k.getSdt());
            pr.setString(5, k.getEmail());
            pr.setString(6, k.getGhichu() == null ? " " : k.getGhichu());

            int rs = pr.executeUpdate();
            if (rs == 1) {
                return true;
            }

        } catch (SQLException e) {
            System.out.println("loi");
            return false;
        }

        return false;

    }

    // sua nha cung cap
    public boolean changeKH(NhaCC k) {
        Connection conn = connect();
        try {
            PreparedStatement pr = conn.prepareStatement("Update  NHACUNGCAP set TenNCC=?,DiaChi=?,Sdt=?,Email=?,GhiChu=? where MaNCC=?");
            pr.setString(6, k.getMaNCC());
            pr.setString(1, k.getTenNCC());
            pr.setString(2, k.getDiaChi());
            pr.setString(3, k.getSdt());
            pr.setString(4, k.getEmail());
            pr.setString(5, k.getGhichu() == null ? " " : k.getGhichu());
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

    //xoa nha cung cap
    public boolean deleteKH(String mancc) {
        Connection conn = connect();
        try {
            PreparedStatement pr = conn.prepareCall("delete from NHACUNGCAP where MaNCC=?");
            pr.setString(1, mancc);
            pr.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("loi");
            return false;
        }

    }
}
