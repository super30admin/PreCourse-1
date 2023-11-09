// Time Complexity : O(1)
// Space Complexity : O(1)

class Stack {
  static final int MAX = 1000;
  int top;
  int a[] = new int[MAX]; // Maximum size of Stack

  boolean isEmpty()
  {
    return top == -1;
  }

  Stack()
  {
    top = -1; //Initialize your constructor
  }
  
  boolean push(int x)
  {
    //Check for stack Overflow
    if (top == MAX - 1) {
      System.out.println("Stack Overflow/Stack is full");
      return false;
    } else {
      a[++top] = x;
      return true;
    }
  }
  
  int pop()
  {
    //If empty return 0 and print "Stack Underflow"
    if (top == -1) {
      System.out.println("Stack Underflow/Stack is empty");
      return 0;
    } else {
      return a[top--];
    }
  }
  
  int peek()
  {
    return a[top];
  }
} 
  
// Driver code 
class Main { 
  public static void main(String args[])
  {
    Stack s = new Stack();
    s.push(10);
    s.push(20);
    s.push(30);
    System.out.println(s.pop() + " Popped from stack");
  }
}