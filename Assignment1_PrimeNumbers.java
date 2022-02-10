package Assignment1;

public class Assignment1_PrimeNumbers {

	public static void main(String[] args) {

		int a = 0;
		int b = 30;
		for (int i = a; i <= b; i++) {
			if (i == 0 || i == 1)
				continue;
			boolean flag = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true)
				System.out.print(i + " ");
		}
	}
}
