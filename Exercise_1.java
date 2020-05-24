
class Stack {
	static final int MAX = 1000;
	int top;
	int a[];

	boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	Stack() {
		top = -1;
		a = new int[MAX];
	}

	boolean push(int x) {
		if (top == MAX - 1) {
			System.out.println("Stack Overflow");
			return false;
		}
		a[++top] = x;
		return true;
	}

	int pop() {
		if (top == -1) {
			System.out.println("Stack Underflow");
			return 0;
		}

		int item = a[top--];
		return item;
	}

	int peek() {
		if (top == -1) {
			System.out.println("Stack Underflow");
		}
		return a[top];
	}
}

public class Excercise_1 {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		System.out.println("Peek : " + s.peek());
		s.push(20);
		System.out.println("Peek : " + s.peek());
		s.push(30);
		System.out.println("Peek : " + s.peek());
		System.out.println(s.pop() + " Popped from stack");
	}

}
