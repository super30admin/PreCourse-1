// Time Complexity : O(1) for all operations.
// Space Complexity : O(N) where 'N' is the size of the stack.


class Stack { 
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 

    Stack() 
    { 
        top = -1;
    } 

    //Check if stack is empty, if empty return true else false.
    boolean isEmpty() 
    { 
        if(top < 0){
            return true;
        }

        return false;
    } 
  
    //Push elements to the stack, if stack is full return false else true. Increment the top pointer.
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top == MAX){
            System.out.println("Stack Overflow");
            return false;
        }

        a[++top] = x;
        return true;
    } 
  
    //Pop elements from stack, if stack is empty return 0 and print " Stack Underflow". Else return the popped element. Decrement the top pointer.
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }

        int temp = a[top];
        a[top] = 0;
        top--;
        return temp;
    } 
  
    //Return the top element.
    int peek() 
    { 
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
