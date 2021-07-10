package tutorial12;

public class ForLoops {
	
	static void fizz (int x, int y) {
		
		for (int i =1; i<100; i++) {
			
			if(i%x==0 && i%y==0)
				
				System.out.println("FizzBuzz");
			
			else if (i%x==0)
				System.out.println("Fizz");
			
			
			else if (i%y==0)
				System.out.println("Buzz");
			
			else 
				System.out.println(i);
			
			
		}
	}
	
	public static void main(String[] args) {
		ForLoops.fizz(5, 9);
		
		
	}
	
	
	
	
	
	

		
		
		
		
			
			
	
	
	


	 

}
