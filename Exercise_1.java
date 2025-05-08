class Stack { 
    // Time Complexity: O(1) -> push, pop, peek functions
    // Additional TC: O(n) -> toString (additional function I have added)
    // Space Complexity: O(n) -> where n = Max size of the Array
    //Did this code successfully run on Leetcode : Yes (works on Compilers)
    // Any problem you faced while coding this : Not as such
      static final int MAX = 1000; 
      int top; 
      int a[] = new int[MAX]; // Maximum size of Stack 
    
      boolean isEmpty() 
      { 
          //directly checking if top is still pointing at -1 that means stack is empty
          return(top == -1);
      } 
  
      Stack() 
      { 
          //Initialize your constructor
          // setting top as -1 so that first element pushed will come to the 0 index
          top = -1;
      } 
    
      boolean push(int x) 
      { 
          //Check for stack Overflow
          // if top has reached the max-1 value because array is 0 index based 
          if(top == MAX-1)
              return false;
          //Write your code here
          // incrementing top first then assigning value to the array position
           a[++top] = x;
           return true;
      } 
    
      int pop() 
      { 
          //If empty return 0 and print " Stack Underflow"
          //checking if stack is empty
          if(top == -1)
          {
              System.out.println("Stack Underflow");
              return 0;
          }
          //Write your code here
          // putting element in variable to decrement top first before returning the value
          int element = a[top];
          // decermenting value of top to point to prev element
          top--;
          // returning the popped element before the top decrement
          return element;
      } 
    
      int peek() 
      { 
          //Write your code here
          //checking if stack is empty
          if(top == -1)
          {
              System.out.println("Stack Underflow");
              return 0;
          }
          //returnig the top element
          return a[top];
      } 
      
      //additional function I have created to print Stack directly calling the object
      @Override
      public String toString() {
          //using stringbuilder because it is mutable
          StringBuilder sb = new StringBuilder("[");
          //starting loop from top till 0
          for(int i = top;i>=0;i--){
              sb.append(a[i]);
              // adding comma only in non zero value of i (better visibility)
              if (i != 0) sb.append(", ");
          }
          sb.append("]");
          //returning the string version of StringBuilder
          return sb.toString();
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
          System.out.println("Stack: " + s);
          System.out.println(s.pop() + " Popped from stack");  
          
      } 
  }
  
