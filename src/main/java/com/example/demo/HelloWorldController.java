package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HelloWorldController {

    @RequestMapping(value="/helloWorld", method=RequestMethod.GET)
    public ModelAndView helloWorld()
    {
        // The html file name is helloWorldPage.html.
    	ModelAndView model = new ModelAndView("helloWorldPage");

        return model;
    }
    
    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public String helloWorld1()
    {
        // The html file name is helloWorldPage.html.
    	return "helloWorldPage";
    }
}

