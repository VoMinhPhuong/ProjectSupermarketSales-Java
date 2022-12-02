/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package market.app.client.ui.staff;

import entity.Account;
import entity.OrderDetail;
import entity.Product;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import market.app.client.Config;
import market.app.client.connect.ConnectServer;
import market.app.client.ui.frmOrder;
import service.IProductService;

public class frmSale extends javax.swing.JInternalFrame {

    private IProductService productService;

    private Account _account;
    //private List<Product> products;
    private List<OrderDetail> details;
    /**
     * Creates new form frmSale
     */
    private final DefaultTableModel modelTableOrderDetail = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
        }
    };
    private final String[] colums = new String[]{"STT", "Tên mặt hàng", "Đơn vị tính", "Đơn giá" ,"Số lượng", "Thành tiền"};

    public frmSale(Account account) {
        initComponents();
        Config.initColTable(tblOrderDetail, modelTableOrderDetail, colums);
        Config.hideTitleBarInternalFrame(this);
        productService = ConnectServer.getInstance().getProductService();
        details = new ArrayList<>();
        btnConfirm.setEnabled(false);
        //give from login
        _account = account;
        txtItemName.setEditable(false);
        getTextChangeInput(txtItemID);
        getTextChangeInput(txtNumber);
    }

    //handle input value change
    private void handleGiveInput(JTextField field) {
        try {
            String id = field.getText();
            try {
                Product product = productService.findProductById(id);
                 System.out.println("product"+product);
                if (product != null && product.getType().isSelling() == true) {
                    txtItemName.setText(product.getName());
                    txtNumber.setEditable(true);
                    btnConfirm.setEnabled(false);
                } else {
                    txtItemName.setText("Sản phẩm này không tồn tại");
                    btnConfirm.setEnabled(false);
                    txtNumber.setEditable(false);
                }
            } catch (Exception ex) {
                System.err.println("Lỗi tìm kiếm sản phẩm trong event textChange");
            }
        } catch (NumberFormatException ex) {
            lblNotifiId.setText("phải là số!");
        }
    }

    //handle input number
    //check number product exists
    private void handleInputNumber(JTextField field) {
        try {
            int number = Integer.parseInt(field.getText());
            Product product = productService.findProductById(txtItemID.getText());
            if (number > 0) {
                if (number <= product.getNumber()) {
                    btnConfirm.setEnabled(true);
                } else {
                    btnConfirm.setEnabled(false);
                    lblNotifiNumber.setText("vượt quá số lượng sản phẩm hiện có " + product.getNumber());
                }
            } else {
                lblNotifiNumber.setText("phải là số lớn hơn 0!");
            }
        } catch (Exception e) {
            lblNotifiNumber.setText("phải là số!");
        }
    }

    //give input value change
    private void getTextChangeInput(JTextField field) {
        field.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (field.equals(txtItemID)) {
                    lblNotifiId.setText("");
                    handleGiveInput(field);
                } else {
                    lblNotifiNumber.setText("");
                    handleInputNumber(field);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if (field.equals(txtItemID)) {
                    if (!field.getText().trim().equals("")) {
                        lblNotifiId.setText("");
                        handleGiveInput(field);
                    } else {
                        lblNotifiId.setText("");
                        txtItemName.setText("");
                        btnConfirm.setEnabled(false);
                    }
                } else {
                    if (!field.getText().trim().equals("")) {
                        lblNotifiNumber.setText("");
                        handleInputNumber(field);
                    } else {
                        lblNotifiNumber.setText("");
                        btnConfirm.setEnabled(false);
                    }
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //handleGiveInput(field);
                //System.err.println("change update");
            }
        });
    }

    //check order detail exists then update quatity
    public static OrderDetail isExist(List<OrderDetail> details, Product product, int number) {
        for (OrderDetail detail : details) {
            if (detail.getProduct().getId().toString().equals(product.getId().toString()) ) {
                detail.setQuantity(detail.getQuantity() + number);

                return detail;
            }
        }

        return null;
    }

    private void clearInput() {
        txtItemID.setText("");
        txtItemName.setText("");
        txtNumber.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnInput = new javax.swing.JPanel();
        lblItemID = new javax.swing.JLabel();
        txtItemID = new javax.swing.JTextField();
        lblItemName = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        lblNumber = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        lblNotifiNumber = new javax.swing.JLabel();
        lblNotifiId = new javax.swing.JLabel();
        pnItemList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderDetail = new javax.swing.JTable();
        btnCreateOrder = new javax.swing.JButton();
        lblTagTotalMoney = new javax.swing.JLabel();
        lblTotalMoney = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtSales = new javax.swing.JLabel();

        setBackground(new java.awt.Color(226, 254, 254));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(1280, 800));
        setVisible(true);

        pnInput.setBackground(new java.awt.Color(226, 254, 254));
        pnInput.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(69, 123, 157), 3, true), "Thông tin mặt hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        lblItemID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblItemID.setText("Nhập mã mặt hàng:");

        lblItemName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblItemName.setText("Tên mặt hàng: ");

        lblNumber.setText("Số lượng: ");

        btnConfirm.setBackground(new java.awt.Color(33, 162, 72));
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-ok-24.png"))); // NOI18N
        btnConfirm.setText("Xác nhận");
        btnConfirm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        btnConfirm.setBorderPainted(false);
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnDel.setBackground(new java.awt.Color(255, 0, 0));
        btnDel.setForeground(new java.awt.Color(255, 255, 255));
        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-remove-24.png"))); // NOI18N
        btnDel.setText("Xóa");
        btnDel.setToolTipText("Chọn một mặt hàng để xóa");
        btnDel.setBorderPainted(false);
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        lblNotifiNumber.setForeground(new java.awt.Color(255, 0, 51));

        lblNotifiId.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout pnInputLayout = new javax.swing.GroupLayout(pnInput);
        pnInput.setLayout(pnInputLayout);
        pnInputLayout.setHorizontalGroup(
            pnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnInputLayout.createSequentialGroup()
                        .addGroup(pnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblItemName)
                            .addComponent(lblNumber))
                        .addGap(50, 50, 50)
                        .addGroup(pnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtItemName)
                            .addComponent(txtNumber)
                            .addGroup(pnInputLayout.createSequentialGroup()
                                .addComponent(lblNotifiNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnInputLayout.createSequentialGroup()
                        .addComponent(btnConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
                    .addGroup(pnInputLayout.createSequentialGroup()
                        .addComponent(lblItemID)
                        .addGap(18, 18, 18)
                        .addGroup(pnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnInputLayout.createSequentialGroup()
                                .addComponent(lblNotifiId, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtItemID))))
                .addContainerGap())
        );
        pnInputLayout.setVerticalGroup(
            pnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNotifiId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemID)
                    .addComponent(txtItemID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemName)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNotifiNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumber)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(pnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnItemList.setBackground(new java.awt.Color(226, 254, 254));
        pnItemList.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(69, 123, 157), 3, true), "Danh sách mặt hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        pnItemList.setForeground(java.awt.Color.white);

        tblOrderDetail.setBackground(new java.awt.Color(234, 243, 244));
        tblOrderDetail.setModel(new javax.swing.table.DefaultTableModel(
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
        tblOrderDetail.setSelectionBackground(new java.awt.Color(27, 169, 255));
        jScrollPane1.setViewportView(tblOrderDetail);

        btnCreateOrder.setBackground(new java.awt.Color(77, 109, 239));
        btnCreateOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-get-cash-24.png"))); // NOI18N
        btnCreateOrder.setText("Thanh toán");
        btnCreateOrder.setBorderPainted(false);
        btnCreateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateOrderActionPerformed(evt);
            }
        });

        lblTagTotalMoney.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTagTotalMoney.setText("Tổng tiền:");

        lblTotalMoney.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTotalMoney.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalMoney.setText("0,000 VNÐ");

        javax.swing.GroupLayout pnItemListLayout = new javax.swing.GroupLayout(pnItemList);
        pnItemList.setLayout(pnItemListLayout);
        pnItemListLayout.setHorizontalGroup(
            pnItemListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCreateOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnItemListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnItemListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnItemListLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTagTotalMoney)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnItemListLayout.setVerticalGroup(
            pnItemListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnItemListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnItemListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTagTotalMoney)
                    .addComponent(lblTotalMoney))
                .addGap(18, 18, 18)
                .addComponent(btnCreateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtSales.setBackground(new java.awt.Color(93, 144, 245));
        txtSales.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtSales.setForeground(new java.awt.Color(255, 255, 255));
        txtSales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSales.setText("BÁN HÀNG");
        txtSales.setToolTipText("");
        txtSales.setAutoscrolls(true);
        txtSales.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtSales, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnItemList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnItemList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateOrderActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCreateOrderActionPerformed
        if (!details.isEmpty()) {
            frmOrder forder = new frmOrder(details, _account, true);
            forder.setVisible(true);
            //listening close form
            forder.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    details.clear();
                    Config.loadOrderDetailToList(modelTableOrderDetail, details);
                    lblTotalMoney.setText(Config.formatMoney(Config.calTotalMoneyByListOrderDetail(details)));
                }
            });
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng thêm sản phẩm rồi mới thanh toán!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCreateOrderActionPerformed

    private void btnConfirmActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        String id = txtItemID.getText();
        try {
            int number = Integer.parseInt(txtNumber.getText());
            try {
                Product product = productService.findProductById(id);
                OrderDetail detail = isExist(details, product, number);
                if (detail == null) {
                    OrderDetail _detail = new OrderDetail(product, null, number);
                    details.add(_detail);
                }

                Config.loadOrderDetailToList(modelTableOrderDetail, details);
                lblTotalMoney.setText(Config.formatMoney(Config.calTotalMoneyByListOrderDetail(details)));
                clearInput();
            } catch (Exception ex) {
                ex.printStackTrace();
                System.err.println("Lỗi tìm kiếm sản phẩm khi xác nhận thêm sản phẩm vào chi tiết hóa đơn!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vui lòng số lượng là số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnDelActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        int index = tblOrderDetail.getSelectedRow();
        if (index > -1) {
            details.remove(index);
            Config.loadOrderDetailToList(modelTableOrderDetail, details);
            lblTotalMoney.setText(Config.formatMoney(Config.calTotalMoneyByListOrderDetail(details)));
        } else{
            JOptionPane.showMessageDialog(null, "Vui lòng chọn sản phẩm muốn xóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDelActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton btnConfirm;
    javax.swing.JButton btnCreateOrder;
    javax.swing.JButton btnDel;
    javax.swing.JPanel jPanel1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JLabel lblItemID;
    javax.swing.JLabel lblItemName;
    javax.swing.JLabel lblNotifiId;
    javax.swing.JLabel lblNotifiNumber;
    javax.swing.JLabel lblNumber;
    javax.swing.JLabel lblTagTotalMoney;
    javax.swing.JLabel lblTotalMoney;
    javax.swing.JPanel pnInput;
    javax.swing.JPanel pnItemList;
    javax.swing.JTable tblOrderDetail;
    javax.swing.JTextField txtItemID;
    javax.swing.JTextField txtItemName;
    javax.swing.JTextField txtNumber;
    javax.swing.JLabel txtSales;
    // End of variables declaration//GEN-END:variables
}
