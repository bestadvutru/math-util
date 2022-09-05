/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.longnh.mathutil.test.core;

import com.longnh.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){       
        Assert.assertEquals(1, MathUtil.getFactorial(1));
    }
    
//    @Test(expected = IllegalArgumentException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException(){       
//        MathUtil.getFactorial(-5);
//    }
    
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion(){
        Assert.assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-5));
    }

    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch(){
        try{
            MathUtil.getFactorial(-5);            
        }catch (Exception e){
            Assert.assertEquals("Invalid argument. N must be between 0..20", e.getMessage());
        }
    }     
}