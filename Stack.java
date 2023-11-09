// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No 


// Your code here along with comments explaining your approach
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return top == 0; //we return true is top is empty or false if its not empty

    } 

    Stack() 
    { 
        //Initialize your constructor 

        top = 0; //keeping track of the top index 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top == MAX){
            //System.out.println("Stack overflow");
            return false; //return false if there is stack overflow
        }
        //Write your code here
        a[top] = x; //push the element 'x' to top
        top++; //incrementing the size
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }
        //Write your code here
        top--; //remove the top element 
        return a[top];
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[top]; //returning the top of stack 
    } 

  
// Driver code 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
