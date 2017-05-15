package com.learn.algorithms.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vmankena on 5/7/17.
 */
public class EqualTest {



    @Test
    public void singleColleague(){
        int[] currentNoOfChoclates={3};
        int noOfColleagues=1;
        MinNoOfOperation minNoOfOperation=new MinNoOfOperation(currentNoOfChoclates, noOfColleagues);
        int expectedResult=0;
        int result=minNoOfOperation.getMinNumOfOperations();
        Assert.assertEquals("No of Operations should be zero if there is only one colleague", result, expectedResult);
    }

    @Test
    public void twocolleaguesWithDiffOneChoclate(){
        int[] currentNoOfChoclates={2,3};
        int noOfColleagues=2;
        MinNoOfOperation minNoOfOperation=new MinNoOfOperation(currentNoOfChoclates, noOfColleagues);
        int expectedResult=1;
        int result=minNoOfOperation.getMinNumOfOperations();
        Assert.assertEquals("No of Operations should be zero if there is only one colleague", result, expectedResult);
    }

    @Test
    public void twocolleaguesWithDiffTwoChoclate(){
        int[] currentNoOfChoclates={1,3};
        int noOfColleagues=2;
        MinNoOfOperation minNoOfOperation=new MinNoOfOperation(currentNoOfChoclates, noOfColleagues);
        int expectedResult=1;
        int result=minNoOfOperation.getMinNumOfOperations();
        Assert.assertEquals("No of Operations should be zero if there is only one colleague", result, expectedResult);
    }

    @Test
    public void twocolleaguesWithDiffThreeChoclate(){
        int[] currentNoOfChoclates={1,4};
        int noOfColleagues=2;
        MinNoOfOperation minNoOfOperation=new MinNoOfOperation(currentNoOfChoclates, noOfColleagues);
        int expectedResult=2;
        int result=minNoOfOperation.getMinNumOfOperations();
        Assert.assertEquals("No of Operations should be zero if there is only one colleague", result, expectedResult);
    }

    @Test
    public void twocolleaguesWithDiffFourChoclate(){
        int[] currentNoOfChoclates={1,5};
        int noOfColleagues=2;
        MinNoOfOperation minNoOfOperation=new MinNoOfOperation(currentNoOfChoclates, noOfColleagues);
        int expectedResult=2;
        int result=minNoOfOperation.getMinNumOfOperations();
        Assert.assertEquals("No of Operations should be zero if there is only one colleague", result, expectedResult);
    }

    @Test
    public void twocolleaguesWithDiffFiveChoclate(){
        int[] currentNoOfChoclates={1,6};
        int noOfColleagues=2;
        MinNoOfOperation minNoOfOperation=new MinNoOfOperation(currentNoOfChoclates, noOfColleagues);
        int expectedResult=1;
        int result=minNoOfOperation.getMinNumOfOperations();
        Assert.assertEquals("No of Operations should be zero if there is only one colleague", result, expectedResult);
    }

    @Test
    public void twocolleaguesWithDiffSixChoclate(){
        int[] currentNoOfChoclates={1,7};
        int noOfColleagues=2;
        MinNoOfOperation minNoOfOperation=new MinNoOfOperation(currentNoOfChoclates, noOfColleagues);
        int expectedResult=2;
        int result=minNoOfOperation.getMinNumOfOperations();
        Assert.assertEquals("No of Operations should be zero if there is only one colleague", result, expectedResult);
    }

    @Test
    public void twocolleaguesWithDiffSevenChoclate(){
        int[] currentNoOfChoclates={1,8};
        int noOfColleagues=2;
        MinNoOfOperation minNoOfOperation=new MinNoOfOperation(currentNoOfChoclates, noOfColleagues);
        int expectedResult=2;
        int result=minNoOfOperation.getMinNumOfOperations();
        Assert.assertEquals("No of Operations should be zero if there is only one colleague", result, expectedResult);
    }

    @Test
    public void twocolleaguesWithDiffEightChoclate(){
        int[] currentNoOfChoclates={1,9};
        int noOfColleagues=2;
        MinNoOfOperation minNoOfOperation=new MinNoOfOperation(currentNoOfChoclates, noOfColleagues);
        int expectedResult=3;
        int result=minNoOfOperation.getMinNumOfOperations();
        Assert.assertEquals("No of Operations should be zero if there is only one colleague", result, expectedResult);
    }
}
