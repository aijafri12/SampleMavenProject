
public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student_track st=new Student_track();
		st.setStudent_name("Saad");
		st.setStudent_id(100);
		st.setStudent_mobileName(6468339451l);
		st.setStudent_add("Broadway");
		st.setStudent_course("Java");
		
		double fee=st.course_fee(st.getStudent_course());
		
		System.out.println(st.getStudent_name()+" "+st.getStudent_id()+" "+st.getStudent_mobileName()+" "+st.getStudent_add()+" "+st.getStudent_course()+" "+fee);
		
	
		
		
		
		
	}

}
