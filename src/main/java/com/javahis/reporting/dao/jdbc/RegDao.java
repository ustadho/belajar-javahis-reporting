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
    
    public Object kunjunganUnit(String tanggal1, String tanggal2, String unit){
        return mr.mapList("select reg.tgl_masuk, reg.no_reg, reg.norm, "
                + "coalesce(ps.nama||coalesce(', '||ps.title,''),'') as pasien, "
                + "coalesce(dok.nama,'') as dokter "
                + "from rm_reg_pasien reg "
                + "inner join rm_pasien ps on ps.norm=reg.norm "
                + "left join rm_reg_dokter_merawat rw on rw.no_reg=reg.no_reg "
                + "left join vw_dokter_gabung dok on dok.kode_dokter=rw.kodedokter "
                + "where to_char(reg.tgl_masuk, 'yyyy-MM-dd')>='"+tanggal1+"' "
                + "and to_char(reg.tgl_masuk, 'yyyy-MM-dd')<='"+tanggal2+"' "
                + "and reg.status_batal_pasien "
                + "order by coalesce(dok.nama,''), reg.no_reg, reg.tgl_masuk");
    }
}
