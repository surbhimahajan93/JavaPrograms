/*

Stack Min: How would you design a stack which, in addition to push and pop, has a function min
which returns the minimum element? Push, pop and min should all operate in 0(1) time.

*/
class Stack{
	List<Integer> list;
	int top;
	Map<Integer,Integer> map;

	Stack(){
		list = new ArrayList<>();
		map = new HashMap<>();
		top = -1;
	}

	boolean isEmpty(){
		return list.isEmpty();
	}

	void push(int x){
		int min = calculateMin(x);
		list.add(++top,x);
		map.put(top,min);
	}

	boolean pop(){
		if(top == -1){
			return false;
		}
		
		list.remove(top);
		map.remove(top);
		top--;
		return true;	
	}
	
	int min(){
		if(top == -1) {
			throw new EmptyStackException();
		}
		return map.get(top);
	}

	private int calculateMin(int x){
		if(top == -1){
			return x;
		}
		return Math.min(map.get(top),x);		

	}

}
