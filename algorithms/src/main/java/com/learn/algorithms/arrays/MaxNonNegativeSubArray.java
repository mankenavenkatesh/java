package com.learn.algorithms.arrays;

import java.util.ArrayList;

/**
 * Created by vmankena on 6/2/17.
 */
public class MaxNonNegativeSubArray {

    public ArrayList<Integer> maxset(ArrayList<Integer> a) {
        a.add(-100);
        ArrayList<Integer> maxNonNegativeSubArray=new ArrayList<Integer>();
        int lastStartIndex=0;
        int lastEndIndex=0;
        double lastMaxSum=0;
        double sum=0;
        int currentStartIndex=0;
        int currentEndIndex=0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)<0){
                if(sum==lastMaxSum){
                    if((currentEndIndex-currentStartIndex) > (lastEndIndex-lastStartIndex)){
                        lastStartIndex=currentStartIndex;
                        lastEndIndex=currentEndIndex;
                    }
                }
                else if(sum>lastMaxSum){
                    lastMaxSum=sum;
                    lastStartIndex=currentStartIndex;
                    lastEndIndex=currentEndIndex;
                }
                currentStartIndex=i+1;
                currentEndIndex=i+1;
                sum=0;
            }
            else
            {
                currentEndIndex++;
                sum+=a.get(i);
            }
        }

        for(;lastStartIndex<lastEndIndex;lastStartIndex++){
            maxNonNegativeSubArray.add(a.get(lastStartIndex));
        }

        return maxNonNegativeSubArray;
    }
}
