package JAVAbasic;

public class Flow_Control4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100000000;
		
		if ((a >= 1) && (a <=100)) {
			
			System.out.println("A is a small Number");
		}
		
		else if ((a > 100) && (a <= 1000)) {
			
			System.out.println("A is Medium, Number");
			
		}
		
		else if ((a > 1000) && (a <= 10000)) {
			
			System.out.println("A is Big, Number");
			

	}
		
			else if (a > 10000) {
			
			System.out.println("A is high Number");
			

}
		
			else {
				
				System.out.println("A is either Zero or Negative Number");
			}
				
}}