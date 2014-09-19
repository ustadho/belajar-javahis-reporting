/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javahis.reporting.dao.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author faheem
 */
@Repository
public class RegDao {
    @Autowired
    MapResultSet mr;
    
    public Object testData(){
        return mr.mapList("select norm, nama, tgl_lahir, alamat_domisili "
                + "from rm_pasien limit 100");
    }
}
