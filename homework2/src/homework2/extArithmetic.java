package homework2;

public class extArithmetic extends BasicArithmetic_parentclass {

	void mul() {
		x=3;
		y=6;
		
		int mul=x*y;
		System.out.println("x times y= "+mul);
		
	}
	public static void main(String[] args) {
		
		
		extArithmetic  a= new extArithmetic ();
		a.sub();
		
		a.add();
		a.mul();
		
		
		
	}
	
	
	
}
