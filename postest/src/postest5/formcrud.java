/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postest5;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wildan
 */
public class formcrud extends javax.swing.JFrame {

    /**
     * Creates new form formcrud
     */
    public formcrud() {
        initComponents();
    }
     private DefaultTableModel model;
    
     public void InitTable(){
    model = new DefaultTableModel();
    model.addColumn("NAMA");
    model.addColumn("NOMOR TELEPON");
    model.addColumn("KOTA");
    jTable1.setModel(model);

    }
    void filterhrf(KeyEvent huruf){
        if(Character.isAlphabetic(huruf.getKeyChar())){
            huruf.consume();
        JOptionPane.showMessageDialog(null, "teksfield ini hanya bisa diisi dengan angka");
        }
    }
    
    void filterangka (KeyEvent angka){
        if(Character.isDigit(angka.getKeyChar())) {
            angka.consume();
        JOptionPane.showMessageDialog(null, "teksfield ini hanya bisa diisi dengan huruf");
    }}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inpnama = new javax.swing.JTextField();
        inptelp = new javax.swing.JTextField();
        cmbkota = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tambah = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N

        inpnama.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                inpnamaCaretUpdate(evt);
            }
        });
        inpnama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inpnamaKeyTyped(evt);
            }
        });

        inptelp.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                inptelpCaretUpdate(evt);
            }
        });
        inptelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inptelpActionPerformed(evt);
            }
        });
        inptelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inptelpKeyTyped(evt);
            }
        });

        cmbkota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nasi padang", "nasi campur", "nasi ayam", "nasi goreng" }));
        cmbkota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbkotaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "nama", "no telpon", "makanan favorit"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        tambah.setText("tambahdata");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        simpan.setText("simpandata");
        simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simpanMouseClicked(evt);
            }
        });
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        hapus.setText("hapus");
        hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusMouseClicked(evt);
            }
        });
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        reset.setText("reset");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });

        update.setText("update");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jButton1.setText("Kosongkan tabel");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 2, 11)); // NOI18N
        jLabel1.setText("Nama");

        jLabel2.setText("No telp");

        jLabel3.setText("Makanan fav");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(inpnama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                            .addComponent(inptelp, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addComponent(tambah)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addComponent(simpan)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(update)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(hapus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(reset))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(jButton1)))
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(cmbkota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inpnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inptelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbkota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(84, 84, 84)
                .addComponent(tambah)
                .addGap(4, 4, 4)
                .addComponent(update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(hapus)
                    .addComponent(reset))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(114, 114, 114))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
       inpnama.setEnabled(true);
        inptelp.setEnabled(true);
        cmbkota.setEnabled(true);
    }//GEN-LAST:event_tambahActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
       
    }//GEN-LAST:event_simpanActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
    }//GEN-LAST:event_updateActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hapusActionPerformed

    private void hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusMouseClicked
      try{
            int pilih = JOptionPane.showConfirmDialog(this, "ingin hapus", "Confirmasi hapus", JOptionPane.YES_OPTION);
            if(pilih==JOptionPane.YES_OPTION){
                int baris = jTable1.getSelectedRow();
                model.removeRow(baris);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"tabel belum dipilih", "kesalahan",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_hapusMouseClicked

    private void simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simpanMouseClicked
       Object[] data = new Object[3];
        data[0] = inpnama.getText();
        data[1] = inptelp.getText();
        data[2] = cmbkota.getSelectedItem();
        model.addRow(data);

        update.setEnabled(true);
        hapus.setEnabled(true);
        reset.setEnabled(true);
    }//GEN-LAST:event_simpanMouseClicked

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        inpnama.setText("");
        inptelp.setText("");
        cmbkota.setSelectedItem("");
    }//GEN-LAST:event_resetMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        inpnama.requestFocus();
    }//GEN-LAST:event_jButton1MouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
     InitTable();
    }//GEN-LAST:event_formComponentShown

    private void inpnamaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_inpnamaCaretUpdate
       if(inpnama.getText().length() !=0 && inptelp.getText().length() !=0){
            simpan.setEnabled(true);
        }
        else{
            simpan.setEnabled(false);
            update.setEnabled(false);
            hapus.setEnabled(false);
            reset.setEnabled(false);
        }
    }//GEN-LAST:event_inpnamaCaretUpdate

    private void inpnamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inpnamaKeyTyped
       filterangka(evt);
    }//GEN-LAST:event_inpnamaKeyTyped

    private void inptelpCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_inptelpCaretUpdate
       if(inpnama.getText().length() !=0 && inptelp.getText().length() !=0){
            simpan.setEnabled(true);
        }
        else{
            simpan.setEnabled(false);
            update.setEnabled(false);
            hapus.setEnabled(false);
            reset.setEnabled(false);
        }
    }//GEN-LAST:event_inptelpCaretUpdate

    private void inptelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inptelpActionPerformed
      
    }//GEN-LAST:event_inptelpActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      inpnama.setText("");
        inptelp.setText("");
        
        inpnama.setEnabled(false);
        inptelp.setEnabled(false);
        cmbkota.setEnabled(false);
        simpan.setEnabled(false);
        update.setEnabled(false);
        hapus.setEnabled(false);
        reset.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void inptelpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inptelpKeyTyped
        filterhrf(evt);
    }//GEN-LAST:event_inptelpKeyTyped

    private void cmbkotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbkotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbkotaActionPerformed

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
try{
            int baris = jTable1.getSelectedRow();

            jTable1.setValueAt(inpnama.getText(), baris, 0);
            jTable1.setValueAt(inptelp.getText(), baris, 1);
            jTable1.setValueAt(cmbkota.getSelectedItem(), baris, 2);
        }
        catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this,"table belum dipilih","kesalahan",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_updateMouseClicked

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
            java.util.logging.Logger.getLogger(formcrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formcrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formcrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formcrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formcrud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbkota;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField inpnama;
    private javax.swing.JTextField inptelp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton reset;
    private javax.swing.JButton simpan;
    private javax.swing.JButton tambah;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}