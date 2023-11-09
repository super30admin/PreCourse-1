//Time Complexity - O(1) for all operations
//Space Complexity - O(n), where 'n' is the size of the array (Worst case is the complete     //array being used)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : On Leetcode, while running the code, it didn't     //accept class name Stack, so I changed it to Stack1

class Stack1 { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top==-1; //if stack is empty, it will return true else will return false   
    } 

    Stack1() 
    { 
        //Initialize your constructor 
        top = -1; //initializing top with a random negative number 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top==MAX-1) //if stack is full 
        {
            System.out.println("Stack is full.");
            return false;
        }else
        {
            top++; // incrementing top to push new element into the stack which will be the new top element
            a[top] = x;
            System.out.println("Pushed element: "+x);
            return true;
        }
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(!isEmpty())
        {
            int oldTop = top; // old top value will be used to return the element 
            top--;
            return a[oldTop];
        }else
        {
            System.out.println("Stack Underflow");
            return 0;
        }
            
    } 
  
    int peek() 
    { 
        if(!isEmpty())
            return a[top];
        else
        {
            System.out.println("Stack is empty");
            return -1;
        }
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack1 s = new Stack1(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}