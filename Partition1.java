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
