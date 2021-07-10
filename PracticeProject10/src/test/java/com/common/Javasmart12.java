package com.common;

public class Javasmart12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x[]= {2,24,45,67,89,56};
		
		int max=x[0];
		int min=x[0];
		for(int i=0;i<x.length;i++) 
		{
			
			if(x[i]>max)
				max=x[i];
			else if(x[i]<min)
				min=x[i];
			
		}
		
		
		System.out.println(max);
		
		System.out.println(min);
		
		

	}

}
