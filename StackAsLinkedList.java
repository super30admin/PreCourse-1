// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/* 
 * root of linked list acts as the top of stack
 * when a value is pushed, it will be added in the beginning and previous node will be linked by assigning to next 
 * when a value is popped, current node data will be returned and next will be assigned to root
 * root == null represents empty stack
 * 
 * initially root will be null
 * StackAsLinkedList [root=null]
 * after pushing 10 root will be 
 * StackAsLinkedList [root=StackNode [data=10, next=null]]
 * after pushing 20 root will be
 * StackAsLinkedList [root=StackNode [data=20, next=StackNode [data=10, next=null]]]
 * after pushing 30 root will be
 * StackAsLinkedList [root=StackNode [data=30, next=StackNode [data=20, next=StackNode [data=10, next=null]]]]
 * after popping 30 root will be
 * StackAsLinkedList [root=StackNode [data=20, next=StackNode [data=10, next=null]]]
*/
import java.util.EmptyStackException;

public class StackAsLinkedList {

	StackNode root;

	static class StackNode {
		int data;
		StackNode next;

		StackNode(int data) {
			this.data = data;
			this.next = null;
		}

		@Override
		public String toString() {
			return "StackNode [data=" + data + ", next=" + next + "]";
		}

	}

	public boolean isEmpty() {
		return root == null;
	}

	public synchronized void push(int data) {
		StackNode stackNode = new StackNode(data);
		stackNode.next = root;
		root = stackNode;
	}

	public synchronized int pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return 0;
		}
		int poppedInt = root.data;
		root = root.next;
		return poppedInt;
	}

	public synchronized int peek() {
		if (isEmpty())
			throw new EmptyStackException();
		return root.data;
	}

	@Override
	public String toString() {
		return "StackAsLinkedList [root=" + root + "]";
	}

	// Driver code
	public static void main(String[] args) {

		StackAsLinkedList sll = new StackAsLinkedList();
		sll.push(10);
		sll.push(20);
		sll.push(30);
		System.out.println(sll.pop() + " popped from stack");
		System.out.println("Top element is " + sll.peek());
	}
}
