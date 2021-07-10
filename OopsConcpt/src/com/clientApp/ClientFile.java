package com.clientApp;

import java.util.Scanner;

import logInAndLogOutArray.Daoimpl.UserDaoimpl;

public class ClientFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDaoimpl ud=new UserDaoimpl();
		Scanner sc =new Scanner(System.in);
		
		while(true) {
		
		System.out.println("````````````````````");
		
		System.out.println(" 1) Create account ");
		
		System.out.println(" 2) enter email_id");
		
		System.out.println("3) enter user_pw ");
		
		System.out.println("````````````````````");

		
		System.out.println("enter the choice ");
		
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			
		ud.register_User();
		 
		break;
		
		case 2:
			
			System.out.println("Enter email_id and password");
			
			String email_id=sc.next();
			
			System.out.println("enter password");
			String user_pw=sc.next();
			
			boolean flag=ud.verifyUserlogin(email_id, user_pw);
			
			if (flag)
				System.out.println("valid user");
			
			else 
				System.out.println("not valid user");
			
			break;
					
		case 3:
			System.out.println("Thanks for using the application ");
			System.exit(0);
		
			default:
				System.out.println("choose 1-3 options1");
		
		}
		
	
		
		}
		

	}

}
