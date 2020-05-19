// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Problem not on Leetcode but working on eclipse
// Any problem you faced while coding this : None as I was aware of this concept
// Your code here along with comments explaining your approach

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return top == -1; // returns true if top is pointing to a invalid number i.e. -1 meaning stack is empty
        // Time Complexity : O(1)
        
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;   // initialized top = -1 to denote stack being empty as array index starts with 0
        
        
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here

        if(top==MAX)  // return false i.e unable to push if the pointer has reached MAX value i.e array has no more space
            return false;

            a[++top] = x; // otherwise incrementing top and adding the element x to be pushed at the top position in the array
            return true; 
        // Time Complexity : O(1)
       
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()) //calling isEmpty method to check if we can pop or not
        {
            System.out.println("Stack Underflow");
          	return 0;  // returning 0 and printing Stack Underflow if stack is empty
        }
        else
        {
            int val = a[top]; // otherwise storing the value to be popped in a temperary variable
            top--; //decrementing top value as value has been popped
            return val;   // returning the value popped out   
            // Time Complexity : O(1)
           
        }
       
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[top]; // returning the last element inserted denoted by top
         // Time Complexity : O(1)
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
        System.out.println(s.isEmpty() + " - isEmpty or not ");
      	System.out.println(s.peek()+ " - Peek Element");
    } 
}
