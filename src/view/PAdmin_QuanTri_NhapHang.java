/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.NhaCCDao;
import controller.NhapHangDao;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.NhaCC;
import model.NhapHang;
import static view.TrangChu.Xulydn;

/**
 *
 * @author Admin
 */
public class PAdmin_QuanTri_NhapHang extends javax.swing.JPanel {

    public PAdmin_QuanTri_NhapHang() {
        initComponents();
        initTable(new NhapHangDao().getListNH());
        setcbNCC();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        hoadonbang = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        NhapHang = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaNH = new javax.swing.JTextField();
        txtTongTien = new javax.swing.JTextField();
        btnTHEM = new javax.swing.JButton();
        btnSUA = new javax.swing.JButton();
        btnXOA = new javax.swing.JButton();
        btnHUY = new javax.swing.JButton();
        txtngayLap = new javax.swing.JTextField();
        txtthongbao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtfind = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CBNCC = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        setForeground(new java.awt.Color(204, 0, 0));
        setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(740, 550));

        jPanel8.setLayout(null);

        NhapHang.setBackground(new java.awt.Color(255, 204, 102));
        NhapHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        NhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhapHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(NhapHang);

        javax.swing.GroupLayout hoadonbangLayout = new javax.swing.GroupLayout(hoadonbang);
        hoadonbang.setLayout(hoadonbangLayout);
        hoadonbangLayout.setHorizontalGroup(
            hoadonbangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hoadonbangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap())
        );
        hoadonbangLayout.setVerticalGroup(
            hoadonbangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hoadonbangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.add(hoadonbang);
        hoadonbang.setBounds(10, 53, 520, 408);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DANH SÁCH NHẬP HÀNG");
        jPanel8.add(jLabel2);
        jLabel2.setBounds(10, 28, 520, 14);

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));

        jLabel4.setText("Mã Nhập Hàng");

        jLabel5.setText("Mã NCC");

        jLabel6.setText("Ngày Lập");

        jLabel7.setText("Tổng tiền");

        btnTHEM.setBackground(new java.awt.Color(255, 204, 153));
        btnTHEM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btnTHEM.setText("Thêm");
        btnTHEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTHEMActionPerformed(evt);
            }
        });

        btnSUA.setBackground(new java.awt.Color(255, 204, 153));
        btnSUA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Edit.PNG"))); // NOI18N
        btnSUA.setText("Sửa");
        btnSUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSUAActionPerformed(evt);
            }
        });

        btnXOA.setBackground(new java.awt.Color(255, 204, 153));
        btnXOA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        btnXOA.setText("Xóa");
        btnXOA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXOAActionPerformed(evt);
            }
        });

        btnHUY.setBackground(new java.awt.Color(255, 204, 153));
        btnHUY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        btnHUY.setText("Hủy");
        btnHUY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHUYActionPerformed(evt);
            }
        });

        txtthongbao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtthongbao.setForeground(new java.awt.Color(153, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search-icon16.png"))); // NOI18N
        jLabel1.setText("Tìm kiếm");

        txtfind.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtfindCaretUpdate(evt);
            }
        });

        jLabel8.setText("Ngày lập");

        CBNCC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(txtthongbao))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addGap(18, 18, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                .addComponent(txtngayLap)
                                .addComponent(CBNCC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMaNH, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(btnTHEM)
                            .addGap(30, 30, 30)
                            .addComponent(btnSUA)
                            .addGap(30, 30, 30)
                            .addComponent(btnXOA, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnHUY))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel8)
                            .addGap(35, 35, 35)
                            .addComponent(txtfind, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtMaNH, txtTongTien, txtngayLap});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfind, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(55, 55, 55)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaNH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(txtthongbao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtngayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSUA)
                        .addComponent(btnXOA)
                        .addComponent(btnHUY))
                    .addComponent(btnTHEM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtMaNH, txtTongTien, txtngayLap});

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnHUY, btnSUA, btnTHEM, btnXOA});

        jPanel8.add(jPanel5);
        jPanel5.setBounds(540, 50, 450, 410);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/banner1.jpg"))); // NOI18N
        jPanel8.add(jLabel3);
        jLabel3.setBounds(0, 0, 1020, 510);

        jLabel10.setText("jLabel10");
        jPanel8.add(jLabel10);
        jLabel10.setBounds(710, 10, 40, 14);

        jTabbedPane1.addTab("Quản Lý Nhập Hàng", jPanel8);

        jButton1.setBackground(new java.awt.Color(255, 204, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Full-shopping-cart.png"))); // NOI18N
        jButton1.setText("Hóa Đơn");
        jButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton1.setPreferredSize(new java.awt.Dimension(73, 10));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sanpham.png"))); // NOI18N
        jButton2.setText("Sản Phẩm");
        jButton2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 204, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/information.png"))); // NOI18N
        jButton3.setText("Danh Mục");
        jButton3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 204, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/us.png"))); // NOI18N
        jButton4.setText("Nhân Viên");
        jButton4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 204, 153));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Users.png"))); // NOI18N
        jButton5.setText("Nhà cung cấp");
        jButton5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 204, 153));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/green-dollar 16x16.png"))); // NOI18N
        jButton6.setText("Doanh Thu");
        jButton6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 204, 153));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setForeground(new java.awt.Color(204, 0, 0));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/green-dollar 16x16.png"))); // NOI18N
        jButton8.setText("Nhập hàng");
        jButton8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 204, 153));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setForeground(new java.awt.Color(204, 0, 0));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_back.png"))); // NOI18N
        jButton7.setText("Đăng Xuất");
        jButton7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7});

        jPanel3.add(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //dang xuat        
  
        Xulydn.setBottomComponent(TrangChu.admindn);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // hoa don
        Xulydn.setBottomComponent(TrangChu.hoadon);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // sanpham
        Xulydn.setBottomComponent(TrangChu.sanpham);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // khach hang
        Xulydn.setBottomComponent(TrangChu.danhmuc);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // nhan vien
        Xulydn.setBottomComponent(TrangChu.nhanvien);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //doi tac
        Xulydn.setBottomComponent(TrangChu.doitac);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // doanh thu
        Xulydn.setBottomComponent(TrangChu.doanhthu);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnHUYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHUYActionPerformed
        // huy
        inittxt();
    }//GEN-LAST:event_btnHUYActionPerformed

    private void btnTHEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTHEMActionPerformed
        // them
        if (kiemtratrong() == false) {
            return;
        }
        if (themNH()) {
            JOptionPane.showMessageDialog(null, "Thêm thành công",
                    "Thông báo", JOptionPane.DEFAULT_OPTION);
            initTable(new NhapHangDao().getListNH());
            inittxt();
        } else {
            JOptionPane.showMessageDialog(null, "Thêm thất bại",
                    "Thông báo", JOptionPane.DEFAULT_OPTION);
        }
    }//GEN-LAST:event_btnTHEMActionPerformed

    private void btnSUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUAActionPerformed
        // sua
        if (this.txtMaNH.getText() == null || this.txtMaNH.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Mã nhập hàng trống!");
        } else {
            int x = JOptionPane.showConfirmDialog(null, ".Bạn có chắc muốn sửa thông tin nhập hàng " + this.txtMaNH.getText() + " không?");
            if (x == 0) {
                if (kiemtratrong() == false) {
                    return;
                }
                if (suaNH()) {
                    JOptionPane.showMessageDialog(null, "Sửa thành công",
                            "Thông báo", JOptionPane.DEFAULT_OPTION);
                    initTable(new NhapHangDao().getListNH());

                    inittxt();
                } else {
                    JOptionPane.showMessageDialog(null, "Sửa thất bại",
                            "Thông báo", JOptionPane.DEFAULT_OPTION);
                }

            }
        }
    }//GEN-LAST:event_btnSUAActionPerformed

    private void btnXOAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXOAActionPerformed
        // xoa
        if (this.txtMaNH.getText() == null || this.txtMaNH.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Mã nhập hàng trống!");
        } else {
            int x = JOptionPane.showConfirmDialog(null, "Xóa tất cả thông tin về đơn nhập hàng này.Bạn có chắc xóa?");
            if (x == 0) {
                if (new NhapHangDao().deleteNH(txtMaNH.getText())) {
                    JOptionPane.showMessageDialog(null, "Xóa thành công",
                            "Thông báo", JOptionPane.DEFAULT_OPTION);
                    initTable(new NhapHangDao().getListNH());
                    inittxt();
                } else {
                    JOptionPane.showMessageDialog(null, "Xóa thất bại",
                            "Thông báo", JOptionPane.DEFAULT_OPTION);
                }

            }
        }
    }//GEN-LAST:event_btnXOAActionPerformed

    private void NhapHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhapHangMouseClicked
        // click
        try {
            this.txtMaNH.setText(NhapHang.getModel().getValueAt(NhapHang.getSelectedRow(), 0).toString());
            CBNCC.setSelectedIndex(getvitrincc(NhapHang.getModel().getValueAt(NhapHang.getSelectedRow(), 1).toString()));
            this.txtngayLap.setText(NhapHang.getModel().getValueAt(NhapHang.getSelectedRow(), 2).toString());
            this.txtTongTien.setText(NhapHang.getModel().getValueAt(NhapHang.getSelectedRow(), 3).toString());

        } catch (Exception e) {
            System.out.println("Có giá trị null");
        }
    }//GEN-LAST:event_NhapHangMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Xulydn.setBottomComponent(TrangChu.nhaphang);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void txtfindCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtfindCaretUpdate
        // TODO add your handling code here:
        if (txtfind.getText().equals("")) {
            initTable(new NhapHangDao().getListNH());
        } else {
            initTable(settablengay());
        }

    }//GEN-LAST:event_txtfindCaretUpdate

    private Vector<Vector> settablengay() {
        Vector<Vector> fin = new NhapHangDao().getListNH();
        Vector finok = new Vector();
        for (Vector o : fin) {
            if ((o.get(2).toString()).contains(txtfind.getText())) {
                finok.add(o);
            }
        }
        return finok;
    }

    private void initTable(Vector s) {
        Vector column = new Vector(1);
        column.add("Mã NH");
        column.add("MaNCC");
        column.add("Ngày Lập");
        column.add("Tổng Tiền");

        DefaultTableModel model = new DefaultTableModel(s, column);
        this.NhapHang.setModel(model);
    }

    public void inittxt() {
        txtngayLap.setText("");
        txtTongTien.setText("");
        txtMaNH.setText("");
        CBNCC.setSelectedIndex(0);
    }

    private boolean themNH() {
        NhaCC ncc = (NhaCC) CBNCC.getSelectedItem();
        return new NhapHangDao().addNH(new NhapHang(this.txtMaNH.getText(), ncc.getMaNCC(), this.txtngayLap.getText(), Integer.parseInt(this.txtTongTien.getText())));
    }

    private boolean suaNH() {
        NhaCC ncc = (NhaCC) CBNCC.getSelectedItem();
        return new NhapHangDao().changeNH(new NhapHang(this.txtMaNH.getText(), ncc.getMaNCC(), this.txtngayLap.getText(), Integer.parseInt(this.txtTongTien.getText())));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CBNCC;
    private javax.swing.JTable NhapHang;
    private javax.swing.JButton btnHUY;
    private javax.swing.JButton btnSUA;
    private javax.swing.JButton btnTHEM;
    private javax.swing.JButton btnXOA;
    private javax.swing.JPanel hoadonbang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtMaNH;
    private javax.swing.JTextField txtTongTien;
    private javax.swing.JTextField txtfind;
    private javax.swing.JTextField txtngayLap;
    private javax.swing.JLabel txtthongbao;
    // End of variables declaration//GEN-END:variables

    public int getvitrincc(String mancc) {
        Vector<NhaCC> s = new NhaCCDao().getListMANCC();
        for (int i = 0; i < s.size(); i++) {

            if (mancc.toLowerCase().trim().equals(s.get(i).getMaNCC().toLowerCase().trim())) {
                return i;
            }
        }
        return 0;
    }

    private void setcbNCC() {

        Vector<NhaCC> c = new NhaCCDao().getListMANCC();
        DefaultComboBoxModel model = new DefaultComboBoxModel(c);
        CBNCC.setModel(model);
    }

    private boolean kiemtratrong() {
        if (this.txtMaNH.getText() == null || this.txtMaNH.getText().equals("")) {
            this.txtthongbao.setText("Mã NPP không được trống");
            txtMaNH.requestFocus();
            return false;
        }
        if (this.txtngayLap.getText() == null || this.txtngayLap.getText().equals("")) {
            this.txtthongbao.setText("Địa chỉ NPP không được trống");
            txtngayLap.requestFocus();
            return false;
        }
        if (this.txtTongTien.getText() == null || this.txtTongTien.getText().equals("")) {
            this.txtthongbao.setText("Email NPP không được trống");
            txtTongTien.requestFocus();
            return false;
        }

        return true;
    }

}
