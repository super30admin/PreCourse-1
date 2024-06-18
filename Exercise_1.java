// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int length;
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        return a.length == 0;
    } 

    Stack() 
    { 
        //Initialize your constructor
        length = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if (length + 1 > 1000) return false;
        length++;
        a[length] = x;
        return true;

    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(length == -1) return 0;
        int val = a[length];
        length--;
        return val;
    } 
  
    int peek() 
    { 
        //Write your code here
        if (a.length == -1) return -1;
        return a[a.length-1];
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
