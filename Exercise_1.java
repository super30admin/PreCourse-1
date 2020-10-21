package S30.PreCourse_1;

// Time Complexity : Push: O(1), Pop: O(1), Peek: O(1)
// Space Complexity : O(1) - Size of stack is fixed as value of MAX
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : None

class Stack {
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(this.top == -1) return true;
        return false;
    } 

    Stack()
    { 
        this.top = -1;
    } 
  
    boolean push(int x) 
    {
        if(top+1 >= MAX-1){
            System.out.println("Maximum Capacity Exceeded. Stack Overflow");
            return false;
        }
        a[++top] = x;
        return true;
    } 
  
    int pop() 
    {
        if(top <= -1){
            System.out.println("Stack Underflow");
            return 0;
        }
        int result = a[top--];
        return result;
    } 
  
    int peek() 
    {
        if(top <= -1){
            System.out.println("Stack Empty");
            return 0;
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
