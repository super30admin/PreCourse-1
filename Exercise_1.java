//Time complexity: O(1)
//Space complexity : O(n)

class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file

    static final int MAX = 1000; 
    int top; 
    int a[];
  
    boolean isEmpty() 
    { 
        //Write your code here
        return top == -1;
    } 

    Stack() 
    { 
        //Initialize your constructor
        a = new int[MAX]; // Maximum size of Stack
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top == MAX) {
            System.out.println("Error: Stack Overflow. Stack is full");
            return false;
        }
        a[++top] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()) {
            System.out.println("Warning: Stack Underflow. Stakc is empty");
            return 0;
        }
        return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty())
            return 0;
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
