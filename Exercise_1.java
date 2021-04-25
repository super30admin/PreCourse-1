import java.util.Arrays;

// Time Complexity : all funcs are O(1)
// Space Complexity :  O(n), n-> stack capacity
// Any problem you faced while coding this : no

class Stack { 
    static final int MAX = 1000; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    int top_index;
    boolean isEmpty() 
    { 
        //Write your code here 
        if(a[0]==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    } 

    Stack() 
    { 
        Arrays.fill(a,-1);       //Initialize your constructor 
        //Initializing all the elements as -1, to check isEmpty easily
    } 
  
    boolean push(int x) 
    { 
        
        if(top_index==MAX)//Checking for stack Overflow
        {
            return false;
        }
        else{
            a[top_index++]= x;
            return true;
        }
        // Push new ele to the top of stack and Increment top_index 
        
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
            
        }
        else
        {  
            return a[--top_index];
            //since top_index is already inc, we decrement top_index, and return corresponding ele
        }
        
    } 
  
    int peek() 
    { 
        
        return a[top_index]; // assuming peek is done when stack is non-empty
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        //s.push(20); 
        //s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
        //System.out.println("Top element is " + s.peek()); 
    } 
}
