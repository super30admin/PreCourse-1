// All operations - Time complexity: O(1)
// Space complexity: O(N) - N size of growing StackedLinkedlist (stored elements)
class StackAsLinkedList {
	static stackNode = class {
		constructor(d) {
			//Constructor here
			this.data = d;
			this.next = null;
		}
	};

	constructor() {
		this.root = null;
	}

	isEmpty() {
		//Write your code here for the condition if stack is empty.
		return this.root === null;
	}

	push(data) {
		//Write code to push data to the stack.
		const newNode = new StackAsLinkedList.stackNode(data);
		if (this.isEmpty()) {
			this.root = newNode;
		} else {
			const temp = this.root;
			this.root = newNode;
			newNode.next = temp;
		}
	}

	pop() {
		//If Stack Empty Return 0 and print "Stack Underflow"
		if (this.isEmpty()) {
			console.log("Stack Underflow");
			return 0;
		}
		//Write code to pop the topmost element of stack.
		//Also return the popped element
		const popedElement = this.root.data;
		this.root = this.root.next;
		return popedElement;
	}

	peek() {
		//Write code to just return the topmost element without removing it.
		if (this.isEmpty()) return 0;
		return this.root.data;
	}
}
//Driver code
const sll = new StackAsLinkedList();
sll.push(10);
sll.push(20);
sll.push(30);
console.log(sll.pop() + " popped from stack");
console.log("Top element is " + sll.peek());
