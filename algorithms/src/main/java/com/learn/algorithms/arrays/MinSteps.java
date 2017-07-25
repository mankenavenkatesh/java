package com.learn.algorithms.arrays;

import java.util.ArrayList;

public class MinSteps {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int minSteps=0;
        int noOfPoints=X.size();
        int noOfStepsBetweenXCord=0;
        int noOfStepsBetweenYCord=0;
        for(int i=1;i<noOfPoints;i++){
            noOfStepsBetweenXCord = X.get(i)-X.get(i-1);
            noOfStepsBetweenXCord = noOfStepsBetweenXCord >0 ? noOfStepsBetweenXCord : -1 * noOfStepsBetweenXCord;
            
            noOfStepsBetweenYCord = Y.get(i)-Y.get(i-1);
            noOfStepsBetweenYCord = noOfStepsBetweenYCord >0 ? noOfStepsBetweenYCord : -1 * noOfStepsBetweenYCord;
            
            minSteps +=  noOfStepsBetweenXCord>noOfStepsBetweenYCord ? noOfStepsBetweenXCord : noOfStepsBetweenYCord;
        }
        return minSteps;
    }
}
