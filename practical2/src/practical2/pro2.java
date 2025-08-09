package practical2;

import java.util.Scanner;

public class pro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter string2: ");
        String str2 = sc.nextLine();
        if(str1.equals(str2)) {
        	System.out.println("equal");
        }else {
        	System.out.println("Not equal");
        }
        if (str1 == str2) {
            System.out.println("equal.");
        } else {
            System.out.println("NOT equal.");
        }
	}
}
