package improveJava;

public class ArrEx3 {

	static int minvalue(int min[]) {
		
		int minvalue=min[0];
		
		
		for(int i=0; i<min.length; i++) {
		
			if (minvalue>min[i]) {
				
				minvalue=min[i];
				
			}
			
			
			
		}
		
		
		
		
		return minvalue;
		
		
		
		
		
	}
	
	static int maxvalue(int max[] ) {
		
		int maxvalue=max[0];
		
		for(int i=0; i<max.length;i++) {
			
		
			if (maxvalue<max[i])
			maxvalue=max[i];
		
		
			
			
		}
		
		
		
		
		return maxvalue;
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		int []arr= {24,55,112,55,533,3};
		int min=minvalue(arr);
		System.out.println(min);
		int max=maxvalue(arr);
		System.out.println(max);

		
	}

}
