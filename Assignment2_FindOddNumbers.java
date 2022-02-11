package Assignment2;

public class Assignment2_FindOddNumbers {

	public static void main(String[] args) {
    
		int i, num;
		i = 79;
    num = 187;
		System.out.print("Odd numbers between " + i + " and " + num + " are : ");
    while (i <= num) {
			System.out.print(i + " ");
			i = i + 2;
		}
    
	}
}
