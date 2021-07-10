import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameNumber {

	public static void main(String[] args) {
		

		ArrayList a=new ArrayList();
		a.add("23");
		a.add( "34");
		a.add("11");
		a.add("67");
		a.remove(3);
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
			
			
		}
		
		
		
	}

}
