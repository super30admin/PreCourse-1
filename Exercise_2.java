// Time Complexity : O(1) for push/pop/peek
// Space Complexity : O(1) for push/pop/peek
// Any problem you faced while coding this : Spent some time thinking on how to track the next node while implementing push


/**
 *  Implement Stack using Linked List.
 * 
 * Upon pushing data, we create a new node and point its next to the last inserted element (root), and update the root
 * to point to that node. Doing this the new element is always added in a LIFO manner and the root has the most recent
 * updated element.
 */
class StackAsLinkedList { 

	StackNode root; 

	static class StackNode { 
		int data; 
		StackNode next; 

		StackNode(int data) 
		{ 
			this.data = data;
		} 
	} 


	public boolean isEmpty() 
	{ 
		return root == null;
	} 

	public void push(int data) 
	{ 
		if (root == null) {
			root = new StackNode(data);
		}
		else {
			StackNode node = new StackNode(data);
			node.next = root;
			root = node;
		}
	} 

	public int pop() 
	{ 	
		//If Stack Empty Return 0 and print "Stack Underflow"
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return 0;
		}

		//Write code to pop the topmost element of stack.
		int data = root.data;
		root = root.next;

		//Also return the popped element 
		return data;
	} 

	public int peek() 
	{ 
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return 0;
		}

		//Write code to just return the topmost element without removing it.
		return root.data;
	} 

	//Driver code
	public static void main(String[] args) 
	{ 
		StackAsLinkedList sll = new StackAsLinkedList(); 

		sll.push(10); 
		sll.push(20); 
		sll.push(30); 

		System.out.println(sll.pop() + " popped from stack"); 

		System.out.println("Top element is " + sll.peek()); 

		System.out.println(sll.pop() + " popped from stack");
		System.out.println(sll.pop() + " popped from stack");

		System.out.println("Top element is " + sll.peek());

		// Stack is empty
		System.out.println("Is stack empty? " + sll.isEmpty());
		} 
} 
