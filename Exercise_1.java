class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
//    Time Complexity : O(1) Push and Pop operations take O(1) when a new block of memory is created
//    Space Complexity :O(1) As a new list is created and used
//    Did this code successfully run on Leetcode : Yes
//    Any problem you faced while coding this : No
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return (top == -1);
    } 

    Stack() 
    { 
        //Initialize your constructor 
        this.top = -1 ;
        //this.a = a;

    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top+1 ==  MAX ){
            System.out.println("Stack Overflow");
            return false;
        }
        top = top+1;
        a[top] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }

        int prev = top;
        top--;
        // a[prev] = 0;
        return a[prev];
    } 

  
    int peek() 
    { 
        //Write your code here
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        return a[top];
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
        s.push(40); 
        System.out.println(s.peek() + " Peek from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        
    } 
}
