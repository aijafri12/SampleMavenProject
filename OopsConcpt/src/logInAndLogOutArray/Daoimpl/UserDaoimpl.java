package logInAndLogOutArray.Daoimpl;

import java.util.Scanner;

import logInAndLogOutArray.CreateAccount;

public class UserDaoimpl {

	CreateAccount adduser[]=new CreateAccount[3];
	Scanner sc= new Scanner(System.in);
	
	public void register_User() {
		
		for(int i=0; i<adduser.length;i++) {
			
		
		
		System.out.println("Enter User_Id");
		int u_ID=sc.nextInt();
		
		System.out.println("Enter first_name");
		String  first_name=sc.next();
		
		

		System.out.println("Enter last_name");
		String  last_name=sc.next();
		

		System.out.println("Enter email_id");
		String  email_id=sc.next();
		

		System.out.println("Enter mobile_number");
		long mobile_number=sc.nextLong();
		
		

		System.out.println("Enter password");
		String  user_pw=sc.next();
		
		
		CreateAccount user=new CreateAccount(u_ID,first_name,  last_name,email_id, mobile_number, user_pw);

		adduser[i]=user;
		
		
		}
		
		
	}
	
	public boolean verifyUserlogin(String email_id, String user_pw) {
		
		boolean flag=false;
		for(CreateAccount user:adduser) {
		
			if(user.getEmail_id().equals(email_id)&& user.getUser_password().equals(user_pw)) {
				
				flag=true;
				
			}
			
			
		}
		
		
		return flag;
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
