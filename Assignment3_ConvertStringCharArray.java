package Assignment3;

public class Assignment3_ConvertStringCharArray {
  
	public static void main(String[] args) {
		
		char[] ch = { 'B', 'R', 'O', 'A', 'D', 'R', 'I', 'D', 'G', 'E' };
		String str = new String(ch);
		System.out.println("Char Array converted to String : "+str);
    
		char c[] = str.toCharArray();
		System.out.println("String converted to Char Array : ");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
