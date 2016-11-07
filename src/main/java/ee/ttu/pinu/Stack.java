package ee.ttu.pinu;

interface Stack<E> {
	boolean empty();

	E push(E item);

	E pop();

	E peek();
}



