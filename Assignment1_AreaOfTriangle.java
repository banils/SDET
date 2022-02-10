package Assignment1;

import java.util.Scanner;

public class Assignment1_AreaOfTriangle {

	public static void main(String args[]) {
    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base of Triangle:");
		double base = sc.nextDouble();
		System.out.println("Enter the Height of Triangle:");
		double height = sc.nextDouble();

		double area = (base * height) / 2;
		System.out.println("Area of Triangle calculated is: " + area);
	}
}
