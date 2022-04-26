/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.toolsmanager.dataAccess;

import static com.mycompany.toolsmanager.constants.Constants.USERSPATH;
import com.mycompany.toolsmanager.models.Attempt;
import com.mycompany.toolsmanager.models.Levels;
import com.mycompany.toolsmanager.models.Results;
import com.mycompany.toolsmanager.models.User;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTextField;

/**
 *
 * @author Diego Ramirez
 */
public class DataAccess {
    
    public static void accessUserLogin(ArrayList<User> arr) throws IOException{
        String cadena;
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(USERSPATH));
            br.readLine();
            while ((cadena = br.readLine()) != null) {
                String[] spliter = cadena.split(",");
                arr.add(new User(Integer.parseInt(spliter[0]), spliter[1], spliter[2],spliter[3],spliter[4],spliter[5],spliter[6],spliter[7]));
                //break;
            }
            br.close();
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    public static void accessUser(ArrayList<User> arr, JTextField txt) throws IOException{
        String cadena;
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(txt.getText()));
            br.readLine();
            while ((cadena = br.readLine()) != null) {
                String[] spliter = cadena.split(",");
                arr.add(new User(Integer.parseInt(spliter[0])));
                //break;
            }
            br.close();
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    public static void accessLevel(ArrayList<Levels> arr, JTextField txt) throws IOException{
        String cadena;
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(txt.getText()));
            br.readLine();
            while ((cadena = br.readLine()) != null) {
                String[] spliter = cadena.split(",");
                arr.add(new Levels(Integer.parseInt(spliter[0])));
                //break;
            }
            br.close();
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public static void accessLevelAll(ArrayList<Levels> arr, JTextField txt) throws IOException{
        String cadena;
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(txt.getText()));
            br.readLine();
            while ((cadena = br.readLine()) != null) {
                String[] spliter = cadena.split(",");
                arr.add(new Levels(Integer.parseInt(spliter[0]),Integer.parseInt(spliter[1]),Integer.parseInt(spliter[2]),Integer.parseInt(spliter[3]),Integer.parseInt(spliter[4]),Integer.parseInt(spliter[5]),Integer.parseInt(spliter[6]),Integer.parseInt(spliter[7]),Integer.parseInt(spliter[8]),Integer.parseInt(spliter[9])));
                //break;
            }
            br.close();
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    public static void accessAttempt(ArrayList<Attempt> arr, JTextField txt) throws IOException{
        String cadena;
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(txt.getText()));
            br.readLine();
            while ((cadena = br.readLine()) != null) {
                String[] spliter = cadena.split(",");
                arr.add(new Attempt(Integer.parseInt(spliter[0]),Integer.parseInt(spliter[1]),Integer.parseInt(spliter[2])));
                //break;
            }
            br.close();
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
}
       
    public static void accessResults(ArrayList<Results> arr, JTextField txt) throws IOException{
        String cadena;
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(txt.getText()));
            br.readLine();
            while ((cadena = br.readLine()) != null) {
                String[] spliter = cadena.split(",");
                arr.add(new Results(Integer.parseInt(spliter[0]),Integer.parseInt(spliter[1]),Integer.parseInt(spliter[2]),Integer.parseInt(spliter[3]),Integer.parseInt(spliter[4]),Integer.parseInt(spliter[5]),Integer.parseInt(spliter[6]),Integer.parseInt(spliter[7]),Integer.parseInt(spliter[8]),Integer.parseInt(spliter[9]),Integer.parseInt(spliter[10])));
                //break;
            }
            br.close();
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
}
