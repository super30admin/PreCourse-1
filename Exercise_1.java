// Time Complexity : O(1)
// Space Complexity : 0(1) we created an int array with fixed size
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


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
        return top<0;  
    } 

    Stack() 
    { 
        //Initialize your constructor
        top=-1;  //Setting top value as -1 when stack is created
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top+1 > MAX){
            return false; //When size increases MAX, pushing elements into stack is prevented
        }
        else{
            top++;  //Top points to peek element, Increment it to add a new element into stack 
            a[top] = x;  //assigning value to array
            return true; // returns true since an element is added
        }
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top<0) return 0;  //     When stack is empty top is -1
        else {
            int peekEle = a[top];  //store peek element into a variable and decrement top 
            top--;
            return peekEle; // return peek element
        }
    } 
  
    int peek() 
    { 
        //Write your code here
         if(top<0){
            return 0; //if stack is empty return 0
         } else {
            return a[top];  // If stack is not empty, return top element. 
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
