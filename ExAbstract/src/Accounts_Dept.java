
public class Accounts_Dept extends Employee {

	@Override
	double calCulate_Salary(String dePt_name) {
		
		if (dePt_name.equals("account_dept"))
	
		return 15000;
	
		else if (dePt_name.equals("IT_dept"))
			
		
		return 10000;
		
		else if(dePt_name.equals("Hr_dept"))
		
		return 13000;
		
		else 
			return 7000;
	}

}
