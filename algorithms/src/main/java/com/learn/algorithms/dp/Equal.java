package com.learn.algorithms.dp;

/**
 * Created by vmankena on 5/7/17.
 * https://www.hackerrank.com/challenges/equal
 *
 */


public class Equal {
    // Problem defined in above hackerrank link
    public static void main(){
        int[] currentNoOfChoclates=new int[2];
        int noOfColleagues=2;
        MinNoOfOperation minNoOfChoclates=new MinNoOfOperation(currentNoOfChoclates, noOfColleagues);
        System.out.println(minNoOfChoclates.getMinNumOfOperations());
    }
}


 class MinNoOfOperation {
     int[] currentNoOfChoclates;
     int noOfColleagues;

     public MinNoOfOperation(int[] currentNoOfChoclates, int noOfColleagues ){
        this.currentNoOfChoclates=currentNoOfChoclates;
        this.noOfColleagues=noOfColleagues;
    }

     public int getMinNumOfOperations(){
         int minNoOfOper=0;
          if(noOfColleagues<=1){
            return minNoOfOper;
          }
         return minNoOfOper;
     }
}