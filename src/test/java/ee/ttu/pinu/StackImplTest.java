package ee.ttu.pinu;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackImplTest {

	private StackImpl stackImpl;

	@Before
	public void setUp() {
		stackImpl = new StackImpl();
	}

	@Test
	public void pop() {
		stackImpl.push(1);
		stackImpl.push(2);
		assertEquals(2, stackImpl.pop());
		assertEquals(1, stackImpl.peek());
	}

	@Test
	public void push() {
		assertEquals("2",stackImpl.push("2"));
	}

	@Test
	public void empty() {
		assertEquals(true, stackImpl.empty());
		stackImpl.push("5");
		assertEquals(false, stackImpl.empty());
	}

	@Test
	public void peek() {
		assertEquals(null, stackImpl.peek());
		stackImpl.push(5);
		assertEquals(5, stackImpl.peek());
	}

}
