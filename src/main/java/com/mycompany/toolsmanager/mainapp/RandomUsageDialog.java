/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.toolsmanager.mainapp;

import com.mycompany.toolsmanager.dataAccess.DataAccess;
import com.mycompany.toolsmanager.models.User;
import com.mycompany.toolsmanager.showdata.Data;
import com.mycompany.toolsmanager.startapp.Login;
import com.mycompany.toolsmanager.utils.Utils;
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
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Diego Ramirez
 */
public class RandomUsageDialog extends javax.swing.JDialog {

    DataAccess da = new DataAccess();
    Utils u = new Utils();
    
    /**
     * Creates new form RandomUsageDialog
     */
    public RandomUsageDialog(java.awt.Frame parent, boolean modal) {
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

        txtRegister = new javax.swing.JTextField();
        lblRegisterNum = new javax.swing.JLabel();
        btnCreateData = new javax.swing.JButton();
        lblSession = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        lblMax = new javax.swing.JLabel();
        jspMin = new javax.swing.JSpinner();
        jspMax = new javax.swing.JSpinner();
        lblTitle = new javax.swing.JLabel();
        txtFileChooser = new javax.swing.JTextField();
        btnSelectUser = new javax.swing.JButton();
        lblFile = new javax.swing.JLabel();
        lblDates = new javax.swing.JLabel();
        txtDateIni = new javax.swing.JTextField();
        txtDateFinal = new javax.swing.JTextField();
        lblInitial = new javax.swing.JLabel();
        lblFinal = new javax.swing.JLabel();
        cmbFormat = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblRegisterNum.setText("Numero de registros");

        btnCreateData.setText("Create data");
        btnCreateData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDataActionPerformed(evt);
            }
        });

        lblSession.setText("Tiempo de sesi??n");

        lblMin.setText("Min");

        lblMax.setText("Max");

        lblTitle.setText("ToolsManager");

        btnSelectUser.setText("Select Usuaris");
        btnSelectUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectUserActionPerformed(evt);
            }
        });

        lblFile.setText("Selecciona el fichero de usuarios");

        lblDates.setText("Elige una fecha de inicio y de fina l(yyyy-MM-dd HH:mm:ss)");

        txtDateIni.setText("2021-05-21 12:00:00");

        txtDateFinal.setText("2021-05-21 20:00:00");

        lblInitial.setText("Inicio");

        lblFinal.setText("Final");

        cmbFormat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSV", "JSON", "SQL" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnSelectUser))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblFinal)
                                        .addComponent(txtDateFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMax)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jspMax, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(cmbFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCreateData)))))
                .addContainerGap(51, Short.MAX_VALUE))
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
                    .addComponent(txtFileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectUser))
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
                    .addComponent(lblRegisterNum)
                    .addComponent(cmbFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDataActionPerformed
        // TODO add your handling code here:
        if(cmbFormat.getSelectedItem() == "CSV"){
            createCSV();
        }else if(cmbFormat.getSelectedItem() == "JSON"){
            createJSON();
        }
        else if(cmbFormat.getSelectedItem() == "SQL"){
            createSQL();
        }
    }//GEN-LAST:event_btnCreateDataActionPerformed

    private void btnSelectUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectUserActionPerformed
        // TODO add your handling code here:
        u.fileChooserCSV(txtFileChooser, this);
    }//GEN-LAST:event_btnSelectUserActionPerformed

    public void createJSON(){
        Data data = new Data(this, true);
        JSONObject mainObj = new JSONObject();
        JSONArray ja = new JSONArray();
        try {
            ArrayList<User> uArrayList = new ArrayList<>();
            da.accessUser(uArrayList,txtFileChooser);
            for(int i = 0; i <= Integer.parseInt(txtRegister.getText()) - 1;i++){
                Random r = new Random();
                int linea = r.nextInt(uArrayList.size());
                User usuariAleatori = uArrayList.get(linea);
                int idaleatori = usuariAleatori.getId();
                long offset = Timestamp.valueOf(txtDateIni.getText()).getTime();
                long end = Timestamp.valueOf(txtDateFinal.getText()).getTime();
                long diff = end - offset + 1;
                Timestamp rand = new Timestamp(offset + (long)(Math.random() * diff));
                System.out.println(rand);
                int min = (int) jspMin.getValue();
                int max = (int) jspMax.getValue();
                int rndInt = r.nextInt(max - min) + min;
                long plus = TimeUnit.MINUTES.toMillis(rndInt);
                Timestamp rand2 = new Timestamp(rand.getTime() + plus);
                JSONObject jo = new JSONObject();
                jo.put("IdUsuari",idaleatori);
                jo.put("loginTimestamp",rand);
                jo.put("logoutTimestamp",rand2);
                ja.put(jo);
            }
            mainObj.put("Usuaris", ja);
            data.dataJson(mainObj.toString(4));
            data.setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void createCSV(){
        Data data = new Data(this, true);
        try {
            ArrayList<User> uArrayList = new ArrayList<>();
            da.accessUser(uArrayList,txtFileChooser);
            data.randomusage();
            for(int i = 0; i <= Integer.parseInt(txtRegister.getText()) - 1;i++){
                Random r = new Random();
                int linea = r.nextInt(uArrayList.size());
                User usuariAleatori = uArrayList.get(linea);
                int idaleatori = usuariAleatori.getId();
                long offset = Timestamp.valueOf(txtDateIni.getText()).getTime();
                long end = Timestamp.valueOf(txtDateFinal.getText()).getTime();
                long diff = end - offset + 1;
                Timestamp rand = new Timestamp(offset + (long)(Math.random() * diff));
                System.out.println(rand);
                int min = (int) jspMin.getValue();
                int max = (int) jspMax.getValue();
                int rndInt = r.nextInt(max - min) + min;
                long plus = TimeUnit.MINUTES.toMillis(rndInt);
                Timestamp rand2 = new Timestamp(rand.getTime() + plus);
                data.data(idaleatori,rand,rand2);
            }
            data.setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void createSQL(){
        Data data = new Data(this, true);
        try {
            ArrayList<User> uArrayList = new ArrayList<>();
            da.accessUser(uArrayList,txtFileChooser);
            for(int i = 0; i <= Integer.parseInt(txtRegister.getText()) - 1;i++){
                Random r = new Random();
                int linea = r.nextInt(uArrayList.size());
                User usuariAleatori = uArrayList.get(linea);
                int idaleatori = usuariAleatori.getId();
                long offset = Timestamp.valueOf(txtDateIni.getText()).getTime();
                long end = Timestamp.valueOf(txtDateFinal.getText()).getTime();
                long diff = end - offset + 1;
                Timestamp rand = new Timestamp(offset + (long)(Math.random() * diff));
                System.out.println(rand);
                int min = (int) jspMin.getValue();
                int max = (int) jspMax.getValue();
                int rndInt = r.nextInt(max - min) + min;
                long plus = TimeUnit.MINUTES.toMillis(rndInt);
                Timestamp rand2 = new Timestamp(rand.getTime() + plus);
                data.dataSQL(idaleatori,rand,rand2);
            }
            data.setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(RandomUsageDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RandomUsageDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RandomUsageDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RandomUsageDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RandomUsageDialog dialog = new RandomUsageDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnSelectUser;
    private javax.swing.JComboBox<String> cmbFormat;
    private javax.swing.JSpinner jspMax;
    private javax.swing.JSpinner jspMin;
    private javax.swing.JLabel lblDates;
    private javax.swing.JLabel lblFile;
    private javax.swing.JLabel lblFinal;
    private javax.swing.JLabel lblInitial;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblRegisterNum;
    private javax.swing.JLabel lblSession;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtDateFinal;
    private javax.swing.JTextField txtDateIni;
    private javax.swing.JTextField txtFileChooser;
    private javax.swing.JTextField txtRegister;
    // End of variables declaration//GEN-END:variables
}
