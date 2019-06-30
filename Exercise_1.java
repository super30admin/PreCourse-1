class Stack {
    private static final int MAX = 1000;
    private int top ;
    private int a[] = new int[MAX]; // Maximum size of Stack
    private int size = 0;
  
    private boolean isEmpty()
    { 
        //Write your code here
        if(this.size == 0)
            return true;
        return false;

    }

    private boolean isFull()
    {
        //code for checking stack overflow
        if(this.MAX == Stack.MAX)
            return false;
        return true;
    }

    Stack() 
    { 
        //Initialize your constructor
        this.top = -1;
        int[] a = new int[]{};
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(isFull())
            return false;

        this.size++;
        this.a[++top] = x;
        return true;

    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        this.size--;
        int result = this.a[top];
        this.a[top] = 0;
        this.top--;
        return result;

    } 
  
    int peek() 
    { 
        //Write your code here
        if(size==0)
            return 0;

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
