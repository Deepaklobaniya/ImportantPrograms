package nqtproblems;
import java.util.*;
class Node{
	int data;
	Node next;
}
public class linkedlist {
	Node head;
	
	public void insert(int data) {
		Node node = new Node();
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
	 
	public void show() {
		Node node = head;
		while(node.next != null) {
			System.out.print(node.data+"->");
			node = node.next;
		}
		System.out.println(node.data+"->"+null);
	}

	public static void main(String[] args) {
		linkedlist list = new linkedlist();
		list.insert(10);
		list.insert(20);
		list.insert(100);
		list.insert(500);
		list.insert(10000);
		list.show();
	}
}
