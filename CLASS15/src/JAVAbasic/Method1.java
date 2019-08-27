package JAVAbasic;

public class Method1 {

	public  void studentsrank(int marks)  {
		// TODO Auto-generated method stub
		
		//Create a Method
		
		if (marks >= 600) {
			
			System.out.println("Rank A");
		}
		else if (marks >= 500) {
			
			System.out.println("Rank B");
		}
		else System.out.println("Rank C");
	
	}
	
	
	public static void main (String [] args) {
		
		//Call method by Invoking object
		Method1 obj = new Method1();
		
		obj.studentsrank(700);
	}
	

}
