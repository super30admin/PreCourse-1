class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty()
    {
        //Write your code here
        if(top>=0){
            return false;
        }
        else {
            return true;
        }
    }

    Stack()
    {
        //Initialize your constructor
        top = -1;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        if(top>=MAX-1){
            System.out.println("Stack overflow");
            return false;
        }
        else{
            top=++top;
            a[top] = x;
            return true;
        }
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(!isEmpty()){
            int x = a[top];
            top = --top;
            return x;
        }
        else{
            System.out.println("Stack underflow");
            return 0;
        }
    }

    int peek()
    {
        //Write your code here
        if(!isEmpty()){
            int x = a[top];
            return x;
        }
        else{
            System.out.println("Stack underflow");
            return 0;
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
