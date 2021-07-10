package CollecTionFramwrok;

import java.util.ArrayList;

public class ArrayListDemo_3 {

	public static void main(String[] args) {
		
        ArrayList list=new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(100);
		list.add(null);
		
		
		Object[] arr=list.toArray();
		for (Object ob:arr )
			System.out.print(ob+" ");
		
		
		
		
		
		
		
		
		
		
		
	}

}
