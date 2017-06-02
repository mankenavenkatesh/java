package com.learn.algorithms.arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by vmankena on 6/2/17.
 */
public class MaxNonNegativeSubArrayTest {

    private MaxNonNegativeSubArray maxNonNegativeSubArray=new MaxNonNegativeSubArray();

    @Test
    public void positiveTestCase(){
        ArrayList<Integer> x =new ArrayList<Integer>();
        x.add(1);
        x.add(2);
        x.add(4);
        x.add(-7);
        x.add(2);
        x.add(3);

        ArrayList<Integer> b=maxNonNegativeSubArray.maxset(x);
        System.out.println(b);
    }

    @Test
    public void twoPositiveTwoNegativeNumbers(){
        ArrayList<Integer> x =new ArrayList<Integer>();
        x.add(1967513926);
        x.add(1540383426);
        x.add(-1303455736);
        x.add(-521595368);

        ArrayList<Integer> b=maxNonNegativeSubArray.maxset(x);
        int[] expected={1967513926,1540383426};
        // Assert.assertArrayEquals(expected, b.stream().mapToInt(i -> i).toArray());
    }
}
