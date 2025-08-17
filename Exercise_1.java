// Time Complexity : O(1) for all operations (push, pop, peek, isEmpty) - we only access array at index top, no shifting or searching required
// Space Complexity : O(MAX) fixed
// Any problem you faced while coding this : no

class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file

  static final int MAX = 1000; // set maximum stack capacity
  int top;                     // tracks index of top element (-1 = empty)
  int a[] = new int[MAX];      // fixed-size array to hold stack elements

  boolean isEmpty() {
    // empty when top hasn't moved from initial -1
    return this.top == -1;
  }

  Stack() {
    // start with empty
    this.top = -1;
  }

  boolean push(int x) {
    // check if we've reached last valid index
    if (top == MAX - 1) {
      System.out.println("stack Overflow");
      return false;
    }

    // increment top first, then place element
    a[++top] = x;
    return true;
  }

  int pop() {
    // check if stack is empty
    if (isEmpty()) {
      System.out.println("Stack Underflow");
      return -1;
    }

    // get current top element, then decrement top
    return a[top--];
  }

  int peek() {
    // same empty check
    if (isEmpty()) {
      System.out.println("Stack Underflow");
      return -1;
    }

    // just return top element, don't change top
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
