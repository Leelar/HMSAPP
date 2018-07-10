package com.mlk.views;

import com.mlk.controllers.JTableColumnAutoResize;
import com.mlk.controllers.RoomManager;
import com.mlk.models.MLKComboBox;
import com.mlk.models.Room;
import com.mlk.utils.Util;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class FrmRooms extends javax.swing.JInternalFrame {

    DefaultTableModel model = new DefaultTableModel();
    RoomManager manager = new RoomManager();

    public FrmRooms() {
        initComponents();
        jTable1.getTableHeader().setFont(new Font("Saysettha OT", Font.BOLD, 12));
        JTableColumnAutoResize.resizeColumnWidth(jTable1);
        model = (DefaultTableModel) jTable1.getModel();
        manager.refresh(jTable1, model);
        MLKComboBox mlk_dept = new MLKComboBox("tbl_Department", "DeptID", "DeptName");
        MLKComboBox mlk_roomtype = new MLKComboBox("tbl_RoomType", "RTypeID", "RTypeName");
        manager.setDeptMLKComboBox(mlk_dept);
        manager.setRoomTypeMLKComboBox(mlk_roomtype);
        manager.configComboBoxes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUpMenu = new javax.swing.JPopupMenu();
        menuCancel = new javax.swing.JMenuItem();
        menuUpdate = new javax.swing.JMenuItem();
        menuDelete = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        btnNew3 = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        popUpMenu.setComponentPopupMenu(popUpMenu);

        menuCancel.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        menuCancel.setText("ຍົກເລີກ");
        popUpMenu.add(menuCancel);

        menuUpdate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        menuUpdate.setText("ແກ້ໄຂ");
        menuUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUpdateActionPerformed(evt);
            }
        });
        popUpMenu.add(menuUpdate);

        menuDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        menuDelete.setText("ລົບອອກ");
        menuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDeleteActionPerformed(evt);
            }
        });
        popUpMenu.add(menuDelete);

        setClosable(true);
        setTitle("Room");
        setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.BorderLayout());

        jTable1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ລະຫັດ", "ຫ້ອງນອນ", "ປະເພດຫ້ອງ", "ຈຳນວນຕຽງ", "ລາຄາ", "ຢູ່ພະແນກ", "ໝາຍເຫດ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setComponentPopupMenu(popUpMenu);
        jTable1.setRowHeight(30);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(1).setMinWidth(100);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(2).setMinWidth(100);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(3).setMinWidth(100);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(4).setMinWidth(120);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(120);
        }

        jPanel5.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNew3.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnNew3.setText("ເພີ່ມໃໝ່");
        btnNew3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNew3ActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnRefresh.setText("ໂຫຼດຂໍ້ມູນມາໃໝ່");

        jLabel1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel1.setText("ຄົ້ນຫາຕາມລະຫັດ,ຊື່");

        txtSearch.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(btnNew3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh)
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 477, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew3)
                    .addComponent(btnRefresh)
                    .addComponent(jLabel1)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, txtSearch});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNew3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNew3ActionPerformed
        FrmNewRoom frm = new FrmNewRoom(null, closable, new Room(0, 0, "", 1, 1, 0, ""));
        frm.setVisible(true);
        manager.refresh(jTable1, model);
    }//GEN-LAST:event_btnNew3ActionPerformed

    private void menuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDeleteActionPerformed
        if (Util.confirmMsg("ທ່ານຕ້ອງການລືບລາຍການນີ້ບໍ?")) {
            int id = Integer.parseInt(this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 0).toString().trim());
            if (manager.delete(id)) {
                Util.infoMsg("ສຳເລັດ!");
                manager.refresh(jTable1, model);
            } else {
                Util.warningMsg("ເກີດຂໍ້ຜິດພາດ");
                manager.refresh(jTable1, model);
            }
        }
    }//GEN-LAST:event_menuDeleteActionPerformed

    private void menuUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUpdateActionPerformed
        int id = Integer.parseInt(this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 0).toString().trim());
        Room rm = manager.getRoomObject(id);
        FrmNewRoom newDoctorObject = new FrmNewRoom(null, closable, rm);
        newDoctorObject.setVisible(true);
        manager.refresh(jTable1, model);
    }//GEN-LAST:event_menuUpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2) {
            this.menuUpdate.doClick();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        manager.clear(jTable1, model);
        ArrayList<Room> rooms = manager.searchRoom(this.txtSearch.getText().trim());
        for (Room r : rooms) {
            model.addRow(new Object[]{r.getRoomID(), r.getRoomCode(), manager.getRomTypeComboBoxValue(r.getRoomType()), r.getQty(), r.getPrice(), manager.getDeptComboBoxValue(r.getDeptID()), r.getNote()});
        }
    }//GEN-LAST:event_txtSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNew3;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem menuCancel;
    private javax.swing.JMenuItem menuDelete;
    private javax.swing.JMenuItem menuUpdate;
    private javax.swing.JPopupMenu popUpMenu;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
