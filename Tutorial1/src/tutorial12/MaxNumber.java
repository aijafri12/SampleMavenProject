package tutorial12;

import java.util.Arrays;

public class MaxNumber {

	public static void main(String[] args) {
		
		String name[]= {"Maryam Jamila","Abu Nasir", "Abdullah Jafori","Kawsar Madani"};
		
		for(int i=0; i<name.length; i++) {
			
			if (name[i]=="Abdullah Jafori") {
				
				name [i]="AJ";
				
				break;
				
	}
			else 
				System.out.println("this is not a match");
			
			
			
			
			
		}
		
		System.out.println(Arrays.toString(name));
		
		
		
		
		
	}
	
	
			
			
	}
	

		
		
	    /*	Initialize array value

	    Step 2:  (int max = a[0];)

	            Initialize max value as array's first value

	    Step 3: (for int i = 1; i < a.length; i++ )

	            Iterate array using a for loop (exclude arrays first position 0, since it was assumed as max value)

	    Step 4: if(a[i] > max)

	            Use if condition to compare array current value with max value, if current array value is greater than max then assign array current value as max (max = a[i];).

	    Step 5:

	            Continue the loop and resign the max value if array current value is greater than max
		
		*/
	
		
			
	
		
		
		
	

	
			
		
		
		
		
		
		
		
		
	

