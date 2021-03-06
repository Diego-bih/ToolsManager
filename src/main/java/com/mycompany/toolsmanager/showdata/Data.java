/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.toolsmanager.showdata;

import com.mycompany.toolsmanager.models.UEina;
import java.awt.Desktop;
import java.awt.Dialog;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Diego Ramirez
 */
public class Data extends javax.swing.JDialog {
    JFileChooser fileChooser = new JFileChooser();
    public static boolean usage = false;
    public static boolean attempts = false;

    /**
     * Creates new form Data
     */
    public Data(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }
    
    public Data(Dialog owner, boolean modal) {
        super(owner, modal);
        initComponents();
    }
    
    public void randomusage()
    {
        txaData.setText("idUsuari,loginTimestamp,logoutTimestamp" + "\n");
    }
    
    public void randomattempts()
    {
        txaData.setText("idIntent,idUsuari,idNivell,inicioIntentTimestamp,finIntentTimeStamp" + "\n");  
    }
    
    public void randomresults()
    {
        txaData.setText("idIntent,idUsuari,idNivell,identificaEina1,identificaEina2,identificaEina3,identificaEina4,identificaEina5,identificaEina6,identificaEina7,identificaEina8" + "\n");  
    }
    
     public void inventory()
    {
        txaData.setText("idUsuari,idEina" + "\n");  
    }
    
    public void data(int id, Timestamp timeini, Timestamp timefin){   
        txaData.append(String.valueOf(id) + "," + timeini + "," + timefin + "\n");
    }
    
    public void datattempts(int id,int idusuari,int idnivell, Timestamp timeini, Timestamp timefin){   
        txaData.append(String.valueOf(id) + "," + String.valueOf(idusuari) + "," + String.valueOf(idnivell)+ "," + timeini + "," + timefin + "\n");
    }
    
    /*public void datainventory(int id, int ideina1, int ideina2, int ideina3,int ideina4,int ideina5,int ideina6,int ideina7,int ideina8){   
       txaData.append(String.valueOf(id) + "," + String.valueOf(ideina1) + "," + String.valueOf(ideina2) + "," + String.valueOf(ideina3) + "," + String.valueOf(ideina4) + "," + String.valueOf(ideina5) + "," + String.valueOf(ideina6) + "," + String.valueOf(ideina7) + "," + String.valueOf(ideina8) +"\n");
    }*/
   public void datainventory(int id, int ideina){
        txaData.append(String.valueOf(id) + "," + String.valueOf(ideina) +"\n");
    }
     
     public void dataresults(int idIntent,int usuari,int idNivell,int e1, int e2, int e3, int e4, int e5, int e6, int e7, int e8){   
        txaData.append(String.valueOf(idIntent) + "," + String.valueOf(usuari) + "," + String.valueOf(idNivell) + "," + String.valueOf(e1)+ "," + String.valueOf(e2) + "," + String.valueOf(e3) + "," + String.valueOf(e4) + "," + String.valueOf(e5) + "," + String.valueOf(e6) + "," + String.valueOf(e7) + "," + String.valueOf(e8) +  "\n");
    }

    public void dataJson(String mainObj){ 
        txaData.append(mainObj);
     }
    
    public void dataAttemptJson(String mainObj){ 
        txaData.append(mainObj);
     }
     public void dataInventoryJson(String mainObj){ 
        txaData.append(mainObj);
     }
     
     public void dataSQL(int id, Timestamp timeini, Timestamp timefin){
         txaData.append("INSERT INTO dbo.sessions" + "(id_usuari,login,logout)" + " VALUES(" + id + ",'" + timeini  + "','" + timefin + "')" + ";" + "\n" + "\n");
     }
     public void dataAttemptSQL(int idusuari,int idnivell, Timestamp timeini, Timestamp timefin){
         txaData.append("INSERT INTO dbo.Intents" + "(id_usuari,id_nivell,inicioIntent,finIntent)" + " VALUES(" +  idusuari + "," + idnivell + ",'" + timeini + "','" + timefin + "')" + ";" + "\n" + "\n");
     }
      public void dataResultSQL(int idIntent,int e1, int e2, int e3, int e4, int e5, int e6, int e7, int e8){
         txaData.append("INSERT INTO dbo.resultats" + "(id_intent,eina1,eina2,eina3,eina4,eina5,eina6,eina7,eina8)" + " VALUES(" + idIntent + "," + e1 + "," + e2 + "," + e3 + "," + e4  + "," + e5 + "," + e6 + "," + e7 + "," + e8 + ")" + ";" + "\n" + "\n");
     }
      
      public void dataInventorySQL(int id, int ideina){
         txaData.append("INSERT INTO dbo.Inventari" + "(id_usuari,id_eina)" + " VALUES(" + id + "," + ideina + ")" + ";" + "\n" + "\n");
      }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuarisData = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaData = new javax.swing.JTextArea();
        btnSelect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txaData.setColumns(20);
        txaData.setRows(5);
        jScrollPane2.setViewportView(txaData);

        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUsuarisData, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSelect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(btnSave)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuarisData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave)
                    .addComponent(btnSelect))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
            File file = fileChooser.getSelectedFile();
            BufferedWriter bw;
            try{
                bw = new BufferedWriter(new FileWriter(file));
                bw.write(txaData.getText());
                bw.flush();
                System.out.println("Success");
                if(!Desktop.isDesktopSupported())
                {  
                System.out.println("not supported");  
                return;  
                }  
                Desktop desktop = Desktop.getDesktop(); 
                ProcessBuilder pb = null;
                if(file.exists())
                pb= new ProcessBuilder("Notepad.exe", file.toString());
                pb.start();
                } catch (IOException ex) {  
                Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:           
        int returnOption = fileChooser.showSaveDialog(this);
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (returnOption == JFileChooser.APPROVE_OPTION){
            txtUsuarisData.setText(fileChooser.getSelectedFile().getAbsolutePath());
        }     
    }//GEN-LAST:event_btnSelectActionPerformed

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
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Data dialog = new Data(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSelect;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txaData;
    private javax.swing.JTextField txtUsuarisData;
    // End of variables declaration//GEN-END:variables
}
