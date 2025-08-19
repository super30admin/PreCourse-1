//Time Complexity: O(1)
//Space Complexity: O(1)
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        return top == 0;
    } 

    Stack()
    {
        //Initialize your constructor
        this.top = 0;
    }

    /**
     *
     * @param x the number to add to the stack
     * @return  if top < MAX, add the element at the end of the array, return true
     *          else print "Stack Overflow" and return false
     */
    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        if (top >= MAX) {
            System.out.println("Stack Overflow");
            return false;
        }

        a[top] = x;
        top++;

        return true;
    }

    /**
     *
     * @return pop and return the last element from the stack which is the top element in the array
     */
    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top == 0) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int popped = a[top - 1];
        a[top - 1] = 0;

        top--;
        return popped;
    }

    /**
     *
     * @return the top element from the stack which is the last element in the array
     */
    int peek()
    {
        if (top == 0) {
            System.out.println("Stack Underflow");
            return 0;
        }

        return a[top - 1];
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

