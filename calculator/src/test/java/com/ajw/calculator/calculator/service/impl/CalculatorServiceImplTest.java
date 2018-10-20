/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ajw.calculator.calculator.service.impl;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author andy
 */
public class CalculatorServiceImplTest {
    
    private CalculatorServiceImpl calculatorService;
    
    @Before
    public void setUp() {
        this.calculatorService = new CalculatorServiceImpl();
    }
    
    @Test
    public void testSum() {
        Assert.assertEquals(calculatorService.sum(1, 1), 2);
    }
}
