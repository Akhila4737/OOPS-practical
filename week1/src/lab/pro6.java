package lab;

import java.util.Scanner;

public class pro6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            char lowerCh = Character.toLowerCase(ch);
            if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u')
                System.out.println(ch + " is a Vowel.");
            else
                System.out.println(ch + " is a Consonant.");
        } else {
            System.out.println(ch + " is not an Alphabet.");
        }

	}

}
