/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.toolsmanager.mainapp;

import com.mycompany.toolsmanager.dataAccess.DataAccess;
import com.mycompany.toolsmanager.models.Attempt;
import com.mycompany.toolsmanager.models.User;
import com.mycompany.toolsmanager.models.Levels;
import com.mycompany.toolsmanager.showdata.Data;
import com.mycompany.toolsmanager.startapp.Login;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Diego Ramirez
 */
public class RandomAttemptsDialog extends javax.swing.JDialog {
    DataAccess da = new DataAccess();
    /**
     * Creates new form RandomAttemptsDialog
     */
    public RandomAttemptsDialog(java.awt.Frame parent, boolean modal) {
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

        btnSelectUser = new javax.swing.JButton();
        txtRegister = new javax.swing.JTextField();
        lblFile = new javax.swing.JLabel();
        lblRegisterNum = new javax.swing.JLabel();
        lblDates = new javax.swing.JLabel();
        btnCreateData = new javax.swing.JButton();
        txtDateIni = new javax.swing.JTextField();
        lblSession = new javax.swing.JLabel();
        txtDateFinal = new javax.swing.JTextField();
        lblMin = new javax.swing.JLabel();
        lblInitial = new javax.swing.JLabel();
        lblMax = new javax.swing.JLabel();
        lblFinal = new javax.swing.JLabel();
        jspMin = new javax.swing.JSpinner();
        jspMax = new javax.swing.JSpinner();
        lblTitle = new javax.swing.JLabel();
        txtUserChooser = new javax.swing.JTextField();
        txtLevelChooser = new javax.swing.JTextField();
        btnSelectLevel = new javax.swing.JButton();
        lblFile1 = new javax.swing.JLabel();
        lblResultsData = new javax.swing.JLabel();
        txtAttemptsChooser = new javax.swing.JTextField();
        btnCreateResultsData = new javax.swing.JButton();
        btnSelectAttempts = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSelectUser.setText("Select Usuaris");
        btnSelectUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectUserActionPerformed(evt);
            }
        });

        lblFile.setText("Selecciona el fichero de usuarios");

        lblRegisterNum.setText("Numero de registros");

        lblDates.setText("Elige una fecha de inicio y de fina l(yyyy-MM-dd HH:mm:ss)");

        btnCreateData.setText("Create data");
        btnCreateData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDataActionPerformed(evt);
            }
        });

        txtDateIni.setText("2021-05-21 12:00:00");

        lblSession.setText("Tiempo de sesión");

        txtDateFinal.setText("2021-05-21 20:00:00");

        lblMin.setText("Min");

        lblInitial.setText("Inicio");

        lblMax.setText("Max");

        lblFinal.setText("Final");

        lblTitle.setText("ToolsManager");

        btnSelectLevel.setText("Select Level");
        btnSelectLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectLevelActionPerformed(evt);
            }
        });

        lblFile1.setText("Selecciona el fichero de los niveles");

        lblResultsData.setText("Seleccione el fichero de los intentos una vez creado");

        btnCreateResultsData.setText("Create results data");
        btnCreateResultsData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateResultsDataActionPerformed(evt);
            }
        });

        btnSelectAttempts.setText("Select Attempts");
        btnSelectAttempts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectAttemptsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreateResultsData)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblFile)
                    .addComponent(lblDates)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSession)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDateIni, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblInitial)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblMin)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jspMin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRegisterNum)
                                .addGap(18, 18, 18)
                                .addComponent(txtRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFinal)
                                    .addComponent(txtDateFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblMax)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jspMax, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btnCreateData))))
                    .addComponent(lblFile1)
                    .addComponent(lblResultsData)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(txtUserChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSelectUser))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLevelChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnSelectLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAttemptsChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(btnSelectAttempts)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectUser))
                .addGap(12, 12, 12)
                .addComponent(lblFile1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLevelChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectLevel))
                .addGap(18, 18, 18)
                .addComponent(lblDates)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFinal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDateFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMax)
                            .addComponent(jspMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInitial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDateIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSession)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMin)
                            .addComponent(jspMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateData)
                    .addComponent(txtRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRegisterNum))
                .addGap(26, 26, 26)
                .addComponent(lblResultsData)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAttemptsChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectAttempts))
                .addGap(18, 18, 18)
                .addComponent(btnCreateResultsData)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectUserActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("CSV Files", "csv");
        fileChooser.setFileFilter(fileFilter);
        int returnOption = fileChooser.showOpenDialog(this);
        if (returnOption == JFileChooser.APPROVE_OPTION)
        txtUserChooser.setText(fileChooser.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_btnSelectUserActionPerformed

    private void btnCreateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDataActionPerformed
        // TODO add your handling code here:
        Data data = new Data(this, true);
        ArrayList<User> uArrayList = new ArrayList<>();
        ArrayList<Levels> lArrayList = new ArrayList<>();
        try {
            da.accessUser(uArrayList,txtUserChooser);
            da.accessLevel(lArrayList,txtLevelChooser);
            data.randomattempts();
            for(int i = 0; i <= Integer.parseInt(txtRegister.getText()) - 1;i++){
                Random r = new Random();
                int linea = r.nextInt(uArrayList.size());
                User usuariAleatori = uArrayList.get(linea);
                int idaleatori = usuariAleatori.getId();
                //Numero aleatorio de intento
                int id = r.nextInt(10) + 1;
                
                int linea2 = r.nextInt(lArrayList.size());
                Levels levelAleatori = lArrayList.get(linea2);
                int idaleatori2 = levelAleatori.getId();
                
                
                long offset = Timestamp.valueOf(txtDateIni.getText()).getTime();
                long end = Timestamp.valueOf(txtDateFinal.getText()).getTime();
                long diff = end - offset + 1;
                Timestamp rand = new Timestamp(offset + (long)(Math.random() * diff));
                int min = (int) jspMin.getValue();
                int max = (int) jspMax.getValue();
                int rndInt = r.nextInt(max - min) + min;
                long plus = TimeUnit.MINUTES.toMillis(rndInt);
                Timestamp rand2 = new Timestamp(rand.getTime() + plus);
                data.datattempts(id,idaleatori,idaleatori2,rand,rand2);
            }
            data.setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCreateDataActionPerformed

    private void btnSelectLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectLevelActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("CSV Files", "csv");
        fileChooser.setFileFilter(fileFilter);
        int returnOption = fileChooser.showOpenDialog(this);
        if (returnOption == JFileChooser.APPROVE_OPTION)
        txtLevelChooser.setText(fileChooser.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_btnSelectLevelActionPerformed

    private void btnCreateResultsDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateResultsDataActionPerformed
        // TODO add your handling code here:
        Data data = new Data(this, true);
        ArrayList<Attempt> aArrayList = new ArrayList<>();
        try {
            da.accessAttempt(aArrayList,txtAttemptsChooser);
            data.randomresults();
            for(Attempt u : aArrayList){
                Random r = new Random();
                int eina1 = r.nextInt(2);
                int eina2 = r.nextInt(2);
                int eina3 = r.nextInt(2);
                int eina4 = r.nextInt(2);
                int eina5 = r.nextInt(2);   
                int eina6 = r.nextInt(2);   
                int eina7 = r.nextInt(2);   
                int eina8 = r.nextInt(2);   
                
                data.dataresults(u.getIdIntent(),u.getIdUsuari(),u.getIdNivell(),eina1,eina2,eina3,eina4,eina5,eina6,eina7,eina8);
            }
            data.setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCreateResultsDataActionPerformed

    private void btnSelectAttemptsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectAttemptsActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("CSV Files", "csv");
        fileChooser.setFileFilter(fileFilter);
        int returnOption = fileChooser.showOpenDialog(this);
        if (returnOption == JFileChooser.APPROVE_OPTION)
        txtAttemptsChooser.setText(fileChooser.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_btnSelectAttemptsActionPerformed

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
            java.util.logging.Logger.getLogger(RandomAttemptsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RandomAttemptsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RandomAttemptsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RandomAttemptsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RandomAttemptsDialog dialog = new RandomAttemptsDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCreateResultsData;
    private javax.swing.JButton btnSelectAttempts;
    private javax.swing.JButton btnSelectLevel;
    private javax.swing.JButton btnSelectUser;
    private javax.swing.JSpinner jspMax;
    private javax.swing.JSpinner jspMin;
    private javax.swing.JLabel lblDates;
    private javax.swing.JLabel lblFile;
    private javax.swing.JLabel lblFile1;
    private javax.swing.JLabel lblFinal;
    private javax.swing.JLabel lblInitial;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblRegisterNum;
    private javax.swing.JLabel lblResultsData;
    private javax.swing.JLabel lblSession;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAttemptsChooser;
    private javax.swing.JTextField txtDateFinal;
    private javax.swing.JTextField txtDateIni;
    private javax.swing.JTextField txtLevelChooser;
    private javax.swing.JTextField txtRegister;
    private javax.swing.JTextField txtUserChooser;
    // End of variables declaration//GEN-END:variables
}
