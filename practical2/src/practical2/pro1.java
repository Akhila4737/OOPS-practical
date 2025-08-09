package practical2;

import java.util.Scanner;

public class pro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String a=sc.nextLine();
		if(a.length()>2) {
		System.out.println("charAt(2):input.charAt(2)");
		}
		else {
			System.out.println("char(2):string too short");
		}
		 System.out.println("Length: " + a.length());
	        System.out.println("UpperCase: " + a.toUpperCase());
	        System.out.println("LowerCase: " + a.toLowerCase());
	        if (a.length() > 3) {
	            System.out.println("Substring(1, 3): " + a.substring(1, 3));
	        } else {
	            System.out.println("Substring(1, 3): String too short.");
	        }
	        System.out.println("Contains 'java': " + a.contains("java"));
	        System.out.println("Replace 'a' with '@': " + a.replace('a', '@'));
	}

}
