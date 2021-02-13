// Time Complexity : O(1)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Not found on leetcode
// Any problem you faced while coding this : No
class Stack {
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 

    //time complexity: O(1)
    boolean isEmpty() 
    { 
        //Write your code here
        if (top == -1)
            return true;
        return false;
    } 

    //constructor
    Stack() 
    { 
        //Initialize your constructor
        top = -1;
    } 

    //time complexity: O(1)
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if (top < 999) {
            top++;
            a[top] = x;
            return true;
        }
        else {
            System.out.println("stack overflow");
            return false;
        }
    } 

    //time complexity: O(1)
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top == -1) {
            System.out.println("stack underflow");
            return 0;
        }
        int res = a[top];
        a[top] = 0;
        top--;
        return res;
    }

    //time complexity: O(1)
    int peek() 
    { 
        //Write your code here
        if (top != -1) {
            return a[top];
        }
        return -1;
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
