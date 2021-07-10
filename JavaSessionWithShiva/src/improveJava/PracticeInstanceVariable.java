package improveJava;

public class PracticeInstanceVariable {

	int paymentId; //instance or non-static variable 
	
	String paymentName;
	
	
	void disPlay() {
		
		int paymentId=100;
		String paymentName="Book";
		System.out.println(paymentId+" "+paymentName);
      
		
		
		
	}

	
	public static void main(String[] args) {
  
		
		
		
		PracticeInstanceVariable instVariables=new PracticeInstanceVariable();// creating object of the class so we can access and modify non static variable from static method.
		System.out.println(instVariables.paymentId +" "+instVariables.paymentName);

		
		
		instVariables.paymentName="StudentFee";
		instVariables.paymentId=124;
		
		instVariables.disPlay();
		
		System.out.println(instVariables.paymentName+" "+instVariables.paymentId);
		
		
		
	}

}
