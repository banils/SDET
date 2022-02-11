package Assignment2;

public class Assignment2_FindDuplicatesInArray {
  
	public static void main(String[] args) {
    
		int[] numbers = { 12, 32, 12, 45, 65, 93, 0, 23, 45, 6 };
		for (int i = 0; i < numbers.length - 1; i++) 
		{
		  for (int j = i + 1; j < numbers.length; j++) 
		  {
		    if ((numbers[i] == numbers[j]) && (i != j)) 
		    {
		      System.out.println("Duplicate Element in Array is : " + numbers[j]);
		    }
		  }
		}
    
	}
}
