package ee.ttu.pinu;

import java.util.ArrayList;

public class Stack {
	ArrayList<Object> list = new ArrayList<Object>();

	public boolean empty() {
		return list.size() == 0;
	}

	public Object push(Object object) {
		list.add(object);
		return object;
	}

	public Object pop() {
		Object object = peek();
		if (object != null) {
			list.remove(list.size() - 1);
		}
		return object;
	}

	public Object peek() {
		return empty() ? null : list.get(list.size() - 1);
	}
}
