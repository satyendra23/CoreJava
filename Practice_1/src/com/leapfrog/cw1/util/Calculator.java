/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.cw1.util;

/**
 *
 * @author satye
 */
public class Calculator {
    
    /**
     * Default Constructor
     */
    public Calculator (){
        System.out.println("Constructor Hit");
     
    }
    
    public int add(int x,int y){
        
        return x+y;
    }
    
    public int sub(int x,int y){
        return x-y;
    }
    
    public int div(int x,int y){
        return x/y;
    }
    
    public int mul(int x,int y){
        return x*y;
    }
    
    public int max(int x,int y){
        return (x>y)?x:y;
    }
}
    

