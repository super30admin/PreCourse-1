
class Stack {
  // Please read sample.java file before starting.
  // Kindly include Time and Space complexity at top of each file
  static final int MAX = 1000;
  int top = -1;
  int a[] = new int[MAX]; // Maximum size of Stack

  boolean isEmpty() {
    if (top > 0) {
      return false;
    } else {
      return true;
    }

  }

  Stack() {

  }

  boolean push(int x) {
    top = top + 1;
    a[top] = x;
    return isEmpty();
  }

  int pop() {
    int b;
    if (!isEmpty()) {
      b = a[top];
      top = top - 1;
      return b;
    } else {
      return 0;
    }
  }

  int peek() {
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