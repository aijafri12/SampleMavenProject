package com.PracticeApp.dao.impl;

import java.util.Scanner;

import com.PracticeApp.bean.Student;

public class StudentDaoImpl {

	
	Scanner sc=new Scanner(System.in);
	Student [] addStudent=null;
	public void addStudent() {
		
		
		System.out.println("how many student can join the class? ");
		int size=sc.nextInt();
		addStudent=new Student[size];
		
		
		for(int i=0; i<size; i++) {
			
	
		
		
		System.out.println("enter student number: ");
		
		int stnum=sc.nextInt();
		
		System.out.println("enter student name: ");
		String sname =sc.next();
		
		
		System.out.println("enter student address: ");
		String stadd=sc.next();
		
	     Student sd= new Student(stnum,sname,stadd);
		
	     addStudent[i]=sd;
	     
	     System.out.println("student added succesfully ");
		}
		
		
		
	}public Student[]viewallStudent(){
		
		
		return addStudent;
		
		
	}
	public Student viewStuden(int stnum) {
		
		
		if(addStudent!=null) {
		
		for(Student sd:addStudent) {
			
			if (sd.getStnum()==stnum) {
				
				return sd;
				
			}
			
		}
			
		}
		
		
		return null;
		
	}
	
	
	
	
}
