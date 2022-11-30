/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package market.app.client.ui;

import entity.Account;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import market.app.client.Config;
import market.app.client.connect.ConnectServer;
import market.app.client.ui.manager.frmMenuManager;
import market.app.client.ui.staff.frmMenuStaff;
import service.IAccountService;

/**
 *
 * @author Le Tuan
 */
public class frmLogin extends javax.swing.JFrame {

    private IAccountService accountService;

    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
        initComponents();
        //set full size
        this.setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        accountService = ConnectServer.getInstance().getAccountService();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("checked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnLogin = new javax.swing.JPanel();
        lblNameShop = new javax.swing.JLabel();
        lblTiltle = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        lblForgotPassword = new javax.swing.JLabel();
        pnImage = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnLogin.setBackground(new java.awt.Color(226, 254, 254));
        pnLogin.setPreferredSize(new java.awt.Dimension(400, 618));

        lblNameShop.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblNameShop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameShop.setText("QUẢN LÝ SIÊU THỊ");
        lblNameShop.setToolTipText("");

        lblTiltle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTiltle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiltle.setText("Đăng nhập");

        txtUserName.setToolTipText("Tài khoản là mã nhân viên");
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(7, 142, 227));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-login-rounded-24.png"))); // NOI18N
        btnLogin.setText("Đăng nhập");
        btnLogin.setToolTipText("Nhập tài khoản mật khẩu để đăng nhập");
        btnLogin.setBorderPainted(false);
        btnLogin.setMaximumSize(new java.awt.Dimension(66, 22));
        btnLogin.setMinimumSize(new java.awt.Dimension(66, 22));
        btnLogin.setPreferredSize(new java.awt.Dimension(66, 22));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtPassword.setToolTipText("");

        lblForgotPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblForgotPassword.setText("Quên mật khẩu");
        lblForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgotPasswordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnLoginLayout = new javax.swing.GroupLayout(pnLogin);
        pnLogin.setLayout(pnLoginLayout);
        pnLoginLayout.setHorizontalGroup(
            pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUserName)
                    .addComponent(lblNameShop, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(lblTiltle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLoginLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnLoginLayout.setVerticalGroup(
            pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLoginLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(lblNameShop)
                .addGap(34, 34, 34)
                .addComponent(lblTiltle)
                .addGap(37, 37, 37)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblForgotPassword)
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(343, Short.MAX_VALUE))
        );

        getContentPane().add(pnLogin, java.awt.BorderLayout.WEST);

        pnImage.setBackground(new java.awt.Color(255, 255, 255));

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo_Supermarket.png"))); // NOI18N

        javax.swing.GroupLayout pnImageLayout = new javax.swing.GroupLayout(pnImage);
        pnImage.setLayout(pnImageLayout);
        pnImageLayout.setHorizontalGroup(
            pnImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
        );
        pnImageLayout.setVerticalGroup(
            pnImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE))
        );

        getContentPane().add(pnImage, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String userName = txtUserName.getText().trim();
        String password = new String(txtPassword.getPassword()).trim();
        try {
            if (userName.equals("") || password.equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn vui lòng nhập đầy đủ thông tin!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            } else {
                Account account = accountService.findAccountByUserName(userName);
//                System.err.println(account);
                if (account != null) {
                    if (account.getStaff().getId().equals(userName) && account.getPassword().equals(password)) {
                        if (account.getStaff().isStatus()) {
                            if (!account.getStaff().isPosition()) {
                                new frmMenuStaff(account).setVisible(true);
                            } else {
                                new frmMenuManager(account).setVisible(true);
                            }

                            //close form
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(this, "Tài khoản này không có quyền đăng nhập!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "Tài khoản hoặc mật khẩu không đúng!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Tài khoản không tồn tại!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi xử lý đăng nhập!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Config.closeForm(this);
    }//GEN-LAST:event_formWindowClosing

    // Lỡ tay bấm. sr
    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void lblForgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotPasswordMouseClicked
        frmForgotPassword frmForgotPassword = new frmForgotPassword();
        frmForgotPassword.setVisible(true);
    }//GEN-LAST:event_lblForgotPasswordMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the FlatLaf look and feel */

 /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblForgotPassword;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblNameShop;
    private javax.swing.JLabel lblTiltle;
    private javax.swing.JPanel pnImage;
    private javax.swing.JPanel pnLogin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}