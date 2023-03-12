package com.tourist.tourist_management.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {

    @RequestMapping(value="/welcome",method= RequestMethod.GET)
    public String welcome() {return "welcome NSBM";}
    @RequestMapping(value="/welcome",method= RequestMethod.POST)
    public String welcome_1()
    {
        return "welcome NSBM from POST";
    }

}
