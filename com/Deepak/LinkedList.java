package com.Deepak;
class LinkedList{
    class Node{
	int data;
	Node next; } 
	Node head;
	public void insertAtBeg(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(head == null) {
			head = node;
		}
		else{
			Node n = head;
			while(n.next != null) {
				size++;
			 	n = n.next;
			}
			n.next = node;
		}
	}
	private int size=0;
	public int get(int index) {
		if(index>= size) {
			return -1;
		}
		else {
			Node curr = head;
			for(int i=0; i<index; i++) {
				curr = curr.next;				
			}
			return curr.data;
		}
	}
	public void show() {
	Node node = head;
			while(node.next != null) {
				size++;
				System.out.println(node.data);
			 	node = node.next;
			}
			node.next = node;
			System.out.println(node.data);			
}
	public static void main(String[] args)	{
	LinkedList list = new LinkedList();
	list.insertAtBeg(10);
	list.insertAtBeg(20);
	list.insertAtBeg(30);
	list.insertAtBeg(40);
	list.show();
	System.out.println(list.get(2));
}
}