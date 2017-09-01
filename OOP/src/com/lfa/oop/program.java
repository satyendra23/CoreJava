/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.oop;
import com.lfa.oop.util.CalculatorHelper;
/**
 *
 * @author satye
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculatorHelper ch=new CalculatorHelper();
        
        System.out.println(ch.add(12, 8));
        System.out.println(ch.sub(24, 3));
    }
    
    
    
}
