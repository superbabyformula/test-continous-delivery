/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ajw.calculator.calculator.service.impl;

import com.ajw.calculator.calculator.service.CalculatorService;
import org.springframework.stereotype.Service;

/**
 *
 * @author andy
 */
@Service("calculatorService")
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int sum(int x, int y) {
        return x+y;
    }
}
