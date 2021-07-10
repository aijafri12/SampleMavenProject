
public class JavaExceptionHandling {
	
	public static void main(String[] args) {
		
		int x=100;

		
	
		try {
			int y=x/0;
			System.out.println(y);
	
			
			
		}
		catch(ArithmeticException e) {
	
			e.getMessage();
			
			System.out.println("something went wrong");
	
			
		
		}
		
		
		
	}
	
	
	
	

}
