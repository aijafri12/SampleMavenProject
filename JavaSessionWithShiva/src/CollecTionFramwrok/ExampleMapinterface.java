package CollecTionFramwrok;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;import java.util.Map;
import java.util.Set;

public class ExampleMapinterface {

	public static void main(String[] args) {

		
		HashMap<Integer, String > hm=new HashMap<Integer, String >();
		hm.put(100, "Pen_price");
		hm.put(101, "Book_price");
		hm.put(102, "pencil_price");
		hm.put(null, "Super_editionBook");
		hm.put(103, null);
		hm.put(104, null);
		hm.put(105, null);
		
		System.out.print(hm+"\n");
		
		Object ob=hm.get(102);
		System.out.println(ob);
		
		Set s=hm.keySet();
		System.out.println(s);
		Collection c=hm.values();
		
		System.out.println(c+"\n");
		
		for(Map.Entry m: hm.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
			
			
			
		}
		
		
		
		
		
		
	}

}
