package com.sthirty.precourseone.prblmtow;

public class Exercise_2 {

	StackNode root = null;

	static class StackNode {
		int data;
		StackNode next;

		StackNode(int d) {
			data = d;
			next = null;

		}
	}

	public boolean isEmpty() {
		if(root==null)
		{
			return true;
		}
		else
		{
		return false;
		}// Write your code here for the condition if stack is empty.
	}

	public void push(int data) {
		StackNode temp = new StackNode(data);

		temp.next = root;
		root = temp;

	}

	public int pop() {
		int d = root.data;
		root = root.next;
		return d;
		// If Stack Empty Return 0 and print "Stack Underflow"
		// Write code to pop the topmost element of stack.
		// Also return the popped element
	}

	public int peek() {
		if(root!=null)
		{
			return root.data;	
		}
		
		return 0;
		// Write code to just return the topmost element without removing it.
	}

	// Driver code
	public static void main(String[] args) {

		Exercise_2 sll = new Exercise_2();

		sll.push(10);
		sll.push(20);
		sll.push(30);
		sll.push(40);
		System.out.println(sll.pop() + " popped from stack");
		System.out.println(sll.pop() + " popped from stack");
		System.out.println(sll.pop() + " popped from stack");
		System.out.println(sll.pop() + " popped from stack");
		System.out.println("Top element is " + sll.peek());
	}
}