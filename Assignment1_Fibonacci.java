package Assignment1;

import java.util.Scanner;

public class Assignment1_Fibonacci {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values :");
        int a = sc.nextInt();
        int firstNum = 0, secondNum = 1;
        System.out.print("Fibanocci Series for " + a + " values : ");

        for (int i = 1; i <= a; ++i)
        {
            System.out.print(firstNum + ", ");
            int total = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = total;
        }
    }
}
