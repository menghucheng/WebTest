package com.testweb.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by MENGHUCHENG012 on 2016/4/7.
 */
@Controller
public class testWebController {

    /*日志对象*/
    private static final Logger logger = Logger.getLogger(testWebController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        logger.info("I'm visiting!");
        return "index";
    }
}
