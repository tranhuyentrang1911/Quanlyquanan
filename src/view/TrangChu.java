package view;

import common.DongHo;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Admin;
import model.NhanVien;

public class TrangChu extends javax.swing.JFrame {

    public static PAdmin_DangNhap admindn = new PAdmin_DangNhap();
    public static PNhanVien_DangNhap nhanviendn = new PNhanVien_DangNhap();
    public static PTrangChu tc = new PTrangChu();
    public static PAdmin_QuanTri_HoaDon hoadon = new PAdmin_QuanTri_HoaDon();
    public static PAdmin_QuanTri_DoanhThu doanhthu = new PAdmin_QuanTri_DoanhThu();
    public static PAdmin_QuanTri_NhaCC doitac = new PAdmin_QuanTri_NhaCC();
    public static PAdmin_QuanTri_DanhMuc danhmuc = new PAdmin_QuanTri_DanhMuc();
    public static PAdmin_QuanTri_NhanVien nhanvien = new PAdmin_QuanTri_NhanVien();
    public static PAdmin_QuanTri_SanPham sanpham = new PAdmin_QuanTri_SanPham();
    public static PAdmin_QuanTri_NhapHang nhaphang = new PAdmin_QuanTri_NhapHang();
    public static PNhanVien_QuanTri_HoaDon nvsanpham;
    public static Admin ad;
    public static NhanVien nv;

    public TrangChu() throws ClassNotFoundException, SQLException {
        initComponents();
        this.setResizable(false);
        this.setLocation(100, 5);
        this.setTitle("QUẢN LÝ QUẢN ĂN NHANH");
        Xulydn.setBottomComponent(tc);
        DongHo c = new DongHo();
        c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.topPane.add(c, java.awt.BorderLayout.SOUTH);
        Thread t = new Thread(c);
        t.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Xulydn = new javax.swing.JSplitPane();
        topPane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnThoat = new javax.swing.JMenu();
        dangnhap = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        thoat = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        Xulydn.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        topPane.setForeground(new java.awt.Color(153, 0, 0));
        topPane.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUÁN ĂN NHANH");
        topPane.add(jLabel1, java.awt.BorderLayout.CENTER);

        Xulydn.setLeftComponent(topPane);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1198, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );

        Xulydn.setRightComponent(jPanel1);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 204));

        mnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/NCC16x16.png"))); // NOI18N
        mnThoat.setText("Hệ Thống");

        dangnhap.setText("Đăng nhập Admin");
        dangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangnhapActionPerformed(evt);
            }
        });
        mnThoat.add(dangnhap);

        jMenuItem2.setText("Đăng nhập Nhân Viên");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnThoat.add(jMenuItem2);

        thoat.setText("Thoát");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });
        mnThoat.add(thoat);

        jMenuBar1.add(mnThoat);

        jMenu1.setText("Trợ Giúp");

        jMenuItem1.setText("Hướng dẫn");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Xulydn, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Xulydn, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dangnhapActionPerformed
    
        Xulydn.setBottomComponent(TrangChu.admindn);
    }//GEN-LAST:event_dangnhapActionPerformed
    
    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed
        JOptionPane.showMessageDialog(null, "Tạm biệt",
                "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_thoatActionPerformed


    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
  
        Xulydn.setBottomComponent(TrangChu.nhanviendn);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TrangChu().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JSplitPane Xulydn;
    private javax.swing.JMenuItem dangnhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JMenu mnThoat;
    private static javax.swing.JMenuItem thoat;
    private javax.swing.JPanel topPane;
    // End of variables declaration//GEN-END:variables
}
