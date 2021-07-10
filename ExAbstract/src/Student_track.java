
public class Student_track extends Student {

	@Override
	public double course_fee(String student_course) {
		// TODO Auto-generated method stub
		
		if (student_course.equals("Java"))
		
		return 2500;
		
		else if  (student_course.equals("net"))
		
		return 1000;
		
		
		else
			return 500;
		
		
		
		
	}

}
