package com.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoanTypes {

    @ResponseBody
    @GetMapping(path = "/LoanTypePing")
    public String ping(){
        return "Ping Successfull";
    }
//
//    @ResponseBody
//    @GetMapping(path = "getLoanTypes")
//    public List<LoanTypes> getLoanTypes(){
//
//    }
}
