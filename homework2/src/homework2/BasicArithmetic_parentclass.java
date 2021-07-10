package homework2;

public class BasicArithmetic_parentclass {
	int x; // this is an instance variable
	int y; // because its inside the class but outside the method
	int sum;
	void add() 
	{
		x=10;
		y=15;
		
		sum=x+y;
		System.out.println("addition of x+y = "+sum);
	}
	void sub() {
		
		x=20;
		y=12;
	int sub;
	sub=x-y;
	System.out.println("the substruction of x-y = "+sub);
	}
	
	protected void secured() {
		
		System.out.println(" dont accsess");
		
	}
	
}
