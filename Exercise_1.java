
/**
 * Class implementing stack using array.
 * Time complexity: O(1)
 * Space complexity: O(MAX)
 */
class Stack {
    static final int MAX = 1000; // Maximum size of Stack
    int top; // Top pointer
    int[] stackUsingArray;
    int EMPTY_STACK_INDEX;

    // boolean isEmpty method was here


    Stack() 
    {
        //Initialize your constructor
        //Initialize array
        this.stackUsingArray = new int[MAX];
        this.EMPTY_STACK_INDEX = -1;
        //Initialize top pointer
        this.top = EMPTY_STACK_INDEX; //This indicates that the stack is initially empty.
    }

    boolean isEmpty()
    {
        //Write your code here
        return top == -1;
    }

    boolean push(int x) 
    { 
        //Check for stack Overflow
        if (top >= MAX - 1) {
            System.out.println("Cannot push new element. \nStack already full. " +
                    "\nPop an element before pushing new element.");
            return  false;
        }
        //Write your code here
        //Adding new element to stack if it is not already full
        stackUsingArray[++top] = x;
        System.out.println("Successfully pushed element " + x + " to stack");
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if (this.isEmpty()) {
            System.out.println("Stack underflow");
        }
        //Write your code here
        //Popping the top element form the stack
        return stackUsingArray[top--];

    } 
  
    int peek() 
    { 
        //Write your code here
        if (this.isEmpty()) {
            System.out.println("Stack underflow. Nothing to peek here.");
        }
        return stackUsingArray[top];
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
        System.out.println(s.peek() + " Peek from stack");
    } 
}
