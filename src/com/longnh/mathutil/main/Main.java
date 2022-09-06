/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.longnh.mathutil.main;

import static com.longnh.mathutil.core.MathUtil.getFactorial;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        long expected = 120;
        int n = 5;
        long actual = getFactorial(n);
        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual);
        
    }
}
