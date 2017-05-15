package com.learn.algorithms;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by vmankena on 4/28/17.
 */
public class SampleProgramTest {

    SampleProgram sampleProgram=new SampleProgram();

    @Test
    public void testSumOfTwoNums(){

        int a=5;
        int b=4;
        int expectedSum=9;
        int result=sampleProgram.sum(a,b);
        Assert.assertEquals(expectedSum, result);
    }
}
