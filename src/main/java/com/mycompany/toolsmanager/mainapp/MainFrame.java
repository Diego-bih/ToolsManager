/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.toolsmanager.mainapp;

import static com.mycompany.toolsmanager.constants.Constants.NOIMAGE;
import com.mycompany.toolsmanager.models.User;
import com.mycompany.toolsmanager.startapp.Login;
import com.mycompany.toolsmanager.showdata.Data;
import com.mycompany.toolsmanager.utils.Utils;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Diego Ramirez
 */
public class MainFrame extends javax.swing.JFrame {
    public static boolean logged = false;
    public static String username;
    public static String photo;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() throws IOException {
        initComponents();
        File file = new File(NOIMAGE);
        if(!file.exists()) file.createNewFile();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        lblTitle = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblUserImage = new javax.swing.JLabel();
        mnuBar = new javax.swing.JMenuBar();
        mniRandomData = new javax.swing.JMenu();
        mniRandomUsage = new javax.swing.JMenuItem();
        mniRandomAttempts = new javax.swing.JMenuItem();
        mniDataInventory = new javax.swing.JMenuItem();
        mnuFile = new javax.swing.JMenu();
        mnuHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("ToolsManager");

        mniRandomData.setText("File");

        mniRandomUsage.setText("Random Usage");
        mniRandomUsage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRandomUsageActionPerformed(evt);
            }
        });
        mniRandomData.add(mniRandomUsage);

        mniRandomAttempts.setText("Random Attempts");
        mniRandomAttempts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRandomAttemptsActionPerformed(evt);
            }
        });
        mniRandomData.add(mniRandomAttempts);

        mniDataInventory.setText("Inventory Data");
        mniDataInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDataInventoryActionPerformed(evt);
            }
        });
        mniRandomData.add(mniDataInventory);

        mnuBar.add(mniRandomData);

        mnuFile.setText("Edit");
        mnuBar.add(mnuFile);

        mnuHelp.setText("Help");
        mnuBar.add(mnuHelp);

        setJMenuBar(mnuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUserImage, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblTitle)
                .addGap(44, 44, 44)
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblUserImage, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Login login = new Login(this, true);
        login.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        login.setVisible(true);
        showUserInfo();
    }//GEN-LAST:event_formWindowOpened

    private void mniRandomUsageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRandomUsageActionPerformed
        // TODO add your handling code here:
        RandomUsageDialog rud = new RandomUsageDialog(this, true);
        rud.setVisible(true);
    }//GEN-LAST:event_mniRandomUsageActionPerformed

    private void mniRandomAttemptsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRandomAttemptsActionPerformed
        // TODO add your handling code here:
        RandomAttemptsDialog rad = new RandomAttemptsDialog(this, true);
        rad.setVisible(true);
    }//GEN-LAST:event_mniRandomAttemptsActionPerformed

    private void mniDataInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDataInventoryActionPerformed
        // TODO add your handling code here:
        DataInventoryDialog did = new DataInventoryDialog(this,true);
        did.setVisible(true);
    }//GEN-LAST:event_mniDataInventoryActionPerformed

    public void showUserInfo(){
        if(logged = true){
            lblUserName.setText(username);
            BufferedImage originalImage = null;
            try {
                originalImage = ImageIO.read(new File(photo));
                ImageIcon icon = Utils.resizeImageIcon(originalImage, lblUserImage.getWidth(), lblUserImage.getHeight());
                lblUserImage.setIcon(icon);
            } catch (IOException ioe) {
                System.out.println("Imagen no valida");
            }catch(NullPointerException e) {
             System.out.println("NullPointerException thrown!");
            }
        }
        
    }
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserImage;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JMenuItem mniDataInventory;
    private javax.swing.JMenuItem mniRandomAttempts;
    private javax.swing.JMenu mniRandomData;
    private javax.swing.JMenuItem mniRandomUsage;
    private javax.swing.JMenuBar mnuBar;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuHelp;
    // End of variables declaration//GEN-END:variables
}
