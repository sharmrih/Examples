package JAVAbasic;

public class String_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1 = "Selenium";
		String str2 = "SELENIUM";
		String str3 = "Seleniuma";
		String str4 = "Selenium";
		String str5 = "               Selenium       ";
		String str6 = "Welcome to  Selenium Testing";
		
		
		System.out.println(str1.compareTo(str2)); //positive Value
		System.out.println(str1.compareTo(str3)); //negative Value
		System.out.println(str1.compareTo(str4)); // Zero
		
		System.out.println(str1.equals(str3)); //True
		System.out.println(str1.equals(str4)); // False
		
		System.out.println(str1.concat(str3)); //Merge
		System.out.println(str1 + str4); // Merge
		
		System.out.println(str1.charAt(1)); // It will show the item which is present in the at second postion
		
		System.out.println(str1.equalsIgnoreCase(str2)); //True
		System.out.println(str1.equalsIgnoreCase(str3)); //false
		
		System.out.println(str1.toUpperCase()); //It will allow the system to move the to uppercase
		
		System.out.println(str2.toLowerCase()); //It will allow the system to move the to uppercase
		
		System.out.println(str5);
		System.out.println(str5.trim());
		
		System.out.println(str6.substring(12));
		System.out.println(str6.substring(21));
		System.out.println(str6.substring(12,20));
		System.out.println(str6.substring(9,11));
		
		System.out.println(str1.length());
		
		System.out.println(str6.endsWith("Testing"));
		
	}

}
