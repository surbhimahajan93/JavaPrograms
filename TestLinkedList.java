class LinkedList{
	Node head;
	
	static class Node {
		int data;
		Node next;
		public Node(int data){
			this.data = data;
		}
	}
	static LinkedList insertNode(LinkedList list, int d){
		Node newNode = new Node(d);
		if(list.head == null){
			list.head = newNode;
		}
		else{
			Node current = list.head;
			while(current.next != null){
				current = current.next;
			}
			current.next = newNode;
		}
		return list;
	}
	
	static LinkedList deleteNode(LinkedList list, int d){
		Node current = list.head;
		Node prevNode = null;
		if(current != null && current.data == d){
			list.head = current.next;
		}
		else{
			
			while(current.next != null && current.data != d){
				prevNode = current;
				current = current.next;	
			}
			if(current != null)
			prevNode.next = current.next;
			else{
				System.out.println("Not found");
			}
		}
		return list;
	}
	
	static void printElements(LinkedList list){
		Node current = list.head;
		while( current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}
}

public class TestLinkedList{
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list.insertNode(list,1);
		list.insertNode(list,2);
		list.insertNode(list,3);
		list.insertNode(list,2);
		list.insertNode(list,8);
		list.insertNode(list,2);
		list.insertNode(list,1);
		list.insertNode(list,9);
		list.insertNode(list,8);
		list.printElements(list);
		
	
		
	}
	
	
}