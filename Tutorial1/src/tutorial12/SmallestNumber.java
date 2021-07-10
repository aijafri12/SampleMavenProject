package tutorial12;

import java.util.Arrays;

public class SmallestNumber {

	static int ovloading(int x, int y) {
		
		
		return x+y;
		
		
	}
	static double ovloading(double x, double y) {
		
		
		return x+y;
		
		
	}
	public static void main(String[] args) {
		int myint=SmallestNumber.ovloading(45, 6);
		double mydouble=SmallestNumber.ovloading(53.4, 55);
		
		System.out.println(myint);
		System.out.println(mydouble);
		
	}

	
	
	

}