
package com.mlk.views;

import com.mlk.controllers.ControlDeskTopPane;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import javax.swing.UIManager;

public class FrmMain extends javax.swing.JFrame {
    String img_background;
    public FrmMain() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        this.setVisible(true);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/mlk/images/Logo.png"))); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jocGroupPane1 = new com.xzq.osc.JocGroupPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTaskPane1 = new com.l2fprod.common.swing.JTaskPane();
        jTaskPaneGroup1 = new com.l2fprod.common.swing.JTaskPaneGroup();
        btnSMRegister = new com.xzq.osc.JocHyperlink();
        btnSMPatientList = new com.xzq.osc.JocHyperlink();
        btnSMRtpPatient = new com.xzq.osc.JocHyperlink();
        jTaskPaneGroup5 = new com.l2fprod.common.swing.JTaskPaneGroup();
        jocHyperlink15 = new com.xzq.osc.JocHyperlink();
        jocHyperlink16 = new com.xzq.osc.JocHyperlink();
        jocHyperlink17 = new com.xzq.osc.JocHyperlink();
        jocHyperlink18 = new com.xzq.osc.JocHyperlink();
        jTaskPaneGroup3 = new com.l2fprod.common.swing.JTaskPaneGroup();
        jocHyperlink8 = new com.xzq.osc.JocHyperlink();
        jocHyperlink9 = new com.xzq.osc.JocHyperlink();
        jocHyperlink10 = new com.xzq.osc.JocHyperlink();
        jocHyperlink23 = new com.xzq.osc.JocHyperlink();
        jTaskPaneGroup4 = new com.l2fprod.common.swing.JTaskPaneGroup();
        jocHyperlink11 = new com.xzq.osc.JocHyperlink();
        jocHyperlink12 = new com.xzq.osc.JocHyperlink();
        jTaskPaneGroup2 = new com.l2fprod.common.swing.JTaskPaneGroup();
        btnSMDoctorList = new com.xzq.osc.JocHyperlink();
        btnSMPosition = new com.xzq.osc.JocHyperlink();
        jTaskPaneGroup6 = new com.l2fprod.common.swing.JTaskPaneGroup();
        btnSMHospitalInfo = new com.xzq.osc.JocHyperlink();
        btnSMRoomInfo = new com.xzq.osc.JocHyperlink();
        btnBedInfo = new com.xzq.osc.JocHyperlink();
        btnSMNationalityInfo = new com.xzq.osc.JocHyperlink();
        btnSMProvinceInfo = new com.xzq.osc.JocHyperlink();
        btnSMDisttrictInfo = new com.xzq.osc.JocHyperlink();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        img_background = "";
        ImageIcon icon = new ImageIcon(getClass().getResource(img_background));
        final Image img = icon.getImage();
        DeskTopControl = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HMS");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 3));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jocGroupPane1.setExpansionDirection(com.xzq.osc.JocGroupPane.ExpansionDirection.LEFT_TO_RIGHT);
        jocGroupPane1.setText("");
        jocGroupPane1.setLayout(new java.awt.BorderLayout());

        jTaskPaneGroup1.setTitle("ການລົງທະບຽນ");
        jTaskPaneGroup1.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N

        btnSMRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Register_24px.png"))); // NOI18N
        btnSMRegister.setText("ລົງທະບຽນຜູ້ເຈັບ");
        btnSMRegister.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnSMRegister.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSMRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSMRegisterActionPerformed(evt);
            }
        });
        jTaskPaneGroup1.getContentPane().add(btnSMRegister);

        btnSMPatientList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Sick_24px.png"))); // NOI18N
        btnSMPatientList.setText("ເພີ່ມຜູ້ເຈັບ");
        btnSMPatientList.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnSMPatientList.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSMPatientList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSMPatientListActionPerformed(evt);
            }
        });
        jTaskPaneGroup1.getContentPane().add(btnSMPatientList);

        btnSMRtpPatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/News_24px.png"))); // NOI18N
        btnSMRtpPatient.setText("ລາຍງານການລົງທະບຽນ");
        btnSMRtpPatient.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnSMRtpPatient.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup1.getContentPane().add(btnSMRtpPatient);

        jTaskPane1.add(jTaskPaneGroup1);

        jTaskPaneGroup5.setTitle("ຂະແໜງ");
        jTaskPaneGroup5.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N

        jocHyperlink15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Clinic_24px.png"))); // NOI18N
        jocHyperlink15.setText("ພາຍໃນ");
        jocHyperlink15.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup5.getContentPane().add(jocHyperlink15);

        jocHyperlink16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Clinic1_24px.png"))); // NOI18N
        jocHyperlink16.setText("ພະນອກ");
        jocHyperlink16.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup5.getContentPane().add(jocHyperlink16);

        jocHyperlink17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Ambulance_24px.png"))); // NOI18N
        jocHyperlink17.setText("ສຸກເສີນ");
        jocHyperlink17.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup5.getContentPane().add(jocHyperlink17);

        jocHyperlink18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Children_24px.png"))); // NOI18N
        jocHyperlink18.setText("ເດັກນ້ອຍ");
        jocHyperlink18.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup5.getContentPane().add(jocHyperlink18);

        jTaskPane1.add(jTaskPaneGroup5);

        jTaskPaneGroup3.setExpanded(false);
        jTaskPaneGroup3.setTitle("ຫ້ອງ Lab & ຜ່າຕັດ");
        jTaskPaneGroup3.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N

        jocHyperlink8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/X-ray_24px.png"))); // NOI18N
        jocHyperlink8.setText("ຫ້ອງ X-Ray");
        jocHyperlink8.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup3.getContentPane().add(jocHyperlink8);

        jocHyperlink9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Echo_24px.png"))); // NOI18N
        jocHyperlink9.setText("ຫ້ອງເອໂກ");
        jocHyperlink9.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup3.getContentPane().add(jocHyperlink9);

        jocHyperlink10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Analyze_24px.png"))); // NOI18N
        jocHyperlink10.setText("ຫ້ອງວິເຄາະ");
        jocHyperlink10.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup3.getContentPane().add(jocHyperlink10);

        jocHyperlink23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Physical Therapy_24px.png"))); // NOI18N
        jocHyperlink23.setText("ຫ້ອງຜ່າຕັດ");
        jocHyperlink23.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup3.getContentPane().add(jocHyperlink23);

        jTaskPane1.add(jTaskPaneGroup3);

        jTaskPaneGroup4.setExpanded(false);
        jTaskPaneGroup4.setTitle("ການຢາ & ການເງິນ");
        jTaskPaneGroup4.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N

        jocHyperlink11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Medical Bag_24px.png"))); // NOI18N
        jocHyperlink11.setText("ລາຍການໃບສັ່ງຢາ");
        jocHyperlink11.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup4.getContentPane().add(jocHyperlink11);

        jocHyperlink12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Money_24px.png"))); // NOI18N
        jocHyperlink12.setText("ຈ່າຍຄ່າຢາ");
        jocHyperlink12.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup4.getContentPane().add(jocHyperlink12);

        jTaskPane1.add(jTaskPaneGroup4);

        jTaskPaneGroup2.setExpanded(false);
        jTaskPaneGroup2.setTitle("ຂໍ້ມູນທ່ານໝໍ");
        jTaskPaneGroup2.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N

        btnSMDoctorList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Medical Doctor_24px.png"))); // NOI18N
        btnSMDoctorList.setText("ເພີ່ມທ່ານໝໍ");
        btnSMDoctorList.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnSMDoctorList.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSMDoctorList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSMDoctorListActionPerformed(evt);
            }
        });
        jTaskPaneGroup2.getContentPane().add(btnSMDoctorList);

        btnSMPosition.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Medal_24px.png"))); // NOI18N
        btnSMPosition.setText("ຕຳແໜ່ງ");
        btnSMPosition.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnSMPosition.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSMPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSMPositionActionPerformed(evt);
            }
        });
        jTaskPaneGroup2.getContentPane().add(btnSMPosition);

        jTaskPane1.add(jTaskPaneGroup2);

        jTaskPaneGroup6.setTitle("ຕັ້ງຄ່າລະບົບ");
        jTaskPaneGroup6.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N

        btnSMHospitalInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Hospital 3_24px.png"))); // NOI18N
        btnSMHospitalInfo.setText("ຂໍ້ໍມູນໂຮງໝໍ");
        btnSMHospitalInfo.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnSMHospitalInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSMHospitalInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSMHospitalInfoActionPerformed(evt);
            }
        });
        jTaskPaneGroup6.getContentPane().add(btnSMHospitalInfo);

        btnSMRoomInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Room_24px.png"))); // NOI18N
        btnSMRoomInfo.setText("ຫ້ອງນອນ");
        btnSMRoomInfo.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnSMRoomInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup6.getContentPane().add(btnSMRoomInfo);

        btnBedInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Hotel Bed_24px.png"))); // NOI18N
        btnBedInfo.setText("ຂໍ້ມູນຕຽງນອນ");
        btnBedInfo.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnBedInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup6.getContentPane().add(btnBedInfo);

        btnSMNationalityInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Flag 2_24px.png"))); // NOI18N
        btnSMNationalityInfo.setText("ສັນຊາດ");
        btnSMNationalityInfo.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnSMNationalityInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup6.getContentPane().add(btnSMNationalityInfo);

        btnSMProvinceInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Canada Map_24px.png"))); // NOI18N
        btnSMProvinceInfo.setText("ແຂວງ");
        btnSMProvinceInfo.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnSMProvinceInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSMProvinceInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSMProvinceInfoActionPerformed(evt);
            }
        });
        jTaskPaneGroup6.getContentPane().add(btnSMProvinceInfo);

        btnSMDisttrictInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Region_24px.png"))); // NOI18N
        btnSMDisttrictInfo.setText("ເມືອງ");
        btnSMDisttrictInfo.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnSMDisttrictInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSMDisttrictInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSMDisttrictInfoActionPerformed(evt);
            }
        });
        jTaskPaneGroup6.getContentPane().add(btnSMDisttrictInfo);

        jTaskPane1.add(jTaskPaneGroup6);

        jLabel1.setText("                                                                  ");
        jTaskPane1.add(jLabel1);

        jScrollPane1.setViewportView(jTaskPane1);

        jocGroupPane1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jocGroupPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 3));
        jPanel2.setLayout(new java.awt.BorderLayout());

        DeskTopControl.setBackground(java.awt.SystemColor.control);

        javax.swing.GroupLayout DeskTopControlLayout = new javax.swing.GroupLayout(DeskTopControl);
        DeskTopControl.setLayout(DeskTopControlLayout);
        DeskTopControlLayout.setHorizontalGroup(
            DeskTopControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        DeskTopControlLayout.setVerticalGroup(
            DeskTopControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 772, Short.MAX_VALUE)
        );

        jPanel2.add(DeskTopControl, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jMenu1.setText("ລະບົບຈັດການໂຮງໝໍ");
        jMenu1.setEnabled(false);
        jMenu1.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSMPatientListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSMPatientListActionPerformed
        FrmPatientList patientObject = new FrmPatientList();
        DeskTopControl.add(patientObject);
        patientObject.setVisible(true);
        try {
          patientObject.setMaximum(true);
        } catch (PropertyVetoException e) {
            JOptionPane.showConfirmDialog(null,"Can not be maximized!");
        }
    }//GEN-LAST:event_btnSMPatientListActionPerformed

    private void btnSMRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSMRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSMRegisterActionPerformed

    private void btnSMDoctorListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSMDoctorListActionPerformed
        FrmDoctorList frmDoctorList = new FrmDoctorList();
        DeskTopControl.add(frmDoctorList);
        frmDoctorList.setVisible(true);
        try {
          frmDoctorList.setMaximum(true);
        } catch (PropertyVetoException e) {
            JOptionPane.showConfirmDialog(null,"Can not be maximized!");
        }
    }//GEN-LAST:event_btnSMDoctorListActionPerformed

    private void btnSMPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSMPositionActionPerformed
        FrmPosition frmPosition = new FrmPosition();      
        ControlDeskTopPane aa = new ControlDeskTopPane();
        aa.controljInternalFrame(DeskTopControl, frmPosition, "Position");
    }//GEN-LAST:event_btnSMPositionActionPerformed

    private void btnSMHospitalInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSMHospitalInfoActionPerformed
        FrmHospital frmHospitalInfo = new FrmHospital();
        ControlDeskTopPane aa = new ControlDeskTopPane();
        aa.controljInternalFrame(DeskTopControl, frmHospitalInfo, "Hospital Info");
    }//GEN-LAST:event_btnSMHospitalInfoActionPerformed

    private void btnSMDisttrictInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSMDisttrictInfoActionPerformed
      FrmDistricts districtsObject = new FrmDistricts();
        DeskTopControl.add(districtsObject);
        districtsObject.setVisible(true);
        try {
          districtsObject.setMaximum(true);
        } catch (PropertyVetoException e) {
            JOptionPane.showConfirmDialog(null,"Can not be maximized!");
        }
    }//GEN-LAST:event_btnSMDisttrictInfoActionPerformed

    private void btnSMProvinceInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSMProvinceInfoActionPerformed
       FrmProvinces provinceObj = new FrmProvinces();
        DeskTopControl.add(provinceObj);
        provinceObj.setVisible(true);
        try {
          provinceObj.setMaximum(true);
        } catch (PropertyVetoException e) {
            JOptionPane.showConfirmDialog(null,"Can not be maximized!");
        }
    }//GEN-LAST:event_btnSMProvinceInfoActionPerformed

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
                    //UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
                //SwingUtilities.updateComponentTreeUI(this);
                    break;
                }
                
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DeskTopControl;
    private com.xzq.osc.JocHyperlink btnBedInfo;
    private com.xzq.osc.JocHyperlink btnSMDisttrictInfo;
    private com.xzq.osc.JocHyperlink btnSMDoctorList;
    private com.xzq.osc.JocHyperlink btnSMHospitalInfo;
    private com.xzq.osc.JocHyperlink btnSMNationalityInfo;
    private com.xzq.osc.JocHyperlink btnSMPatientList;
    private com.xzq.osc.JocHyperlink btnSMPosition;
    private com.xzq.osc.JocHyperlink btnSMProvinceInfo;
    private com.xzq.osc.JocHyperlink btnSMRegister;
    private com.xzq.osc.JocHyperlink btnSMRoomInfo;
    private com.xzq.osc.JocHyperlink btnSMRtpPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.l2fprod.common.swing.JTaskPane jTaskPane1;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup1;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup2;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup3;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup4;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup5;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup6;
    private com.xzq.osc.JocGroupPane jocGroupPane1;
    private com.xzq.osc.JocHyperlink jocHyperlink10;
    private com.xzq.osc.JocHyperlink jocHyperlink11;
    private com.xzq.osc.JocHyperlink jocHyperlink12;
    private com.xzq.osc.JocHyperlink jocHyperlink15;
    private com.xzq.osc.JocHyperlink jocHyperlink16;
    private com.xzq.osc.JocHyperlink jocHyperlink17;
    private com.xzq.osc.JocHyperlink jocHyperlink18;
    private com.xzq.osc.JocHyperlink jocHyperlink23;
    private com.xzq.osc.JocHyperlink jocHyperlink8;
    private com.xzq.osc.JocHyperlink jocHyperlink9;
    // End of variables declaration//GEN-END:variables
}
