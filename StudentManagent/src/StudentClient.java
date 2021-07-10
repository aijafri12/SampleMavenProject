import java.util.Scanner;

import com.PracticeApp.bean.Student;
import com.PracticeApp.dao.impl.StudentDaoImpl;

public class StudentClient {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentDaoImpl sd=new StudentDaoImpl();
		
		while(true) {
			
			
			System.out.println("```````````````````````````");
			System.out.println("1) AddStudent ");
			
			System.out.println("2) ViewAllStudent ");
			System.out.println("3) viewStudent ");
			System.out.println("4) exit ");


			System.out.println("enter the choice");
			
			int choice=sc.nextInt();			
		
			switch(choice) {
			
			case 1:
				
				sd.addStudent();

				break;
				
			case 2:
				Student[]viewallStudent=sd.viewallStudent();
				
				///! means not null or not true 
				
				if (viewallStudent!=null) {
					
					for(Student sb:viewallStudent) {
						
						System.out.println(sb.getStnum()+" "+sb.getSname()+" "+sb.getStadd());
						
						

					}
				}
				
				
				else 
					System.out.println("student record not found");
				
				
				break;
			
			
			
			case 3:
			
			
			System.out.println("enter student number to see details: ");
			int stnum=sc.nextInt();
			Student sb=sd.viewStuden(stnum);
			
			if (sb!=null) {
				System.out.println(sb.getStnum()+" "+sb.getSname()+" "+sb.getStadd());

				
			}
			else
				System.out.println("resources not found ");
			
			break;
			
			case 4:
				
				System.out.println("Thank you for using the app");
			
			System.exit(0);
			
			default:
				System.out.println("choose 1-4 options");
				
				
			
			}
			
			
		}
		
		
		
		
		
	}

}
