/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.toolsmanager.utils;

import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Diego Ramirez
 */
public class Utils {
    public static void showHidePassword(javax.swing.JPasswordField pwsField, boolean show) {
        if (show) {
            pwsField.setEchoChar((char) 0);    
        } else {
            pwsField.setEchoChar((char) '*');
        }
    }
    
    public static void errorMessage(String message)
    {
        System.err.println(message);
                JOptionPane.showMessageDialog(null,
                message,
                "Error",
                JOptionPane.ERROR_MESSAGE);
    }
    
    public static void infoMessage(String message)
    {
        System.err.println(message);
                JOptionPane.showMessageDialog(null,
                message,
                "Info",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void warningMessage(String message)
    {
        System.err.println(message);
                JOptionPane.showMessageDialog(null,
                message,
                "Warning",
                JOptionPane.WARNING_MESSAGE);
    }
    
    public static ImageIcon resizeImageIcon (BufferedImage originalImage, int desiredWidth, int desiredHeight) {
        int newHeight = 0;    
        int newWidth = 0;
        float aspectRatio = (float)originalImage.getWidth() / originalImage.getHeight();
        if (originalImage.getWidth() > originalImage.getHeight()) {
            newWidth = desiredWidth;
            newHeight = Math.round( desiredWidth / aspectRatio);                
        }
        else {
            newHeight = desiredHeight;
            newWidth = Math.round(desiredHeight * aspectRatio);
        }
        Image resultingImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        BufferedImage outputImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
        outputImage.getGraphics().drawImage(resultingImage, 0, 0, null);
        ImageIcon imageIcon = new ImageIcon(outputImage);
        return imageIcon;
    }
    
    public File newFile(String file) {
        File targetFile = new File(file);
        return targetFile;
    }
    
    public void fileChooserCSV(JTextField txt, Component c){
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("CSV Files", "csv");
        fileChooser.setFileFilter(fileFilter);
        fileChooser.setSelectedFile(newFile(".csv"));
        int returnOption = fileChooser.showOpenDialog(c);
        if (returnOption == JFileChooser.APPROVE_OPTION)
        txt.setText(fileChooser.getSelectedFile().getAbsolutePath());;      
    }
}
