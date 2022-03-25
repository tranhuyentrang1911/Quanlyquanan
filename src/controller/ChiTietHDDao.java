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
import model.ChiTietHD;

/**
 *
 * @author Admin
 */
public class ChiTietHDDao {

    public Vector getListIndex() {
        Connection conn = connect();
        ResultSet rs = null;
        Vector list = new Vector();
        try {
            PreparedStatement stmt = conn.prepareStatement(
                    "select * from CHITIETHOADON");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Vector list2 = new Vector();
                list2.add(rs.getInt(1));
                list2.add(rs.getInt(2));
                list2.add(rs.getString(3));
                list2.add(rs.getInt(4));
                list2.add(rs.getInt(5));

                list.add(list2);

            }

        } catch (SQLException e) {
            System.out.println("loi");
        }

        return list;

    }

    public Vector getListHDCT() {
        Connection conn = connect();
        ResultSet rs = null;
        Vector list = new Vector();
        try {
            PreparedStatement stmt = conn.prepareStatement(
                    "select c.MaHD,s.MaSP,s.TenSP,n.MaNV,n.HoVaTen,c.SoLuong,c.ThanhTien,h.ngayLap from dbo.CHITIETHOADON c,dbo.SANPHAM s,dbo.NHANVIEN n,dbo.tbHOADON h where c.MaSP=s.MaSP and h.MaNV=n.MaNV and h.MaHD=c.MaHD");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Vector list2 = new Vector();
                list2.add(rs.getInt(1));
                list2.add(rs.getString(2));
                list2.add(rs.getString(3));
                list2.add(rs.getString(4));
                list2.add(rs.getString(5));
                list2.add(rs.getInt(6));
                list2.add(rs.getInt(7));
                list2.add(common.validate.chuyenkieu_Date_to_String(rs.getString(8).trim()));

                list.add(list2);

            }

        } catch (SQLException e) {
            System.out.println("loi");

        }

        return list;

    }

    public Vector getListHDCTbyMaHD(int madh) {
        Connection conn = connect();
        ResultSet rs = null;
        Vector list = new Vector();
        try {
            PreparedStatement stmt = conn.prepareStatement(
                    "select c.MaHD,s.MaSP,s.TenSP,n.MaNV,n.HoVaTen,c.SoLuong,c.ThanhTien,h.ngayLap from dbo.CHITIETHOADON c,dbo.SANPHAM s,dbo.NHANVIEN n,dbo.tbHOADON h where c.MaSP=s.MaSP and h.MaNV=n.MaNV and h.MaHD=c.MaHD and h.MaHD=?");
            stmt.setInt(1, madh);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Vector list2 = new Vector();
                list2.add(rs.getInt(1));
                list2.add(rs.getString(2));
                list2.add(rs.getString(3));
                list2.add(rs.getString(4));
                list2.add(rs.getString(5));
                list2.add(rs.getInt(6));
                list2.add(rs.getInt(7));
                list2.add(common.validate.chuyenkieu_Date_to_String(rs.getString(8).trim()));

                list.add(list2);

            }

        } catch (SQLException e) {
            System.out.println("loi");
        }

        return list;

    }

    public Vector getListHDCTby2day(String start, String end) {
        Connection conn = connect();
        ResultSet rs = null;
        Vector list = new Vector();
        try {
            PreparedStatement stmt = conn.prepareStatement(
                    "select c.MaHD,s.MaSP,s.TenSP,n.MaNV,n.HoVaTen,c.SoLuong,c.ThanhTien,h.ngayLap from dbo.CHITIETHOADON c,dbo.SANPHAM s,dbo.NHANVIEN n,dbo.tbHOADON h where c.MaSP=s.MaSP and h.MaNV=n.MaNV and h.MaHD=c.MaHD and h.ngayLap between ? and ?");
            stmt.setDate(1, common.validate.chuyenkieudate_sqldate(start));
            stmt.setDate(2, common.validate.chuyenkieudate_sqldate(end));
            rs = stmt.executeQuery();

            while (rs.next()) {
                Vector list2 = new Vector();
                list2.add(rs.getInt(1));
                list2.add(rs.getString(2));
                list2.add(rs.getString(3));
                list2.add(rs.getString(4));
                list2.add(rs.getString(5));
                list2.add(rs.getInt(6));
                list2.add(rs.getInt(7));
                list2.add(common.validate.chuyenkieu_Date_to_String(rs.getString(8).trim()));

                list.add(list2);

            }

        } catch (SQLException e) {
            System.out.println("loi");
        }

        return list;

    }
  public String getspMaxHDCTby2day(String start, String end) {
        Connection conn = connect();
        ResultSet rs = null;
       String sp ="";
        try {
            PreparedStatement stmt = conn.prepareStatement(
                    "select TOP(1) s.TenSP from dbo.CHITIETHOADON c,dbo.SANPHAM s,dbo.NHANVIEN n,dbo.tbHOADON h where c.MaSP=s.MaSP and h.MaNV=n.MaNV and h.MaHD=c.MaHD and h.ngayLap between ? and ?\n" +
"	GROUP BY s.TenSP\n" +
"    ORDER BY COUNT(s.TenSP) DESC");
            stmt.setDate(1, common.validate.chuyenkieudate_sqldate(start));
            stmt.setDate(2, common.validate.chuyenkieudate_sqldate(end));
            rs = stmt.executeQuery();

            while (rs.next()) {
                sp = rs.getString(1);
            }

        } catch (SQLException e) {
            System.out.println("loi");
        }

        return sp;

    }
    public boolean addHDCT(ChiTietHD ct) {
        Connection conn = connect();

        try {
            PreparedStatement pr = conn.prepareStatement("insert into CHITIETHOADON(Ma,MaHD,MaSP,SoLuong,ThanhTien) values(?,?,?,?,?)");
            pr.setInt(1, ct.getMa());
            pr.setInt(2, ct.getMaDH());
            pr.setString(3, ct.getMaSP());
            pr.setInt(4, ct.getSoLuong());
            pr.setInt(5, ct.getTongTien());
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

}
