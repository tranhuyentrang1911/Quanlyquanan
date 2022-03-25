/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DanhMucDao;
import controller.SanPhamDao;
import java.awt.Image;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DanhMuc;
import model.SanPham;
import static view.TrangChu.Xulydn;

/**
 *
 * @author Admin
 */
public class PAdmin_QuanTri_SanPham extends javax.swing.JPanel {

    public PAdmin_QuanTri_SanPham() {
        initComponents();
        initTable(new SanPhamDao().getListSP());
        setcbDM();

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
        TBSP = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMASP = new javax.swing.JTextField();
        txtTENSP = new javax.swing.JTextField();
        txtGIA = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSUA = new javax.swing.JButton();
        btnXOA = new javax.swing.JButton();
        btnHUY = new javax.swing.JButton();
        CBMADM = new javax.swing.JComboBox();
        img = new javax.swing.JLabel();
        btnCHONANH = new javax.swing.JButton();
        txtthongbao = new javax.swing.JLabel();
        txtGHICHU = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        GHICHU = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(740, 550));

        jPanel8.setLayout(null);

        hoadonbang.setBackground(new java.awt.Color(255, 255, 204));

        TBSP.setBackground(new java.awt.Color(255, 204, 102));
        TBSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TBSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBSP);

        javax.swing.GroupLayout hoadonbangLayout = new javax.swing.GroupLayout(hoadonbang);
        hoadonbang.setLayout(hoadonbangLayout);
        hoadonbangLayout.setHorizontalGroup(
            hoadonbangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hoadonbangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
                .addContainerGap())
        );
        hoadonbangLayout.setVerticalGroup(
            hoadonbangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hoadonbangLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.add(hoadonbang);
        hoadonbang.setBounds(10, 43, 970, 180);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BẢNG SẢN PHẨM");
        jPanel8.add(jLabel2);
        jLabel2.setBounds(0, 10, 520, 14);

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));

        jLabel4.setText("Mã SP");

        jLabel5.setText("Mã DM");

        jLabel7.setText("Tên SP");

        jLabel8.setText("Giá");

        btnThem.setBackground(new java.awt.Color(255, 204, 153));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
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
        btnHUY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CANCEL.PNG"))); // NOI18N
        btnHUY.setText("Hủy");
        btnHUY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHUYActionPerformed(evt);
            }
        });

        CBMADM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        img.setText("Hình ảnh");

        btnCHONANH.setBackground(new java.awt.Color(255, 204, 153));
        btnCHONANH.setText("chọn ảnh");
        btnCHONANH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCHONANHActionPerformed(evt);
            }
        });

        txtthongbao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtthongbao.setForeground(new java.awt.Color(153, 0, 0));

        txtGHICHU.setText("Ghi Chú");

        GHICHU.setColumns(20);
        GHICHU.setRows(5);
        jScrollPane2.setViewportView(GHICHU);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(523, 523, 523)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnThem)
                        .addGap(30, 30, 30)
                        .addComponent(btnSUA, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)
                        .addComponent(btnHUY, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtthongbao))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(CBMADM, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtMASP, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTENSP, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(txtGIA, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtGHICHU))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(btnXOA, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btnCHONANH)
                        .addGap(31, 31, 31))))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtGIA, txtTENSP});

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CBMADM, txtMASP});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCHONANH)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMASP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtGIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGHICHU))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(CBMADM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTENSP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSUA)
                                .addComponent(btnXOA)
                                .addComponent(btnHUY)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtthongbao))
                        .addContainerGap())))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CBMADM, txtGIA, txtMASP, txtTENSP});

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnHUY, btnSUA, btnThem, btnXOA});

        jPanel8.add(jPanel5);
        jPanel5.setBounds(33, 250, 910, 210);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/banner1.jpg"))); // NOI18N
        jPanel8.add(jLabel17);
        jLabel17.setBounds(0, 0, 1020, 530);

        jTabbedPane1.addTab("Quản Lý Sản Phẩm", jPanel8);

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
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5, jButton7});

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // sanpham
        Xulydn.setBottomComponent(TrangChu.sanpham);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // doanh thu
        Xulydn.setBottomComponent(TrangChu.doanhthu);
    }//GEN-LAST:event_jButton6ActionPerformed

    public ImageIcon setIC(String path) {
        ImageIcon imgs = new ImageIcon(path);
        Image ig = imgs.getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ic = new ImageIcon(ig);
        return ic;
    }
    private void btnCHONANHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCHONANHActionPerformed
        try {
            // upload anh
            JFileChooser s = new JFileChooser("sanphamimg");
            s.showOpenDialog(this);
            java.io.File file = s.getSelectedFile();
            img.setIcon(setIC(file.getAbsolutePath()));
            img.setName(file.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("loi khi set anh");
        }
    }//GEN-LAST:event_btnCHONANHActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (kiemtratrong() == false) {
            return;
        }
        if (themSP()) {
            JOptionPane.showMessageDialog(null, "Thêm thành công",
                    "Thông báo", JOptionPane.DEFAULT_OPTION);
            initTable(new SanPhamDao().getListSP());
            inittxt();
        } else {
            JOptionPane.showMessageDialog(null, "Thêm thất bại",
                    "Thông báo", JOptionPane.DEFAULT_OPTION);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void TBSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBSPMouseClicked
        // click table
        this.txtMASP.setText(TBSP.getModel().getValueAt(TBSP.getSelectedRow(), 0).toString());
        this.txtTENSP.setText(TBSP.getModel().getValueAt(TBSP.getSelectedRow(), 2).toString());
        this.txtGIA.setText(TBSP.getModel().getValueAt(TBSP.getSelectedRow(), 3).toString());
        this.GHICHU.setText(TBSP.getModel().getValueAt(TBSP.getSelectedRow(), 5).toString());
        img.setName(TBSP.getModel().getValueAt(TBSP.getSelectedRow(), 4).toString());
        img.setIcon(setIC(TBSP.getModel().getValueAt(TBSP.getSelectedRow(), 4).toString()));
        CBMADM.setSelectedIndex(getvitridm(TBSP.getModel().getValueAt(TBSP.getSelectedRow(), 1).toString()));

    }//GEN-LAST:event_TBSPMouseClicked

    private void btnSUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUAActionPerformed
        // sua
        if (this.txtMASP.getText() == null || this.txtMASP.getText().equals("")) {
            txtthongbao.setText("Mã đơn hàng trống.");
        } else {
            int x = JOptionPane.showConfirmDialog(null, ".Bạn có chắc muốn sửa thông tin sản phẩm " + this.txtMASP.getText() + " không?");
            if (x == 0) {
                if (kiemtratrong() == false) {
                    return;
                }
                if (suaSP()) {
                    JOptionPane.showMessageDialog(null, "Sửa thành công",
                            "Thông báo", JOptionPane.DEFAULT_OPTION);
                    initTable(new SanPhamDao().getListSP());
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
       
        if (this.txtMASP.getText() == null || this.txtMASP.getText().equals("")) {
            txtthongbao.setText("Mã sản phẩm trống.");
        } else {
            int x = JOptionPane.showConfirmDialog(null, "Xóa sản phẩm này.Bạn có chắc xóa?");
            if (x == 0) {
                if (new SanPhamDao().deleteSP(txtMASP.getText())) {
                    JOptionPane.showMessageDialog(null, "Xóa thành công",
                            "Thông báo", JOptionPane.DEFAULT_OPTION);
                    initTable(new SanPhamDao().getListSP());
                    inittxt();
                } else {
                    JOptionPane.showMessageDialog(null, "Xóa thất bại",
                            "Thông báo", JOptionPane.DEFAULT_OPTION);
                }

            }
        }
    }//GEN-LAST:event_btnXOAActionPerformed

    private void btnHUYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHUYActionPerformed
        // huy
        inittxt();
    }//GEN-LAST:event_btnHUYActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // hoa don
        Xulydn.setBottomComponent(TrangChu.hoadon);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Xulydn.setBottomComponent(TrangChu.nhaphang);
    }//GEN-LAST:event_jButton8ActionPerformed

    public int getvitridm(String madm) {
        Vector<DanhMuc> s = new DanhMucDao().getListMADM();
        for (int i = 0; i < s.size(); i++) {

            if (madm.toLowerCase().trim().equals(s.get(i).getMaDM().toLowerCase().trim())) {
                return i;
            }
        }
        return 0;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CBMADM;
    private javax.swing.JTextArea GHICHU;
    private javax.swing.JTable TBSP;
    private javax.swing.JButton btnCHONANH;
    private javax.swing.JButton btnHUY;
    private javax.swing.JButton btnSUA;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXOA;
    private javax.swing.JPanel hoadonbang;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel txtGHICHU;
    private javax.swing.JTextField txtGIA;
    private javax.swing.JTextField txtMASP;
    private javax.swing.JTextField txtTENSP;
    private javax.swing.JLabel txtthongbao;
    // End of variables declaration//GEN-END:variables

    private void initTable(Vector s) {
        Vector column = new Vector(1);
        column.add("Mã SP");
        column.add("Mã DM");
        column.add("Tên SP");
        column.add("Gía");
        column.add("Đường dẫn");
        column.add("Mô tả");
        column.add("Nổi Bật");
        DefaultTableModel model = new DefaultTableModel(s, column);
        this.TBSP.setModel(model);
    }

    private void setcbDM() {

        Vector<DanhMuc> c = new DanhMucDao().getListMADM();
        DefaultComboBoxModel model = new DefaultComboBoxModel(c);
        CBMADM.setModel(model);
    }

    void inittxt() {
        this.txtMASP.setText("");
        this.txtGIA.setText("");
        this.txtTENSP.setText("");
        CBMADM.setSelectedIndex(0);
        txtthongbao.setText("");

        GHICHU.setText("");
    }

    private boolean kiemtratrong() {
        if (this.txtMASP.getText() == null || this.txtMASP.getText().equals("")) {
            this.txtthongbao.setText("Mã sản phẩms không được trống");
            txtMASP.requestFocus();
            return false;
        }
        if (this.txtTENSP.getText() == null || this.txtTENSP.getText().equals("")) {
            this.txtthongbao.setText("Tên sản phẩm không được trống");
            txtTENSP.requestFocus();
            return false;
        }
        if (this.txtGIA.getText() == null || this.txtGIA.getText().equals("")) {
            this.txtthongbao.setText("Gía sản phẩm không được trống");
            txtGIA.requestFocus();
            return false;
        }
        if (common.validate.checkDOUBLE(this.txtGIA.getText()) == false) {
            this.txtthongbao.setText("Sai giá.");
            txtGIA.requestFocus();
            return false;
        }
        if (this.img.getName() == null || this.img.getName().equals("")) {
            this.txtthongbao.setText("Chưa chọn hình.");
            img.requestFocus();
            return false;
        }

        return true;
    }

    private boolean themSP() {
        DanhMuc dm = (DanhMuc) CBMADM.getSelectedItem();

        return new SanPhamDao().addSP(new SanPham(
                this.txtMASP.getText(),
                dm.getMaDM(),
                this.txtTENSP.getText(),
                Integer.parseInt(txtGIA.getText()),
                img.getName(),
                GHICHU.getText() == null ? " " : GHICHU.getText(),
                false));

    }

    private boolean suaSP() {
        DanhMuc dm = (DanhMuc) CBMADM.getSelectedItem();

        SanPham k = new SanPham(
                this.txtMASP.getText(),
                dm.getMaDM(),
                this.txtTENSP.getText(),
                Integer.parseInt(txtGIA.getText()),
                img.getName(),
                GHICHU.getText() == null ? " " : GHICHU.getText(),
                false);
        k.show();
        return new SanPhamDao().changeSP(k);
    }
}
