/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package market.app.client.ui.manager;

import entity.ProductType;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import market.app.client.Config;
import market.app.client.connect.ConnectServer;
import service.IProductTypeService;

/**
 *
 * @author Le Tuan
 */
public class frmItemType extends javax.swing.JFrame {

    /**
     * Creates new form frmItemType
     */
    private IProductTypeService productTypeService;

    private final DefaultTableModel modelTableProductTypeList = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
        }
    };
    private final String[] colums = new String[]{"STT", "Tên loại mặt hàng", "Đơn vị"};

    public frmItemType() {
        initComponents();

        // connect RMI
        productTypeService = ConnectServer.getInstance().getProductTypeService();
        setLocationRelativeTo(null);
        Config.initColTable(tblItemTypeList, modelTableProductTypeList, colums);

        //btn
        btnChange.setEnabled(false);
        btnDelete.setEnabled(false);
        // load data
        loadDataToListView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnAction = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblIItemTypeName = new javax.swing.JLabel();
        txtProductType = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtUnit = new javax.swing.JTextField();
        pnItemTypeList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItemTypeList = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        pnAction.setBackground(new java.awt.Color(226, 254, 254));
        pnAction.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(69, 123, 157), 3, true), "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        btnAdd.setBackground(new java.awt.Color(33, 162, 72));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-new-24.png"))); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.setToolTipText("Thêm loại mặt hàng");
        btnAdd.setBorderPainted(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnChange.setBackground(new java.awt.Color(255, 203, 59));
        btnChange.setForeground(new java.awt.Color(255, 255, 255));
        btnChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-pencil-24.png"))); // NOI18N
        btnChange.setText("Sửa");
        btnChange.setToolTipText("Cập nhật thông tin");
        btnChange.setBorderPainted(false);
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-remove-24.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.setToolTipText("Xóa loại mặt hàng");
        btnDelete.setBorderPainted(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblIItemTypeName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIItemTypeName.setText("Tên loại mặt hàng: ");

        txtProductType.setToolTipText("Tên loại mặt hàng có thể trùng");
        txtProductType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductTypeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductTypeKeyTyped(evt);
            }
        });

        jLabel1.setText("Đơn vị:");

        txtUnit.setToolTipText("Đơn vị phải là duy nhất");
        txtUnit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnitKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnActionLayout = new javax.swing.GroupLayout(pnAction);
        pnAction.setLayout(pnActionLayout);
        pnActionLayout.setHorizontalGroup(
            pnActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnActionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnActionLayout.createSequentialGroup()
                        .addGroup(pnActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUnit, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProductType)
                            .addGroup(pnActionLayout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnActionLayout.createSequentialGroup()
                        .addGroup(pnActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIItemTypeName)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnActionLayout.setVerticalGroup(
            pnActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnActionLayout.createSequentialGroup()
                .addComponent(lblIItemTypeName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProductType, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnItemTypeList.setBackground(new java.awt.Color(226, 254, 254));
        pnItemTypeList.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(69, 123, 157), 3, true), "Danh sách loại mặt hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        tblItemTypeList.setBackground(new java.awt.Color(234, 243, 244));
        tblItemTypeList.setModel(new javax.swing.table.DefaultTableModel(
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
        tblItemTypeList.setSelectionBackground(new java.awt.Color(27, 169, 255));
        tblItemTypeList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemTypeListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblItemTypeList);

        javax.swing.GroupLayout pnItemTypeListLayout = new javax.swing.GroupLayout(pnItemTypeList);
        pnItemTypeList.setLayout(pnItemTypeListLayout);
        pnItemTypeListLayout.setHorizontalGroup(
            pnItemTypeListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnItemTypeListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnItemTypeListLayout.setVerticalGroup(
            pnItemTypeListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnItemTypeListLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel2.setText("Tìm kiếm: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnAction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnItemTypeList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(pnAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(261, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(284, 284, 284)
                    .addComponent(pnItemTypeList, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Load data to list
    private void loadDataToListView() {
        modelTableProductTypeList.setRowCount(0);

        try {
            int i = 1;
            for (ProductType prod : productTypeService.getAllProductType()) {
                Object[] obj = new Object[]{i++, prod.getName(), prod.getUnit()};
                modelTableProductTypeList.addRow(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        modelTableProductTypeList.fireTableDataChanged();
    }

    // clear input
    private void clearInputs() {
        txtProductType.setText("");
        txtUnit.setText("");
        txtProductType.requestFocus();

        btnChange.setEnabled(false);
        btnDelete.setEnabled(false);
        btnAdd.setEnabled(true);
        tblItemTypeList.clearSelection();
    }

    // Check inputs
    private boolean checkInputs() {
        String prodType = txtProductType.getText();
        String unit = txtUnit.getText();

        if (prodType.equals("") || unit.equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn cần phải nhập đầy đủ thông tin!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return true;
        }

        return false;
    }

    /// vaildate ten nhan vien
    private boolean regexName(String name) {
        String reg = "^([aAàÀảẢãÃáÁạẠăĂằẰẳẲẵẴắẮặẶâÂầẦẩẨẫẪấẤậẬbBcCdDđĐeEèÈẻẺẽẼéÉẹẸêÊềỀểỂễỄếẾệỆ\n"
                + "fFgGhHiIìÌỉỈĩĨíÍịỊjJkKlLmMnNoOòÒỏỎõÕóÓọỌôÔồỒổỔỗỖốỐộỘơƠờỜởỞỡỠớỚợỢpPqQrRsStTu\n"
                + "UùÙủỦũŨúÚụỤưƯừỪửỬữỮứỨựỰvVwWxXyYỳỲỷỶỹỸýÝỵỴzZ123456789]+)"
                + "((\\s{1}[aAàÀảẢãÃáÁạẠăĂằẰẳẲẵẴắẮặẶâÂầẦẩẨẫẪấẤậẬbBcCdDđĐeEèÈẻẺẽẼéÉẹẸêÊềỀểỂễỄếẾệỆ\n"
                + "fFgGhHiIìÌỉỈĩĨíÍịỊjJkKlLmMnNoOòÒỏỎõÕóÓọỌôÔồỒổỔỗỖốỐộỘơƠờỜởỞỡỠớỚợỢpPqQrRsStTu\n"
                + "UùÙủỦũŨúÚụỤưƯừỪửỬữỮứỨựỰvVwWxXyYỳỲỷỶỹỸýÝỵỴzZ0123456789]*){0,})$";
        Pattern pattern = Pattern.compile(reg);
        if (pattern.matcher(name).find()) {
            return true;
        }

        return false;
    }

    // Button add product type
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String prodType = txtProductType.getText();
        String unit = txtUnit.getText();

        // check inputs
        if (checkInputs()) {
            return;
        }

        // check name product type
        if (!regexName(prodType)) {
            JOptionPane.showMessageDialog(this, "Tên loại mặt hàng không hợp lệ. Vui lòng kiểm tra lại!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // check unit
        if (!regexName(unit)) {
            JOptionPane.showMessageDialog(this, "Đơn vị không hợp lệ. Vui lòng kiểm tra lại!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        ProductType productType = new ProductType(prodType, unit);

        try {
            // check exist product type
            for (ProductType prod : productTypeService.getAllProductType()) {
                if (prodType.equals(prod.getName()) && unit.equals(prod.getUnit())) {
                    JOptionPane.showMessageDialog(this, "Đơn vị của loại sản phẩm này đã tồn tại, Vui lòng nhập tên khác nếu muốn nhập loại sản phẩm có cùng tên!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    //clearInputs();
                    return;
                }
            }

            //productType.setSelling(true);
            boolean res = productTypeService.addOrUpdateProductType(productType);
            if (res) {
                JOptionPane.showMessageDialog(this, "Thêm loại sản phẩm thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                loadDataToListView();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm loại sản phẩm thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
            clearInputs();
        } catch (Exception ex) {
            Logger.getLogger(frmItemType.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnAddActionPerformed

    // fix server
    private List<ProductType> getProductTypes() {
        List<ProductType> list = new ArrayList<>();
        try {
            for (ProductType pt : productTypeService.getAllProductType()) {
                ProductType productType = productTypeService.findProductTypeById(pt.getId());
                list.add(productType);
            }

            return list;
        } catch (Exception ex) {
            Logger.getLogger(frmManageItem.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    // Button update
    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        String prodType = txtProductType.getText();
        String unit = txtUnit.getText();
        int selected = tblItemTypeList.getSelectedRow();
        ProductType productType = null;

        if (selected < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn loại mặt hàng cần sửa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // check name product type
        if (!regexName(prodType)) {
            JOptionPane.showMessageDialog(this, "Tên loại mặt hàng không hợp lệ. Vui lòng kiểm tra lại!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // check unit
        if (!regexName(unit)) {
            JOptionPane.showMessageDialog(this, "Đơn vị không hợp lệ. Vui lòng kiểm tra lại!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // check inputs
        if (checkInputs()) {
            return;
        }

        try {
            if (selected >= 0) {
                productType = getProductTypes().get(selected);

                if (productType != null) {
                    productType.setName(prodType);
                    productType.setUnit(unit);

                    // check exist product type
                    for (ProductType prod : productTypeService.getAllProductType()) {
                        if (prodType.equals(prod.getName()) && unit.equals(prod.getUnit())) {
                            JOptionPane.showMessageDialog(this, "Đơn vị của loại sản phẩm này đã tồn tại, Vui lòng nhập tên khác nếu muốn nhập loại sản phẩm có cùng tên!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                            //clearInputs();
                            return;
                        }
                    }

                    boolean res = productTypeService.addOrUpdateProductType(productType);
                    if (res) {
                        JOptionPane.showMessageDialog(this, "Cập nhật thành công loại sản phẩm!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        loadDataToListView();
                    } else {
                        JOptionPane.showMessageDialog(this, "Cập nhật loại sản phẩm thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    }
                    clearInputs();
                } else {
                    JOptionPane.showMessageDialog(this, "Loại sản phẩm không tồn tại!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                    clearInputs();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnChangeActionPerformed

    // Button delete
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selected = tblItemTypeList.getSelectedRow();
        ProductType productType = null;

        if (selected < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn loại mặt hàng cần xóa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            if (selected >= 0) {
                productType = getProductTypes().get(selected);
                int choise = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa loại sản phẩm này không?", "Thông báo", JOptionPane.YES_NO_OPTION);

                for (ProductType prod : productTypeService.getAllProductType()) {
                    if (productType.getId() == prod.getId()) {
                        if (choise == JOptionPane.YES_OPTION) {
                            productType.setSelling(false);
                            productTypeService.addOrUpdateProductType(productType);

                            JOptionPane.showMessageDialog(this, "Xóa loại sản phẩm thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                            clearInputs();
                            loadDataToListView();
                        }
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(frmItemType.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    // Cliked list view
    private void tblItemTypeListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemTypeListMouseClicked
        int selected = tblItemTypeList.getSelectedRow();

        btnChange.setEnabled(true);
        btnDelete.setEnabled(true);
        btnAdd.setEnabled(false);

        txtProductType.setText(tblItemTypeList.getValueAt(selected, 1).toString());
        txtUnit.setText(tblItemTypeList.getValueAt(selected, 2).toString());
    }//GEN-LAST:event_tblItemTypeListMouseClicked

    private void txtProductTypeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductTypeKeyReleased
        // bỏ
    }//GEN-LAST:event_txtProductTypeKeyReleased

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String searchVal = txtSearch.getText();
        searchFilter(searchVal);
    }//GEN-LAST:event_txtSearchKeyReleased

    // No number
    private void txtUnitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnitKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_PERIOD)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUnitKeyTyped

    // No number
    private void txtProductTypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductTypeKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_PERIOD)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtProductTypeKeyTyped

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        clearInputs();
    }//GEN-LAST:event_formMouseClicked

    // handle search
    private void searchFilter(String val) {
        TableRowSorter<DefaultTableModel> row = new TableRowSorter<DefaultTableModel>((DefaultTableModel) tblItemTypeList.getModel());
        tblItemTypeList.setRowSorter(row);
        row.setRowFilter(RowFilter.regexFilter("(?i)" + val));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> {
//            new frmItemType().setVisible(true);
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIItemTypeName;
    private javax.swing.JPanel pnAction;
    private javax.swing.JPanel pnItemTypeList;
    private javax.swing.JTable tblItemTypeList;
    private javax.swing.JTextField txtProductType;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUnit;
    // End of variables declaration//GEN-END:variables
}