/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import controller.ChiTietHDDao;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import static view.TrangChu.Xulydn;

/**
 *
 * @author Admin
 */
public class PAdmin_QuanTri_DoanhThu extends javax.swing.JPanel {

    public PAdmin_QuanTri_DoanhThu() {
        initComponents();
        initTable(new ChiTietHDDao().getListHDCT());

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
        TBTK = new javax.swing.JTable();
        lb1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb_tongthu = new javax.swing.JLabel();
        lb_sp = new javax.swing.JLabel();
        lb_nv = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        spmax = new javax.swing.JLabel();
        sum = new javax.swing.JLabel();
        sp = new javax.swing.JLabel();
        btnIN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNGAY = new javax.swing.JTextField();
        btnXEM = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNGAYDEN = new javax.swing.JTextField();
        txtthongbao = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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

        TBTK.setBackground(new java.awt.Color(255, 204, 102));
        TBTK.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TBTK);

        lb1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb1.setText("Tổng thu nhập:");

        lb2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb2.setText("Số lượng sp bán ra:");

        lb3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb3.setText("Sản phẩm có lượt mua nhiều nhất:");

        javax.swing.GroupLayout hoadonbangLayout = new javax.swing.GroupLayout(hoadonbang);
        hoadonbang.setLayout(hoadonbangLayout);
        hoadonbangLayout.setHorizontalGroup(
            hoadonbangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hoadonbangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hoadonbangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(hoadonbangLayout.createSequentialGroup()
                        .addGroup(hoadonbangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb1)
                            .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(hoadonbangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hoadonbangLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(hoadonbangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(hoadonbangLayout.createSequentialGroup()
                                        .addComponent(lb_tongthu, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(hoadonbangLayout.createSequentialGroup()
                                        .addGroup(hoadonbangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_nv, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_sp, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(hoadonbangLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(sum, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(lb3)
                                .addGap(37, 37, 37)
                                .addComponent(spmax, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hoadonbangLayout.setVerticalGroup(
            hoadonbangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hoadonbangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(hoadonbangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lb_tongthu))
                .addGap(18, 18, 18)
                .addGroup(hoadonbangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb1)
                    .addComponent(lb3)
                    .addComponent(spmax)
                    .addComponent(sum))
                .addGap(18, 18, 18)
                .addGroup(hoadonbangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb2)
                    .addComponent(lb_sp)
                    .addComponent(sp))
                .addGap(18, 18, 18)
                .addComponent(lb_nv)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.add(hoadonbang);
        hoadonbang.setBounds(10, 50, 1004, 320);

        btnIN.setBackground(new java.awt.Color(255, 204, 153));
        btnIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/report (1).png"))); // NOI18N
        btnIN.setText("IN THỐNG KÊ");
        btnIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINActionPerformed(evt);
            }
        });
        jPanel8.add(btnIN);
        btnIN.setBounds(640, 440, 175, 43);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Từ ngày");
        jPanel8.add(jLabel3);
        jLabel3.setBounds(320, 390, 70, 14);
        jPanel8.add(txtNGAY);
        txtNGAY.setBounds(400, 380, 159, 30);

        btnXEM.setBackground(new java.awt.Color(255, 204, 153));
        btnXEM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view.png"))); // NOI18N
        btnXEM.setText("XEM THỐNG KÊ");
        btnXEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXEMActionPerformed(evt);
            }
        });
        jPanel8.add(btnXEM);
        btnXEM.setBounds(840, 440, 172, 43);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Đến Ngày");
        jPanel8.add(jLabel6);
        jLabel6.setBounds(320, 440, 60, 14);
        jPanel8.add(txtNGAYDEN);
        txtNGAYDEN.setBounds(400, 430, 160, 30);

        txtthongbao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtthongbao.setForeground(new java.awt.Color(204, 0, 0));
        jPanel8.add(txtthongbao);
        txtthongbao.setBounds(140, 380, 170, 14);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/banner1.jpg"))); // NOI18N
        jLabel5.setText("Đến ngày");
        jPanel8.add(jLabel5);
        jLabel5.setBounds(0, 0, 1020, 510);

        jTabbedPane1.addTab("Quản Lý Doanh Thu", jPanel8);

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
                .addContainerGap())
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
                .addGap(11, 11, 11)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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

    private void btnXEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXEMActionPerformed
        // xem theo ngay
        if (kiemtratrong()) {
            initTable(new ChiTietHDDao().getListHDCTby2day(txtNGAY.getText(), txtNGAYDEN.getText()));
            thongke();
            init();
        } else {
            initTable(new ChiTietHDDao().getListHDCT());
            spmax.setText("");
            sum.setText("");
            sp.setText("");

        }
    }//GEN-LAST:event_btnXEMActionPerformed

    public void thongke() {
        int price, totalprice = 0;
        int sl, sumsl = 0;
        int count = TBTK.getRowCount();
        for (int i = 0; i < count; i++) {
            price = Integer.parseInt(TBTK.getValueAt(i, 6).toString());
            sl = Integer.parseInt(TBTK.getValueAt(i, 5).toString());
            totalprice += price;
            sumsl += sl;
        }
        spmax.setText(new ChiTietHDDao().getspMaxHDCTby2day(txtNGAY.getText(), txtNGAYDEN.getText()));
        sum.setText(String.valueOf(totalprice) + ".VND");
        sp.setText(String.valueOf(sumsl));
    }
    private void btnINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINActionPerformed
        // in hoa don

        try {
            File file = new File("Thongke.pdf");
            Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream(file));
            doc.open();

            PdfPTable tb = new PdfPTable(7);

            tb.addCell("MaHD");
            tb.addCell("MaSP");
            tb.addCell("Tên SP");
            tb.addCell("MaNV");
            tb.addCell("So luong");
            tb.addCell("Thanh tien");
            tb.addCell("Ngay lap");
            int count = TBTK.getRowCount();
            for (int i = 0; i < count; i++) {
                String mahd = TBTK.getValueAt(i, 0).toString();
                String masp = TBTK.getValueAt(i, 1).toString();
                String tensp = TBTK.getValueAt(i, 2).toString();
                String manv = TBTK.getValueAt(i, 3).toString();
                String soL = TBTK.getValueAt(i, 5).toString();
                String thanhtien = TBTK.getValueAt(i, 6).toString();
                String ngayL = TBTK.getValueAt(i, 7).toString();
                tb.addCell(mahd);
                tb.addCell(masp);
                tb.addCell(tensp);
                tb.addCell(manv);
                tb.addCell(soL);
                tb.addCell(thanhtien);
                tb.addCell(ngayL);

            }
            doc.add(tb);
            Phrase phrase = new Phrase();
            Chunk chunk = new Chunk("\n                         Tong thu:  " + sum.getText() + "\n                         San pham mua nhieu nhat:  " + spmax.getText() + "\n                         So luong san pham ban ra:  " + sp.getText());
            phrase.add(chunk);
            doc.add(phrase);

            doc.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //Mở file pdf
        if (Desktop.isDesktopSupported()) {
            try {
                File myFile = new File("Thongke.pdf");
                Desktop.getDesktop().open(myFile);
            } catch (IOException ex) {
                System.out.println("Lỗi không thể mở file");
            }
        }

    }//GEN-LAST:event_btnINActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Xulydn.setBottomComponent(TrangChu.nhaphang);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void initTable(Vector s) {
        Vector column = new Vector(1);
        column.add("MaHD");
        column.add("MaSP");
        column.add("Ten SP");
        column.add("MaNV");
        column.add("Ten Nhan Vien ");
        column.add("Số Lượng");
        column.add("Thành Tiền");
        column.add("Ngày Lập");

        DefaultTableModel model = new DefaultTableModel(s, column);
        this.TBTK.setModel(model);
    }

    public void init() {
        txtNGAY.setText("");
        txtNGAYDEN.setText("");
        txtthongbao.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBTK;
    private javax.swing.JButton btnIN;
    private javax.swing.JButton btnXEM;
    private javax.swing.JPanel hoadonbang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb_nv;
    private javax.swing.JLabel lb_sp;
    private javax.swing.JLabel lb_tongthu;
    private javax.swing.JLabel sp;
    private javax.swing.JLabel spmax;
    private javax.swing.JLabel sum;
    private javax.swing.JTextField txtNGAY;
    private javax.swing.JTextField txtNGAYDEN;
    private javax.swing.JLabel txtthongbao;
    // End of variables declaration//GEN-END:variables

    private boolean kiemtratrong() {
        if (this.txtNGAY.getText() == null || this.txtNGAY.getText().equals("")) {
            this.txtthongbao.setText("Ngày không được trống.");
            txtNGAY.requestFocus();
            return false;
        }
        if (this.txtNGAYDEN.getText() == null || this.txtNGAYDEN.getText().equals("")) {
            this.txtthongbao.setText("Ngày không được trống.");
            txtNGAYDEN.requestFocus();
            return false;
        }

        if (common.validate.checkdate(this.txtNGAY.getText()) == false) {
            this.txtthongbao.setText("Sai Ngày(MM/DD/YYY)");
            txtNGAY.requestFocus();
            return false;
        }

        if (common.validate.checkdate(this.txtNGAYDEN.getText()) == false) {
            this.txtthongbao.setText("Sai Ngày(MM/DD/YYY)");
            txtNGAYDEN.requestFocus();
            return false;
        }

        return true;
    }
}
