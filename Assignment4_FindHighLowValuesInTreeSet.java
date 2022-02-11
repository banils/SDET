package Assignment4;

import java.util.TreeSet;

public class Assignment4_FindHighLowValuesInTreeSet {

	public static void main(String[] args) {

		TreeSet<String> tSet = new TreeSet<String>();

		tSet.add("1");
		tSet.add("7");
		tSet.add("2");
		tSet.add("5");
		tSet.add("4");

		System.out.println("Lowest value stored in TreeSet is : " + tSet.first());

		System.out.println("Highest value stored in TreeSet is : " + tSet.last());

	}
}
