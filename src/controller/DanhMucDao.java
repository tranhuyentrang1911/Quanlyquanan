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
import model.DanhMuc;

public class DanhMucDao {
      //danh sach khach hang

    public Vector getListDM() {
        Connection conn = connect();
        ResultSet rs = null;
        Vector list = new Vector();
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from DANHMUC");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Vector list2 = new Vector();
                list2.add(rs.getString(1));
                list2.add(rs.getString(2));

                list.add(list2);

            }

        } catch (SQLException e) {
            System.out.println("loi");
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DanhMucDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return list;

    }

    public Vector<DanhMuc> getListMADM() {
        Connection conn = connect();
        ResultSet rs = null;
        Vector<DanhMuc> list = new Vector<DanhMuc>();
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from DANHMUC");
            rs = stmt.executeQuery();

            while (rs.next()) {

                list.add(new DanhMuc(rs.getString(1), rs.getString(2)));

            }

        } catch (SQLException e) {
            System.out.println("loi");
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DanhMucDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return list;

    }
    //them khach hang

    public boolean addDM(DanhMuc k) {
        Connection conn = connect();

        try {
            PreparedStatement pr = conn.prepareStatement("insert into DANHMUC values(?,?)");
            pr.setString(1, k.getMaDM());
            pr.setString(2, k.getTenDM());

            int rs = pr.executeUpdate();
            if (rs == 1) {
                return true;
            }

        } catch (SQLException e) {
            System.out.println("loi");
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DanhMucDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return false;

    }

     // sua khach hang
    public boolean changeDM(DanhMuc k) {
        Connection conn = connect();
        try {
            PreparedStatement pr = conn.prepareStatement("Update  DANHMUC set TenDM=? where MaDM=?");
            pr.setString(1, k.getTenDM());
            pr.setString(2, k.getMaDM());
            int rs = pr.executeUpdate();
            if (rs == 1) {
                return true;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("loi");
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DanhMucDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return false;

    }

      //xoa khach hang
    public boolean deleteDM(String madm) {
        Connection conn = connect();
        try {
            PreparedStatement pr = conn.prepareCall("delete from DANHMUC where MaDM=?");
            pr.setString(1, madm);
            pr.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("loi");
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DanhMucDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
