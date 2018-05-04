/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beginningspring.helloworldmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author javaBrat
 */
@Controller
public class HelloReaderController {

    @RequestMapping(value = "/hello")
    public ModelAndView sayHello() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello Reader!");
        mv.setViewName("helloReader");
        return mv;
    }
}
