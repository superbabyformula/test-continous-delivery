/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ajw.calculator.calculator;

import com.ajw.calculator.calculator.service.CalculatorService;
import com.ajw.calculator.calculator.service.impl.CalculatorServiceImpl;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author andy
 */
public class CalculatorApplicationTest {
    
    @Test
    public void testCalculatorApplication() {
        CalculatorApplication app = new CalculatorApplication();
        Assert.assertEquals("", "");
    }
    
    @Test
    public void testSum() {
        CalculatorService calculatorService = new CalculatorServiceImpl();
        Assert.assertEquals(calculatorService.sum(1, 1), 2);
    }
}
