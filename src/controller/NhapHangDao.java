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
import model.NhapHang;

/**
 *
 * @author Admin
 */
public class NhapHangDao {

    public Vector getListNH() {
        Connection conn = connect();
        ResultSet rs = null;
        Vector list = new Vector();
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from NHAPHANG");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Vector list2 = new Vector();
                list2.add(rs.getString(1));
                list2.add(rs.getString(2));
                list2.add(common.validate.chuyenkieu_Date_to_String(rs.getString(3)));
                list2.add(rs.getInt(4));

                list.add(list2);

            }

        } catch (SQLException e) {
            System.out.println("loi");
        }

        return list;

    }

    public boolean addNH(NhapHang k) {
        Connection conn = connect();

        try {
            PreparedStatement pr = conn.prepareStatement("insert into NHAPHANG values(?,?,?,?)");
            pr.setString(1, k.getMa());
            pr.setString(2, k.getMaNCC());
            pr.setDate(3, common.validate.chuyenkieudate_sqldate(k.getNgayLap()));
            pr.setInt(4, k.getTongTien());

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

    // sua nhap hang
    public boolean changeNH(NhapHang k) {
        Connection conn = connect();
        try {
            PreparedStatement pr = conn.prepareStatement("Update  NHAPHANG set MaNCC=?,ngayLap=?,TongTien=? where MaNH=?");
            pr.setString(4, k.getMa());
            pr.setString(1, k.getMaNCC());
            pr.setDate(2, common.validate.chuyenkieudate_sqldate(k.getNgayLap()));
            pr.setInt(3, k.getTongTien());

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

    //xoa nhap hang
    public boolean deleteNH(String ma) {
        Connection conn = connect();
        try {
            PreparedStatement pr = conn.prepareCall("delete from NHAPHANG where MaNH=?");
            pr.setString(1, ma);
            pr.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("loi");
            return false;
        }

    }
}
