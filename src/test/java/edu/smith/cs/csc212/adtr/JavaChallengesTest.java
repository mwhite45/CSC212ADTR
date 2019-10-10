package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;

//import java.util.Arrays;

//import org.junit.Assert;
import org.junit.Test;
import edu.smith.cs.csc212.adtr.Challenges;
import edu.smith.cs.csc212.adtr.real.JavaList;
//import edu.smith.cs.csc212.adtr.real.JavaMap;
import edu.smith.cs.csc212.adtr.real.JavaSet;



public class JavaChallengesTest {
	
	
	@Test
	public void testIntersection() {

		SetADT<Integer> left = new JavaSet<>();
		SetADT<Integer> right = new JavaSet<>();
		left.insert(1);
		right.insert(2);
		left.insert(3);
		right.insert(4);
		left.insert(5);
		right.insert(5);
		SetADT<Integer> output = Challenges.intersection(left, right);
		
		assertEquals(1, output.size());
		
	}
	
	@Test
	public void testUnion() {
		// set up the situation
		SetADT<Integer> left = new JavaSet<>();
		SetADT<Integer> right = new JavaSet<>();
		left.insert(1);
		right.insert(2);
		left.insert(3);
		right.insert(4);
		//to add to center vex, add to both sides?
		left.insert(5);
		right.insert(5);
		SetADT<Integer> output = Challenges.union(left, right);

		assertEquals(5, output.size());
		
		
	}
	
	@Test
	public void testWordCount() {
		ListADT<String> words = new JavaList<>();
		words.addBack("a");
		words.addBack("b");
		words.addBack("c");
		words.addBack("a");
		words.addBack("a");
		words.addBack("b");
		MapADT<String, Integer> output = Challenges.wordCount(words);
		
		JavaMapTest.assertIntEq(3, output.get("a"));
		
		
	}

}
