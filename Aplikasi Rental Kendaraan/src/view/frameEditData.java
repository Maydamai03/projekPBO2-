/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.datarentalcontroller;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import controller.datarentalcontroller;
import javax.swing.table.DefaultTableModel;
import model.datarental;
/**
 *
 * @author ACER
 */
public class frameEditData extends javax.swing.JFrame {

    /**
     * Creates new form frameEditData
     */

     private datarentalcontroller dc;
    private datarental dataRental;

    public frameEditData(datarental dataRental) {
        initComponents();
        dc = new datarentalcontroller(this);
        this.dataRental = dataRental;
        JTxtNamaCustomer.setText(dataRental.getNama_customer());
        JTxtnoHp.setText(dataRental.getNo_telp_customer());

        if (dataRental.getTipe_kendaraan().equals("Mobil")) {
            Jradiobtn1.setSelected(true);
        } else if (dataRental.getTipe_kendaraan().equals("Motor")) {
            Jradiobtn2.setSelected(true);
        }

        JDropKendaraan.setSelectedItem(dataRental.getNama_kendaraan());

        JFieldLamaSewa.setText(String.valueOf(dataRental.getLama_waktu_sewa()));
        JFieldBiayaPerjam.setText(String.valueOf(dataRental.getBiaya_perjam()));
        JFieldTotalBiaya.setText(String.valueOf(dataRental.getTotal_biaya()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        toFrameUtama = new javax.swing.JToggleButton();
        JFieldBiayaPerjam = new javax.swing.JTextField();
        Jradiobtn2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        JTxtNamaCustomer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JFieldLamaSewa = new javax.swing.JTextField();
        Jradiobtn1 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTxtnoHp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JDropKendaraan = new javax.swing.JComboBox<>();
        JFieldTotalBiaya = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JToggleButton();
        hitungbiaya = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        toFrameUtama.setBackground(new java.awt.Color(0, 153, 153));
        toFrameUtama.setForeground(new java.awt.Color(255, 255, 255));
        toFrameUtama.setText("Kembali ke Home");
        toFrameUtama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toFrameUtamaActionPerformed(evt);
            }
        });

        JFieldBiayaPerjam.setEditable(false);
        JFieldBiayaPerjam.setBackground(new java.awt.Color(233, 250, 250));
        JFieldBiayaPerjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFieldBiayaPerjamActionPerformed(evt);
            }
        });

        Jradiobtn2.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(Jradiobtn2);
        Jradiobtn2.setText("Motor");
        Jradiobtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jradiobtn2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("STHupo", 1, 36)); // NOI18N
        jLabel1.setText("Form Perentalan Kendaraan");

        JTxtNamaCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTxtNamaCustomerActionPerformed(evt);
            }
        });

        jLabel6.setText("Lama Waktu Sewa (Jam) :");

        jLabel2.setText("Nama Penyewa :");

        JFieldLamaSewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFieldLamaSewaActionPerformed(evt);
            }
        });

        Jradiobtn1.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(Jradiobtn1);
        Jradiobtn1.setText("Mobil");
        Jradiobtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jradiobtn1ActionPerformed(evt);
            }
        });

        jLabel7.setText("No.HP               :");

        jLabel3.setText("Tipe Kendaraan : ");

        JTxtnoHp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTxtnoHpActionPerformed(evt);
            }
        });

        jLabel4.setText("Nama Kendaraan :");

        jLabel9.setText("Total Biaya :");

        JDropKendaraan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "~SILAHKAN PILIH~", "Ferrari", "Koenisegg", "Pagani", "Avanza", "Kijang Kotak", " " }));
        JDropKendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JDropKendaraanActionPerformed(evt);
            }
        });

        JFieldTotalBiaya.setEditable(false);
        JFieldTotalBiaya.setBackground(new java.awt.Color(233, 250, 250));
        JFieldTotalBiaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFieldTotalBiayaActionPerformed(evt);
            }
        });

        jLabel5.setText("Biaya /Jam :");

        updateBtn.setBackground(new java.awt.Color(255, 255, 204));
        updateBtn.setText("Update Data Rental");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        hitungbiaya.setBackground(new java.awt.Color(255, 255, 204));
        hitungbiaya.setText("Hitung ");
        hitungbiaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungbiayaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTxtNamaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTxtnoHp, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(Jradiobtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Jradiobtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(JDropKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(90, 90, 90))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(JFieldTotalBiaya)
                                            .addComponent(JFieldBiayaPerjam)
                                            .addComponent(JFieldLamaSewa, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addComponent(hitungbiaya))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toFrameUtama))
                        .addGap(188, 188, 188)))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTxtNamaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Jradiobtn1)
                    .addComponent(Jradiobtn2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(JTxtnoHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(JDropKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(JFieldBiayaPerjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JFieldLamaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JFieldTotalBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hitungbiaya))
                .addGap(18, 18, 18)
                .addComponent(updateBtn)
                .addGap(78, 78, 78)
                .addComponent(toFrameUtama)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toFrameUtamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toFrameUtamaActionPerformed
        frameUtama v = new frameUtama();
        v.setVisible(true);
        v.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_toFrameUtamaActionPerformed

    private void JFieldBiayaPerjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFieldBiayaPerjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JFieldBiayaPerjamActionPerformed

    private void Jradiobtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jradiobtn2ActionPerformed
        // TODO add your handling code here:
        JDropKendaraan.removeAllItems(); 

        JDropKendaraan.addItem("Honda");
        JDropKendaraan.addItem("Yamaha");
        JDropKendaraan.addItem("Suzuki");
        JDropKendaraan.addItem("Kawasaki");
    }//GEN-LAST:event_Jradiobtn2ActionPerformed

    private void JTxtNamaCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTxtNamaCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTxtNamaCustomerActionPerformed

    private void JFieldLamaSewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFieldLamaSewaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JFieldLamaSewaActionPerformed

    private void Jradiobtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jradiobtn1ActionPerformed
        // TODO add your handling code here:
        JDropKendaraan.removeAllItems(); 

        JDropKendaraan.addItem("Ferrari");
        JDropKendaraan.addItem("Koenisegg");
        JDropKendaraan.addItem("Pagani");
        JDropKendaraan.addItem("Avanza");
        JDropKendaraan.addItem("Kijang Kotak");
    }//GEN-LAST:event_Jradiobtn1ActionPerformed

    private void JTxtnoHpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTxtnoHpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTxtnoHpActionPerformed

    private void JDropKendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JDropKendaraanActionPerformed
        int index = JDropKendaraan.getSelectedIndex();
        if (Jradiobtn1.isSelected()) { 
            switch (index) {

                case 0:
                JFieldBiayaPerjam.setText("200000"); 
                break;
                case 1:
                JFieldBiayaPerjam.setText("500000"); 
                break;
                case 2:
                JFieldBiayaPerjam.setText("350000"); 
                break;
                case 3:
                JFieldBiayaPerjam.setText("190000");
                break;
                case 4:
                JFieldBiayaPerjam.setText("90000");  
                break;
                default:
                break;
            }
        } else if (Jradiobtn2.isSelected()) { 
            switch (index) {
               
                case 0:
                JFieldBiayaPerjam.setText("100000"); 
                break;
                case 1:
                JFieldBiayaPerjam.setText("80000"); 
                break;
                case 2:
                JFieldBiayaPerjam.setText("90000");  
                break;
                case 3:
                JFieldBiayaPerjam.setText("120000"); 
                break;
                default:
                break;
            }
        }

    }//GEN-LAST:event_JDropKendaraanActionPerformed

    private void JFieldTotalBiayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFieldTotalBiayaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JFieldTotalBiayaActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        dc.update();
        dc.isitabel();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void hitungbiayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungbiayaActionPerformed
        // TODO add your handling code here:
        String biayaPerJamStr = JFieldBiayaPerjam.getText();
        String lamaSewaStr = JFieldLamaSewa.getText();

        try {
            int biayaPerJam = Integer.parseInt(biayaPerJamStr);
        int lamaSewa = Integer.parseInt(lamaSewaStr);

        int totalBiaya = biayaPerJam * lamaSewa;

            JFieldTotalBiaya.setText(String.valueOf(totalBiaya));
        } catch (NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_hitungbiayaActionPerformed

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
            java.util.logging.Logger.getLogger(frameEditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameEditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameEditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameEditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            datarental rentalData = new datarental(); 
            new frameEditData(rentalData).setVisible(true);            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JDropKendaraan;
    private javax.swing.JTextField JFieldBiayaPerjam;
    private javax.swing.JTextField JFieldLamaSewa;
    private javax.swing.JTextField JFieldTotalBiaya;
    private javax.swing.JTextField JTxtNamaCustomer;
    private javax.swing.JTextField JTxtnoHp;
    private javax.swing.JRadioButton Jradiobtn1;
    private javax.swing.JRadioButton Jradiobtn2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton hitungbiaya;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton toFrameUtama;
    private javax.swing.JToggleButton updateBtn;
    // End of variables declaration//GEN-END:variables
public JComboBox<String> getJDropKendaraan() {
        return JDropKendaraan;
    }

    public void setJDropKendaraan(JComboBox<String> JDropKendaraan) {
        this.JDropKendaraan = JDropKendaraan;
    }

    public JTextField getJFieldBiayaPerjam() {
        return JFieldBiayaPerjam;
    }

    public void setJFieldBiayaPerjam(JTextField JFieldBiayaPerjam) {
        this.JFieldBiayaPerjam = JFieldBiayaPerjam;
    }

    public JTextField getJFieldLamaSewa() {
        return JFieldLamaSewa;
    }

    public void setJFieldLamaSewa(JTextField JFieldLamaSewa) {
        this.JFieldLamaSewa = JFieldLamaSewa;
    }

    public JTextField getJFieldTotalBiaya() {
        return JFieldTotalBiaya;
    }

    public void setJFieldTotalBiaya(JTextField JFieldTotalBiaya) {
        this.JFieldTotalBiaya = JFieldTotalBiaya;
    }

    public JTextField getJTxtNamaCustomer() {
        return JTxtNamaCustomer;
    }

    public void setJTxtNamaCustomer(JTextField JTxtNamaCustomer) {
        this.JTxtNamaCustomer = JTxtNamaCustomer;
    }

    public JTextField getJTxtnoHp() {
        return JTxtnoHp;
    }

    public void setJTxtnoHp(JTextField JTxtnoHp) {
        this.JTxtnoHp = JTxtnoHp;
    }

    public JRadioButton getJradiobtn1() {
        return Jradiobtn1;
    }

    public void setJradiobtn1(JRadioButton Jradiobtn1) {
        this.Jradiobtn1 = Jradiobtn1;
    }

    public JRadioButton getJradiobtn2() {
        return Jradiobtn2;
    }

    public void setJradiobtn2(JRadioButton Jradiobtn2) {
        this.Jradiobtn2 = Jradiobtn2;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public JToggleButton getjToggleButton2() {
        return toFrameUtama;
    }

    public void setjToggleButton2(JToggleButton jToggleButton2) {
        this.toFrameUtama = jToggleButton2;
    }
}