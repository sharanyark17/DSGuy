package linkedLists;

import node.DoubleNode;

public class DoubleLinkedList {

	private DoubleNode head;
	private DoubleNode tail;
	private int size;

	// 1. create a double circular linked list
	public DoubleNode createDoubleLinkedList(int value) {
		DoubleNode node = new DoubleNode();
		head = new DoubleNode();
		tail = new DoubleNode();
		node.setValue(value);
		head = node;
		tail = node;
		setSize(1);
		return head;

	}

	// 2. check if linked list exists
	public Boolean existsDoubleLinkedList() {
		return head != null;
	}

	// 3. traverse a double linked list
	public void traverseDoubleLinkedList() {
		DoubleNode tempNode = head;
		if (existsDoubleLinkedList()) {
			for (int i = 0; i < getSize(); i++) {
				System.out.print(tempNode.getValue());
				if (i < getSize() - 1) {
					System.out.print("->");
				}
				tempNode = tempNode.getNext();
			}
		} else {
			System.out.println("linked list does not exist");
		}
		System.out.println("\n");
	}

	// 4. insert a node in the linked list
	public void insertNodeDoubleLinkedList(int value, int location) {
		DoubleNode node = new DoubleNode();
		DoubleNode tempNode = head;
		node.setValue(value);
		if (existsDoubleLinkedList()) {
			// insert at beginning
			if (location == 0) {
				node.setNext(head);
				node.setPrevious(null);
				head = node;

			} else if (location >= getSize()) {
				/*
				 * for (int i = 0; i < location - 1; i++) { tempNode = tempNode.getNext(); }
				 */
				node.setPrevious(tail.getNext());
				node.setNext(null);
				tail.setNext(node);
				tail = node;
			} else if (location < getSize()) {
				
				for (int i = 1; i < location - 1; i++) {
					tempNode = tempNode.getNext();
				}
				node.setNext(tempNode.getNext());
				node.setPrevious(tempNode);
				tempNode.getNext().setPrevious(node);
				tempNode.setNext(node);

			}

			setSize(getSize() + 1);
		}

		// insert at end
		// insert in between
	}

	// 5. search for a value
	public void searchForNode(int value) {
		if (existsDoubleLinkedList()) {
			DoubleNode tempNode = head;
			Boolean isFound = false;
			for (int i = 0; i < getSize(); i++) {
				if (tempNode.getValue() == value) {
					System.out.println("found value " + value + "at location" + i);
					isFound = true;
				}
			}
			if (isFound != true) {
				System.out.println("the value doesn't exist in the linked list");
			}
		} else {
			System.out.println("The linked list doesn't exist");
		}
	}

	// 6. Delete linked list
	public void deleteCompleteLinkedList() {
		System.out.println("deleting complete linked list");
		head = null;
		tail = null;
		System.out.println("deleted the linked list");
	}

	// 7. Delete a particular node
	public void deleteNode(int location) {
		if (existsDoubleLinkedList()) {
			DoubleNode tempNode = head;
			if (getSize() == 1) {
				head = null;
				tail = null;
			}
			// deleting starting node
			else if (location == 0) {
				head.getNext().getNext().setPrevious(null);
				head = head.getNext().getNext();

			}
			// deleting last node
			else if (location >= getSize()) {
				for (int i = 0; i < location - 1; i++) {
					tempNode = tempNode.getNext();
				}

				tempNode.setNext(null);
				tail = tempNode;

			}
			// deleting in between node
			else if (location < getSize()) {
				for (int i = 0; i < location - 1; i++) {
					tempNode = tempNode.getNext();
				}

				tempNode.setNext(tempNode.getNext().getNext());
				tempNode.getNext().getNext().setPrevious(tempNode);
			}

			setSize(getSize() - 1);
		} else {
			System.out.println("The linked list doesn't exist");
		}
	}

	public DoubleNode getHead() {
		return head;
	}

	public void setHead(DoubleNode head) {
		this.head = head;
	}

	public DoubleNode getTail() {
		return tail;
	}

	public void setTail(DoubleNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
