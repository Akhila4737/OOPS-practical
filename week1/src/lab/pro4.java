package lab;

import java.util.Scanner;

public class pro4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
        }

        if (sum == num)
            System.out.println(num + " is a Perfect Number.");
        else
            System.out.println(num + " is not a Perfect Number.");
	}

}
