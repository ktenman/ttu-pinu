package ee.ttu.pinu;

import java.util.ArrayList;

class Stack {
	private final ArrayList<Object> list = new ArrayList<Object>();

	boolean empty() {
		return list.size() == 0;
	}

	Object push(Object object) {
		list.add(object);
		return object;
	}

	Object pop() {
		Object object = peek();
		if (object != null) {
			list.remove(list.size() - 1);
		}
		return object;
	}

	Object peek() {
		return empty() ? null : list.get(list.size() - 1);
	}

}
