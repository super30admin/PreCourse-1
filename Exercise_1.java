// Time Complexity : O(1) for push, pop and peek
// Space Complexity : O(1) - constant space
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this : No

class Stack { 
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top == -1){
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
        if(top + 1 == MAX){
            return false;
        }

        a[++top] = x;
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

        return a[top--];

    } 

    int peek() 
    { 
        //Write your code here
        if(isEmpty){
            System.out.println("Stack Underflow");
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
    } 
}
