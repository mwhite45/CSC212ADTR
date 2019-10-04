package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {
	
	// you might want this.
	void assertIntEq(int x, int y) {
		assertEquals(x, y);
	}

	@Test
	public void testEmpty() {
		MapADT<String, String> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
		//Assert.assert
	}
	
	@Test
	public void testGetNumbers() {
		//squares.get returns capital integer
		// setup the situation
		MapADT<Integer, Integer> squares = new JavaMap<>();
		squares.put(4, 16);
		squares.put(5, 25);
		squares.put(6, 36);
		
		//junit: assertEquals tries ot work on everything
		//assertEquals(int, int)
		//assertEquals(Object, Object)
		// this line is ambiguous 
		//assertEquals(25, squares.get(5)); doesn't work with Java
		
		//solutions
		assertIntEq(25, squares.get(5));
		//or
		assertEquals(25, (int) squares.get(5)); //please turn into a lower case integer.
		//or
		assertEquals((Integer) 25, squares.get(5));
		
	}
	
	@Test
	public void testPutNumbers() {
		// setup the situation
		MapADT<Integer, Integer> squares2 = new JavaMap<>();
		squares2.put(4, 16);
		squares2.put(5, 25);
		squares2.put(6, 36);
		squares2.put(6, 40);
		
		//can't have multiple of same key with different values
		//crashes
		//assertIntEq(36, squares2.get(6));
		
		//for contains use get - and see if null
		//true
		assertNotNull(squares2.get(5));
		
		assertEquals(3, squares2.size());
		
		
	}
	
	@Test
	public void testsizeMap() {
		// setup the situation
		MapADT<Integer, Integer> squares3 = new JavaMap<>();
		squares3.put(4, 16);
		squares3.put(5, 25);
		squares3.put(6, 36);
		squares3.put(6, 40);
		
		//crashes
		//assertEquals(4, squares3.size());
		//true
		assertEquals(3, squares3.size());
		
	}
	
	@Test
	public void testRemove() {
		// setup the situation
		MapADT<Integer, Integer> squares4 = new JavaMap<>();
		squares4.put(4, 16);
		squares4.put(5, 25);
		squares4.put(6, 36);
		squares4.put(6, 40);
		
		squares4.remove(6);
		
		assertEquals(3, squares4.size());
	}
	
	
}
