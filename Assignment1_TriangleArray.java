package Assignment1;

public class Assignment1_TriangleArray {
  
	public static void main(String args[]) {
    System.out.println("Triangle Array : "); 
    int n = 10;
	  printTriangle(n); 
	}
  
	public static void printTriangle(int n) { 
  	for (int i = 0; i < n; i++) 
	  { 
	    for (int j = n - i; j > 1; j--) 
	    { 
	      System.out.print(" "); 
	    } 
	    for (int j = 0; j <= i; j++) 
	    { 
	      System.out.print("0 "); 
	    } 
	    System.out.println(); 
	  }
	}
}
