package com.learn.algorithms.dp;

import java.util.Date;

public class FibanocciWithoutDP {

	public static void main(String[] args) {
		System.out.println(new Date().getTime());
		System.out.println(fibanocci(5));
		System.out.println(new Date().getTime());
		System.out.println(fibanoccioptimized(5));
		System.out.println(new Date().getTime());
		System.out.println(fibanocciDP(5));
		System.out.println(new Date().getTime());
	}
	
	
	public static int fibanocci(int n){
		// This is o(n) space , 
		if(n==0 || n==1)
			return 1;
		
		return fibanocci(n-1) + fibanocci(n-2);
	}
	
	public static int fibanoccioptimized(int n){
		int x1=1;
		int x2=1;
		int x3=0;
		for(int i=2;i<=n;i++){
			x3=x2+x1;
			x1=x2;
			x2=x3;
		}
		return x2;
	}
	
	public static int fibanocciDP(int n){
		int[] dictionary=new int[n+1];
		dictionary[0]=1;
		dictionary[1]=1;
		
		return fib(dictionary,n);
		
	}
	public static int fib(int[] dic, int n){
		if(dic[n]!=0){
			return dic[n];
		}
		
		return fib(dic, n-1) + fib(dic, n-2);
	}
}
