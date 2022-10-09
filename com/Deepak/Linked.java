package com.Deepak;

import com.Deepak.LinkedList.Node;

public class Linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Node head;
	public void insert(int data) {
		
		Node node = new Node(data);
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		}
		
		Node n = head;
		while(n.next != null) {
			n = n.next;
		}
		n.next = node;
	}
}
