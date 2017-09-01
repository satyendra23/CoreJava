/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.arrayexample;

import com.lfa.arrayexample.util.ArrayHelper;

/**
 *
 * @author satye
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = {20, 22, 24, 27, 33, 35};

        int x = 22;

        if (ArrayHelper.search(nums, x)) {
            System.out.println("found " + x);
        } else {
            System.out.println("not found");

        }
    }
}
