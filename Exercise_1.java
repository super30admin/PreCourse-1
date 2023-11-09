
// Time Complexity :O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : I didn't find this on Leetcode so successfully run it on eclipse.
// Any problem you faced while coding this : NO
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        //checking whether the stack is empty or not by checking the pointer top as such equal to -1 or not
        if(top==-1)
          return true;
        return false;

    } 

    Stack() 
    { 
        //Initialize your constructor 
        // Initialising the top pointer to -1 as such specifies the stack is empty
        top=-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        // checking whether the top pointer meets the max then the stack could not accomodate more elements
        if(top==MAX-1){
            System.out.println("Stack Overflow");
            return false;
        }
        //The top pointer will get incremented and it will be assigned to value x.
        else{
            a[++top]=x;
            return true;
        }
    } 
  
    int pop() 
    { 
        if(top==-1){
            System.out.println("Stack Underflow");
            return 0;
        }
        //Decrement the top pointer and then return that element.
        else{
            return a[top--];
        }
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    { 
        //Write your code here
        //Return the top element of the stack. 
        
        return a[top] ;

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
        System.out.println(s.peek());
    } 
}
