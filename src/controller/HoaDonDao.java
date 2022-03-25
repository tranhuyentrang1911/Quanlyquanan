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
import model.HoaDon;

/**
 *
 * @author Admin
 */
public class HoaDonDao {

    public Vector getListHD() {
        Connection conn = connect();
        ResultSet rs = null;
        Vector list = new Vector();
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from tbHOADON");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Vector list2 = new Vector();
                list2.add(rs.getString(1).trim());
                list2.add(rs.getString(2).trim());
                list2.add(common.validate.chuyenkieu_Date_to_String(rs.getString(3).trim()));
                list2.add(rs.getString(4).trim());
                list.add(list2);

            }

        } catch (SQLException e) {
            System.out.println("loi");
        }

        return list;

    }

    //them khach hang
    public boolean addHD(HoaDon k) {
        Connection conn = connect();

        try {
            PreparedStatement pr = conn.prepareStatement("insert into tbHOADON values(?,?,?,?)");
            pr.setInt(1, k.getMaDH());
            pr.setString(2, k.getMaNV());
            pr.setDate(3, common.validate.chuyenkieudate_sqldate(k.getNgayLap()));
            pr.setInt(4, (int) k.getTongTien());

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

}
