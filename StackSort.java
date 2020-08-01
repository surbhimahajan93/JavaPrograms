
import java.util.*;

public class DoNotCommit {

	public static void main(String args[]) {
		Stack s = new Stack(5);
		s.push(48);
		s.push(36);
		s.push(1);
		s.push(-1);
		s.push(0);
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}

	public static int[] sort(Stack s) {
		int length = s.length();
		divideArray(s.getArr(), 0, length - 1);
		return s.getArr();

	}

	public static int[] divideArray(int[] arr, int lIndex, int hIndex) {
		if (lIndex < hIndex) {
			int middle = lIndex + (hIndex - lIndex) / 2;
			divideArray(arr, lIndex, middle);
			divideArray(arr, middle + 1, hIndex);
			mergeArray(arr, lIndex, middle, hIndex);

		}
		return arr;
	}

	public static int[] mergeArray(int[] arr, int lIndex, int middle, int hIndex) {
		int[] tempArr = new int[arr.length];
		System.arraycopy(arr, 0, tempArr, 0, arr.length);
		int start = lIndex;
		int end = middle + 1;
		int i = lIndex;
		;
		while (start <= middle && end <= hIndex) {
			if (tempArr[start] <= tempArr[end]) {
				arr[i] = tempArr[start];
				start++;
			} else {
				arr[i] = tempArr[end];
				end++;
			}
			i++;
		}
		while (start <= middle) {
			arr[i] = tempArr[start];
			i++;
			start++;
		}
		return arr;
	}
}

class Stack {

	private int[] arr;
	private int top;

	int length() {
		return top + 1;
	}

	Stack(int n) {
		this.arr = new int[n];
		this.top = -1;
	}

	boolean isEmpty() {
		return top == -1 ? true : false;

	}

	void push(int x) {
		arr[++top] = x;
	}

	int pop() {
		if (top == -1) {
			throw new EmptyStackException();
		}

		return arr[top--];
	}

	int peek() {
		return arr[top];
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}
}
