package JAVAbasic;

import java.io.Console;
import java.lang.*;

public class Examples {
	
	//Create a Method (User Defined)
	
	public int multiply(int a, int b, int c) {
		
		int result = a * b * c;
		return result;
		
	}
public static void main(String[] args) {
	
	//This is a Sample Program
	int a=10,b,c; // variable decalaration
	b=20; c=30; //Initialization
	final int money =100;// Constant Declarion
			System.out.println("Addition of a,b is " + (a+b));// Addition of a,b is 30
			System.out.println(money);//100
			System.out.println(c);//30
			
			if (a>b) {
				
				System.out.println("a is a Big Number");
			}
				else
				{
					
					System.out.println("B is a Big Number");
					
				}

			for (int d=1; d <=10;d++) {
				
				System.out.println(d);
			}

}

	
}

