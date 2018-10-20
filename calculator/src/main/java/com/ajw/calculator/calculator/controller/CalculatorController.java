/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ajw.calculator.calculator.controller;

import com.ajw.calculator.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author andy
 */
@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    
    @Autowired
    private CalculatorService calculatorService;

    public void setCalculatorService(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    
    @RequestMapping(value = "/sum", method = RequestMethod.GET)
    public @ResponseBody String sum(@RequestParam("a") int a, @RequestParam("b") int b) {
        return String.valueOf(calculatorService.sum(a, b));
    }
    
//    @RequestMapping(value = "/ping", method = RequestMethod.GET)
//    public @ResponseBody String ping() {
//        return "pong";
//    }
}
