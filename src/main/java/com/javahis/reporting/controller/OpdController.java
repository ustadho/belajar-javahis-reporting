/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javahis.reporting.controller;

import com.javahis.reporting.ReportParam;
import com.javahis.reporting.service.ReportingService;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author faheem
 */
@Controller
public class OpdController {
    @Autowired ReportingService reportingService;
    Logger logger=LoggerFactory.getLogger(OpdController.class);
    
    @RequestMapping(value = "/report/opd/reg*",  method = RequestMethod.GET)
    private ModelMap listReg(HttpServletRequest request){
        String uri = request.getRequestURI();
        String format = uri.substring(uri.lastIndexOf(".") + 1);
        logger.warn("query [{}]", request.getQueryString());
        logger.warn("tanggal1 : [{}]", request.getParameter("tanggal1"));
        logger.warn("tanggal2 : [{}]", request.getParameter("tanggal2"));
        String tanggal1=request.getParameter("tanggal1");
        String tanggal2=request.getParameter("tanggal12");
        return new ModelMap()
                .addAttribute("tanggal1", tanggal1)
                .addAttribute("tanggal2", tanggal1)
                .addAttribute("format", format)
                .addAttribute("dataSource", reportingService.regList(tanggal1, 
                    tanggal2, 
                    "002"));
    }
    @RequestMapping(value = "/report/opd/reg/json",  method = RequestMethod.GET)
    @ResponseBody
    private Object listRegJson(@RequestBody ReportParam param, HttpServletRequest request){
        return reportingService.regList(
                    new SimpleDateFormat("yyyy-MM-dd").format(param.getTanggal1()), 
                    new SimpleDateFormat("yyyy-MM-dd").format(param.getTanggal2()), 
                    "002");
    }
}
