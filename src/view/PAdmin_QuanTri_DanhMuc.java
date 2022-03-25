package view;

import controller.DanhMucDao;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DanhMuc;
import static view.TrangChu.Xulydn;

/**
 *
 * @author Admin
 */
public class PAdmin_QuanTri_DanhMuc extends javax.swing.JPanel {

    public PAdmin_QuanTri_DanhMuc() {
        initComponents();
        initTable(new DanhMucDao().getListDM());

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
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMADM = new javax.swing.JTextField();
        btnTHEM = new javax.swing.JButton();
        btnSUA = new javax.swing.JButton();
        btnXOA = new javax.swing.JButton();
        btnHUY = new javax.swing.JButton();
        txtTenDM = new javax.swing.JTextField();
        txtthongbao = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(740, 550));

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(107, 28));

        jPanel8.setLayout(null);

        hoadonbang.setBackground(new java.awt.Color(255, 255, 204));

        jTable1.setBackground(new java.awt.Color(255, 204, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout hoadonbangLayout = new javax.swing.GroupLayout(hoadonbang);
        hoadonbang.setLayout(hoadonbangLayout);
        hoadonbangLayout.setHorizontalGroup(
            hoadonbangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hoadonbangLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        hoadonbangLayout.setVerticalGroup(
            hoadonbangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hoadonbangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.add(hoadonbang);
        hoadonbang.setBounds(120, 43, 580, 184);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Danh Sách Danh Mục");
        jPanel8.add(jLabel2);
        jLabel2.setBounds(210, 20, 270, 17);

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));
        jPanel6.setMinimumSize(new java.awt.Dimension(917, 231));
        jPanel6.setPreferredSize(new java.awt.Dimension(917, 231));

        jLabel10.setText("Mã DM");

        jLabel11.setText("Tên DM");

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

        txtTenDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenDMActionPerformed(evt);
            }
        });

        txtthongbao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtthongbao.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTHEM)
                        .addGap(42, 42, 42)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnSUA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnXOA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(50, 50, 50)
                        .addComponent(btnHUY)
                        .addGap(391, 391, 391))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenDM, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtthongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(txtMADM, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(139, 139, 139))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtMADM, txtTenDM});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMADM, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTHEM, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSUA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXOA)
                    .addComponent(btnHUY))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(txtthongbao)
                .addContainerGap())
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtMADM, txtTenDM});

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnHUY, btnSUA, btnTHEM, btnXOA});

        jPanel8.add(jPanel6);
        jPanel6.setBounds(120, 250, 580, 231);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/banner1.jpg"))); // NOI18N
        jPanel8.add(jLabel8);
        jLabel8.setBounds(0, 0, 1002, 540);

        jTabbedPane1.addTab("Quản Lý Danh Mục", jPanel8);

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 495));

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

        jButton8.setBackground(new java.awt.Color(255, 204, 153));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setForeground(new java.awt.Color(204, 0, 0));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/green-dollar 16x16.png"))); // NOI18N
        jButton8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton8.setLabel("Nhập hàng");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
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
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton2, jButton3, jButton4, jButton5, jButton6, jButton7});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 133, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHUYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHUYActionPerformed
        // huy
        inittxt();
    }//GEN-LAST:event_btnHUYActionPerformed

    private void btnXOAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXOAActionPerformed
        // xoa
        if (this.txtMADM.getText() == null || this.txtMADM.getText().equals("")) {
            txtthongbao.setText("Mã danh mục trống.");
        } else {
            int x = JOptionPane.showConfirmDialog(null, "Xóa danh mục này.Bạn có chắc xóa?");
            if (x == 0) {
                if (new DanhMucDao().deleteDM(txtMADM.getText())) {
                    JOptionPane.showMessageDialog(null, "Xóa thành công",
                            "Thông báo", JOptionPane.DEFAULT_OPTION);
                    initTable(new DanhMucDao().getListDM());
                    inittxt();
                } else {
                    JOptionPane.showMessageDialog(null, "Xóa thất bại",
                            "Thông báo", JOptionPane.DEFAULT_OPTION);
                }

            }
        }
    }//GEN-LAST:event_btnXOAActionPerformed

    private void btnSUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUAActionPerformed
        // sua
        if (this.txtMADM.getText() == null || this.txtMADM.getText().equals("")) {
            txtthongbao.setText("Mã danh mục trống.");
        } else {
            int x = JOptionPane.showConfirmDialog(null, ".Bạn có chắc muốn sửa thông tin danh mục " + this.txtMADM.getText() + " không?");
            if (x == 0) {
                if (kiemtratrong() == false) {
                    return;
                }
                if (suadanhmuc()) {
                    JOptionPane.showMessageDialog(null, "Sửa thành công",
                            "Thông báo", JOptionPane.DEFAULT_OPTION);
                    initTable(new DanhMucDao().getListDM());

                    inittxt();
                } else {
                    JOptionPane.showMessageDialog(null, "Sửa thất bại",
                            "Thông báo", JOptionPane.DEFAULT_OPTION);
                }

            }
        }
    }//GEN-LAST:event_btnSUAActionPerformed

    private void btnTHEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTHEMActionPerformed
        if (kiemtratrong() == false) {
            return;
        }
        if (themdanhmuc()) {
            JOptionPane.showMessageDialog(null, "Thêm thành công",
                    "Thông báo", JOptionPane.DEFAULT_OPTION);
            initTable(new DanhMucDao().getListDM());

            inittxt();
        } else {
            JOptionPane.showMessageDialog(null, "Thêm thất bại",
                    "Thông báo", JOptionPane.DEFAULT_OPTION);
        }
    }//GEN-LAST:event_btnTHEMActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        this.txtMADM.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0).toString());
        this.txtTenDM.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained

    }//GEN-LAST:event_jTable1FocusGained

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //dang xuat
        
        Xulydn.setBottomComponent(TrangChu.admindn);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // doanh thu
        Xulydn.setBottomComponent(TrangChu.doanhthu);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //doi tac
        Xulydn.setBottomComponent(TrangChu.doitac);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // nhan vien
        Xulydn.setBottomComponent(TrangChu.nhanvien);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // khach hang
        Xulydn.setBottomComponent(TrangChu.danhmuc);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // sanphams
        Xulydn.setBottomComponent(TrangChu.sanpham);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // hoa don
        Xulydn.setBottomComponent(TrangChu.hoadon);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Xulydn.setBottomComponent(TrangChu.nhaphang);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void txtTenDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenDMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenDMActionPerformed
    private void initTable(Vector s) {
        Vector column = new Vector(1);
        column.add("Ma DM");
        column.add("Ten DM");

        DefaultTableModel model = new DefaultTableModel(s, column);
        this.jTable1.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtMADM;
    private javax.swing.JTextField txtTenDM;
    private javax.swing.JLabel txtthongbao;
    // End of variables declaration//GEN-END:variables

    private boolean kiemtratrong() {
        if (this.txtMADM.getText() == null || this.txtMADM.getText().equals("")) {
            this.txtthongbao.setText("Mã danh mục không được trống");
            txtMADM.requestFocus();
            return false;
        }
       
        if (this.txtTenDM.getText() == null || this.txtTenDM.getText().equals("")) {
            this.txtthongbao.setText("Tên danh mục không được trống");
            txtTenDM.requestFocus();
            return false;
        }
        return true;
    }

    public void inittxt() {
       
        txtTenDM.setText("");
        txtMADM.setText("");
        this.txtthongbao.setText("");

    }

    private boolean themdanhmuc() {
        return new DanhMucDao().addDM(new DanhMuc(this.txtMADM.getText(), this.txtTenDM.getText()));
    }

    private boolean suadanhmuc() {
        return new DanhMucDao().changeDM(new DanhMuc(this.txtMADM.getText(), this.txtTenDM.getText()));
    }

   
}
