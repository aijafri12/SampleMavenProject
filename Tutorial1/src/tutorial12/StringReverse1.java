package tutorial12;

import java.util.Arrays;

public class StringReverse1 {

	public static void main(String[] args) {
		String []name= {"AJ","Saad","tapadar","Samad","Ahmed"};
	    String temp;
	    
	    for (int i=0; i<name.length-1; i++) {
	    	
	    	temp=name[i];
	    	name[i]=name[name.length-i-1];
	    	
	    	
	    	
	    }
		
		

	}

}
