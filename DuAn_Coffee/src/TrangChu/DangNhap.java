/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TrangChu;


import Login.LoginDialog;
import Login.Server_Login;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author Hoàng Quân
 */
public class DangNhap extends javax.swing.JFrame {

    /**
     * Creates new form DangNhap
     */
    public DangNhap() {
        initComponents();
        setLocationRelativeTo(null);
        this.Menu();
        setTitle("Ứng dụng bán coffee - nhom 3");
        if (!Server_Login.daDangNhap()) {
            new LoginDialog(this, true).setVisible(true);
        }

        if (!Server_Login.daDangNhap()) {
            System.exit(0);
        } else {
            lblThongTin.setText("Người đăng nhập: " + Server_Login.user.getTenNV() + " - " + "Chức vụ: " + Server_Login.user.getChucVu());
        }
    }

    private void Menu() {
        XMenu xmenu = new XMenu(jpnView);
        List<Menu> listMN = new ArrayList<>();
        listMN.add(new Menu("BanHang", jpnBanHang, lblHang));
        listMN.add(new Menu("NhanVien", jpnNhanVien, lblNhanVien));
        listMN.add(new Menu("HoaDon", jpnHoaDon, lblDon));
        listMN.add(new Menu("KhachHang", jpnKhachHang, lblKhachHang));
        listMN.add(new Menu("VouCher", jpnVouCher, lblVoucher));
        listMN.add(new Menu("SanPham", jpnSanPham, lblPham));
        listMN.add(new Menu("ThongKe", jpnDoanhThu, lblDoanhThu));

        xmenu.setEvent(listMN);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnMenuu = new javax.swing.JPanel();
        jpnBanHang = new javax.swing.JPanel();
        lblHang = new javax.swing.JLabel();
        jpnHoaDon = new javax.swing.JPanel();
        lblDon = new javax.swing.JLabel();
        jpnSanPham = new javax.swing.JPanel();
        lblPham = new javax.swing.JLabel();
        jpnVouCher = new javax.swing.JPanel();
        lblVoucher = new javax.swing.JLabel();
        jpnNhanVien = new javax.swing.JPanel();
        lblNhanVien = new javax.swing.JLabel();
        jpnKhachHang = new javax.swing.JPanel();
        lblKhachHang = new javax.swing.JLabel();
        jpnDoanhThu = new javax.swing.JPanel();
        lblDoanhThu = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lblDangXuat = new javax.swing.JLabel();
        jpnThoai = new javax.swing.JPanel();
        lblThoai = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblThongTin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnMenuu.setBackground(new java.awt.Color(249, 236, 220));
        jpnMenuu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jpnBanHang.setBackground(new java.awt.Color(249, 236, 220));
        jpnBanHang.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblHang.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHang.setText("   Bán Hàng");
        lblHang.setPreferredSize(new java.awt.Dimension(100, 32));

        javax.swing.GroupLayout jpnBanHangLayout = new javax.swing.GroupLayout(jpnBanHang);
        jpnBanHang.setLayout(jpnBanHangLayout);
        jpnBanHangLayout.setHorizontalGroup(
                jpnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnBanHangLayout.createSequentialGroup()
                                .addComponent(lblHang, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jpnBanHangLayout.setVerticalGroup(
                jpnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jpnHoaDon.setBackground(new java.awt.Color(249, 236, 220));
        jpnHoaDon.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDon.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblDon.setText("   Hóa Đơn");
        lblDon.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout jpnHoaDonLayout = new javax.swing.GroupLayout(jpnHoaDon);
        jpnHoaDon.setLayout(jpnHoaDonLayout);
        jpnHoaDonLayout.setHorizontalGroup(
                jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHoaDonLayout.createSequentialGroup()
                                .addComponent(lblDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jpnHoaDonLayout.setVerticalGroup(
                jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jpnSanPham.setBackground(new java.awt.Color(249, 236, 220));
        jpnSanPham.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblPham.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPham.setText("   Sản Phẩm");
        lblPham.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout jpnSanPhamLayout = new javax.swing.GroupLayout(jpnSanPham);
        jpnSanPham.setLayout(jpnSanPhamLayout);
        jpnSanPhamLayout.setHorizontalGroup(
                jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnSanPhamLayout.createSequentialGroup()
                                .addComponent(lblPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jpnSanPhamLayout.setVerticalGroup(
                jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPham, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jpnVouCher.setBackground(new java.awt.Color(249, 236, 220));
        jpnVouCher.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblVoucher.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblVoucher.setText("   Voucher");
        lblVoucher.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout jpnVouCherLayout = new javax.swing.GroupLayout(jpnVouCher);
        jpnVouCher.setLayout(jpnVouCherLayout);
        jpnVouCherLayout.setHorizontalGroup(
                jpnVouCherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblVoucher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnVouCherLayout.setVerticalGroup(
                jpnVouCherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblVoucher, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jpnNhanVien.setBackground(new java.awt.Color(249, 236, 220));
        jpnNhanVien.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNhanVien.setText("   Nhân Viên");
        lblNhanVien.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout jpnNhanVienLayout = new javax.swing.GroupLayout(jpnNhanVien);
        jpnNhanVien.setLayout(jpnNhanVienLayout);
        jpnNhanVienLayout.setHorizontalGroup(
                jpnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnNhanVienLayout.setVerticalGroup(
                jpnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jpnKhachHang.setBackground(new java.awt.Color(249, 236, 220));
        jpnKhachHang.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblKhachHang.setText("   Khách hàng");
        lblKhachHang.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout jpnKhachHangLayout = new javax.swing.GroupLayout(jpnKhachHang);
        jpnKhachHang.setLayout(jpnKhachHangLayout);
        jpnKhachHangLayout.setHorizontalGroup(
                jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblKhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnKhachHangLayout.setVerticalGroup(
                jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jpnDoanhThu.setBackground(new java.awt.Color(249, 236, 220));
        jpnDoanhThu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDoanhThu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblDoanhThu.setText("   Doanh Thu");
        lblDoanhThu.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout jpnDoanhThuLayout = new javax.swing.GroupLayout(jpnDoanhThu);
        jpnDoanhThu.setLayout(jpnDoanhThuLayout);
        jpnDoanhThuLayout.setHorizontalGroup(
                jpnDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDoanhThu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnDoanhThuLayout.setVerticalGroup(
                jpnDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(249, 236, 220));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblDangXuat.setText("   Đăng Xuất");
        lblDangXuat.setPreferredSize(new java.awt.Dimension(100, 30));
        lblDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDangXuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jpnThoai.setBackground(new java.awt.Color(249, 236, 220));
        jpnThoai.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblThoai.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblThoai.setText("   Thoát");
        lblThoai.setPreferredSize(new java.awt.Dimension(100, 30));
        lblThoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThoaiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnThoaiLayout = new javax.swing.GroupLayout(jpnThoai);
        jpnThoai.setLayout(jpnThoaiLayout);
        jpnThoaiLayout.setHorizontalGroup(
                jpnThoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnThoaiLayout.createSequentialGroup()
                                .addComponent(lblThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jpnThoaiLayout.setVerticalGroup(
                jpnThoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblThoai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/tải xuống.png"))); // NOI18N
        jLabel1.setText("Logo");

        javax.swing.GroupLayout jpnMenuuLayout = new javax.swing.GroupLayout(jpnMenuu);
        jpnMenuu.setLayout(jpnMenuuLayout);
        jpnMenuuLayout.setHorizontalGroup(
                jpnMenuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jpnBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnVouCher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jpnMenuuLayout.setVerticalGroup(
                jpnMenuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnMenuuLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jpnBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jpnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jpnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jpnVouCher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jpnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jpnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jpnDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jpnThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
        );

        jpnView.setBackground(new java.awt.Color(251, 227, 203));
        jpnView.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anh/mau-thiet-ke-logo-ca-phe-dep-5.jpg"))); // NOI18N

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
                jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnViewLayout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1008, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(287, Short.MAX_VALUE))
        );
        jpnViewLayout.setVerticalGroup(
                jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnViewLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(245, 245, 245));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        lblThongTin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblThongTin.setText("Tên người dùng: Nhóm 3 - Chức vụ: Bộ 5 Siêu Đẳng");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblThongTin)
                                .addGap(513, 513, 513))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jpnMenuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jpnMenuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblThoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoaiMouseClicked
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "THOAT", JOptionPane.YES_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_lblThoaiMouseClicked

    private void lblDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseClicked
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?", "ĐĂNG XUẤT", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            Server_Login.dangXuat();
            JOptionPane.showMessageDialog(this, "Đăng xuất thành công!", "THÔNG BÁO", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            LoginDialog loginDialog = new LoginDialog(this, true);
            loginDialog.setVisible(true);
            if (Server_Login.daDangNhap()) {
                DangNhap dangNhap = new DangNhap();
                dangNhap.setVisible(true);
            } else {
                System.exit(0);
            }
        }
    }//GEN-LAST:event_lblDangXuatMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jpnBanHang;
    private javax.swing.JPanel jpnDoanhThu;
    private javax.swing.JPanel jpnHoaDon;
    private javax.swing.JPanel jpnKhachHang;
    private javax.swing.JPanel jpnMenuu;
    private javax.swing.JPanel jpnNhanVien;
    private javax.swing.JPanel jpnSanPham;
    private javax.swing.JPanel jpnThoai;
    private javax.swing.JPanel jpnView;
    private javax.swing.JPanel jpnVouCher;
    private javax.swing.JLabel lblDangXuat;
    private javax.swing.JLabel lblDoanhThu;
    private javax.swing.JLabel lblDon;
    private javax.swing.JLabel lblHang;
    private javax.swing.JLabel lblKhachHang;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblPham;
    private javax.swing.JLabel lblThoai;
    private javax.swing.JLabel lblThongTin;
    private javax.swing.JLabel lblVoucher;
    // End of variables declaration//GEN-END:variables
}
