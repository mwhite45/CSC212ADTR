package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {
	
	
	@Test
	public void testEmpty() {
		// setup the situation
		SetADT<String> empty = new JavaSet<>();
		
		//make sure it makes sense
		assertEquals(0, empty.size());
		
		
	}
	
	@Test
	public void testSize1() {
		// setup the situation
		SetADT<String> single = new JavaSet<>();
		single.insert("Z");
		
		// left: expected. right: actual
		assertEquals(1, single.size());
	}
	
	@Test
	public void testInsert1() {
		// test wont tell you (if can't get data into it)
		// setup the situation 
		SetADT<String> single2 = new JavaSet<>();
		single2.insert("A");
		single2.insert("B");
		
		//true
		assertEquals(2, single2.size());
		
	}
	
	@Test
	public void testRepeatedInsert() {
		//sets don't let you add repeated things.
		// setup the situation
		SetADT<String> items = new JavaSet<>();
		items.insert("A");
		items.insert("B");
		items.insert("C");
		items.insert("C");
		
		// No matter what, "C" can't be added twice.
		items.insert("C");
		assertEquals(3, items.size());
		
		//double checking - same as for loop
		items.insert("C");
		assertEquals(3, items.size());
		
		assertEquals(3, items.size());
		assertEquals(true, items.contains("A"));
		assertEquals(true, items.contains("B"));
		assertEquals(true, items.contains("C"));
		
	}
	
	@Test
	public void testContains() {
		// setup the situation
		SetADT<String> items2 = new JavaSet<>();
		items2.insert("A");
		items2.insert("B");
		
		assertEquals(true, items2.contains("A"));
		assertEquals(true, items2.contains("B"));
		
		//true
		assertEquals(false, items2.contains("C"));
		
	}
	
	@Test
	public void testRemove() {
		// setup the situation
		SetADT<String> items3 = new JavaSet<>();
		items3.insert("A");
		items3.insert("B");
		
		items3.remove("A");
		
		//true
		assertEquals(false, items3.contains("A"));
		
		
	} 
	
	
}
