package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import edu.smith.cs.csc212.adtr.Challenges;
import edu.smith.cs.csc212.adtr.real.JavaSet;



public class JavaChallengesTest {
	
	
	@Test
	public void testIntersection() {
		SetADT<Integer> output = new JavaSet<>();
		SetADT<Integer> left = new JavaSet<>();
		SetADT<Integer> right = new JavaSet<>();
		left.insert(1);
		right.insert(2);
		left.insert(3);
		right.insert(4);
		//to add to center vex, add to both sides?
		left.insert(5);
		right.insert(5);
		
	}
	
	@Test
	public void testUnion() {
		// set up the situation
		SetADT<Integer> output = new JavaSet<>();
		SetADT<Integer> left = new JavaSet<>();
		SetADT<Integer> right = new JavaSet<>();
		left.insert(1);
		right.insert(2);
		left.insert(3);
		right.insert(4);
		//to add to center vex, add to both sides?
		left.insert(5);
		right.insert(5);
		
		
		
	}
	
	@Test
	public void testWordCount() {
		
	}

}
