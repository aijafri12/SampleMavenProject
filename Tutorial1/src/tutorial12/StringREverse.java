package tutorial12;

import java.util.Arrays;

public class StringREverse {

	public static void main(String[] args) {

		String name[]= {"Abdullah", "Tapadar","Saad","Samad"};
		
		for(int i=0;i<name.length;i++) {
			
			if (name[i]=="Saad") {
				
				name[i]="Saadi";
				
				break;
		
				
			}
			
			else
				System.out.println("It is not a match let's move to next element");
			
			
			
		}System.out.println(Arrays.toString(name));
		
		
		
		
	}

}
