package com.lyd.controller;

import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringAjaxJquery {
	
	
	/*
	 * 
	 * http://crunchify.com/how-to-use-ajax-jquery-in-spring-web-mvc-jsp-example/
	 */

	@RequestMapping("/ajax")
    public ModelAndView helloAjaxTest() {
        return new ModelAndView("ajax", "message", "lyd Spring MVC with Ajax and JQuery Demo..");
    }
 
    @RequestMapping(value = "/ajaxtest", method = RequestMethod.GET)
    public @ResponseBody
    String getTime() {
 
        Random rand = new Random();
        float r = rand.nextFloat() * 100;
        String result = "<br>Next Random # is <b>" + r + "</b>. Generated on <b>" + new Date().toString() + "</b>";
        System.out.println("Debug Message from SpringAjaxJquery Controller.." + new Date().toString());
        return result;
    }
}
