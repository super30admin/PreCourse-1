import java.util.Arrays;
//time complexity: O(1)
//space complexity: 4008 bytes
class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        return top==0;
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = 0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top!=MAX) {
            a[top] = x;
            top++;
            return true;
        }
        return false;
    }

  
    int pop() 
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int topElement = a[top-1];
        a[top-1] = 0;
        top--;
        return topElement;

    } 
  
    int peek() 
    { 
        //Write your code here
        return isEmpty()?-1:a[top-1];
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
