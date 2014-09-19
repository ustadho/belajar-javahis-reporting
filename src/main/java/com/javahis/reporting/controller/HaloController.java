/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javahis.reporting.controller;

import com.javahis.reporting.domain.BusinessService;
import com.javahis.reporting.service.ReportingService;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author faheem
 */
@Controller
public class HaloController {
    @Autowired
    ReportingService reportingService;
    
    private BusinessService service = new BusinessService();
    
    @RequestMapping(value = "/halo", method = RequestMethod.GET)
    public ModelMap halo(){
        ModelMap mm=new ModelMap();
        mm.addAttribute("nama", "Ustadho");
        return mm;
    }
    
    @RequestMapping(value = "/test-data", method = RequestMethod.GET)
    @ResponseBody
    public Object testData(){
        return reportingService.testData();
    }
    
    @RequestMapping(value = "/test-print/export*", method = RequestMethod.GET)
    public ModelMap exportDataAnggota(HttpServletRequest request) {
        String uri = request.getRequestURI();
        String format = uri.substring(uri.lastIndexOf(".") + 1);

        return new ModelMap()
                .addAttribute("format", format)
                .addAttribute("tanggal", new Date())
                .addAttribute("dataSource", service.semuaAnggota());
     }
}
