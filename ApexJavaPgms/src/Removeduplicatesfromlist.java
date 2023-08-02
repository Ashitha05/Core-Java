
public class Removeduplicatesfromlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(4);
        ListNode node8 = new ListNode(4);
        ListNode node9 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;

        System.out.println("Original Linked List:");
        printLinkedList(head);
        removedup(head);
        System.out.println("Linked List after removing duplicates:");
        printLinkedList(head);
	}
public static ListNode removedup(ListNode head)
{
	ListNode cur=head;
	while(cur!=null && cur.next!=null)
	{
		
		if(cur.val==cur.next.val)
		{
			cur.next=cur.next.next;
		}
		else
			cur=cur.next;
	}
	return head;
}
public static void printLinkedList(ListNode head) {
    ListNode cur = head;

    while (cur != null) {
        System.out.print(cur.val + " -> ");
        cur = cur.next;
    }
    System.out.println("null");
}
}
