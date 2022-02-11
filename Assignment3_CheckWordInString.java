package Assignment3;

public class Assignment3_CheckWordInString {
  
	public static void main(String[] args) {
    
		String str = "A brown fox ran away fast";
		int intIndex = str.indexOf("brown");
		if(intIndex == - 1) 
			System.out.println("brown not found");
		else 
			System.out.println("Found brown at index: "+ intIndex);

	}
}
