package stack_using_linkedList;

import linkedLists.SingleLinkedList;
import node.SingleNode;

public class StackByLinkedList {

	SingleLinkedList list;
	SingleNode head;

	// create empty stack
	public StackByLinkedList() {
		list = new SingleLinkedList();
	}

	// push
	public void push(int value) {
		if (list.getHead() == null) {
			list.createSingleLinkedList(value);
		} else {
			list.insertInLinkedList(value, 0);
		}
	}

	// pop
	public void pop() {
		if (!isStackEmpty()) {
			System.out.println("popping the 1st node");
			list.deletionOfNode(0);
		} else {
			System.out.println("The linked list doesn't exist");
		}
	}

	public boolean isStackEmpty() {
		return list.getHead() == null;

	}

	// no isStackFull in linked list because , in linked list you can keep adding
	// nodes so stack implemented using linked list can never be full

	public void peek() {
		if(!isStackEmpty())
		System.out.println("the 1st node of list hold value " + list.getHead().getValue());
		else
			System.out.println("The stack is empty");
	}

	public void deleteEntireStack() {
		System.out.println("deleting the entire linked list");
		list.setHead(null);
		System.out.println("successfully deleted the entire linked list");
	}

}
