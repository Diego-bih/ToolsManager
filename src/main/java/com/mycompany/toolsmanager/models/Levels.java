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
public class Levels {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEina1() {
        return idEina1;
    }

    public void setIdEina1(int idEina1) {
        this.idEina1 = idEina1;
    }

    public int getIdEina2() {
        return idEina2;
    }

    public void setIdEina2(int idEina2) {
        this.idEina2 = idEina2;
    }

    public int getIdEina3() {
        return idEina3;
    }

    public void setIdEina3(int idEina3) {
        this.idEina3 = idEina3;
    }

    public int getIdEina4() {
        return idEina4;
    }

    public void setIdEina4(int idEina4) {
        this.idEina4 = idEina4;
    }

    public int getIdEina5() {
        return idEina5;
    }

    public void setIdEina5(int idEina5) {
        this.idEina5 = idEina5;
    }

    public int getIdEina6() {
        return idEina6;
    }

    public void setIdEina6(int idEina6) {
        this.idEina6 = idEina6;
    }

    public int getIdEina7() {
        return idEina7;
    }

    public void setIdEina7(int idEina7) {
        this.idEina7 = idEina7;
    }

    public int getIdEina8() {
        return idEina8;
    }

    public void setIdEina8(int idEina8) {
        this.idEina8 = idEina8;
    }

    public int getTempsLimit() {
        return tempsLimit;
    }

    public void setTempsLimit(int tempsLimit) {
        this.tempsLimit = tempsLimit;
    }

    public Levels(int id, int idEina1, int idEina2, int idEina3, int idEina4, int idEina5, int idEina6, int idEina7, int idEina8, int tempsLimit) {
        this.id = id;
        this.idEina1 = idEina1;
        this.idEina2 = idEina2;
        this.idEina3 = idEina3;
        this.idEina4 = idEina4;
        this.idEina5 = idEina5;
        this.idEina6 = idEina6;
        this.idEina7 = idEina7;
        this.idEina8 = idEina8;
        this.tempsLimit = tempsLimit;
    }
    public Levels(int id){
    this.id = id;
    };

    @Override
    public String toString() {
        return id + "," + idEina1 + "," + idEina2 + "," + idEina3 + "," + idEina4 + "," + idEina5 + "," + idEina6 + "," + idEina7 + "," + idEina8 + "," + tempsLimit;
    }
    int id;
    int idEina1;
    int idEina2;
    int idEina3;
    int idEina4;
    int idEina5;
    int idEina6;
    int idEina7;
    int idEina8;
    int tempsLimit;
    
}
