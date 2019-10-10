package edu.smith.cs.csc212.adtr;

import edu.smith.cs.csc212.adtr.real.JavaMap;
import edu.smith.cs.csc212.adtr.real.JavaSet;

public class Challenges {

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
		for (String word: words) {
			//gets amount of times word is seen
			Integer wordCount = output.get(word);
			if (wordCount == null) {
				//if first time, it will be null so we set to 1
				output.put(word, 1);
			} else {
				output.put(word, wordCount + 1); //put actually puts it in the list
			}
		}
		
		return output;
	}
}
