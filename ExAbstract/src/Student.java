
public abstract class Student {

	
	private int student_id;
	private String student_name;
	private long student_mobileName;
	private String Student_add;
	private String student_course;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public long getStudent_mobileName() {
		return student_mobileName;
	}
	public void setStudent_mobileName(long student_mobileName) {
		this.student_mobileName = student_mobileName;
	}
	public String getStudent_add() {
		return Student_add;
	}
	public void setStudent_add(String student_add) {
		Student_add = student_add;
	}
	public String getStudent_course() {
		return student_course;
	}
	public void setStudent_course(String student_course) {
		this.student_course = student_course;
	}
	
	
	public abstract double course_fee(String student_course);
	
	
	
	
}
