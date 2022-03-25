package view;

import controller.NhanVienDao;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.NhanVien;
import static view.TrangChu.Xulydn;

public class PAdmin_QuanTri_NhanVien extends javax.swing.JPanel {

    public PAdmin_QuanTri_NhanVien() {
        initComponents();
        groupcb();
        initTable(new NhanVienDao().getListNV());
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
        TBNV = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtMANV = new javax.swing.JTextField();
        txtEMAIL = new javax.swing.JTextField();
        btnTHEM = new javax.swing.JButton();
        btnSUA = new javax.swing.JButton();
        btnXOA = new javax.swing.JButton();
        btnHUY = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtHOTEN = new javax.swing.JTextField();
        txtDIACHI = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFINTEN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFINMA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMATKHAU = new javax.swing.JTextField();
        cbCHUCVU = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNGAYSINH = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNGAYVAOLAM = new javax.swing.JTextField();
        cbNAM = new javax.swing.JRadioButton();
        cbNU = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGHICHU = new javax.swing.JTextArea();
        txtthongbao = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
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

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 204));

        jPanel8.setBackground(new java.awt.Color(255, 255, 204));
        jPanel8.setLayout(null);

        hoadonbang.setBackground(new java.awt.Color(255, 255, 204));

        TBNV.setBackground(new java.awt.Color(255, 204, 102));
        TBNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        TBNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBNV);

        javax.swing.GroupLayout hoadonbangLayout = new javax.swing.GroupLayout(hoadonbang);
        hoadonbang.setLayout(hoadonbangLayout);
        hoadonbangLayout.setHorizontalGroup(
            hoadonbangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 946, Short.MAX_VALUE)
            .addGroup(hoadonbangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(hoadonbangLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        hoadonbangLayout.setVerticalGroup(
            hoadonbangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
            .addGroup(hoadonbangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hoadonbangLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel8.add(hoadonbang);
        hoadonbang.setBounds(10, 10, 946, 190);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Danh Sách Nhân Viên");
        jPanel8.add(jLabel2);
        jLabel2.setBounds(10, 18, 127, 14);

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));

        jLabel10.setText("Mã Nhân Viên");

        jLabel11.setText("Họ Và Tên ");

        jLabel12.setText("Số điện thoại");

        jLabel13.setText("Email");

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
        btnHUY.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHUY.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnHUY.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnHUY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHUYActionPerformed(evt);
            }
        });

        jLabel16.setText("Địa chỉ");

        txtDIACHI.setAlignmentX(0.0F);
        txtDIACHI.setAlignmentY(0.0F);
        txtDIACHI.setAutoscrolls(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search-icon16.png"))); // NOI18N
        jLabel3.setText("Tìm kiếm");

        txtFINTEN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFINTENKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Tên");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Mã NV");

        txtFINMA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFINMAKeyReleased(evt);
            }
        });

        jLabel6.setText("Chức Vụ");

        jLabel7.setText("Mật Khẩu");

        cbCHUCVU.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Chọn chức vụ--", "Đầu bếp", "Order", "Thu ngân" }));
        cbCHUCVU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCHUCVUActionPerformed(evt);
            }
        });

        jLabel8.setText("Ghi chú");

        jLabel14.setText("Ngày Sinh");

        jLabel15.setText("Ngày vào làm");

        cbNAM.setText("Nam");

        cbNU.setText("Nữ");

        jLabel17.setText("Giới Tính");

        txtGHICHU.setColumns(20);
        txtGHICHU.setRows(5);
        jScrollPane2.setViewportView(txtGHICHU);

        txtthongbao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtthongbao.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMATKHAU, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbNAM, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(cbNU, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(txtMANV, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addGap(34, 34, 34))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addGap(54, 54, 54)))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(24, 24, 24)))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                    .addComponent(txtHOTEN)
                                    .addComponent(txtDIACHI)
                                    .addComponent(txtNGAYSINH)
                                    .addComponent(txtNGAYVAOLAM)))
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addGap(48, 48, 48)
                                                .addComponent(txtEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(32, 32, 32)
                                                .addComponent(cbCHUCVU, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(42, 42, 42)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel17)
                            .addComponent(txtthongbao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTHEM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSUA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXOA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHUY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtFINMA, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtFINTEN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(txtMANV, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtHOTEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel11))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel16)
                                            .addComponent(txtDIACHI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel12)
                                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17)))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbCHUCVU, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtMATKHAU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cbNAM)
                                            .addComponent(cbNU))))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNGAYSINH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel15)
                                            .addComponent(txtNGAYVAOLAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addComponent(jLabel8))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtthongbao)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(btnTHEM, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSUA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(btnXOA)
                                .addGap(18, 18, 18)
                                .addComponent(btnHUY))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFINTEN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFINMA, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtDIACHI, txtEMAIL, txtHOTEN, txtMANV, txtMATKHAU, txtNGAYSINH, txtNGAYVAOLAM, txtSDT});

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnHUY, btnSUA, btnTHEM, btnXOA});

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtFINMA, txtFINTEN});

        jPanel8.add(jPanel6);
        jPanel6.setBounds(20, 210, 930, 280);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/banner1.jpg"))); // NOI18N
        jPanel8.add(jLabel9);
        jLabel9.setBounds(0, 0, 980, 510);

        jTabbedPane1.addTab("Quản Lý Nhân Viên", jPanel8);

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
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addGap(0, 43, Short.MAX_VALUE))
            .addComponent(jTabbedPane1)
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7});

        jPanel3.add(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
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

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Xulydn.setBottomComponent(TrangChu.nhaphang);
    }//GEN-LAST:event_jButton8ActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // hoa don
        Xulydn.setBottomComponent(TrangChu.hoadon);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // sanpham
        Xulydn.setBottomComponent(TrangChu.sanpham);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbCHUCVUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCHUCVUActionPerformed

    }//GEN-LAST:event_cbCHUCVUActionPerformed

    private void txtFINMAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFINMAKeyReleased
        // tim theo ma
        if (txtFINMA.getText().equals("")) {
            initTable(new NhanVienDao().getListNV());
        } else {
            initTable(settablema());
        }
    }//GEN-LAST:event_txtFINMAKeyReleased

    private void txtFINTENKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFINTENKeyReleased
        // tim theo ten
        if (txtFINTEN.getText().equals("")) {
            initTable(new NhanVienDao().getListNV());
        } else {
            initTable(settableten());
        }
    }//GEN-LAST:event_txtFINTENKeyReleased

    private void btnHUYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHUYActionPerformed
        // huy
        inittxt();
    }//GEN-LAST:event_btnHUYActionPerformed

    private void btnXOAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXOAActionPerformed
        // xoa
        if (this.txtMANV.getText() == null || this.txtMANV.getText().equals("")) {
            txtthongbao.setText("Mã nhân viên trống.");
        } else {
            int x = JOptionPane.showConfirmDialog(null, "Xóa nhân viên này.Bạn có chắc xóa?");
            if (x == 0) {
                if (new NhanVienDao().deleteNV(txtMANV.getText())) {
                    JOptionPane.showMessageDialog(null, "Xóa thành công",
                            "Thông báo", JOptionPane.DEFAULT_OPTION);
                    initTable(new NhanVienDao().getListNV());
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

        if (kiemtratrong() == false) {
            return;
        }
        if (suanhanvien()) {
            JOptionPane.showMessageDialog(null, "Sửa thành công",
                    "Thông báo", JOptionPane.DEFAULT_OPTION);
            initTable(new NhanVienDao().getListNV());

            inittxt();
        } else {
            JOptionPane.showMessageDialog(null, "Sửa thất bại",
                    "Thông báo", JOptionPane.DEFAULT_OPTION);
        }
    }//GEN-LAST:event_btnSUAActionPerformed

    private void btnTHEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTHEMActionPerformed
        // them nhan vien
        if (kiemtratrong() == false) {
            return;
        }
        if (themnhanvien()) {
            JOptionPane.showMessageDialog(null, "Thêm thành công",
                    "Thông báo", JOptionPane.DEFAULT_OPTION);
            initTable(new NhanVienDao().getListNV());

            inittxt();
        } else {
            JOptionPane.showMessageDialog(null, "Thêm thất bại",
                    "Thông báo", JOptionPane.DEFAULT_OPTION);
        }
    }//GEN-LAST:event_btnTHEMActionPerformed

    private void TBNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBNVMouseClicked
        this.txtMANV.setText(TBNV.getModel().getValueAt(TBNV.getSelectedRow(), 0).toString());
        this.txtHOTEN.setText(TBNV.getModel().getValueAt(TBNV.getSelectedRow(), 1).toString());
        this.txtDIACHI.setText(TBNV.getModel().getValueAt(TBNV.getSelectedRow(), 2).toString());
        this.txtSDT.setText(TBNV.getModel().getValueAt(TBNV.getSelectedRow(), 3).toString());
        this.txtEMAIL.setText(TBNV.getModel().getValueAt(TBNV.getSelectedRow(), 4).toString());
        this.cbCHUCVU.setSelectedIndex(TBNV.getModel().getValueAt(TBNV.getSelectedRow(), 5).toString().equals("Đầu bếp") ? 1 : TBNV.getModel().getValueAt(TBNV.getSelectedRow(), 5).toString().equals("Order") ? 2 : 3);
        this.txtNGAYSINH.setText(TBNV.getModel().getValueAt(TBNV.getSelectedRow(), 7).toString());
        this.txtNGAYVAOLAM.setText(TBNV.getModel().getValueAt(TBNV.getSelectedRow(), 8).toString());
        this.txtGHICHU.setText(TBNV.getModel().getValueAt(TBNV.getSelectedRow(), 9).toString());
        String gt = TBNV.getModel().getValueAt(TBNV.getSelectedRow(), 6).toString();
        if (gt.equalsIgnoreCase("Nam")) {
            this.cbNAM.setSelected(true);
        } else {
            this.cbNU.setSelected(true);
        }
    }//GEN-LAST:event_TBNVMouseClicked

    public void groupcb() {
        ButtonGroup group = new ButtonGroup();
        group.add(this.cbNAM);
        group.add(this.cbNU);
        this.cbNAM.setSelected(true);
    }

    private void initTable(Vector s) {
        Vector column = new Vector(1);
        column.add("Ma NV");
        column.add("Ten NV");
        column.add("Địa Chỉ");
        column.add("SĐT");
        column.add("Email");
        column.add("Chức Vụ");
        column.add("Giới Tính");
        column.add("Ngày Sinh");
        column.add("Ngày Vào Làm");
        column.add("Ghi Chú");
        DefaultTableModel model = new DefaultTableModel(s, column);
        this.TBNV.setModel(model);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBNV;
    private javax.swing.JButton btnHUY;
    private javax.swing.JButton btnSUA;
    private javax.swing.JButton btnTHEM;
    private javax.swing.JButton btnXOA;
    private javax.swing.JComboBox cbCHUCVU;
    private javax.swing.JRadioButton cbNAM;
    private javax.swing.JRadioButton cbNU;
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
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtDIACHI;
    private javax.swing.JTextField txtEMAIL;
    private javax.swing.JTextField txtFINMA;
    private javax.swing.JTextField txtFINTEN;
    private javax.swing.JTextArea txtGHICHU;
    private javax.swing.JTextField txtHOTEN;
    private javax.swing.JTextField txtMANV;
    private javax.swing.JTextField txtMATKHAU;
    private javax.swing.JTextField txtNGAYSINH;
    private javax.swing.JTextField txtNGAYVAOLAM;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JLabel txtthongbao;
    // End of variables declaration//GEN-END:variables

    private boolean themnhanvien() {
        NhanVien s = new NhanVien(txtMANV.getText(),
                txtHOTEN.getText(),
                txtDIACHI.getText(),
                txtSDT.getText(),
                txtEMAIL.getText(),
                (cbCHUCVU.getSelectedIndex()) + "",
                (cbNAM.isSelected() ? "1" : "0"),
                txtNGAYSINH.getText(),
                txtNGAYVAOLAM.getText(),
                txtGHICHU.getText(),
                txtMATKHAU.getText());

        return new NhanVienDao().addNV(s);
    }

    private boolean suanhanvien() {
        NhanVien s = new NhanVien(txtMANV.getText(),
                txtHOTEN.getText(),
                txtDIACHI.getText(),
                txtSDT.getText(),
                txtEMAIL.getText(),
                (cbCHUCVU.getSelectedIndex()) + "",
                (cbNAM.isSelected() ? "1" : "0"),
                txtNGAYSINH.getText(),
                txtNGAYVAOLAM.getText(),
                txtGHICHU.getText(),
                txtMATKHAU.getText());

        return new NhanVienDao().changeNV(s);
    }

    public void inittxt() {

        this.txtDIACHI.setText("");
        this.txtEMAIL.setText("");
        this.txtNGAYSINH.setText("");
        this.txtNGAYVAOLAM.setText("");
        this.txtMATKHAU.setText("");
        this.txtMANV.setText("");
        this.txtSDT.setText("");
        this.txtthongbao.setText("");
        this.txtHOTEN.setText("");
        this.txtGHICHU.setText("");

    }

    private boolean kiemtratrong() {
        if (this.txtMANV.getText() == null || this.txtMANV.getText().equals("")) {
            this.txtthongbao.setText("Mã nhân viên không được trống");
            txtMANV.requestFocus();
            return false;
        }

        if (this.txtHOTEN.getText() == null || this.txtHOTEN.getText().equals("")) {
            this.txtthongbao.setText("Họ tên nhân viên không được trống");
            txtHOTEN.requestFocus();
            return false;
        }

        if (this.txtDIACHI.getText() == null || this.txtDIACHI.getText().equals("")) {
            this.txtthongbao.setText("Địa chỉ nhân viên không được trống");
            txtDIACHI.requestFocus();
            return false;
        }

        if (this.txtSDT.getText() == null || this.txtSDT.getText().equals("")) {
            this.txtthongbao.setText("Số điện thoại Nhân viên không được trống");
            txtSDT.requestFocus();
            return false;
        }

        if (this.txtNGAYSINH.getText() == null || this.txtNGAYSINH.getText().equals("")) {
            this.txtthongbao.setText("Ngày sinh nhân viên không được trống");
            txtNGAYSINH.requestFocus();
            return false;
        }
        if (this.txtNGAYVAOLAM.getText() == null || this.txtNGAYVAOLAM.getText().equals("")) {
            this.txtthongbao.setText("Ngày vào làm không được trống");
            txtNGAYVAOLAM.requestFocus();
            return false;
        }
        if (this.txtEMAIL.getText() == null || this.txtEMAIL.getText().equals("")) {
            this.txtthongbao.setText("Email nhân viên không được trống");
            txtEMAIL.requestFocus();
            return false;
        }

        if (this.cbCHUCVU.getSelectedIndex() == 0) {
            this.txtthongbao.setText("Vui lòng chọn chức vụ.");
            this.cbCHUCVU.requestFocus();
            return false;
        }
        if (this.txtMATKHAU.getText() == null || this.txtMATKHAU.getText().equals("")) {
            this.txtthongbao.setText("Mật khẩu nhân viên không được trống");
            txtMATKHAU.requestFocus();
            return false;
        }

        if (common.validate.checkdate(txtNGAYSINH.getText()) == false) {
            this.txtthongbao.setText("Sai ngày sinh(dd/mm/yyyy)");
            txtNGAYSINH.requestFocus();
            return false;
        }

        if (common.validate.checkdate(txtNGAYVAOLAM.getText()) == false) {
            this.txtthongbao.setText("Sai kiểu ngày (dd/mm/yyyy)");
            txtNGAYVAOLAM.requestFocus();
            return false;
        }
        return true;
    }

    private Vector<Vector> settableten() {
        Vector<Vector> fin = new NhanVienDao().getListNV();
        Vector finok = new Vector();
        for (Vector o : fin) {
            if ((o.get(1).toString()).contains(txtFINTEN.getText())) {
                finok.add(o);
            }
        }
        return finok;
    }

    private Vector<Vector> settablema() {
        Vector<Vector> fin = new NhanVienDao().getListNV();
        Vector finok = new Vector();
        for (Vector o : fin) {
            if ((o.get(0).toString()).contains(txtFINMA.getText())) {
                finok.add(o);
            }
        }
        return finok;
    }
}
