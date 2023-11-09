// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : NO

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Checking top position, if it is equal to -1 then there is no elements in Stack
        if(top == -1)
            return true;
        return false;
    } 

    Stack() 
    { 
        // Initializing top with -1
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //If top is equal to MAX-1, then it means Stack reached its max capacity
        if(top == MAX - 1){
            System.out.println("Stack Overflow");
            return false;
        }
        //Increment top by 1 and store current element at index top
        top++;
        a[top] = x;
        return true;
    } 
  
    int pop() 
    { 
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        //If Stack is not underflow
        //First store the top index value
        int val = a[top];
        //Decrement top index by 1 to delete top element
        a[top] = 0;
        top--;
        return val;   
    } 
  
    int peek() 
    { 

        if(isEmpty())
            return 0;
        //Returning top index value, if stack is not empty
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
