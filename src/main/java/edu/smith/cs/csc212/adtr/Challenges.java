package edu.smith.cs.csc212.adtr;

import edu.smith.cs.csc212.adtr.real.JavaMap;
import edu.smith.cs.csc212.adtr.real.JavaSet;

public class Challenges {
	
	int count;
	String[] splitWords;

	// The union of two sets is the set of elements that either contains.
	public static SetADT<Integer> union(SetADT<Integer> left, SetADT<Integer> right) {
		SetADT<Integer> output = new JavaSet<>();
		
		//because elements in sets cannot be repeated, both for loops cover the middle area.
		for (Integer i: left) {
			output.insert(i);
		}
		for (Integer i: right) {
			output.insert(i);
		}
		
		return output;
	}
	
	// The intersection of two sets is the set of elements that both contain.
	public static SetADT<Integer> intersection(SetADT<Integer> left, SetADT<Integer> right) {
		SetADT<Integer> output = new JavaSet<>();
		for (Integer i: left) {
			if (right.contains(i)) {
				output.insert(i);
			}
		}
		
		return output;
	}
	
	// Count the words in the input list and put them in the map.
	//slides page 14
	public static MapADT<String, Integer> wordCount(ListADT<String> words) {
		MapADT<String, Integer> output = new JavaMap<>();
		int count = 0;
		String[] splitWords = words.split("\\s+");
		
		if (words == null || words.isEmpty()) {
			return 0; //method return type not integer. Fix
		} else {
			//for (String word: words) {}
			return splitWords.length;
		}
		
		//return output;
	}
}
