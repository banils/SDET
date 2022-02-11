package Assignment4;

import java.util.*;

public class Assignment4_ArrayListSorting  {

	public static void main(String args[]){
    
	   ArrayList<String> listofcountries = new ArrayList<String>();
	   listofcountries.add("India");
	   listofcountries.add("America");
	   listofcountries.add("Canada");
	   listofcountries.add("Singapore");

	   System.out.println("Before Sorting:");
	   for(String counter: listofcountries) {
            System.out.println(counter);
           }

	   Collections.sort(listofcountries);
	  
	   System.out.println("After Sorting:");
	   for(String counter: listofcountries) {
            System.out.println(counter);
           }
	}
}
