package Assignment3;

public class Assignment3_NumberFormatException {
  
  public static void main (String args[]) {
    
    String str1= "10";
    int x = Integer.parseInt(str1);
    System.out.println(x*x);
    try
    {
      String str2= "ten";
      int y = Integer.parseInt(str2);
    }
    catch(NumberFormatException e)
    {
      System.err.println("Unable to format " + e);
    }
  }
}
