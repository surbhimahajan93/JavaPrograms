import java.util.*;
/*
Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
*/
class Node{
	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
	}
	Node(){
		
	}
	
}

public class KElementLinkedList{
	public static void main(String [] args){
		Node n1 = new Node(1);
		Node n2 = new Node(5);
		Node n3 = new Node(8);
		Node n4 = new Node(10);
		Node n5 = new Node(15);
		n1.next=n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
	
		
		System.out.println(getElement(3,n1).data);
	}
	
	public static Node getElement(int k, Node n1){
		Node n = n1;
		int count = 0;
		while(n != null){
			count++;
			if(count == k){
				return n;
			}
			else{
				n = n.next;
			}
		}
		return null;
	}
	
}