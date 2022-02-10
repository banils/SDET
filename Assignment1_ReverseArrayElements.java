package Assignment1;

import java.util.Scanner;

public class Assignment1_ReverseArrayElements {
  
	public static void main(String args[]) {
    
		int counter, i = 0, j = 0, temp;
		int number[] = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		counter = sc.nextInt();

		for (i = 0; i < counter; i++) {
			System.out.print("Enter Array Elements" + (i + 1) + ": ");
			number[i] = sc.nextInt();
		}

		j = i - 1;
		i = 0;
		while (i < j) {
			temp = number[i];
			number[i] = number[j];
			number[j] = temp;
			i++;
			j--;
		}

		System.out.print("Reversed elements of Array: ");
		for (i = 0; i < counter; i++) {
			System.out.print(number[i] + "  ");
		}
	}
}
