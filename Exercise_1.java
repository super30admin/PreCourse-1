/*
Time: Push O(1), Pop O(1), Peek O(1)
Space: O(1) - Size of the stack is a fixed MAX
Did this code successfully run on Leetcode : N/A
Any problem you faced while coding this : None
*/
class Stack {
  static final int MAX = 1000;
  int top;
  int a[] = new int[MAX]; // Maximum size of Stack

  boolean isEmpty() {
    if (top <= -1)
      return true;

    return false;
  }

  Stack() {
    this.top = -1;
  }

  boolean push(int x) {
    // Check for stack Overflow
    if (top >= MAX - 1) {
      System.out.println("Stack Overflow");
      return false;
    }

    a[++top] = x;
    System.out.println("Pushed " + x);
    return true;
  }

  int pop() {
    // If empty return 0 and print " Stack Underflow"
    if (top <= -1) {
      System.out.println("Stack Underflow");
      return 0;
    }

    int x = a[top--];
    return x;
  }

  int peek() {
    if (top <= -1) {
      System.out.println("Stack Underflow");
      return 0;
    }

    return a[top];
  }
}

// Driver code
class Main {
  public static void main(String args[]) {
    Stack s = new Stack();
    s.push(10);
    s.push(20);
    s.push(30);
    System.out.println(s.pop() + " Popped from stack");
  }
}
