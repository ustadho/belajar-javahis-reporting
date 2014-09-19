/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javahis.reporting;

import com.javahis.reporting.service.ReportingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author faheem
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:com/javahis/**/applicationContext.xml")
public class TestKoneksi { 
    @Autowired
    ReportingService service;
    
    @Test
    public void test(){
        System.out.println("Hello"+ service.testData());
    }
}
