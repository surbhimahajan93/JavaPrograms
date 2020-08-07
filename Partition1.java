
/*

Partition: Write code to partition a linked list around a value x, such that all nodes less than x come
before all nodes greater than or equal to x. If x is contained within the list, the values of x only need
to be after the elements less than x (see below). The partition element x can appear anywhere in the
"right partition"; it does not need to appear between the left and right partitions.
*/

class Partition1 {
	public ListNode partition(ListNode head, int x) {
		if(head == null || head.next == null){
			return head;
		}
		ListNode left = n,right = n,prev = n,head = n;
		while(n != null){
			if(n.val >= x){
				ListNode temp = n.next;
				right = n;
				
			}
			else{
				//ListNode temp = n.next;
				left = n;
				right.next = n.next;
				left.next = right;
				prev = n;
				n = n.next;
			}
		}

}
