public class Node {
    int data;
	Node next;
	Node(int x) 
		{ val = x; }
  }
  
  
class SortedLinkedList {

	public Node deleteDuplicates(Node head) {
		Node n = head;
		Set<Integer> set = new HashSet<>();
		Node prev = null;
		while (n != null) {
			if(set.contains(n.data)){
				prev.next = n.next;
			}
			else{
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}
		
		return head;
	}
	


}