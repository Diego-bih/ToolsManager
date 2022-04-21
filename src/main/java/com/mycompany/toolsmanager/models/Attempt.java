/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.toolsmanager.models;

import java.sql.Timestamp;

/**
 *
 * @author Diego Ramirez
 */
public class Attempt {

    public Attempt(int idIntent,int idUsuari, int idNivell) {
        this.idIntent = idIntent;
        this.idUsuari = idUsuari;
        this.idNivell = idNivell;
    }

    public Attempt(int idIntent, int idUsuari, int idNivell, Timestamp inicioIntentTimestamp, Timestamp finIntentTimestamp) {
        this.idIntent = idIntent;
        this.idUsuari = idUsuari;
        this.idNivell = idNivell;
        this.inicioIntentTimestamp = inicioIntentTimestamp;
        this.finIntentTimestamp = finIntentTimestamp;
    }

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

    public Timestamp getInicioIntentTimestamp() {
        return inicioIntentTimestamp;
    }

    public void setInicioIntentTimestamp(Timestamp inicioIntentTimestamp) {
        this.inicioIntentTimestamp = inicioIntentTimestamp;
    }

    public Timestamp getFinIntentTimestamp() {
        return finIntentTimestamp;
    }

    public void setFinIntentTimestamp(Timestamp finIntentTimestamp) {
        this.finIntentTimestamp = finIntentTimestamp;
    }

    @Override
    public String toString() {
        return idIntent + "," + idUsuari + "," + idNivell + "," + inicioIntentTimestamp + "," + finIntentTimestamp;
    }
    
    int idIntent;
    int idUsuari;
    int idNivell;
    Timestamp inicioIntentTimestamp;
    Timestamp finIntentTimestamp;
    
}
