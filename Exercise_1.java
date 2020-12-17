class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return top == -1;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        top++;
        if (top == a.length) {
            return false;
        }
        //Write your code here
         a[top] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (isEmpty())
        {
            System.out.println("Stack underflow");
            return 0;
        }
        return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
        if (!isEmpty())
        {
            return a[top];
        }
        return Integer.MAX_VALUE;
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


// Time Complexity : O(1), since we push and pop elements to and from the array using an index(top) of array directly
// Space Complexity : O(N) - N is the no.of elements of stack
// Did this code successfully run on Leetcode : I executed it on IntelliJ IDE and it ran fine
// Any problem you faced while coding this : Not really


// Your code here along with comments explaining your approach : self explanatory

