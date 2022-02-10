package Assignment1;

import java.util.Scanner;
import java.util.Arrays;

public class Assignment1_SortingArray {
  
	public static void main(String[] args) {
    
		int count, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements you want in an array: ");
		count = sc.nextInt();
		int num[] = new int[count];
		System.out.println("Enter the elements of an array:");
		for (int i = 0; i < count; i++) {
			num[i] = sc.nextInt();
		}
		
    Arrays.sort(num);
    System.out.println("Elements of array sorted in ascending order: ");
    for (int i = 0; i < num.length; i++) {
      System.out.println(num[i]);
    }
	}
}
