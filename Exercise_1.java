
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    /*
    Time Complexity:
    push() operation -> O(1)  since we are adding elements at the top so no need to
                              traverse the whole array
    pop() operation->O(1)     since we are removing elements from the top so no need to
                              traverse the whole array
    peek() operation->O(1)   since we can access top element directly
    isEmpty() operation-> O(1) only one condition is being checked

    Space Complexity:
    For all operations is O(1) since we are not allocating extra space for storing
     array elements
     */

class Stack {
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    } 

    Stack() 
    { 
        //Initialize your constructor
        //initialize top of the stack as -1 first
        //its index will be 0 when first element gets added to stack
        top=-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        //stack is full, so don't push element on top of stack
        if(top>=MAX-1)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            //increment top by 1 and insert element at top of stack
            top++;
            a[top]=x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If stack is empty return 0 and print " Stack Underflow"
        //Write your code here
        if(this.isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            //fetch the element at top of stack and reduce top index by 1
            int temp=a[top];
            top--;
            //return the popped element from stack
            return temp;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        //return element present at top of the stack
        //if no element at top
        if(top==-1)
        {
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
