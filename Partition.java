class Partition{
/*

Partition: Write code to partition a linked list around a value x, such that all nodes less than x come
before all nodes greater than or equal to x. If x is contained within the list, the values of x only need
to be after the elements less than x (see below). The partition element x can appear anywhere in the
"right partition"; it does not need to appear between the left and right partitions.
*/
	public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        
		ListNode head = new ListNode(0);
		ListNode n = head;
		int carry = 0;
		while(l1 != null && l2 != null){
			int sum1 = l1 != null ? l1.val : 0;
			int sum2 = l2 != null ? l2.val : 0;
			int total = sum1 + sum2 + carry;
			carry = total /10;
			ListNode newVal = new ListNode(total %10);
			n.next = newVal;
            n = n.next;
		 	if(l1 != null){
				l1 = l1.next;
			}
			if(l2 != null){
				l2 = l2.next;
			}
			
		}
		if(carry >0){
			ListNode carryNode = new ListNode(carry);
			n.next = carryNode;
		}
        return head.next;
	}

}