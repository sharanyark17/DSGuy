package linkedLists;

import node.SingleNode;

public class SingleCircularLinkedListMain {

	public static void main(String[] args) {
		SingleCircularLinkedList CLinkedList = new SingleCircularLinkedList();
		CLinkedList.createSingleLinkedList(5);
		CLinkedList.traverseSCLL();
		
		CLinkedList.insertIntoLinkedList(10, 2);
		CLinkedList.traverseSCLL();
		
		CLinkedList.insertIntoLinkedList(30, 3);
		CLinkedList.traverseSCLL();
		
		CLinkedList.insertIntoLinkedList(40, 2);
		CLinkedList.traverseSCLL();
		
		/*
		 * CLinkedList.insertIntoLinkedList(50, 1); 
		 * CLinkedList.traverseSCLL();
		 */
		
		CLinkedList.searchForValue(10);
		CLinkedList.searchForValue(5);
		
		/*
		 * CLinkedList.deleteLinkedList(); 
		 * CLinkedList.traverseSCLL();
		 */
		
		CLinkedList.deleteNodeFromList(2);
		CLinkedList.traverseSCLL();
		
		

	}

}
