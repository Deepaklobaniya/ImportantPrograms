package Linkedlist;

public class Runner {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(10);
		list.insert(10);
//		list.insertAtStart(25);
//		list.insertAtStart(29);
//		list.insertAtStart(29);
		list.show();
		System.out.println("Linked list is palindrom ?: "+list.ispalindrome());
	}
}
	