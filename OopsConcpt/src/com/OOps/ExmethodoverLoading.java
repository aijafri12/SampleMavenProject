package com.OOps;

public class ExmethodoverLoading {

	void student_name (int Student_id, String Student_name) {
		System.out.println(Student_id+" "+Student_name);
		
	}
    
	void student_name (int Student_id, String Student_name, String Student_address) {
		System.out.println(Student_id+" "+Student_name+" "+Student_address);

		
	}
	
	
	public static void main(String[] args) {
		
		ExmethodoverLoading ol=new ExmethodoverLoading();
		ol.student_name(100, "JohnWick");
		
		
		
		
		
		
		
		
	}

}
