package improveJava;

import java.util.Scanner;

public class DynamicReadingOfArray {

	public static void main(String[] args) {

		int []arr=new int [3];
		
		Scanner sc=new Scanner(System.in);
		
		for (int i=0; i<arr.length; i++) {
			
			//value is entered inside the array
			System.out.println("Enter the value");
			arr[i]=sc.nextInt();//enter value to index and moves to next array
			
			/*
			 * System.out.println("Display the value from the array index");
			 * 
			 * System.out.println(arr[i]);
			 */
		}
		
		  //to display the value inside the array
		  System.out.println("Display the value from the array index");
		  
		  for(int i=0; i<arr.length;i++) {
		  
		  System.out.println(arr[i]);
		  
		  
		  }
		 
		
		
		
	}

}
