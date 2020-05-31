package stack_using_Array;

public class StackByArray {

	private int [] arr;
	private int topOfStack;
	private int size;
	
	/*
	 * public int[] createEmptyStack(int size) {
	 * 
	 * this.arr = new int[size]; this.topOfStack = -1; return arr;
	 * 
	 * }
	 */
	
	// notice , he has used a constructor here
	// default constructor is only for memory allocation
	// constructors have same name as class
	// constructor never returns anything
	
	

	public StackByArray(int size)
	{
		this.size = size;
		this.arr = new int[this.size];
		this.topOfStack = -1;
		System.out.println("successfuly created a empty linked list of size" + size);
	}
	
	public void push(int value)
	{
		if (isStackFull()) {
			System.out.println("stack overflow error");
		} else {
			topOfStack++;
			arr[topOfStack] = value;
			
			System.out.println("succesfully inserted value " + value + " at location" + topOfStack);
		}
	}
	
	@SuppressWarnings("null")
	public void pop()
	{
		if (isStackEmpty()) {
			System.out.println("stack underflow error");
		} else {
 			System.out.println("removing top of stack");
			// below statement is important to avoid memory leak
			
			arr[topOfStack] = 0; // btw, null is just a special value
			topOfStack --;
		}
	}
	
	public boolean isStackEmpty()
	{
		return topOfStack == -1;
	}
	
	public boolean isStackFull()
	{
		return topOfStack == arr.length - 1;
	}
	
	public void peek()
	{
		if(!isStackEmpty())
		{
			System.out.println("top of stack value is" + arr[topOfStack]);
		}
		else
		{
			System.out.println("the stack is empty");
		}
	}
	
	public void deleteArray()
	{
		setArr(null);
		System.out.println("The array was successfully deleted");
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public int getTopOfStack() {
		return topOfStack;
	}
	public void setTopOfStack(int topOfStack) {
		this.topOfStack = topOfStack;
	}
	
	
}
