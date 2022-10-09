package ll;

public class lList {
	
	Node head;
	
	public void insert(int data) {
		Node node = new Node(data);
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		}
		
		else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public void del(int data) {
		Node node = new Node(data);
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		}
		
		else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
				n.next.next = n.next; 
			}
			n.next = node;
		}
	}
	
	public void show() {
		while(head.next != null) {
			System.out.print(head.data+"->");
			head = head.next;
		}
		System.out.println(head.data);
	}
	
	public static void main(String[] args) {
		lList ob = new lList();
		ob.insert(10);
		ob.insert(20);
		ob.insert(30);
		ob.insert(40);
		ob.del(20);
		ob.show();
	}
}
