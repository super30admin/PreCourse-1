import java.sql.SQLOutput;

class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file

    // Time Complexity:
    // isEmpty() - O(1)
    // push() - O(1)
    // pop() - O(1)
    // peek() - O(1)
    // Space Complexity for these - O(1)
    private static final int MAX = 1000;
    private int top;
    private int a[] = new int[MAX]; // Maximum size of Stack
  
    boolean isEmpty() 
    { 
        //Write your code here

        return top == -1;
    } 

    Stack() 
    { 
        //Initialize your constructor
        a = new int[MAX];
        this.top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if (top != MAX - 1) {
            a[++top] = x;
            return true;
        }
        return false;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top != -1) {
            return a[top--];
        }
        System.out.println("Stack Underflow");
        return 0;
    } 
  
    int peek() 
    { 
        //Write your code here
        if (top != -1) {
            return a[top];
        }
        System.out.println("Stack Empty");
        return 0;
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
        System.out.println((s.peek() + "is Stack's peek"));
        System.out.println("Is Stack's empty: " + s.isEmpty());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Is Stack's empty: " + s.isEmpty());
    }
}
