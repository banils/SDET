package Assignment1;

public class Assignment1_SumOfNaturalNumbers {
  
	public static void main(String[] args) {

		int num = 20, count = 1, total = 0;
		while (count <= num) {
			total = total + count;
			count++;
		}
		System.out.println("Sum of First 20 Natural Numbers is: " + total);
	}
}
