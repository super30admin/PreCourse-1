class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top = 0;
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return a.length == 0;
    } 

    Stack() 
    { 
        //Initialize your constructor 
    } 
    // TC: O(1)
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if (top == MAX) {
            System.out.println("No space available on stack");
            return false;
        }
        a[top] = x;
        top++;
        return true;
    }

    // TC: O(1)
    int pop()
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (a.length == 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[--top];
    }

    // TC: O(1)
    int peek() 
    { 
        //Write your code here
        if (a.length == 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        return a[top - 1];
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
