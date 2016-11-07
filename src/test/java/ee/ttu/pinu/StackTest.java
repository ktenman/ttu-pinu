package ee.ttu.pinu;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {

	private Stack stack;

	@Before
	public void setUp() {
		stack = new Stack();
	}

	@Test
	public void pop() {
		stack.push(1);
		stack.push(2);
		assertEquals(2, stack.pop());
		assertEquals(1, stack.peek());
	}

	@Test
	public void push() {
		assertEquals("2", stack.push("2"));
	}

	@Test
	public void empty() {
		assertEquals(true, stack.empty());
		stack.push("5");
		assertEquals(false, stack.empty());
	}

	@Test
	public void peek() {
		assertEquals(null, stack.peek());
		stack.push(5);
		assertEquals(5, stack.peek());
	}

}
