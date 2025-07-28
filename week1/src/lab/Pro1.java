package lab;

import java.util.Scanner;

public class Pro1 {

	private static final String Main = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		System.out.println("enter an billamount:");
		double amount=sc.nextInt();
		double gst = amount*0.18;
		double main= amount*0.02;
		double tot=amount+gst+main;
		double discount;
		if(tot>1000) {
			discount=tot*0.10;
		}else {
			discount=tot*0.05;
		}
		double finalbill=tot-discount;
		System.out.println("Bill:"+amount);
		System.out.println("gst:"+gst);
		System.out.println("Maintenance:"+main);
		System.out.println("discount:"+discount);
		System.out.println("final Total:"+finalbill);
    } 
}

