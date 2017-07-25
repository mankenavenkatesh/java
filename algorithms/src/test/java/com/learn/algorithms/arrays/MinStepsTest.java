package com.learn.algorithms.arrays;

import java.util.ArrayList;


import org.junit.Assert;
import org.junit.Test;



public class MinStepsTest {

	private MinSteps minSteps= new MinSteps();
	
	@Test
	public void happyPathTest(){
		
		ArrayList<Integer> X= new ArrayList<Integer>(3);
		ArrayList<Integer> Y= new ArrayList<Integer>(3);
		X.add(new Integer(0));
		X.add(new Integer(1));
		X.add(new Integer(1));
		
		Y.add(new Integer(0));
		Y.add(new Integer(1));
		Y.add(new Integer(2));
				
		int minStep=minSteps.coverPoints(X, Y);
		Assert.assertTrue("min steps in not as expected", minStep==2);
	}
}
