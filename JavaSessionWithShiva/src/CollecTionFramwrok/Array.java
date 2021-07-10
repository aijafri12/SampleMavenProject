package CollecTionFramwrok;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Array {

	public static void main(String[] args) {

		ArrayList list=new ArrayList();
		
		list.add("Saad");
		list.add(1, "saad");
		list.add("AJ");
		list.add(100);
		list.add(null);
		
		
		
		
		//System.out.println(list);
		//Iterator it=list.iterator();
		
		/*
		 * while(it.hasNext()) {
		 * 
		 * Object ob=it.next();
		 * 
		 * System.out.println(ob+" ");
		 * 
		 * 
		 * 
		 * } System.out.println();
		 */
	ListIterator lit=list.listIterator();
	
	while(lit.hasNext()) {
		
		Object ob=lit.next();
		
		System.out.println(ob+" ");
		
		
		
		
	}		System.out.println();

		while(lit.hasPrevious()) {
			
			
			
			Object ob=lit.previous();
			
			System.out.println(ob+" ");
			
			
			
			
		}		System.out.println();
			
		
		
	}
	
	
	

}
