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
public class UEina {

    public int getIdUsuari() {
        return idUsuari;
    }

    public void setIdUsuari(int idUsuari) {
        this.idUsuari = idUsuari;
    }

    public int getEina() {
        return eina;
    }

    public void setEina(int eina) {
        this.eina = eina;
    }

    public UEina(int idUsuari, int eina) {
        this.idUsuari = idUsuari;
        this.eina = eina;
    }
    
    public UEina() {

    }

    @Override
    public String toString() {
        return idUsuari + "," + eina;
    }
    int idUsuari;
    int eina;
    
    
    
}
