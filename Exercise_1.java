// Time Complexity : O(n) to insert
// Space Complexity : O(n) -> n is the number of tree nodes
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : No
class Stack {
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        return top < 0;
    }

    Stack() 
    {
        //constructor initialization
        top = -1;
    }
  
    boolean push(int x) 
    {
        if(top >= (MAX-1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " Pushed into stack successfully");
            return true;
        }
    } 
  
    int pop() 
    { 
        if(top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int topElement = a[top--];
            return topElement;
        }
    } 
  
    int peek() 
    {
        if(top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int topElement = a[top];
            return topElement;
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
