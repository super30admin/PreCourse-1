// Time complexity : O(1)
// Space complexity : O(MAX)
// Did this code successfully run on Leetcode : YES  (https://leetcode.com/problems/valid-parentheses)
// Any problem you faced while coding this : NO

class Stack { 
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //No top element when stack is empty i.e top element index <0
        if(top==-1){ 
            return true;
        }
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top==MAX-1){
            System.out.println("Stack Overflow");
            return false;
        }
        a[++top]=x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top==-1){ 
            System.out.println("Stack Underflow");
            return 0;
        }
        int x= a[top];
        top--;
        return x;
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top==-1){  //if(isEmpty())
            System.out.println("Stack empty");
            return -1;
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
        System.out.println(s.pop() + " Popped from stack"); 
        // s.push(4);
        // System.out.println(s.peek());
        // System.out.println("is Empty " +  s.isEmpty());
        // System.out.println(s.pop());
        // System.out.println("is Empty " + s.isEmpty());
        // System.out.println(s.pop());
        // System.out.println("is Empty " + s.isEmpty());
        // System.out.println(s.pop());
        // System.out.println("is Empty " + s.isEmpty());
        // System.out.println("pop: "+s.pop());
        // System.out.println("peak:" + s.peek());
    } 
}
