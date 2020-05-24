package singleLinkedList;


import node.SingleNode;
//sharanya own
public class SingleLinkedList {
	
	private SingleNode head;
	private SingleNode tail;
	private int size;
	
	//1. Create a single linked list 
	public SingleNode createSingleLinkedList(int nodeValue)
	{
		head = new SingleNode();
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);
		node.setNext(null);
		head = node;
		tail = node;
		size = 1;
		return head;
	}
	
	//2. Check if the linked list exists
	public Boolean existsLinkedList()
	{
		return head != null;
	}
	
	//3. Insert into a LinkedList
	public void insertInLinkedList(int nodeValue, int location)
	{
		// insert at 1st position
		// insert in the middle
		// insert in the last position
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);

		// check if linkedlist exists
		if (!existsLinkedList()) {
			System.out.println("The linked list doesn't exists");
		} else if (location == 0) // insert at 1st node
		{
			node.setNext(head);
			head = node;
		} else if (location >= getSize() ) { // insert at last node
			node.setNext(null);
			tail.setNext(node);
			//tail.setNext(node); // here whatever it was refereing to has been set to new node i.e node with value 5 , is now referecing to i.e has created a link to new node
			tail = node;
			
		
		} else if (location < getSize()) {
			SingleNode tempNode = head;
			int index = 0;
			while (index < location- 1) {
				tempNode = tempNode.getNext();
				index++;
			} 

			node.setNext(tempNode.getNext());
			//node.setValue(nodeValue);
			tempNode.setNext(node);
			System.out.println(tempNode);

		}
		setSize(getSize() + 1);
	}
	
	// 4. Traverese a LL
	public void traverseLinkedList()
	{
		if (existsLinkedList()) {
			
			SingleNode tempNode = head;
			
			for(int i = 0; i < getSize() ; i++)
			{
				System.out.print(tempNode.getValue());
				if (i < getSize() - 1) {
					System.out.print("->");
				}
				tempNode= tempNode.getNext();
			}
		}
		else
		{
			System.out.println("temp node doesn't exist");
		}
		System.out.println("\n");
	}

	// 5. Search a node for given value
	public boolean searchNode(int value)
	{
		if(existsLinkedList())
		{
			SingleNode tempNode = head;
			for(int i=0; i < getSize()-1 ; i++)
			{
				if(tempNode.getValue() == value)
				{
					System.out.println("found this value at location"+i);
					return true;
					
				}
				tempNode = tempNode.getNext();
			}
		}
		
		System.out.println("could not find that node");
		return false;
	}
	
	//6. Delete entire Linked List
	void deleteLinkedList() {
		System.out.println("\n\nDeleting Linked List...");
		head = null;
		tail = null;
		System.out.println("Linked List deleted successfully !");
	}
	
	//7. Delete a node from a Linked List
	public void deletionOfNode(int location)
	{
		if(existsLinkedList())
		{
			// a. if node is inbetween or if node is last node
			SingleNode tempNode = head;
			if(location <= getSize() -1)
			{
				int index = 0;
				while (index < location) {
					tempNode = tempNode.getNext();
					index++;
				}

				if(location < getSize() -1)
				tempNode.setNext(tempNode.getNext().getNext());
				// node.setNext(null);
				if(location == getSize() - 1)
				{
					tempNode.setNext(null);
					tail = tempNode;
				}
					
			}
			// b. if node is in the beginning
			else if(location == 0)
			{
				if(getSize() == 1)
				{
					
				}
			head.setNext(head.getNext().getNext());
			
			}
			
			
			
			
		}
		else
		{
			System.out.println("LL doesn't exist");
		}
	}
	


	// all getters and setters
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
