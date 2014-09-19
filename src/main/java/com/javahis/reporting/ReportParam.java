/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javahis.reporting;

import java.util.Date;

/**
 *
 * @author faheem
 */
public class ReportParam {
    private Date tanggal1;
    private Date tanggal2;
    private String unit;


    public Date getTanggal1() {
        return tanggal1;
    }

    public void setTanggal1(Date tanggal1) {
        this.tanggal1 = tanggal1;
    }

    public Date getTanggal2() {
        return tanggal2;
    }

    public void setTanggal2(Date tanggal2) {
        this.tanggal2 = tanggal2;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    
}
