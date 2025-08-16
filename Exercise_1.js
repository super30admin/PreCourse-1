// All operations- Time complexity: O(1)
// Space complexity: O(N) - N being size of the array
class Stack {
	//Please read sample.java file before starting.
	//Kindly include Time and Space complexity at top of each file
	constructor() {
		//Initialize your constructor
		this.MAX = 1000;
		this.top = -1;
		this.array = new Array(this.MAX);
	}
	isEmpty() {
		return this.top < 0;
	}

	push(x) {
		//Check for stack Overflow
		if (this.top >= this.MAX - 1) {
			return "Stack Overflow";
		}
		this.top++;
		this.array[this.top] = x;
	}

	pop() {
		//If empty return 0 and print "Stack Underflow"
		if (this.isEmpty()) {
			console.log("Stack Underflow");
			return 0;
		}
		const lastElement = this.array[this.top];
		this.top--;
		return lastElement;
	}

	peek() {
		if (this.isEmpty()) return "Empty stack";

		return this.array[this.top];
	}
}

let s = new Stack();
s.push(10);
s.push(20);
console.log(`peeked from stack ${s.peek()}`);
s.push(30);
console.log(s.pop() + " Popped from stack");
