package Assignment2;

public class Assignment2_AverageOfNumbers {
	
	public static void main (String[] args) {
    
        double[] numbers = {1, 2, 3, 4, 5};
        double total = 0;
        for (int i=0; i<numbers.length; i++){
        	total = total + numbers[i];
        }
        double average = total / numbers.length;
        System.out.format("The average of numbers is: %.2f", average);
    }
}
