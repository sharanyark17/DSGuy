package linkedLists;

import node.SingleNode;

public class SingleCircularLinkedList {

	// 1. Create a single circular linked list --
	// 2. Check if the linked list exists --
	// 3. Insert into a LinkedList --
	// 4. Traverse a LL --
	// 5. Search a node for given value -- 
	// 6. Delete entire Linked List
	// 7. Delete a node from a Linked List
	
	// Q --> need to see why only after delete, it prints first node back after last node 

	private SingleNode head;
	private SingleNode tail;
	private int size;

	// 1. Create a single circular linked list

	public SingleNode createSingleLinkedList(int value) {
		head = new SingleNode();
		tail = new SingleNode();
		SingleNode node = new SingleNode();
		node.setValue(value);
		node.setNext(node);

		head = node;
		tail = node;

		setSize(1);
		return head;

	}

	// 2. check if SCLL exists
	public Boolean existsLinkedList() {
		return head != null;
	}

	// 3. traverse a single circular linked list
	public void traverseSCLL() {
		if (existsLinkedList()) {
			SingleNode tempNode = head;

			for (int i = 0; i < getSize(); i++) {
				System.out.print(tempNode.getValue());
				if (i < getSize() - 1) {
					System.out.print("->");
				}
				tempNode = tempNode.getNext();
			}
		} else {
			System.out.println("Linked list doesn't exist");
		}

		System.out.println("\n");
	}

	// 4. Insert into SCLL
	public void insertIntoLinkedList(int value, int location) {
		SingleNode tempNode = head;
		SingleNode node = new SingleNode();
		node.setValue(value);
		// insert at beginning
		if (existsLinkedList()) {
			if (location == 1) {
				node.setNext(head);
				head = node;
				tail.setNext(node);
			}
			// insert at the end
			else if (location >= getSize()) {
				tail.setNext(node);
				tail = node;
				node.setNext(head);
			}
			// insert in the middle
			else if (location < getSize()) {
				int index = 0;
				while (index < location - 1) {
					tempNode = tempNode.getNext();
					index++;
				}

				node.setNext(tempNode.getNext());
				tempNode.setNext(node);
			}
			System.out.println(getSize());
			setSize(getSize() + 1);
		} else {
			System.out.println("The linked list does not exist");
		}
	}

	// 5. Search a node for a given value
	public void searchForValue(int value) {
		SingleNode tempNode = head;
		Boolean nodeExists = false;
		if (existsLinkedList()) {
			for (int i = 0; i < getSize(); i++) {
				if (tempNode.getValue() == value) {
					System.out.println("Value " + value + " exists at location " + i);
					nodeExists = true;
				}

				tempNode = tempNode.getNext();
			}

			if (nodeExists != true) {
				System.out.println("value not found in any node");
			}

		} else {
			System.out.println("Linked list doesn't exist");
		}
	}
	
	//6. Delete entire linked list
	public void deleteLinkedList()
	{
		if (existsLinkedList()) {
			System.out.println("\n\nDeleting Linked List...");
			head = null;
			tail = null;
			System.out.println("Linked List deleted successfully !");
		} else {
			System.out.println("linked list doesn't exist");
		}
	}
	
	//7. Delete node from Linked list
	public void deleteNodeFromList(int location)
	{
		SingleNode tempNode = head;
		if (existsLinkedList()) {
			// deleting a node from the beginning
			if (location == 0) {
				tempNode = tempNode.getNext();
				head = tempNode;
				tail.setNext(head);
				// deleting a node from the end
			} else if (location >= getSize()) {
				for (int i = 0; i < getSize(); i++) {
					tempNode = tempNode.getNext();
				}
				tail.setNext(tempNode);
				tempNode.setNext(head);
				// deleting a node from the middle
			} else if (location < getSize()) {
				for (int i = 0; i < location - 1; i++) {
					tempNode = tempNode.getNext();
				}
				tempNode.setNext(tempNode.getNext().getNext());
			}
		}
	}

	public SingleNode getHead() {
		return head;
	}

	public void setHead(SingleNode head) {
		this.head = head;
	}

	public SingleNode getTail() {
		return tail;
	}

	public void setTail(SingleNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;

	}

}
