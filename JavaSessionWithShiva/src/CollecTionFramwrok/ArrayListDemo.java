package CollecTionFramwrok;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList list_1=new ArrayList();
		
		list_1.add("Saad");
		list_1.add(1, "saad");
		list_1.add("AJ");
		list_1.add(100);
		list_1.add(null);
		
        ArrayList list_2=new ArrayList();
		
		list_2.add("John");
		list_2.add("wick");
		
		System.out.println("list_1 index values: ");
		System.out.println(list_1);
		
		System.out.println("list_2 index values: ");

		System.out.println(list_2);
		
		list_1.addAll(list_2);//Adds one collecion to another collections  
		
		System.out.println("After adding both collection:"+" \n"+ list_1);
		
		//list_1.removeAll(list_2);
		
		list_1.retainAll(list_2);
		
		
		System.out.println(list_1);
		
		
		
		
		
		
		
	}

}
