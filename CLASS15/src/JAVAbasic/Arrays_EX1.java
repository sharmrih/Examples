package JAVAbasic;

public class Arrays_EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a [];
		a = new int[3];
		a[0]=1;
		a[1]=20;
		a[2]=30;
		//a[3] =40;// Out of the Range
		
		System.out.println(a[0]);
		System.out.println(a[1] + a[2]);
		
		//**************************************//
		
		int [] abc= new int [4];
		abc[0] = 10;
		
		System.out.println(abc[0]);
		
		//**************************************//
		
		char [] abcd = {'A','B','Z'}; // Array of Charcters
		
		int [] xyz = {10,20,30,40};  //Array of Integers
		
		String [] c = {"UFT", "Selenium", "RFT"}; //Array of Strings
		
		boolean [] d = {true, false, false, true}; //Array of Booleans values
		
		System.out.println(abcd[1]);
		System.out.println(xyz[3]);
		System.out.println(c[1]);
		System.out.println(d[2]);
		
		//**************************************//
		
		int [] array1 = {1,2,3,4,5};
		
		int array2 [] = array1;
		
		System.out.println(array2[2]);
		
		for (int i=0; i < array2.length; i++) {
			
			System.out.println(array2[i]);
		}
		
		

	}

}
