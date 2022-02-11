package Assignment4;

import java.util.HashMap;

public class Assignment4_KeyExistInHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

		hashmap.put(11, "Anil");
		hashmap.put(22, "Charan");
		hashmap.put(33, "Teja");
		hashmap.put(44, "Mohan");
		hashmap.put(55, "Venkat");

		boolean flag = hashmap.containsKey(22);
		System.out.println("Key 22 exists in HashMap? : " + flag);
		boolean flag2 = hashmap.containsKey(55);
		System.out.println("Key 55 exists in HashMap? : " + flag2);
		boolean flag3 = hashmap.containsKey(99);
		System.out.println("Key 99 exists in HashMap? : " + flag3);
	}
}
