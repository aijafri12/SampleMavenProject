
 abstract public class Employee {

	private String employee_name;
	
	private int employee_Id;
	
	private String dePt_name;

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public int getEmployee_Id() {
		return employee_Id;
	}

	public void setEmployee_Id(int employee_Id) {
		
		
		this.employee_Id = employee_Id;
	}
	
	abstract double calCulate_Salary(String dePt_name);

	public String getDePt_name() {
		return dePt_name;
	}

	public void setDePt_name(String dePt_name) {
		this.dePt_name = dePt_name;
	}
	
	
}
