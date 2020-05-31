package stack_using_Array;

public class StackByArrayMain {

	public static void main(String[] args) {
		
		System.out.println("creating a new stack");
		StackByArray sba = new StackByArray(6);
		
		sba.push(10);
		sba.peek();
	
		sba.push(20);
		sba.peek();
		
		sba.push(30);
		sba.peek();
		
		sba.pop();
		sba.peek();
		
		
	}

}
