/**
 * This class is using JUnit4
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Vlad
 *
 */
public class TestRemoveCharFromString {
	
	public static RemoveCharFromString rcfs;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 rcfs = new RemoveCharFromString();
	}

	@AfterClass
	public static void tearDownAfterClass() {
	}

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	
	@Test
	public void test() {
		assertEquals("Ale interview", rcfs.RemCharMethod1("Apple interview", 'p'));
		assertEquals("Ale interview", rcfs.RemCharMethod2("Apple interview", 'p'));

		assertEquals("Appl intrviw", rcfs.RemCharMethod1("Apple interview", 'e'));
		assertEquals("Appl intrviw", rcfs.RemCharMethod2("Apple interview", 'e'));

		assertEquals("Apple interview", rcfs.RemCharMethod1("Apple interview", 'x'));
		assertEquals("Apple interview", rcfs.RemCharMethod2("Apple interview", 'x'));

		assertEquals("bc bc", rcfs.RemCharMethod1("abc abc", 'a'));
		assertEquals("bc bc", rcfs.RemCharMethod2("abc abc", 'a'));

		assertEquals("ab ab", rcfs.RemCharMethod1("abc abc", 'c'));
		assertEquals("ab ab", rcfs.RemCharMethod2("abc abc", 'c'));

		assertEquals("", rcfs.RemCharMethod1("", ' '));
		assertEquals("", rcfs.RemCharMethod2("", ' '));

		assertEquals("", rcfs.RemCharMethod1(" ", ' '));
		assertEquals("", rcfs.RemCharMethod2(" ", ' '));

		assertEquals(null, rcfs.RemCharMethod1(null, ' '));
		assertEquals(null, rcfs.RemCharMethod2(null, ' '));
	}

}
