class Stack { 
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file

    //Time Complexity: O(1) for all the methods because they all perform constant-time operations.
    //Space Complexity: O(N) where N is the max size of the stack.
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        return top == -1; 
        //if this condition is true, then the stack is empty
        //if its false, stack is not empty
    } 

    Stack() 
    { 
        //Initialize your constructor
       this.top = top;
       //initializing top to -1 to indicate empty
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if (top >= MAX - 1){
            System.out.print("Stack Overflow");
            return false;
        } else{
            a[++top] = x;
            return true;
        }
        //If top's value is greater than the MAX, theres stack overflow
        //else, increment top and set value to x at that position
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            System.out.print("Stack Underflow");
            return 0;
        }else{
            return a[top--];
        }
        //If the stack is empty, then prints Stack Underflow
        //Else, pops off most recent value in array then decrements top
    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty()){
            System.out.print("Stack Empty");
            return 0;
        }else{
            return a[top];
        }
        //If stack is empty, then prints empty
        //else, returns value at the index indicated by top's value
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
