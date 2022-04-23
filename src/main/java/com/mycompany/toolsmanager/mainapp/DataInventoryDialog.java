/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.toolsmanager.mainapp;

import com.mycompany.toolsmanager.models.Levels;
import com.mycompany.toolsmanager.models.Results;
import com.mycompany.toolsmanager.models.User;
import com.mycompany.toolsmanager.showdata.Data;
import com.mycompany.toolsmanager.startapp.Login;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Diego Ramirez
 */
public class DataInventoryDialog extends javax.swing.JDialog {

    /**
     * Creates new form DataInventoryDialog
     */
    public DataInventoryDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        txtResultsChooser = new javax.swing.JTextField();
        txtLevelChooser = new javax.swing.JTextField();
        btnSelectltLevel = new javax.swing.JButton();
        lblFile1 = new javax.swing.JLabel();
        btnSelectResult = new javax.swing.JButton();
        lblFile = new javax.swing.JLabel();
        btnCreateData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSelectltLevel.setText("Select Level");
        btnSelectltLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectltLevelActionPerformed(evt);
            }
        });

        lblFile1.setText("Selecciona el fichero de los niveles");

        btnSelectResult.setText("Select Results");
        btnSelectResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectResultActionPerformed(evt);
            }
        });

        lblFile.setText("Selecciona el fichero de los resultados de los intentos");

        btnCreateData.setText("Create data");
        btnCreateData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFile1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLevelChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSelectltLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtResultsChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSelectResult))
                            .addComponent(lblFile)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(btnCreateData)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResultsChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectResult))
                .addGap(13, 13, 13)
                .addComponent(lblFile1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLevelChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectltLevel))
                .addGap(35, 35, 35)
                .addComponent(btnCreateData)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectltLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectltLevelActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("CSV Files", "csv");
        fileChooser.setFileFilter(fileFilter);
        int returnOption = fileChooser.showOpenDialog(this);
        if (returnOption == JFileChooser.APPROVE_OPTION)
        txtLevelChooser.setText(fileChooser.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_btnSelectltLevelActionPerformed

    private void btnSelectResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectResultActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("CSV Files", "csv");
        fileChooser.setFileFilter(fileFilter);
        int returnOption = fileChooser.showOpenDialog(this);
        if (returnOption == JFileChooser.APPROVE_OPTION)
        txtResultsChooser.setText(fileChooser.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_btnSelectResultActionPerformed

    private void btnCreateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDataActionPerformed
        // TODO add your handling code here:
        Data data = new Data(this, true);
        String cadena;
        BufferedReader br;
        BufferedReader br2;
        try {
            br = new BufferedReader(new FileReader(txtResultsChooser.getText()));
            br2 = new BufferedReader(new FileReader(txtLevelChooser.getText()));
            ArrayList<Results> rArrayList = new ArrayList<>();
            ArrayList<Levels> lArrayList = new ArrayList<>();
            br.readLine();
            while ((cadena = br.readLine()) != null) {
                String[] spliter = cadena.split(",");
                rArrayList.add(new Results(Integer.parseInt(spliter[0]),Integer.parseInt(spliter[1]),Integer.parseInt(spliter[2]),Integer.parseInt(spliter[3]),Integer.parseInt(spliter[4]),Integer.parseInt(spliter[5]),Integer.parseInt(spliter[6]),Integer.parseInt(spliter[7]),Integer.parseInt(spliter[8]),Integer.parseInt(spliter[9]),Integer.parseInt(spliter[10])));
                //break;
            }
            br.close();
            br2.readLine();
            while ((cadena = br2.readLine()) != null) {
                String[] spliter = cadena.split(",");
                lArrayList.add(new Levels(Integer.parseInt(spliter[0]),Integer.parseInt(spliter[1]),Integer.parseInt(spliter[2]),Integer.parseInt(spliter[3]),Integer.parseInt(spliter[4]),Integer.parseInt(spliter[5]),Integer.parseInt(spliter[6]),Integer.parseInt(spliter[7]),Integer.parseInt(spliter[8]),Integer.parseInt(spliter[9])));
                //break;
            }
            br2.close();
            data.inventory();
            System.out.println(lArrayList.get(1).getIdEina1());
            System.out.println(lArrayList.get(1).getIdEina2());
            System.out.println(lArrayList.get(1).getIdEina3());
            System.out.println(lArrayList.get(1).getIdEina4());
            System.out.println(lArrayList.get(1).getIdEina5());
            System.out.println(lArrayList.get(1).getIdEina6());
            System.out.println(lArrayList.get(1).getIdEina7());
            System.out.println(lArrayList.get(1).getIdEina8());
            
            for(Results r : rArrayList){
                if(r.getIdNivell() == 1){
                    if(r.getIdentificaeina1() == 1){
                        r.setIdentificaeina1(lArrayList.get(0).getIdEina1());    
                    }if(r.getIdentificaeina2() == 1){
                        r.setIdentificaeina2(lArrayList.get(0).getIdEina2()); 
                    }
                    if(r.getIdentificaeina3() == 1){
                        r.setIdentificaeina3(lArrayList.get(0).getIdEina3()); 
                    }
                    if(r.getIdentificaeina4() == 1){
                        r.setIdentificaeina4(lArrayList.get(0).getIdEina4()); 
                    }
                    if(r.getIdentificaeina5() == 1){
                        r.setIdentificaeina5(lArrayList.get(0).getIdEina5()); 
                    }
                    if(r.getIdentificaeina6() == 1){
                        r.setIdentificaeina6(lArrayList.get(0).getIdEina6()); 
                    }
                    if(r.getIdentificaeina7() == 1){
                        r.setIdentificaeina7(lArrayList.get(0).getIdEina7()); 
                    }
                    if(r.getIdentificaeina8() == 1){
                        r.setIdentificaeina8(lArrayList.get(0).getIdEina8()); 
                    }
                }else if(r.getIdNivell() == 2) {
                      if(r.getIdentificaeina1() == 1){
                        r.setIdentificaeina1(lArrayList.get(1).getIdEina1());    
                    }if(r.getIdentificaeina2() == 1){
                        r.setIdentificaeina2(lArrayList.get(1).getIdEina2()); 
                    }
                    if(r.getIdentificaeina3() == 1){
                        r.setIdentificaeina3(lArrayList.get(1).getIdEina3()); 
                    }
                    if(r.getIdentificaeina4() == 1){
                        r.setIdentificaeina4(lArrayList.get(1).getIdEina4()); 
                    }
                    if(r.getIdentificaeina5() == 1){
                        r.setIdentificaeina5(lArrayList.get(1).getIdEina5()); 
                    }
                    if(r.getIdentificaeina6() == 1){
                        r.setIdentificaeina6(lArrayList.get(1).getIdEina6()); 
                    }
                    if(r.getIdentificaeina7() == 1){
                        r.setIdentificaeina7(lArrayList.get(1).getIdEina7()); 
                    }
                    if(r.getIdentificaeina8() == 1){
                        r.setIdentificaeina8(lArrayList.get(1).getIdEina8()); 
                    }
                }
                data.datainventory(r.getIdUsuari(), r.getIdentificaeina1(), r.getIdentificaeina2(),r.getIdentificaeina3(),r.getIdentificaeina4(),r.getIdentificaeina5(),r.getIdentificaeina6(),r.getIdentificaeina7(),r.getIdentificaeina8());
            }
            data.setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCreateDataActionPerformed

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
            java.util.logging.Logger.getLogger(DataInventoryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataInventoryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataInventoryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataInventoryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DataInventoryDialog dialog = new DataInventoryDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateData;
    private javax.swing.JButton btnSelectResult;
    private javax.swing.JButton btnSelectltLevel;
    private javax.swing.JLabel lblFile;
    private javax.swing.JLabel lblFile1;
    private javax.swing.JTextField txtLevelChooser;
    private javax.swing.JTextField txtResultsChooser;
    // End of variables declaration//GEN-END:variables
}
