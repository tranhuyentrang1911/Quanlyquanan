/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.NhaCCDao;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.NhaCC;
import static view.TrangChu.Xulydn;

/**
 *
 * @author Admin
 */
public class PAdmin_QuanTri_NhaCC extends javax.swing.JPanel {


    public PAdmin_QuanTri_NhaCC() {
        initComponents();
        initTable(new NhaCCDao().getListNCC2());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        hoadonbang = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBDT = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMANPP = new javax.swing.JTextField();
        txtEMAIL = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        btnTHEM = new javax.swing.JButton();
        btnSUA = new javax.swing.JButton();
        btnXOA = new javax.swing.JButton();
        btnHUY = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtGHICHU = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txtTEN = new javax.swing.JTextField();
        txtDIACHI = new javax.swing.JTextField();
        txtthongbao = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setForeground(new java.awt.Color(204, 0, 0));
        setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(740, 550));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1183, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel1);

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

        jButton8.setBackground(new java.awt.Color(255, 204, 153));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setForeground(new java.awt.Color(204, 0, 0));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/green-dollar 16x16.png"))); // NOI18N
        jButton8.setText("Nhập hàng");
        jButton8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton8.setPreferredSize(new java.awt.Dimension(143, 41));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
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

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 204));

        jPanel8.setBackground(new java.awt.Color(255, 255, 204));
        jPanel8.setLayout(null);

        hoadonbang.setBackground(new java.awt.Color(255, 255, 204));

        TBDT.setBackground(new java.awt.Color(255, 204, 102));
        TBDT.setModel(new javax.swing.table.DefaultTableModel(
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
        TBDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBDTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBDT);

        javax.swing.GroupLayout hoadonbangLayout = new javax.swing.GroupLayout(hoadonbang);
        hoadonbang.setLayout(hoadonbangLayout);
        hoadonbangLayout.setHorizontalGroup(
            hoadonbangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hoadonbangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
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
        hoadonbang.setBounds(20, 60, 490, 408);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NHÀ CUNG CẤP");
        jPanel8.add(jLabel2);
        jLabel2.setBounds(20, 30, 520, 14);

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));

        jLabel4.setText("Mã NPP");

        jLabel5.setText("Tên NPP");

        jLabel6.setText("Địa Chỉ");

        jLabel7.setText("Số Điện Thoại");

        jLabel8.setText("Email");

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

        txtGHICHU.setColumns(20);
        txtGHICHU.setRows(5);
        jScrollPane3.setViewportView(txtGHICHU);

        jLabel9.setText("Ghi chú");

        txtthongbao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtthongbao.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMANPP, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTEN)
                            .addComponent(txtDIACHI)
                            .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(txtEMAIL, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(txtthongbao))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnTHEM)
                        .addGap(30, 30, 30)
                        .addComponent(btnSUA)
                        .addGap(30, 30, 30)
                        .addComponent(btnXOA, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHUY)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDIACHI, txtEMAIL, txtMANPP, txtSDT, txtTEN});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMANPP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDIACHI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(txtthongbao)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSUA)
                        .addComponent(btnXOA)
                        .addComponent(btnHUY))
                    .addComponent(btnTHEM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtDIACHI, txtEMAIL, txtMANPP, txtSDT, txtTEN});

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnHUY, btnSUA, btnTHEM, btnXOA});

        jPanel8.add(jPanel5);
        jPanel5.setBounds(520, 60, 476, 410);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/banner1.jpg"))); // NOI18N
        jPanel8.add(jLabel3);
        jLabel3.setBounds(0, 0, 1000, 520);

        jLabel10.setText("jLabel10");
        jPanel8.add(jLabel10);
        jLabel10.setBounds(710, 10, 40, 14);

        jTabbedPane1.addTab("Quản Lý Nhà Cung Cấp", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
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
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7});

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
        if (themNCC()) {
            JOptionPane.showMessageDialog(null, "Thêm thành công",
                    "Thông báo", JOptionPane.DEFAULT_OPTION);
            initTable(new NhaCCDao().getListNCC2());
            inittxt();
        } else {
            JOptionPane.showMessageDialog(null, "Thêm thất bại",
                    "Thông báo", JOptionPane.DEFAULT_OPTION);
        }
    }//GEN-LAST:event_btnTHEMActionPerformed

    private void btnSUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUAActionPerformed
        // sua
        if (this.txtMANPP.getText() == null || this.txtMANPP.getText().equals("")) {
            txtthongbao.setText("Mã NPP trống.");
        } else {
            int x = JOptionPane.showConfirmDialog(null, ".Bạn có chắc muốn sửa thông tin NCC " + this.txtMANPP.getText() + " không?");
            if (x == 0) {
                if (kiemtratrong() == false) {
                    return;
                }
                if (suaNPP()) {
                    JOptionPane.showMessageDialog(null, "Sửa thành công",
                            "Thông báo", JOptionPane.DEFAULT_OPTION);
                    initTable(new NhaCCDao().getListNCC2());

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
        if (this.txtMANPP.getText() == null || this.txtMANPP.getText().equals("")) {
            txtthongbao.setText("Mã khách hàng trống.");
        } else {
            int x = JOptionPane.showConfirmDialog(null, "Xóa NCC này.Bạn có chắc xóa?");
            if (x == 0) {
                if (new NhaCCDao().deleteKH(txtMANPP.getText())) {
                    JOptionPane.showMessageDialog(null, "Xóa thành công",
                            "Thông báo", JOptionPane.DEFAULT_OPTION);
                    initTable(new NhaCCDao().getListNCC2());
                    inittxt();
                } else {
                    JOptionPane.showMessageDialog(null, "Xóa thất bại",
                            "Thông báo", JOptionPane.DEFAULT_OPTION);
                }

            }
        }
    }//GEN-LAST:event_btnXOAActionPerformed

    private void TBDTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBDTMouseClicked
        // click
        try {
            this.txtMANPP.setText(TBDT.getModel().getValueAt(TBDT.getSelectedRow(), 0).toString());
            this.txtTEN.setText(TBDT.getModel().getValueAt(TBDT.getSelectedRow(), 1).toString());
            this.txtDIACHI.setText(TBDT.getModel().getValueAt(TBDT.getSelectedRow(), 2).toString());
            this.txtSDT.setText(TBDT.getModel().getValueAt(TBDT.getSelectedRow(), 3).toString());
            this.txtEMAIL.setText(TBDT.getModel().getValueAt(TBDT.getSelectedRow(), 4).toString());
            this.txtGHICHU.setText(TBDT.getModel().getValueAt(TBDT.getSelectedRow(), 5).toString());
        } catch (Exception e) {
            System.out.println("Có giá trị null");
        }
    }//GEN-LAST:event_TBDTMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Xulydn.setBottomComponent(TrangChu.nhaphang);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void initTable(Vector s) {
        Vector column = new Vector(1);
        column.add("Mã NPP");
        column.add("Tên NPP");
        column.add("Địa Chỉ");
        column.add("SDT");
        column.add("Email");
        column.add("Ghi Chú");
        DefaultTableModel model = new DefaultTableModel(s, column);
        this.TBDT.setModel(model);
    }

    public void inittxt() {
        txtDIACHI.setText("");
        txtEMAIL.setText("");
        txtGHICHU.setText("");
        txtSDT.setText("");
        txtTEN.setText("");
        txtMANPP.setText("");
        this.txtthongbao.setText("");

    }

    private boolean themNCC() {
        return new NhaCCDao().addKH(new NhaCC(this.txtMANPP.getText(), this.txtTEN.getText(), this.txtDIACHI.getText(), this.txtSDT.getText(), this.txtEMAIL.getText(), this.txtGHICHU.getText() == null ? " " : this.txtGHICHU.getText()));
    }

    private boolean suaNPP() {
        return new NhaCCDao().changeKH(new NhaCC(this.txtMANPP.getText(), this.txtTEN.getText(), this.txtDIACHI.getText(), this.txtSDT.getText(), this.txtEMAIL.getText(), this.txtGHICHU.getText() == null ? " " : this.txtGHICHU.getText()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBDT;
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtDIACHI;
    private javax.swing.JTextField txtEMAIL;
    private javax.swing.JTextArea txtGHICHU;
    private javax.swing.JTextField txtMANPP;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTEN;
    private javax.swing.JLabel txtthongbao;
    // End of variables declaration//GEN-END:variables

    private boolean kiemtratrong() {
        if (this.txtMANPP.getText() == null || this.txtMANPP.getText().equals("")) {
            this.txtthongbao.setText("Mã NPP không được trống");
            txtMANPP.requestFocus();
            return false;
        }
        if (this.txtDIACHI.getText() == null || this.txtDIACHI.getText().equals("")) {
            this.txtthongbao.setText("Địa chỉ NPP không được trống");
            txtDIACHI.requestFocus();
            return false;
        }
        if (this.txtEMAIL.getText() == null || this.txtEMAIL.getText().equals("")) {
            this.txtthongbao.setText("Email NPP không được trống");
            txtEMAIL.requestFocus();
            return false;
        }
        if (this.txtTEN.getText() == null || this.txtTEN.getText().equals("")) {
            this.txtthongbao.setText("Họ tên NPP không được trống");
            txtTEN.requestFocus();
            return false;
        }

        if (this.txtSDT.getText() == null || this.txtSDT.getText().equals("")) {
            this.txtthongbao.setText("Số điện thoại NPP không được trống");
            txtSDT.requestFocus();
            return false;
        }

        return true;
    }

}
