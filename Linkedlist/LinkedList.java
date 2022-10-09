package Linkedlist;

public class LinkedList {
	Node head;
	
	//Insert element at the end
	public void insert(int data) {
		Node node = new Node(data);
		node.data = data;
		node.next = null;
		if(head==null)
		{
			head = node;
		}
		else
		{
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next =  node;
		}
	}
	
	//Insert element at beginning
	public void insertAtStart(int data) {
		Node node = new Node(data);
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}
	
	//slow and fast two pointer(floyd's algos)
	public Node findMiddle(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("Middle of linked list: "+slow.data);
		return slow;
//		System.out.println("middle of linked list: " + slow.data);	
	}
	
	//reverse linked list
	public Node reverse(Node head) {
		Node curr = head;
		Node prev = null;
		
		while(curr != null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
//		while(prev.next != null) {
//			System.out.print(prev.data+" ");
//			prev = prev.next;
//		}
//		System.out.print(prev.data+" ");
	}
	
	//check palindrome linkedlist
	public boolean ispalindrome() {
		
		if(head == null) {
			System.out.println("This is not palindrome");
		}
		
		Node mid = findMiddle(head);
		Node last = reverse(mid);
		Node curr = head;
		
		while(last != null) {
			if(last.data != curr.data) {
				return false;
			}
			last = last.next;
			curr = curr.next;
		}
		
		return true;
	}
	
	//method to print element present in linked list
	public void show()
	{
		Node node = head;
		
		while(node.next!=null)
		{
			System.out.print(node.data+"->");
			node = node.next;
		}
		System.out.println(node.data+"->null");
	}
}
