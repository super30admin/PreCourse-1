class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    // Time Complexity :  push -> O(1), pop -> O(1), peek -> O(1), isEmpty -> O(1)
    // Space Complexity : O(N) where N is MAX (size of the stack)
    // Did this code successfully run on Leetcode : yes
    // Any problem you faced while coding this : No


    // Your code here along with comments explaining your approach
    static final int MAX = 1000; 
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
         return top ==-1;
    } 

    Stack() 
    { 
        //Initialize your constructor
        // Initializing top here
        top =-1;
    } 
  
    boolean push(int x)
    { 
        //Check for stack Overflow
        // if top is greater then size of the array I will print stack overflow else I will increment the top pointer and place by number there.
        if(top>= (MAX -1)){
            System.out.println("Stack Overflow");
            return false;
        }else {
            a[++top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        // I will call methord isEmpty if it returns true I will return 0 and print Stack Underflow
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
         return a[top --];
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        // Peek top element without removing it
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        else {
            return a[top];
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
