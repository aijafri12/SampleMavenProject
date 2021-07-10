package improveJava;


public class FlowControlEX {
	

	static void fizz(int x, int y) {
		
		
		for (int i=1;i<=100; i++) {
			
			if (i%x==0 && i%y==0) 
				
				System.out.println("fizzBuzz");
			
			else if  (i%x==0)
			System.out.println("fizz");
			
			
			else if(i%y==0) 
				System.out.println("Buzz");
				
			else 
				System.out.println(i);
			
		
		}

	 
	 }

	public static void main(String[] args) {

		FlowControlEX.fizz(7,9);
		


	}		
	

}
