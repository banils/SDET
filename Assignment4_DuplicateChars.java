package Assignment4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 
public class Assignment4_DuplicateChars {
 
  public void countDupChars(String str){
 
    Map<Character, Integer> map = new HashMap<Character, Integer>(); 
    char[] chars = str.toCharArray();
    for(Character ch:chars){
      if(map.containsKey(ch)){
         map.put(ch, map.get(ch)+1);
      } else {
         map.put(ch, 1);
        }
    }

    Set<Character> keys = map.keySet();
    for(Character ch:keys){
      if(map.get(ch) > 1){
        System.out.println("Char "+ch+" "+map.get(ch));
      }
    }
  }
 
  public static void main (String args[]) {
	  Assignment4_DuplicateChars obj = new Assignment4_DuplicateChars();
    System.out.println("String: ANIL.CHARAN");
    System.out.println("-------------------------");
    obj.countDupChars("ANIL.CHARAN");
  
    System.out.println("\nString: Broadridge");
    System.out.println("-------------------------");
    obj.countDupChars("Broadridge");
 
    System.out.println("\nString: #@$@!#$%!!%@");
    System.out.println("-------------------------");
    obj.countDupChars("#@$@!#$%!!%@");
  }
}
