package logInAndLogOutArray;

public class CreateAccount {
	
	private int user_id;
	public CreateAccount(int user_id, String first_name, String last_name, String email_id, long user_mobileNum,
			String user_password) {
		super();
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email_id = email_id;
		this.user_mobileNum = user_mobileNum;
		this.user_password = user_password;
	}
	public CreateAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public long getUser_mobileNum() {
		return user_mobileNum;
	}
	public void setUser_mobileNum(long user_mobileNum) {
		this.user_mobileNum = user_mobileNum;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	private String first_name;
	private String last_name;
	private String email_id;
	private long user_mobileNum;
	private String user_password;
	
	
	
	
	
	
	

}
