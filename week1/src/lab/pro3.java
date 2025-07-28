package lab;

import java.util.EventObject;
import java.util.Scanner;

public class pro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Squareroot of number:"+i+"is:"+ Math.sqrt(i));
		}
		

	}

}
