// Time complexity of all operations is O(1); Space complexity is O(n)
// Couldn't find exact question on leetcode but executed all precourse 1 problems on leetcode playground successfully.
// No Problems faced while coding this



class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return (top < 0);
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
        if (top >= (MAX - 1))
        {
            System.out.println(" This stack is full: Stack Overflow! ");
            return false;
        }
        else
        {
            System.out.println(" Pushing item " + x + " " + "onto the top of the stack");
            top++;
            a[top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int res = a[top];
            top--;
            return res;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if (top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            return a[top];
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
