package singleLinkedList;


public class SingleLinkedListMain {

	public static void main(String[] args) {
		
		SingleLinkedList list = new SingleLinkedList();
		
		// creating new SLL
		list.createSingleLinkedList(5);
		list.traverseLinkedList();
		
		// inserting into a SLL 
		list.insertInLinkedList(10, 1);
		list.traverseLinkedList();
		
		list.insertInLinkedList(20, 2);
		list.traverseLinkedList();

		list.insertInLinkedList(30, 2);
		list.traverseLinkedList();

		list.insertInLinkedList(40, 1);
		list.traverseLinkedList();

		list.traverseLinkedList();
		System.out.println();
		
		 
		
	}

}
