package homework2;

public class AddMethod {
	int add() {
	int x;
	int y;
	x=20;
	y=30;
	int sum;
	sum=x+y;
	return sum;
	}
	int sub() {
		int x;
		int y;
		x=20;
		y=30;
		int sub;
		sub=x-y;
		return sub;
		}
	int mul() {
		int x;
		int y;
		x=20;
		y=30;
		int mul;
		mul=x*y;
		return mul;}  
	int div() {
		int x;
		int y;
		x=20;
		y=30;
		int div;
		div=y/x;
		return div;}
	
	
	public static void main(String[] args) {
		AddMethod ad=new AddMethod();
		System.out.println(ad.add());
		System.out.println(ad.sub());
		System.out.println(ad.mul());
		System.out.println(ad.div());
		
	}
	
	

}
 
 