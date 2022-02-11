package Assignment4;

import java.util.*;

public class Assignment4_ReverseArrayList {
  
    public static void main(String[] args) {
      
        //Creating an ArrayList object         
        ArrayList<String> arrlist = new ArrayList<String>(); 
      
        //Adding elements to ArrayList object 
        arrlist.add("Anil");         
        arrlist.add("Charan");        
        arrlist.add("Broadridge");
        arrlist.add("DevLabAlliance");
        arrlist.add("SDET");         
        arrlist.add("Training");
                 
        //Displaying ArrayList Before Reverse
        System.out.println("Before Reverse ArrayList:");         
        System.out.println(arrlist);

        /*Reversing the list using Collections.reverse() method*/         
        Collections.reverse(arrlist);

        //Displaying ArrayList After Reverse
        System.out.println("After Reverse ArrayList:");         
        System.out.println(arrlist);
    }
} 
