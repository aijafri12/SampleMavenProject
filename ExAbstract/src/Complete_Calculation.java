
public class Complete_Calculation implements Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Complete_Calculation cal=new Complete_Calculation();
		
		int add=cal.add_fuction();
		int sub=cal.sub_function();
		int mul=cal.mul_function();
		double div=cal.div_funciton();
		
		System.out.println(add+"\n"+sub+"\n"+mul+"\n"+div);
		
		//System.out.println(cal.add_fuction()+" "+cal.sub_function()+" "+cal.mul_function()+" "+cal.div_funciton());
		
		


	
	
	
	
	
	
	}

	@Override
	public int add_fuction() {
		
		int x=10;
		int y=15;
		
		int add=x+y;
		
	
		
		
		
		return add;
	}

	@Override
	public int sub_function() {

		int x=35;
		int y=15;
		
		int sub=x-y;
		
	
		
		
		return sub;
	}

	@Override
	public int mul_function() {
		int x=10;
		int y=15;
		
		int mul=x*y;
		
		return mul;
	}

	@Override
	public double div_funciton() {
		// TODO Auto-generated method stub

		double x=100;
		double y=15;
		
		double div=x/y;
		
		return  div;
		
	
	
	}

}
