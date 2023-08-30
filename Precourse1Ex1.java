// Time Complexity : O(1)
// Space Complexity : O(n)

public class ArrayStack {
    private int[] stack;
    private int capacity;
    private int top;

    // Constructor to initialize the stack
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1; // indicates an empty stack
    }

    // Add an item to the stack
    public void push(int item) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full. Cannot push more items.");
        }
        stack[++top] = item;
    }

    // Remove and return the top item from the stack
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
        return stack[top--];
    }

    // Get the top item without removing it
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }
        return stack[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
    
    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Main method for testing the stack
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        System.out.println(stack.isEmpty()); // ans = true
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.isEmpty()); // ans = false
        System.out.println(stack.peek()); // ans = 5
        System.out.println(stack.pop());  // ans = 5
        System.out.println(stack.pop());  // ans =  4
        stack.push(6);
        System.out.println(stack.peek()); // ans = 6
    }
}
