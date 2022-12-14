/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package market.app.client.ui.manager;

import entity.Account;
import java.util.logging.Level;
import java.util.logging.Logger;
import market.app.client.ui.frmViewInfor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import market.app.client.Config;
import market.app.client.ui.frmLogin;

public class frmMenuManager extends javax.swing.JFrame {

    private Account _account;
    /**
     * Creates new form frmHomeManager
     */
    //buttons support handle click menu item
    private JButton[] buttons = null;

    public frmMenuManager(Account account) throws Exception {
        initComponents();
        Config.startPanel(new frmManageItem(), pnContent, btnManageItem);
        this.buttons = new JButton[]{btnLogout, btnManageItem, btnManageOrder, btnManageStaff, btnViewInfor};
        this.setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);

        //login send;
        _account = account;
        lblNameAndID.setText(_account.getStaff().getId() + " - " + account.getStaff().getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMenu = new javax.swing.JPanel();
        btnManageItem = new javax.swing.JButton();
        btnManageStaff = new javax.swing.JButton();
        btnManageOrder = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        lblNameAndID = new javax.swing.JLabel();
        btnViewInfor = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        pnContent = new javax.swing.JPanel();
        pnMenuSale = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnMenu.setBackground(new java.awt.Color(75, 161, 218));
        pnMenu.setPreferredSize(new java.awt.Dimension(250, 0));

        btnManageItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-box-24.png"))); // NOI18N
        btnManageItem.setText("Qu???n l?? m???t h??ng");
        btnManageItem.setPreferredSize(new java.awt.Dimension(80, 22));
        btnManageItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageItemActionPerformed(evt);
            }
        });

        btnManageStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-staff-24.png"))); // NOI18N
        btnManageStaff.setText("Qu???n l?? nh??n vi??n");
        btnManageStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStaffActionPerformed(evt);
            }
        });

        btnManageOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-purchase-order-24.png"))); // NOI18N
        btnManageOrder.setText("Qu???n l?? h??a ????n");
        btnManageOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrderActionPerformed(evt);
            }
        });

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-name-64.png"))); // NOI18N

        lblPosition.setBackground(new java.awt.Color(255, 255, 255));
        lblPosition.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPosition.setForeground(new java.awt.Color(255, 255, 255));
        lblPosition.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPosition.setText("Qu???n l??");

        lblNameAndID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblNameAndID.setForeground(new java.awt.Color(255, 255, 255));
        lblNameAndID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameAndID.setText("QL001 - Jone");

        btnViewInfor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-information-24.png"))); // NOI18N
        btnViewInfor.setText("Xem th??ng tin");
        btnViewInfor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewInforActionPerformed(evt);
            }
        });

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-logout-rounded-24.png"))); // NOI18N
        btnLogout.setText("????ng xu???t");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewInfor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNameAndID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageStaff, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(btnManageItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPosition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblNameAndID)
                .addGap(18, 18, 18)
                .addComponent(btnManageItem, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManageStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManageOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        getContentPane().add(pnMenu, java.awt.BorderLayout.WEST);

        pnMenuSale.setBackground(new java.awt.Color(226, 254, 254));

        javax.swing.GroupLayout pnMenuSaleLayout = new javax.swing.GroupLayout(pnMenuSale);
        pnMenuSale.setLayout(pnMenuSaleLayout);
        pnMenuSaleLayout.setHorizontalGroup(
            pnMenuSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
        );
        pnMenuSaleLayout.setVerticalGroup(
            pnMenuSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnContentLayout = new javax.swing.GroupLayout(pnContent);
        pnContent.setLayout(pnContentLayout);
        pnContentLayout.setHorizontalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnMenuSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnContentLayout.setVerticalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentLayout.createSequentialGroup()
                .addComponent(pnMenuSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pnContent, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageItemActionPerformed
        try {
            // TODO add your handling code here:
            Config.startPanel(new frmManageItem(), pnContent, btnManageItem);
        } catch (Exception ex) {
            Logger.getLogger(frmMenuManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        Config.handleButtonClick(buttons, btnManageItem);
    }//GEN-LAST:event_btnManageItemActionPerformed

    private void btnManageStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStaffActionPerformed
        // TODO add your handling code here:
        Config.startPanel(new frmManageStaff(_account), pnContent, btnManageItem);
        Config.handleButtonClick(buttons, btnManageStaff);

    }//GEN-LAST:event_btnManageStaffActionPerformed

    private void btnManageOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrderActionPerformed
        // TODO add your handling code here:
        frmManageOrder order = new frmManageOrder(_account);
        Config.openComponent(order, pnContent);
        Config.handleButtonClick(buttons, btnManageOrder);

    }//GEN-LAST:event_btnManageOrderActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Config.closeForm(this);
    }//GEN-LAST:event_formWindowClosing

    private void btnViewInforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewInforActionPerformed
        // TODO add your handling code here:
        frmViewInfor viewInfor = new frmViewInfor(_account);
        Config.openComponent(viewInfor, pnContent);
        Config.handleButtonClick(buttons, btnViewInfor);
    }//GEN-LAST:event_btnViewInforActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        Config.handleButtonClick(buttons, btnLogout);
        int choose = JOptionPane.showConfirmDialog(this, "B???n c?? ch???c mu???n ????ng xu???t?", "Th??ng b??o", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choose == JOptionPane.YES_OPTION) {
            new frmLogin().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frmMenuManager().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageItem;
    private javax.swing.JButton btnManageOrder;
    private javax.swing.JButton btnManageStaff;
    private javax.swing.JButton btnViewInfor;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNameAndID;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JPanel pnContent;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnMenuSale;
    // End of variables declaration//GEN-END:variables
}
