class Stack {
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX];

	boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	Stack() {
		top = -1;
	}

	boolean push(int x) {
		if (top == MAX - 1) {
			System.out.println("Stack Overflow!");
			return false;
		} else {
			top++;
			a[top] = x;
			System.out.println(a[top]);
			return true;
		}
	}

	int pop() {
		if (top == -1) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int temp = a[top];
			top--;
			return temp;
		}
	}

	int peek() {
		if (top == -1) {
			System.out.println("Stack is empty and there is no value!");
			return 0;
		}
		else
		return a[top];
	}
}
  
//Driver code 
public class Main {
	public static void main(String args[]) {
		Stack s = new Stack();
		 s.push(10);
		 s.push(20);
		 s.push(30);
		/*
		 * for (int i = 0; i<=1000; i++) { s.push(i); }
		 */

		System.out.println(s.peek());
		System.out.println(s.isEmpty());
		System.out.println(s.pop() + " Popped from stack");
		System.out.println(s.peek());
	}
}
