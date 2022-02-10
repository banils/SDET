package Assignment1;

public class Factorial {
	public static void main(String[] args) {
		int number = 5;
		long initialnumber = 1;
		int i = 1;
		while (i <= number) {
			initialnumber = initialnumber * i;
			i++;
		}
		System.out.println("Factorial of " + number + " is: " + initialnumber);
	}
}
