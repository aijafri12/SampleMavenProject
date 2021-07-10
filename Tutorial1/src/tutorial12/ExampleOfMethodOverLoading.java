package tutorial12;

public class ExampleOfMethodOverLoading {
	
		static int Mynumber2(int x, int y) {
			
			
			
			
			
			return x+y;
			
		}
			static double Mynumber2(double x, double y) {
				return  x+y;
				
				
				
				
				
				
				
			}
			
			
			public static void main(String[] args) {
				
				int myint=Mynumber2(5,6);
				double mydouble=Mynumber2(3.4,4.4);
				
			
				
				System.out.println("myint is " + myint);
				System.out.println("mydouble is "+ mydouble);
				
				System.out.println();
				
				
				
			}
			
			
		
	
		

}
