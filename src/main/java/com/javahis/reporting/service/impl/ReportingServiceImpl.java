/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javahis.reporting.service.impl;

import com.javahis.reporting.dao.jdbc.RegDao;
import com.javahis.reporting.service.ReportingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author faheem
 */
@Service
public class ReportingServiceImpl implements ReportingService{
    @Autowired
    RegDao regDao;
    
    public Object testData() {
        return regDao.testData();
    }
    
}
