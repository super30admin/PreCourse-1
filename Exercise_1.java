// Time Complexity :
//   push()  -> O(1)
//   pop()   -> O(1)
//   peek()  -> O(1)
//   isEmpty()-> O(1)
// Space Complexity : O(MAX) because we use a fixed-size array of size MAX
// Any problem you faced while coding this :
//   - Common off-by-one mistakes with the 'top' index. The correct empty value is top = -1.
//   - Remember to check overflow before push and underflow before pop.
// Your code here along with comments explaining your approach
//   - We keep an array to hold items. 'top' stores the index of the current top element.
//   - Empty stack means top == -1. On push we do a[++top] = x; On pop we return a[top--].
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        return(top < 0);  // Stack is empty if top is below 0
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = -1; // Start empty
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top >= (MAX-1)){
            System.out.println("Stack Overflow");
            return false;
        } else{
            a[++top] = x; // Move top up, then write the value
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        } else{
            return a[top--];  // Return current top and move top down
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if (top < 0) { 
            System.out.println("Stack is empty"); 
            return 0; 
        } else { 
            return a[top];  // Return but do not remove
        }
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
