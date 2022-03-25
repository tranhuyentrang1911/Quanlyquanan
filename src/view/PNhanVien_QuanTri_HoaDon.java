package view;

import controller.ChiTietHDDao;
import controller.HoaDonDao;
import controller.SanPhamDao;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ChiTietHD;
import model.HoaDon;
import model.NhanVien;
import model.SanPham;
import static view.TrangChu.Xulydn;

/**
 *
 * @author Admin
 */
public class PNhanVien_QuanTri_HoaDon extends javax.swing.JPanel {

    /**
     * Creates new form PAdmin_QuanTri
     */
    DefaultTableModel tblModel;

    NumberFormat formatter = new DecimalFormat("#,###");

    public PNhanVien_QuanTri_HoaDon(NhanVien n) {
        initComponents();
        setcbSP();
        soluong.setValue(1);
        tblModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tblModel.addColumn("Mã");
        tblModel.addColumn("Tên sản phẩm");
        tblModel.addColumn("Giá");
        tblModel.addColumn("Số lượng");
        tblModel.addColumn("Thành tiền (VNĐ)");
        HoaDon.setModel(tblModel);
        MaNV.setText(n.getMaNV());
        tenNV.setText(n.getTenNV());
        in.setEnabled(false);
    }

    private void setcbSP() {

        Vector<SanPham> c = new SanPhamDao().getListMASP();
        DefaultComboBoxModel model = new DefaultComboBoxModel(c);
        SP.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HoaDon = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        SP = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        soluong = new javax.swing.JSpinner();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        thanhtien = new javax.swing.JTextField();
        bt_khachdua = new javax.swing.JLabel();
        khachdua = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tralai = new javax.swing.JTextField();
        in = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tenNV = new javax.swing.JLabel();
        MaNV = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(740, 550));

        jPanel8.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));

        HoaDon.setBackground(new java.awt.Color(255, 204, 102));
        HoaDon.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(HoaDon);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("Chọn sản phẩm");

        jButton1.setBackground(new java.awt.Color(255, 204, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BanHang16x16.png"))); // NOI18N
        jButton1.setText("THÊM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 204, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 51));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete16.png"))); // NOI18N
        jButton3.setText("XOÁ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        SP.setBackground(new java.awt.Color(255, 204, 153));
        SP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 51));
        jLabel6.setText("Số lượng:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addComponent(SP, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButton1)
                .addGap(31, 31, 31)
                .addComponent(jButton3)
                .addGap(77, 77, 77)
                .addComponent(jLabel6)
                .addGap(37, 37, 37)
                .addComponent(soluong, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(SP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(soluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(256, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(87, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );

        jPanel8.add(jPanel5);
        jPanel5.setBounds(50, 20, 920, 310);

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 51));
        jLabel9.setText("Thanh Toán");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("Thành Tiền");

        bt_khachdua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_khachdua.setForeground(new java.awt.Color(204, 0, 51));
        bt_khachdua.setText("Tiền khách đưa");

        khachdua.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                khachduaCaretUpdate(evt);
            }
        });
        khachdua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                khachduaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Tiền trả lại:");

        in.setBackground(new java.awt.Color(255, 204, 153));
        in.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        in.setForeground(new java.awt.Color(204, 0, 51));
        in.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Print.PNG"))); // NOI18N
        in.setText("In hoá đơn");
        in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(bt_khachdua, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(thanhtien)
                            .addComponent(khachdua)
                            .addComponent(tralai, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                        .addGap(87, 87, 87)
                        .addComponent(in))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(thanhtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_khachdua)
                    .addComponent(khachdua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tralai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(in))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel6);
        jPanel6.setBounds(270, 340, 620, 150);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/banner1.jpg"))); // NOI18N
        jPanel8.add(jLabel7);
        jLabel7.setBounds(0, 0, 1010, 510);

        jLabel1.setText("jLabel1");
        jPanel8.add(jLabel1);
        jLabel1.setBounds(750, 30, 34, 14);

        jTabbedPane1.addTab("Quản lý hoá đơn", jPanel8);

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 495));

        jButton6.setBackground(new java.awt.Color(255, 204, 153));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/green-dollar 16x16.png"))); // NOI18N
        jButton6.setText("Hoá đơn");
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

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("MaNV:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 51));
        jLabel8.setText("Tên nhân viên:");

        tenNV.setForeground(new java.awt.Color(102, 0, 0));

        MaNV.setForeground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tenNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel8))
                            .addGap(8, 8, 8))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton6, jButton7});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton6, jButton7});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // doanh thu

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Vector<Vector> fin = new SanPhamDao().getListSP();

        String box = SP.getSelectedItem().toString();
        String part[] = box.split("\\ ");

        String gia = "";
        String ten = "";
        String ma = "";
        for (Vector o : fin) {
            if ((o.get(0).toString()).contains(part[0])) {
                gia = o.get(3).toString();
                ten = o.get(2).toString();
                ma = o.get(0).toString();
            }

        }
        int price = 0;
        int quantity = 0;
        int into = 1;
        Vector vec = new Vector();
        price = Integer.parseInt(gia);
        quantity = Integer.parseInt(soluong.getValue().toString());
        into = price * quantity;
        vec.add(ma);
        vec.add(ten);
        vec.add(gia);
        vec.add(soluong.getValue());
        vec.add(into);
        tblModel.addRow(vec);

        intomoney();
        khachdua.setText("");
        tralai.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    public void intomoney() {
        int price, totalprice = 0;
        int count = HoaDon.getRowCount();
        for (int i = 0; i < count; i++) {
            price = Integer.parseInt(HoaDon.getValueAt(i, 4).toString());
            totalprice += price;
        }
        thanhtien.setText(String.valueOf(totalprice));
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        int line = HoaDon.getSelectedRow();
        if (line < 0) {
            JOptionPane.showMessageDialog(null, "Chưa chọn sản phẩm cần xoá");
        } else {
            tblModel.removeRow(line);
            intomoney();
            khachdua.setText("");
            tralai.setText("");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void khachduaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_khachduaCaretUpdate
        // TODO add your handling code here:
        try {
            int Repay;

            Repay = Integer.parseInt(khachdua.getText()) - Integer.parseInt(thanhtien.getText());
            tralai.setText(String.valueOf(Repay));
            if (Repay < 0) {

                in.setEnabled(false);
                tralai.setText("");

            } else {

                in.setEnabled(true);

            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_khachduaCaretUpdate
    int n = new HoaDonDao().getListHD().size();
    int m = new ChiTietHDDao().getListIndex().size();
    SimpleDateFormat day = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");

    public boolean themHD() {
        Date date = new Date();
        String maNV = MaNV.getText();
        String strday = day.format(date);
        n++;
        int tongtien = Integer.parseInt(thanhtien.getText());
        HoaDon h = new HoaDon(n, maNV, strday, tongtien);
        return new HoaDonDao().addHD(h);
    }

    public void themCTHD() {

        int count = HoaDon.getRowCount();
        String maSP = "";
        int price = 0;
        int soL = 0;
        for (int i = 0; i < count; i++) {
            m++;
            maSP = HoaDon.getValueAt(i, 0).toString();
            price = Integer.parseInt(HoaDon.getValueAt(i, 4).toString());
            soL = Integer.parseInt(HoaDon.getValueAt(i, 3).toString());
            ChiTietHD ct = new ChiTietHD(m, n, maSP, soL, price);
            new ChiTietHDDao().addHDCT(ct);
        }

    }

    private void inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inActionPerformed
        // TODO add your handling code here:

        if (themHD()) {
            themCTHD();
            JOptionPane.showMessageDialog(null, "Thanh toán thành công",
                    "Thông báo", JOptionPane.DEFAULT_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "Thanh toán thất bại",
                    "Thông báo", JOptionPane.DEFAULT_OPTION);
        }
        Date date = new Date();
        try {
            Writer bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("History//" + n + ".txt"), "UTF8"));
            bw.write("\t\t\tQUAN AN NHANH\r\n\r\n");
            bw.write("\t\t141Chien Thang, Thanh Tri , Ha Noi\r\n");
            bw.write("\t\t\tSĐT: 0386299125\r\n\r\n");
            bw.write("\t\t\tHÓA ĐƠN BÁN HÀNG\r\n\r\n");
            bw.write("Mã hóa đơn: " + n + "\r\n");
            bw.write("Mã nhân viên: " + MaNV.getText() + "\r\n");
            bw.write("Tên nhân viên: " + tenNV.getText() + "\r\n");
            bw.write("Thời gian: " + ft.format(date) + "\r\n");

            bw.write("--------------------------------------------------------------\r\n");
            bw.write("STT\tMã\tTên sản phẩm\tSL\tĐơn giá\tThành tiền\r\n");
            bw.write("--------------------------------------------------------------\r\n");
            //Ghi sản phẩm
            int quantotal = 0;
            int line = HoaDon.getRowCount();
            for (int i = 0; i < line; i++) {
                String id = (String) tblModel.getValueAt(i, 0);
                String name = (String) tblModel.getValueAt(i, 1);
                String price = String.valueOf(tblModel.getValueAt(i, 2));
                String quantity = String.valueOf(tblModel.getValueAt(i, 3));
                String intomoney = String.valueOf(tblModel.getValueAt(i, 4));

                bw.write((i + 1) + "\t" + id + "\t" + name + "\t" + quantity + "\t" + price + "\t" + intomoney + "\r\n\r\n");
                quantotal += Integer.parseInt(quantity);
            }
            bw.write("---------------------------------------------------------------\r\n");
            bw.write("Tổng cộng:\t\t\t" + quantotal + "\t\t" + thanhtien.getText() + " VNĐ\r\n");

            bw.write("\t\t--------------------------------------------\r\n");
            bw.write("\t\tTiền khách đưa:\t\t\t" + khachdua.getText() + " VNĐ\r\n");
            bw.write("\t\tTiền trả lại:\t\t\t" + tralai.getText() + " VNĐ\r\n");
            bw.write("--------------------------------------------------------------\r\n");

            bw.write("Mật khẩu Wifi: tranhuyentrang\r\n");
            bw.write("---------------------CÁM ƠN QUÝ KHÁCH!------------------------");
            bw.close();

        } catch (Exception e) {

        }
        //Mở file txt
        Runtime run = Runtime.getRuntime();
        try {
            run.exec("notepad History//" + n + ".txt");
        } catch (IOException e) {
        }
        tblModel.setRowCount(0);
        thanhtien.setText("");
        khachdua.setText("");
        tralai.setText("");
        in.setEnabled(false);
    }//GEN-LAST:event_inActionPerformed

    private void khachduaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_khachduaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_khachduaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable HoaDon;
    private javax.swing.JLabel MaNV;
    private javax.swing.JComboBox SP;
    private javax.swing.JLabel bt_khachdua;
    private javax.swing.JButton in;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField khachdua;
    private javax.swing.JSpinner soluong;
    private javax.swing.JLabel tenNV;
    private javax.swing.JTextField thanhtien;
    private javax.swing.JTextField tralai;
    // End of variables declaration//GEN-END:variables
}
