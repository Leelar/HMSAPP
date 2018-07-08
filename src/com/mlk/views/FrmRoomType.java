
package com.mlk.views;
import com.mlk.controllers.JTableColumnAutoResize;
import com.mlk.controllers.RoomTypeManager;
import com.mlk.models.RoomType;
import com.mlk.utils.Util;
import java.awt.Font; 
import com.mlk.views.FrmNewProvinces;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class FrmRoomType extends javax.swing.JInternalFrame {
    DefaultTableModel model = new DefaultTableModel();
    RoomTypeManager manager = new RoomTypeManager();
    public FrmRoomType() {
        initComponents();
        tblRoomType.getTableHeader().setFont(new Font("Saysettha OT",Font.BOLD, 12));
        JTableColumnAutoResize.resizeColumnWidth(tblRoomType);
        model =(DefaultTableModel)tblRoomType.getModel();
        manager.refresh(tblRoomType, model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rmtypePopUpMenu = new javax.swing.JPopupMenu();
        menuCancel = new javax.swing.JMenuItem();
        menuUpdate = new javax.swing.JMenuItem();
        menuDelete = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRoomType = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        rmtypePopUpMenu.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        menuCancel.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        menuCancel.setText("ຍົກເລີກ");
        rmtypePopUpMenu.add(menuCancel);

        menuUpdate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        menuUpdate.setText("ແກ້ໄຂ");
        menuUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUpdateActionPerformed(evt);
            }
        });
        rmtypePopUpMenu.add(menuUpdate);

        menuDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        menuDelete.setText("ລົບອອກ");
        menuDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDeleteMouseClicked(evt);
            }
        });
        menuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDeleteActionPerformed(evt);
            }
        });
        rmtypePopUpMenu.add(menuDelete);

        setClosable(true);
        setTitle("Room Type");
        setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.BorderLayout());

        tblRoomType.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        tblRoomType.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "ລະຫັດ", "ຊື່ປະເພດຫ້ອງ", "ໝາຍເຫດ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRoomType.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblRoomType.setComponentPopupMenu(rmtypePopUpMenu);
        tblRoomType.setRowHeight(30);
        tblRoomType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRoomTypeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRoomType);
        if (tblRoomType.getColumnModel().getColumnCount() > 0) {
            tblRoomType.getColumnModel().getColumn(0).setMinWidth(100);
            tblRoomType.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jPanel5.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNew.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnNew.setText("ເພີ່ມໃໝ່");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnRefresh.setText("ໂຫຼດຂໍ້ມູນມາໃໝ່");

        jLabel1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel1.setText("ຄົ້ນຫາຕາມລະຫັດ");

        txtSearch.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh)
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 507, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnRefresh)
                    .addComponent(jLabel1)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2, Short.MAX_VALUE))
        );

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

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        FrmNewRoomType newDoctorObject = new FrmNewRoomType(null,closable,new RoomType(0,"","") );
        newDoctorObject.setVisible(true);
        manager.refresh(tblRoomType, model);
    }//GEN-LAST:event_btnNewActionPerformed

    private void tblRoomTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRoomTypeMouseClicked
        if(evt.getClickCount() == 2 ){
        int id = Integer.parseInt(this.tblRoomType.getValueAt(this.tblRoomType.getSelectedRow(), 0).toString().trim());
        String name = this.tblRoomType.getValueAt(this.tblRoomType.getSelectedRow(), 1).toString().trim();
        String note = this.tblRoomType.getValueAt(this.tblRoomType.getSelectedRow(),2).toString().trim();
        RoomType rt = new RoomType(id, name, note);
        
        FrmNewRoomType newDoctorObject = new FrmNewRoomType(null, closable,rt);
        newDoctorObject.setVisible(true);
        manager.refresh(tblRoomType, model);
        }
    }//GEN-LAST:event_tblRoomTypeMouseClicked

    private void menuDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDeleteMouseClicked
    }//GEN-LAST:event_menuDeleteMouseClicked

    private void menuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDeleteActionPerformed
        if(Util.confirmMsg("ທ່ານຕ້ອງການລືບລາຍການນີ້ບໍ?")){
            int id = Integer.parseInt(this.tblRoomType.getValueAt(this.tblRoomType.getSelectedRow(), 0).toString().trim());
            String name = this.tblRoomType.getValueAt(this.tblRoomType.getSelectedRow(), 1).toString().trim();
            String note = this.tblRoomType.getValueAt(this.tblRoomType.getSelectedRow(),2).toString().trim();
            RoomType rt = new RoomType(id, name, note);
            if(manager.delete(rt)){
                Util.infoMsg("ສຳເລັດ!");
                manager.refresh(tblRoomType, model);
            }
            else{
                Util.warningMsg("ເກີດຂໍ້ຜິດພາດ");
                manager.refresh(tblRoomType, model);
            }
        }
    }//GEN-LAST:event_menuDeleteActionPerformed

    private void menuUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUpdateActionPerformed
        int id = Integer.parseInt(this.tblRoomType.getValueAt(this.tblRoomType.getSelectedRow(), 0).toString().trim());
        String name = this.tblRoomType.getValueAt(this.tblRoomType.getSelectedRow(), 1).toString().trim();
        String note = this.tblRoomType.getValueAt(this.tblRoomType.getSelectedRow(),2).toString().trim();
        RoomType rt = new RoomType(id, name, note);
        
        FrmNewRoomType newDoctorObject = new FrmNewRoomType(null, closable,rt);
        newDoctorObject.setVisible(true);
        manager.refresh(tblRoomType, model);
    }//GEN-LAST:event_menuUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuCancel;
    private javax.swing.JMenuItem menuDelete;
    private javax.swing.JMenuItem menuUpdate;
    private javax.swing.JPopupMenu rmtypePopUpMenu;
    private javax.swing.JTable tblRoomType;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
