import java.util.*;

/*

Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but
the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
that node.
EXAMPLE
lnput:the node c from the linked lista->b->c->d->e->f
Result: nothing is returned, but the new linked list looks like a->b->d->e- >f

*/
class Node{
	char data;
	Node next;
	
	public Node(char data){
		this.data = data;
	}
	Node(){
		
	}
	
}

public class MiddleNode{
	public static void main(String [] args){
		Node n1 = new Node('a');
		Node n2 = new Node('b');
		Node n3 = new Node('c');
		Node n4 = new Node('d');
		Node n5 = new Node('e');
		Node n6 = new Node('f');
		Node n7 = new Node('g');
		n1.next=n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
	
		n1 = removeMiddleNode(n1);
		 while (n1 != null) 
        { 
            System.out.print(n1.data+" "); 
            n1 = n1.next; 
        } 
	}
	
	public static Node removeMiddleNode(Node n1){
		if(n1 == null){
			return n1;
		}
		Node n = n1;
		int count = 0;
		Node prev = null;
		while(n != null){
				count++;
				n = n.next;
			}
		int c =1;
		Node middle = n1;
		while(c < count/2){
			prev = middle;
			middle = middle.next;
			c++;
		}
        prev.next = middle.next; 
		return n1;
	}
}