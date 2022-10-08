package StackUsingArray;
import java.util.EmptyStackException;
public class Stack {

	private int arr[];
    private int size;
    private int index = 0;
 
    public Stack(int size) {
        this.size = size;
        arr = new int[size];
    }
 
    public void push(int element) {
 
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
 
        arr[index] = element;
        index++;
    }
 
    public int pop() {
 
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arr[--index];
    }
 
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }
 
    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }
 
    public int size() {
        return index;
    }
}

package StackUsingArray;

public class StackClient {

	public static void main(String[] args) {
		 Stack stack = new Stack(5);
	        stack.push(56);
	        stack.push(43);
	        stack.push(36);
	        stack.push(28);
	        stack.push(167);
	 
	        System.out.println("Size of stack after push operations: " + stack.size());
	 
	        System.out.printf("Pop elements from stack : ");
	        while (!stack.isEmpty()) {
	            System.out.printf(" %d", stack.pop());
	        }
	 
	        System.out.println("Size of stack after pop operations : " + stack.size());
	    }
	}
