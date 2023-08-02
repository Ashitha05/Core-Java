package Java2Novice;



public class MidelementLinkedList {
	
	static class Node {
		int data;
		Node next;
		Node(int temp){
			data=temp;
		}
		public static void findMidEle(Node head)
		{
			Node singIncNode = head;
	        Node doubIncNode = head;
	        if(head == null) {
	            System.out.println("The haed node is null, no elements in the linked list");
	        }
	 
	        while(doubIncNode != null && doubIncNode.next != null) {
	            doubIncNode = doubIncNode.next.next;
	            singIncNode = singIncNode.next;
	        }
	        System.out.println("Middle Element: "+ singIncNode.data);

		}
		public static void main(String[] args) {
			Node n1= new Node(23);
			Node n2= new Node(26);
			Node n3= new Node(33);
			Node n4= new Node(45);
			Node n5= new Node(10);
			//Node n6= new Node(30);
			
			n1.next=n2;
			n2.next=n3;
			n3.next=n4;
			n4.next=n5;
			//n5.next=n6;
			findMidEle(n1);
			
		}
	}

}
