package linkedLists;

public class DoubleLinkedListMain {

	public static void main(String[] args) {
		
		DoubleLinkedList dll = new DoubleLinkedList();
		dll.createDoubleLinkedList(5);
		dll.traverseDoubleLinkedList();
		
		dll.insertNodeDoubleLinkedList(10, 2);
		dll.traverseDoubleLinkedList();
		
		dll.insertNodeDoubleLinkedList(30, 3); 
		dll.traverseDoubleLinkedList();
		  
		dll.insertNodeDoubleLinkedList(40, 2); 
		dll.traverseDoubleLinkedList();


	}

}
