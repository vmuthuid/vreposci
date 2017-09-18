/**
 * 
 */
package com.vel.tries.mm.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author vmuthu
 *
 */
public class UtilTest {

	Util util = new Util();
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddPass() {
		int result = util.add(2,3);
		assertEquals(5, result);
	}

	@Test
	public void testAddMismatch() {
		int result = util.add(3,3);
		assertNotSame(result, 5);
	}
	
	@Test
	public void testAddComplexPass() {
		int result = util.addcommplex(2,3);
		assertEquals(5, result);
	}

}
