
public class HR_dept {

	public static void main(String[] args) {

		Accounts_Dept ac= new Accounts_Dept();
		ac.setEmployee_name("Saad");
		ac.setEmployee_Id(100);
		ac.setDePt_name("IT_dept");
		double salary=ac.calCulate_Salary(ac.getDePt_name());
		
		System.out.print( "employee_name: " + ac.getEmployee_name()+"\n"+ "Employee_Id: " +ac.getEmployee_Id()+"\n"+"DePt_name: "+ac.getDePt_name() +"\n"+ "Salary: "+salary);
		
	}

}
