class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        if(this.top == 0) return true;
        else return false;
    }

    Stack()
    {
        //Initialize your constructor
        this.top = 0;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        if(this.top < 1000){
            a[this.top] = x;
            this.top++;
            return true;
        }else{
            System.out.println("Stack Overflow with stack size: " + String.valueOf(MAX) );
            return false;
        }
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        this.top--;
        if(this.top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int popped = a[this.top];
            a[this.top] = 0;
            return popped;
        }
    }

    int peek()
    {
        if(this.top < 0 || this.top > 999){
            return 0;
        }else{
            return a[this.top];
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
