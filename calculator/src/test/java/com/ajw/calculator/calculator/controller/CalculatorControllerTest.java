/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ajw.calculator.calculator.controller;

import com.ajw.calculator.calculator.service.CalculatorService;
import static org.hamcrest.Matchers.containsString;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 *
 * @author andy
 */
@RunWith(SpringRunner.class)
@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {
    @Autowired
    private MockMvc mockMvc;
    
    @MockBean
    private CalculatorService calculatorService;
    
    @Before
    public void setUp() {}
    
    @Test
    public void testSum() throws Exception {
        Integer a = 1;
        Integer b = 2;
        Integer sum = a.intValue() + b.intValue();
        when(calculatorService.sum(a.intValue(), b.intValue()))
                .thenReturn(4);
        this.mockMvc.perform(get("/calculator/sum")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(String.valueOf(sum))));
    }
    
}
