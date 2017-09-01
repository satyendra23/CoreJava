/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.arrayexample.util;

/**
 *
 * @author satye
 */
public class ArrayHelper {
    public static boolean search(int[] data, int num){
      for(int i=0;i<data.length;i++){
          if((data[i]==num)){
                return true; 
          } 
      } 
      return false;
    } 
}
