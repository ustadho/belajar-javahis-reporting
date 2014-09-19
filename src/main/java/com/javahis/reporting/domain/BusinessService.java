/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javahis.reporting.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author faheem
 */
public class BusinessService {

    public List<Anggota> semuaAnggota() {
        List<Anggota> hasil = new ArrayList<Anggota>();

        Anggota a = new Anggota();
        a.setNama("Endy Muhardin");
        a.setEmail("endy.muhardin@gmail.com");
        a.setHandphone("081234567890");
        a.setTanggalLahir(new Date());
        hasil.add(a);

        Anggota a1 = new Anggota();
        a1.setNama("Lukman Hakim");
        a1.setEmail("lukman@gmail.com");
        a1.setHandphone("085678909876");
        a1.setTanggalLahir(new Date());
        hasil.add(a1);

        return hasil;
    }
}
