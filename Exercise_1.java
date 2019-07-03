class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        //checking if the stack top is undefined
        if (top == -1){
            return true;
        }
        return false;
    } 

    Stack() 
    {
        //init
        top = -1;
    } 
  
    boolean push(int x) 
    {

        //Check for stack Overflow
        if ((top+1)>MAX) {
            System.out.println("Stack Overflow");
            return false;
        }
        //no overflow, continue adding it to the stack
        top += 1;
        a[top] = x;
        return true;
    }
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }

        //Write your code here
        top -= 1;

        //returning the current element which is in next index, top+1
        return a[top+1];
    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty())
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
