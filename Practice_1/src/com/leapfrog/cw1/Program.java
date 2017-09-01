/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.cw1;

import com.leapfrog.cw1.util.Calculator;

/**
 *
 * @author satye
 */
public class Program {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.max(60, 30));
        System.out.println(c.add(60, 30));
        System.out.println(c.sub(60, 30));
    }
}
