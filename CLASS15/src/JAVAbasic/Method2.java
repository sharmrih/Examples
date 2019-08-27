package JAVAbasic;

public class Method2 {
	
	//User Defined Method
	
	public int multiply (int a, int b, int c) {
		
	int result = a*b*c;
	return result;
	
	}
	
	
	public static void main (String [] args) {
		
		
		//Create Object
		
		Method2 abc = new Method2();
		
		//Call Method
		
		int x =abc.multiply(10, 25, 35);
		System.out.println(x);
		
		System.out.println(abc.multiply(10, 25, 35));
				
		
	}

}
