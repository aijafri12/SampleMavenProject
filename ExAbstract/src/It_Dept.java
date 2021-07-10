
public class It_Dept extends Employee {

	@Override
	double calCulate_Salary(String dePt_name) {
		// TODO Auto-generated method stub
		if (dePt_name.equals("account_dept"))
			
			return 25000;
		
			else if (dePt_name.equals("IT_dept"))
				
			
			return 11000;
			
			else if(dePt_name.equals("Hr_dept"))
			
			return 12000;
			
			else 
				return 6000;
	}

}
