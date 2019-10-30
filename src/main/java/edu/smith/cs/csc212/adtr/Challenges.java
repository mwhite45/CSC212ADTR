package edu.smith.cs.csc212.adtr;

import edu.smith.cs.csc212.adtr.real.JavaMap;
import edu.smith.cs.csc212.adtr.real.JavaSet;

public class Challenges {

	/**
	 * Create our SetADT made up of left and right sets. The union of two sets is the set of elements that either contains.
	 * @param left
	 * @param right
	 * @return
	 */
	
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
	
	/**
	 * Create our SetADT made up of left and right sets. The intersection of two sets is the set of elements that both contain.
	 * @param left
	 * @param right
	 * @return
	 */
	public static SetADT<Integer> intersection(SetADT<Integer> left, SetADT<Integer> right) {
		SetADT<Integer> output = new JavaSet<>();
		for (Integer i: left) {
			if (right.contains(i)) {
				output.insert(i);
			}
		}
		
		return output;
	}
	
	/**
	 * Create our MapADT made up of wordCount list. Counts the words in the input list and outputs them into the map.
	 * @param words
	 * @return
	 */
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
