// Time Complexity : 
//                    isEmpty: O(1)
//                    isFull:  O(1)
//                    Push:    O(1)
//                    Pop:     O(1)
//                    Peek:    O(1)
//                    Creation:O(1)
// Space Complexity : 
//                    isEmpty: O(1)
//                    isFull:  O(1)
//                    Push:    O(1)
//                    Pop:     O(1)
//                    Peek:    O(1) 
//                    Creation:O(N) Here n=max; 
// Did this code successfully run on Leetcode : Not applicable
// Any problem you faced while coding this : No

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top == -1)
        {
            System.out.println("Stack Underflow");  
            return true;
        }
        else {
            return false;
        }
    } 

    boolean isFull() 
    { 
        //Write your code here 
        if(top == MAX-1)
        {
            System.out.println("Stack is Full");
            return true;
        }
        else 
            return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        if(!isFull())
        {
            a[++top]= x;
            System.out.println("Succesfully inserted "+ x);
            return true;
        }
        return false;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty())
        {
            return 0;
        }else {
            return a[top--];
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(!isEmpty())
        {
            return a[top];
        }
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
    } 
}
