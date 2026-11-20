    /*
    Time Complexity:
    isEmpty()- O(1)
    push()- O(1)
    pop()- O(1)
    peek()- O(1)

    Space Complexity:
    O(MAX) for the array
    */

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    private int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        return top == -1;
        //Write your code here 
    } 

    Stack() 
    { 
        top = -1;
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        }

        top++;
        a[top] = x;
        return true;
        //Check for stack Overflow
        //Write your code here
    } 
  
    int pop() 
    { 
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int value = a[top];
        top--;
        return value;
        //delete the top element of the stack and return that
    
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    { 
        return a[top];
        //Write your code here
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
