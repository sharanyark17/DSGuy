package node;

public class DoubleNode {

	private DoubleNode next;
	private DoubleNode previous;
	private int value;
	
	public DoubleNode getNext() {
		return next;
	}
	public void setNext(DoubleNode next) {
		this.next = next;
	}
	public DoubleNode getPrevious() {
		return previous;
	}
	public void setPrevious(DoubleNode previous) {
		this.previous = previous;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
}
