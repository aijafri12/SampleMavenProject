package tutorial12;

import java.util.Arrays;

public class stringVariable {

	public static void main(String[] args) {

		String[]name = {"Samad","Saad", "Aj","Tapadar", "SR"};
		String temp;
		
		for(int i =0;i<name.length/2; i++) {
			
			temp=name[i];
			name[i] =name[name.length-i-1];
			name[name.length-i-1]=temp;
			
		}
		System.out.println(Arrays.toString(name));
		
		/*
		 * int number[]= {255,333,345,555,33}; int large=number[0];
		 * 
		 * 
		 * for(int i=0; i<number.length; i++ ) {
		 * 
		 * 
		 * if(large<number[i]) {
		 * 
		 * large=number[i];
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 * 
		 * } System.out.println(large);
		 */

		/*
		 * String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; for (int i = 0; i <
		 * cars.length; i++) { System.out.println(cars[i]); }
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
