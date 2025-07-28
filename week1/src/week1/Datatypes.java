package week1;

import java.util.Scanner;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int a;
		float b;
		char ch;
        String s;
        System.out.println("enter an integer.value");
        a=sc.nextInt();
        System.out.println("enter an float.value");
        b=sc.nextFloat();
        System.out.println("enter an character");
        ch=sc.next().charAt(0);
        System.out.println("enter your name");
        s=sc.nextLine();
        System.out.println("Integer value is "+a);
        System.out.println("Float value is "+b);
        System.out.println("Character value is "+ch);
        System.out.println("Your name is "+s);
	}

}
