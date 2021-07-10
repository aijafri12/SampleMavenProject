package improveJava;

public class ParameterizeConstructor {
	
	public ParameterizeConstructor(int rule, String name) {
		
		System.out.println(rule + " "+ name);
		
		
		
	}
	public ParameterizeConstructor() {// example constructor overloading 
		
		this(100,"name");//calling a constructor from another constructor
		System.out.println("Student name and rule number:");
		
		
		
		
	}
	
	public static void main(String[] args) {// when we declare parameterized constructor we have to assign value for every object
		new ParameterizeConstructor ();//calling default constructor
		ParameterizeConstructor pc=new ParameterizeConstructor(1,"AJ");
		
		ParameterizeConstructor pc1=new ParameterizeConstructor(2,"Saad");
		ParameterizeConstructor pc2=new ParameterizeConstructor(3,"Nasir");
		ParameterizeConstructor pc3=new ParameterizeConstructor(4,"Maryam");
		ParameterizeConstructor pc4=new ParameterizeConstructor(5,"Salmi");
		
		
		
		
		
	}
	
	
	

}
