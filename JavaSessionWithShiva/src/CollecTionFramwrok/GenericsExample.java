package CollecTionFramwrok;

import java.util.ArrayList;
import java.util.Collections;

public class GenericsExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(100);
		
		list.add(200);
		list.add(300);
		list.add(400);
		
		
		System.out.println(list);
		
		Integer number=list.get(1);
		
		list.add(4, 500);
		
		System.out.println(number);
		System.out.println(list);
		
	   Collections.sort(list);
	   System.out.println(list);
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
