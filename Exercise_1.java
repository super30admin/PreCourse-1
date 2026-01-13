
//Please read sample.java file before starting.
//Kindly include Time and Space complexity at top of each file

// Time Complexity :O(1)
// Space Complexity :O(MAX) (MAX is size of stack)
// Did this code successfully run on Leetcode : ran code locally
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    //check if array is empty by checking top value
    boolean isEmpty() 
    { 
        return top==-1;
    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //top shouldnot be >MAX
        if (top >= MAX - 1) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        a[++top] = x; 
        return true; 
    } 
  
    int pop() { 
        //if top is -1 then array is empty
        if (isEmpty()) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        return a[top--]; 
    }
  
    int peek() 
    { 
        if (isEmpty()) { 
            System.out.println("Stack is Empty"); 
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
