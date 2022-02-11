package Assignment4;

import java.util.*;

public class Assignment4_ConvertMapToList {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Anil");
        map.put(2, "Charan");
        map.put(3, "Teja");
        map.put(4, "Mohan");
        map.put(5, "Venkata");

        List<Integer> keyList = new ArrayList(map.keySet());
        List<String> valueList = new ArrayList(map.values());

        System.out.println("Key List: " + keyList);
        System.out.println("Value List: " + valueList);

    }
}
