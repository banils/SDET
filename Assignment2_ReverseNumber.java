package Assignment2;

import java.util.Scanner;

public class Assignment2_ReverseNumber {

	public static void main(String args[]) {

		int num = 0;
		int revnum = 0;
		System.out.println("Enter your number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();

		while (num != 0) {
			revnum = revnum * 10;
			revnum = revnum + num % 10;
			num = num / 10;
		}

		System.out.println("Reverse of given number is: " + revnum);
	}

}
