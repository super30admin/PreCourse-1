/**
 * Implement stack using Array
 */
class Stack {
    int stackSize;
    int top; 
    int a[];

    /**
     * Constructor
     */
    Stack(int size)
    {
        stackSize=size;
        top=-1;
        a = new int[stackSize];
    }
    /**
     * check whether stack is empty or not
     * @return true if stack is empty and false if not.
     */
    //Time Complexity:o(1)
    // Space complexity:o(1)
    boolean isEmpty() 
    {
        //if top is at -1 it means stack is empty
        return top==-1;
    }


    /**
     * Push the value x into stack and returns boolean value
     * @param x : int value
     * @return returns true if stack has a space and inserts value in a stack else returns false
     */
    //Time Complexity:o(1)
    // Space complexity:o(1)
    boolean push(int x) 
    {
        //There is a space available in the stack for new element
        if(top+1<stackSize){
            top++;
            a[top]=x;
            return true;
        }
        else{
            //element is not pushed because of stack overflow
            System.out.println(" Stack OverFlow");
            return false;
        }
    }

    /**
     * pop or remove the elemnt from the stack. If stack doesnt have ny elemnt then print Stack
     * underflow and return 0. else remove the top value return it
     * @return
     */
    //Time Complexity:o(1)
    // Space complexity:o(1)
    int pop() 
    {
        //If stack is empty
        if(isEmpty()) {
            System.out.println(" Stack Underflow");
            return 0;
        }
        else {
            return a[top--];
        }
    }

    /**
     * Return the top value of the stack.If stack is empty return 0 else return top element
     * @return int value
     */
    //Time Complexity:o(1)
    // Space complexity:o(1)
    int peek() 
    {
        if(isEmpty()) {
            return 0;
        }
        else {
            return a[top];
        }
    } 
} 
  
// Driver code 
 public class Exercise_1 {
    public static void main(String args[]) 
    { 
        Stack s = new Stack(100);
        System.out.println("Peek():"+s.peek());
        System.out.println("pop():"+s.pop());
        System.out.println("Stack Empty:"+s.isEmpty());
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Stack Empty:"+s.isEmpty());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Stack Empty:"+s.isEmpty());
    } 
}
