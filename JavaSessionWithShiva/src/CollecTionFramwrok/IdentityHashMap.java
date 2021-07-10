package CollecTionFramwrok;

import java.util.HashMap;

public class IdentityHashMap {

	public static void main(String[] args) {

		//HashMap hm=new HashMap();
		
		IdentityHashMap hm=new IdentityHashMap();
		
		Integer i1=100;
	
		hm.put(i1, "Saad");
		 
		Integer i2=100;
		hm.put(i2, "AJ");
		
		System.out.println(hm);
		
		
		
		
		
		
		
		
	}

}
