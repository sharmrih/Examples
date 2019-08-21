package JAVAbasic;

public class Flow_Control6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10,b =80, c =7 ,d=2;
		
		if ((a>b) && (a>c) && (a>d)) {
			
			System.out.println("A is a Big Number");
		}
		
		else if (((b>a) && (b>c) && (b>d))) {
			
			System.out.println("B is a big Number");
		}
		
		else if (((c>a) && (c>b) && (c>d))) {
			
			System.out.println("C is a big Number");
	}

		else System.out.println("D is a Big Number");
		
		
}
}
