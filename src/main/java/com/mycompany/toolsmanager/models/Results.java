/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.toolsmanager.models;

/**
 *
 * @author Diego Ramirez
 */
public class Results {

    public int getIdIntent() {
        return idIntent;
    }

    public void setIdIntent(int idIntent) {
        this.idIntent = idIntent;
    }

    public int getIdUsuari() {
        return idUsuari;
    }

    public void setIdUsuari(int idUsuari) {
        this.idUsuari = idUsuari;
    }

    public int getIdNivell() {
        return idNivell;
    }

    public void setIdNivell(int idNivell) {
        this.idNivell = idNivell;
    }

    public int getIdentificaeina1() {
        return identificaeina1;
    }

    public void setIdentificaeina1(int identificaeina1) {
        this.identificaeina1 = identificaeina1;
    }

    public int getIdentificaeina2() {
        return identificaeina2;
    }

    public void setIdentificaeina2(int identificaeina2) {
        this.identificaeina2 = identificaeina2;
    }

    public int getIdentificaeina3() {
        return identificaeina3;
    }

    public void setIdentificaeina3(int identificaeina3) {
        this.identificaeina3 = identificaeina3;
    }

    public int getIdentificaeina4() {
        return identificaeina4;
    }

    public void setIdentificaeina4(int identificaeina4) {
        this.identificaeina4 = identificaeina4;
    }

    public int getIdentificaeina5() {
        return identificaeina5;
    }

    public void setIdentificaeina5(int identificaeina5) {
        this.identificaeina5 = identificaeina5;
    }

    public int getIdentificaeina6() {
        return identificaeina6;
    }

    public void setIdentificaeina6(int identificaeina6) {
        this.identificaeina6 = identificaeina6;
    }

    public int getIdentificaeina7() {
        return identificaeina7;
    }

    public void setIdentificaeina7(int identificaeina7) {
        this.identificaeina7 = identificaeina7;
    }

    public int getIdentificaeina8() {
        return identificaeina8;
    }

    public void setIdentificaeina8(int identificaeina8) {
        this.identificaeina8 = identificaeina8;
    }

    public Results(int idIntent, int idUsuari, int idNivell, int identificaeina1, int identificaeina2, int identificaeina3, int identificaeina4, int identificaeina5, int identificaeina6, int identificaeina7, int identificaeina8) {
        this.idIntent = idIntent;
        this.idUsuari = idUsuari;
        this.idNivell = idNivell;
        this.identificaeina1 = identificaeina1;
        this.identificaeina2 = identificaeina2;
        this.identificaeina3 = identificaeina3;
        this.identificaeina4 = identificaeina4;
        this.identificaeina5 = identificaeina5;
        this.identificaeina6 = identificaeina6;
        this.identificaeina7 = identificaeina7;
        this.identificaeina8 = identificaeina8;
    }

    @Override
    public String toString() {
        return idIntent + "," + idUsuari + "," + idNivell + "," + identificaeina1 + "," + identificaeina2 + "," + identificaeina3 + "," + identificaeina4 + "," + identificaeina5 + "," + identificaeina6 + "," + identificaeina7 + "," + identificaeina8;
    }
    
    int idIntent;
    int idUsuari;
    int idNivell;
    int identificaeina1;
    int identificaeina2;
    int identificaeina3;
    int identificaeina4;
    int identificaeina5;
    int identificaeina6;
    int identificaeina7;
    int identificaeina8;
    
    
    
    
}
