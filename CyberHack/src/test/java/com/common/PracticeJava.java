package com.common;

import java.util.Arrays;

public class PracticeJava {// we can reverse and keep the value here for temporary time
	// length/2 divide the length

	public static void main(String[] args) {
		
		int x[]= {12,34,5,2,454,67,45,23};
		
		int temp; 
		
		for ( int i=0; i<x.length/2; i++ ) {
			
			
			temp=x[i];
			x[i]=x[x.length-1-i];
			x[x.length-1-i]=temp;
			
			
			
		}
		
		System.out.println(Arrays.toString(x));
	}
}
