import java.util.*;

class MyStack {
	int top;
	List<Integer> arr;

	MyStack() {
		top = -1;
		arr = new ArrayList<>();
	}

	boolean push(int x) {
		arr.add(++top, x);
		return true;
	}

	int pop() {
		if (top == -1) {
			throw new EmptyStackException();
		}
		return arr.remove(top--);
	}

	int peek() {
		return arr.get(top);
	}

	int size() {
		return top;
	}

	boolean isEmpty() {
		return top == -1 ? true : false;
	}
}

class MyQueue {
	MyStack stack;
	MyStack temp;

	public MyQueue() {
		stack = new MyStack();
		temp = new MyStack();
	}

	public void push(int x) {
		stack.push(x);

	}

	public int pop() {
		if (stack.isEmpty()) {
			throw new EmptyStackException();
		}
		while (stack.size() > 0) {
			temp.push(stack.pop());
		}
		int x = stack.pop();
		while (!temp.isEmpty()) {
			stack.push(temp.pop());
		}
		return x;
	}

	public int peek() {
		while (stack.size() > 0) {
			temp.push(stack.pop());
		}
		int x = stack.peek();
		while (!temp.isEmpty()) {
			stack.push(temp.pop());
		}
		return x;
	}

	public boolean empty() {
		return stack.isEmpty();
	}
}