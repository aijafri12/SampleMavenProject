
public class Corp_Batch extends Student {

	@Override
	public double course_fee(String student_course) {
		// TODO Auto-generated method stub

		
		if (student_course.equals("Java"))
			
			return 3500;
			
			else if  (student_course.equals("net"))
			
			return 2000;
			
			
			else
				return 1500;
			
			
	}

}
