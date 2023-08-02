package Java2Novice;

public class RemoveLastNode {
	
	static class Node{
		Node next;
		int data;
		Node (int temp)
		{
			data=temp;
		}
	}
	
	public static void printlinkedList(Node head)
	{
		while(head!=null)
		{
			System.out.println(head.data+" ");
			head=head.next;
		}
	}
	
	public static Node removeLastNode(Node head)
	{
		 if(head == null || head.next == null) {
	            return null;
	        }
	        // Find the second last node
	      /*  Node temp = head;
	        while(temp.next.next != null) {
	            temp = temp.next;
	        }
	        // change the second last node next pointer to null
	        temp.next = null;*/
		 while(head.next.next != null) {
	            head = head.next;
	        }
	        // change the second last node next pointer to null
	        head.next = null;
	 
	        return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1= new Node(23);
		Node n2= new Node(26);
		Node n3= new Node(33);
		Node n4= new Node(45);
		Node n5= new Node(10);
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		
		System.out.println("Given linked list is:");
		printlinkedList(n1);
		removeLastNode(n1);
		System.out.println("Lisked list after removal of last node");
		printlinkedList(n1);
	}

}
