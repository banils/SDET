package Assignment1;

public class Assignment1_EvenNumbers {
  
	public static void main(String args[]) {
    
		int x = 50;
		System.out.println("Even Numbers from 1 to " + x + " are: ");
    
		for (int i = 1; i <= x; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
    
	}
}
