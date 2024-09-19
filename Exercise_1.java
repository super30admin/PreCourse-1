/* 
time complexities
    isEmpty() - O(1)
    push()  - O(1)
    pop() - O(1)
    peek() - O(1)
Space complexity:
    Stack - O(n) 
*/


class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {  
        // This method will return true top is negative which implies that the stack is empty. 
        //returns false if top is greater than or equal to zero which implies that the stack has some elements
        return (top < 0);
    } 

    Stack() 
    { 
        //Initialize your constructor. For every object that is created for the class Stack this constructor initializes stack with top element that indicates the size of the stack. 
        // Since a stack would be empty initially, top is initialized to -1.
        top = -1;  
    } 
  
    boolean push(int x) 
    { 
        /* 
        Check for stack Overflow
        Write your code here
        since MAX is initialised to 1000 the maximum index that the underlying stack will be able to handle is MAX -1. 
        Hence any element that comes after the top means that the stack is overflowing 
        */
        if(top >=MAX-1){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            // Increment the size of the stack that is the top and then assign this value to the top index in the array.
            top +=1;
            a[top] = x; 
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            // retrieve the top most element in the stack and decrement the top.
            return a[top--];
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top<0){
            System.out.println("Stack is empty");
            return 0;
        }
        else{
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
