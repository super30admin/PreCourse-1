
import java.util.EmptyStackException;
public class StackUsingArray{
	//declaration of array
	int arr[];
	//declaration of size of array
	int size;
	//declaration and initializing with zero of index array which is top for stack
	int top = 0;

	public StackUsingArray(int size) {
		//constructor for initialization size of array
		this.size = size;
		arr = new int[size];
	}

	public void push(int data) {
		//checking if stack is full
		if (isFull()) {
			throw new StackOverflowError("Stack is full");
		}

		arr[top] = data;
		top++;
	}

	public int pop() {
		//checking if stack is empty
		if (isEmpty()) {
			throw new EmptyStackException(); 
		}
		return arr[--top];
	}

	public boolean isEmpty() {
		if (top == 0) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (top == size) {
			return true;
		}
		return false;
	}

	public int size() {
		return top;
	}

	public int peek() {
		return top;
	}

	public static void main(String a[]) {
		StackUsingArray stack = new StackUsingArray(5);
		System.out.println("1. Size of stack before push operations: " + stack.size());
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);


		System.out.println("1. Size of stack after push operations: " + stack.size());
		System.out.print("2. stack after push operations: "); 
		int i=0;
		while (i<stack.size) {
			System.out.printf(" %d", stack.arr[i]);
			i++;
		}
		int peek=stack.peek();
		System.out.println("\n3. Peek of stack: " + stack.arr[peek-1]);
		System.out.printf("4. Pop elements from stack : ");
		while (!stack.isEmpty()) {
			System.out.printf(" %d", stack.pop());
		}

		System.out.println("\n5. Size of stack after pop operations : " + stack.size());
	}
}