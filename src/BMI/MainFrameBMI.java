/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMI;

import BMI.Fungsi.Progam;
import BMI.Operation.ModelProgam;
import BMI.Operation.Operation;
import javax.swing.JOptionPane;

/**
 *
 * @author Dhimas N A
 */
public class MainFrameBMI extends javax.swing.JFrame {

    Progam progam = new Progam();
    
    public MainFrameBMI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTulisan = new javax.swing.JLabel();
        LabelGambar1 = new javax.swing.JLabel();
        LbNama = new javax.swing.JLabel();
        TfNama = new javax.swing.JTextField();
        LbCheck = new javax.swing.JLabel();
        LbUmur = new javax.swing.JLabel();
        TfUmur = new javax.swing.JTextField();
        LbGender = new javax.swing.JLabel();
        RbCewek = new javax.swing.JRadioButton();
        RbCowok = new javax.swing.JRadioButton();
        BtnSubmit = new javax.swing.JButton();
        LbResult = new javax.swing.JLabel();
        LbBerat = new javax.swing.JLabel();
        LbTinggi = new javax.swing.JLabel();
        TfBerat = new javax.swing.JTextField();
        TfTinggi = new javax.swing.JTextField();
        BtnHitung = new javax.swing.JButton();
        LbHasil = new javax.swing.JLabel();
        TfHasil = new javax.swing.JTextField();
        BtnTips = new javax.swing.JButton();
        LabelGambar = new javax.swing.JLabel();
        TfTips = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelTulisan.setFont(new java.awt.Font("a Anti Corona", 1, 13)); // NOI18N
        LabelTulisan.setForeground(new java.awt.Color(255, 9, 255));
        LabelTulisan.setText("Silakan Input Data di Bawah Untuk Mengetahui BMI Anda !");
        getContentPane().add(LabelTulisan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 390, -1));

        LabelGambar1.setIcon(new javax.swing.ImageIcon("D:\\File Dhimas\\bmi.png")); // NOI18N
        getContentPane().add(LabelGambar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 420, 200));

        LbNama.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        LbNama.setText("Nama");
        getContentPane().add(LbNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 50, 30));

        TfNama.setFont(new java.awt.Font("Book Antiqua", 2, 14)); // NOI18N
        TfNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfNamaActionPerformed(evt);
            }
        });
        getContentPane().add(TfNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 340, 30));

        LbCheck.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        LbCheck.setText("-");
        getContentPane().add(LbCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 340, 30));

        LbUmur.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        LbUmur.setText("Umur");
        getContentPane().add(LbUmur, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        TfUmur.setFont(new java.awt.Font("Book Antiqua", 2, 14)); // NOI18N
        TfUmur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfUmurActionPerformed(evt);
            }
        });
        getContentPane().add(TfUmur, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 60, 30));

        LbGender.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        LbGender.setText("Gender");
        getContentPane().add(LbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        RbCewek.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        RbCewek.setText("Cewek");
        getContentPane().add(RbCewek, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, 30));

        RbCowok.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        RbCowok.setText("Cowok");
        getContentPane().add(RbCowok, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, 30));

        BtnSubmit.setText("Submit");
        BtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 200, -1));

        LbResult.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        LbResult.setText("-");
        getContentPane().add(LbResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 350, 30));

        LbBerat.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        LbBerat.setText("Berat");
        getContentPane().add(LbBerat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        LbTinggi.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        LbTinggi.setText("Tinggi");
        getContentPane().add(LbTinggi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));

        TfBerat.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        getContentPane().add(TfBerat, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 110, 30));

        TfTinggi.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        getContentPane().add(TfTinggi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 110, 30));

        BtnHitung.setText("Hitung");
        BtnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHitungActionPerformed(evt);
            }
        });
        getContentPane().add(BtnHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, -1, -1));

        LbHasil.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        LbHasil.setText("Hasil");
        getContentPane().add(LbHasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, -1, -1));

        TfHasil.setFont(new java.awt.Font("Book Antiqua", 2, 14)); // NOI18N
        TfHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfHasilActionPerformed(evt);
            }
        });
        getContentPane().add(TfHasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 650, 340, 130));

        BtnTips.setText("Tips");
        getContentPane().add(BtnTips, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 790, 110, 30));

        LabelGambar.setIcon(new javax.swing.ImageIcon("D:\\File Dhimas\\images - 2021-04-01T204106.693.png")); // NOI18N
        getContentPane().add(LabelGambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 870, 120, 80));

        TfTips.setFont(new java.awt.Font("Adobe Devanagari", 0, 12)); // NOI18N
        TfTips.setForeground(new java.awt.Color(255, 254, 204));
        getContentPane().add(TfTips, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 830, 340, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TfNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfNamaActionPerformed

    private void TfUmurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfUmurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfUmurActionPerformed

    private void BtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubmitActionPerformed
//------------- Cek Nama-------------//
        Progam progam = new Progam();
        String nama = TfNama.getText();
        
        Boolean cek_nama = progam.checkNama(nama);
        
        String hasil = "Silakan Masukan Huruf Alfabet Saja";
        
        if (cek_nama){
            hasil = "Hai " + nama + "!";
        }
        LbCheck.setText(hasil);
//----------- Cek Umur -------------//
        String umur = TfUmur.getText();
        
        Boolean cek_umur = progam.checkUmur(umur);
        
        String output = "Silakan masukan berat dalam KG dan tinggi dalam CM";
        
        if (cek_umur){
            LbResult.setText(output);
        }
        else {
            JOptionPane.showMessageDialog(this, "Kamu Hanya Dapat "
                                + "Memasukan umur"
					+ " antara 1 sampai 100");
        }
        
    }//GEN-LAST:event_BtnSubmitActionPerformed

    private void TfHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfHasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfHasilActionPerformed

    private void BtnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHitungActionPerformed
        ModelProgam modelprogam = new ModelProgam();
        Progam progam = new Progam();
        Operation op = new Operation();
        
        String a = TfBerat.getText();
        String b = TfTinggi.getText();
        
        int inputBerat = Integer.parseInt(a);
        int inputTinggi = Integer.parseInt(b);
        
        modelprogam
    }//GEN-LAST:event_BtnHitungActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrameBMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrameBMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrameBMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrameBMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrameBMI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHitung;
    private javax.swing.JButton BtnSubmit;
    private javax.swing.JButton BtnTips;
    private javax.swing.JLabel LabelGambar;
    private javax.swing.JLabel LabelGambar1;
    private javax.swing.JLabel LabelTulisan;
    private javax.swing.JLabel LbBerat;
    private javax.swing.JLabel LbCheck;
    private javax.swing.JLabel LbGender;
    private javax.swing.JLabel LbHasil;
    private javax.swing.JLabel LbNama;
    private javax.swing.JLabel LbResult;
    private javax.swing.JLabel LbTinggi;
    private javax.swing.JLabel LbUmur;
    private javax.swing.JRadioButton RbCewek;
    private javax.swing.JRadioButton RbCowok;
    private javax.swing.JTextField TfBerat;
    private javax.swing.JTextField TfHasil;
    private javax.swing.JTextField TfNama;
    private javax.swing.JTextField TfTinggi;
    private javax.swing.JTextField TfTips;
    private javax.swing.JTextField TfUmur;
    // End of variables declaration//GEN-END:variables
}
