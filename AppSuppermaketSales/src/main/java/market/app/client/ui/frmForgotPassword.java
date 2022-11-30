/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package market.app.client.ui;

import entity.Account;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import market.app.client.connect.ConnectServer;
import service.IAccountService;

public class frmForgotPassword extends javax.swing.JFrame {

    private IAccountService accountService = null;
    private Account account = null;

    /**
     * Creates new form frmForgotPassword
     */
    public frmForgotPassword() {
        initComponents();

        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        lblErrorId.setText("");
        lblErrorPhone.setText("");
        lblConfirmNewPass.setText("");
        lblErrorPassword.setText("");
        btnForgotPassword.setEnabled(false);
        //code
        accountService = ConnectServer.getInstance().getAccountService();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTiltle = new javax.swing.JLabel();
        txtPhoneStaff = new javax.swing.JTextField();
        txtNewPassword = new javax.swing.JPasswordField();
        txtIdStaff = new javax.swing.JTextField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnForgotPassword = new javax.swing.JButton();
        lblErrorId = new javax.swing.JLabel();
        lblErrorPhone = new javax.swing.JLabel();
        lblErrorPassword = new javax.swing.JLabel();
        lblConfirmNewPass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTiltle.setBackground(new java.awt.Color(93, 144, 245));
        lblTiltle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTiltle.setForeground(new java.awt.Color(255, 255, 255));
        lblTiltle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiltle.setText("Quên mật khẩu");
        lblTiltle.setOpaque(true);

        txtPhoneStaff.setToolTipText("Tài khoản là mã nhân viên");
        txtPhoneStaff.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPhoneStaffFocusLost(evt);
            }
        });

        txtNewPassword.setToolTipText("");
        txtNewPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNewPasswordFocusLost(evt);
            }
        });

        txtIdStaff.setToolTipText("Tài khoản là mã nhân viên");
        txtIdStaff.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdStaffFocusLost(evt);
            }
        });

        txtConfirmPassword.setToolTipText("");
        txtConfirmPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfirmPasswordFocusLost(evt);
            }
        });

        jLabel1.setText("Nhập mã nhân viên:");

        jLabel2.setText("Nhập mật khẩu mới:");

        jLabel3.setText("Nhập lại mật khẩu mới:");

        jLabel4.setText("Nhập số điện thoại:");

        btnForgotPassword.setBackground(new java.awt.Color(69, 123, 157));
        btnForgotPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnForgotPassword.setForeground(new java.awt.Color(255, 255, 255));
        btnForgotPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-new-24.png"))); // NOI18N
        btnForgotPassword.setText("Tạo mật khẩu mới");
        btnForgotPassword.setToolTipText("Nhập tài khoản mật khẩu để đăng nhập");
        btnForgotPassword.setBorderPainted(false);
        btnForgotPassword.setMaximumSize(new java.awt.Dimension(66, 22));
        btnForgotPassword.setMinimumSize(new java.awt.Dimension(66, 22));
        btnForgotPassword.setPreferredSize(new java.awt.Dimension(66, 22));
        btnForgotPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotPasswordActionPerformed(evt);
            }
        });

        lblErrorId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblErrorId.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorId.setText("jLabel5");

        lblErrorPhone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblErrorPhone.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorPhone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorPhone.setText("jLabel5");

        lblErrorPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblErrorPassword.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorPassword.setText("jLabel5");

        lblConfirmNewPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblConfirmNewPass.setForeground(new java.awt.Color(255, 0, 0));
        lblConfirmNewPass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblConfirmNewPass.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdStaff)
                    .addComponent(txtPhoneStaff)
                    .addComponent(txtNewPassword)
                    .addComponent(txtConfirmPassword)
                    .addComponent(btnForgotPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblErrorPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblErrorId, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblErrorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblConfirmNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 204, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(lblTiltle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTiltle, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblErrorId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPhoneStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblErrorPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblConfirmNewPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdStaffFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdStaffFocusLost
        // TODO add your handling code here:
        String staffId = txtIdStaff.getText();
        if (staffId.trim().equals("")) {
            lblErrorId.setText("Vui lòng nhập mã nhân viên");
            btnForgotPassword.setEnabled(false);
        } else {
            try {
                account = accountService.findAccountByUserName(staffId);
                if (account != null) {
                    if (account.getStaff().isStatus()) {
                        lblErrorId.setText("");
                        btnForgotPassword.setEnabled(true);
                    } else {
                        lblErrorId.setText("Nhân viên này đã nghỉ làm!");
                        btnForgotPassword.setEnabled(false);
                    }
                } else {
                    btnForgotPassword.setEnabled(false);
                    lblErrorId.setText("Nhân viên này không tồn tại!");
                }
            } catch (Exception ex) {
                Logger.getLogger(frmForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtIdStaffFocusLost

    private void txtPhoneStaffFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneStaffFocusLost
        String txtPhone = txtPhoneStaff.getText();
        if (account != null) {
            if (!txtPhone.trim().equals("") && account.getStaff().getPhone().equals(txtPhone)) {
                lblErrorPhone.setText("");
            } else {
                lblErrorPhone.setText("Số điện thoại không đúng!");
            }
        }
    }//GEN-LAST:event_txtPhoneStaffFocusLost

    private void btnForgotPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotPasswordActionPerformed
       if(txtIdStaff.getText().equals("") || txtNewPassword.getText().equals("") || txtConfirmPassword.getText().equals("") || txtPhoneStaff.getText().equals("")) {
           JOptionPane.showMessageDialog(null, "Cần phải nhập đầy đủ thông tin!", "Thông báo", JOptionPane.WARNING_MESSAGE);
           return;
       }


        String confirmPass = new String(txtConfirmPassword.getPassword());
        if (confirmPass.equals(new String(txtNewPassword.getPassword()))) {
            account.setPassword(confirmPass);
            try {
                boolean res = accountService.changePassWord(account);
                if(res) {
                    JOptionPane.showMessageDialog(null, "Mật khẩu mới đã được cập nhật!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    txtConfirmPassword.setText("");
                    txtIdStaff.setText("");
                    txtNewPassword.setText("");
                    txtPhoneStaff.setText("");
                    lblConfirmNewPass.setText("");
                }else {
                    JOptionPane.showMessageDialog(null, "Mật khẩu mới cập nhật thất bại!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception ex) {
                Logger.getLogger(frmForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            lblConfirmNewPass.setText("Mật khẩu nhập lại không đúng với mật khẩu mới!");
        }
    }//GEN-LAST:event_btnForgotPasswordActionPerformed

    private void txtNewPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewPasswordFocusLost
        // TODO add your handling code here:
        String txtNewPass = new String(txtNewPassword.getPassword());
        if (txtNewPass.length() < 6) {
            lblErrorPassword.setText("Mật khẩu phải tối thiểu 6 ký tự!");
        } else {
            lblErrorPassword.setText("");
        }
    }//GEN-LAST:event_txtNewPasswordFocusLost

    private void txtConfirmPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmPasswordFocusLost
        String confirmPass = new String(txtConfirmPassword.getPassword());
        if (confirmPass.equals(new String(txtNewPassword.getPassword()))) {
            lblConfirmNewPass.setText("");
        } else {
            lblConfirmNewPass.setText("Mật khẩu nhập lại không đúng với mật khẩu mới!");
        }
    }//GEN-LAST:event_txtConfirmPasswordFocusLost

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
            java.util.logging.Logger.getLogger(frmForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForgotPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblConfirmNewPass;
    private javax.swing.JLabel lblErrorId;
    private javax.swing.JLabel lblErrorPassword;
    private javax.swing.JLabel lblErrorPhone;
    private javax.swing.JLabel lblTiltle;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtIdStaff;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JTextField txtPhoneStaff;
    // End of variables declaration//GEN-END:variables
}
