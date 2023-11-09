// "static void main" must be defined in a public class.
class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    // space - o(n), where n is the size of array.
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        if(top<0){
            return true;
        }
        return false;
    }

    Stack()
    {
        //Initialize your constructor
        int top=-1;
    }
    //o(1)
    boolean push(int x)
    {
        //Check for stack Overflow
        if(top>=MAX-1){
            System.out.println("Cannot add more elements");
            return false;
        }
        //Write your code here
        top++;
        a[top]=x;
        System.out.println("Added"+ x +" to the stack");
        return true;
    }

    //o(1)
    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        if(top<0){
            System.out.println("Stack underflow");
        }
        int value= a[top];
        top--;
        //Write your code here
        return value;
    }

    //o(1)
    int peek()
    {
        //Write your code here
        if(top<0){
            System.out.println("Stack underflow");
        }
        int value = a[top];
        return value;
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
