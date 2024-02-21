class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top==-1)
            return true;
        return false;
    } 

    Stack() 
    { 
        top = -1; // Initialize top of stack to -1
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top==max-1){
            System.out.println("Element cannot be pushed to the stack.")
                return false;
        }
              a[++top] = x;
            return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top==-1){
            System.out.println(" Stack Underflow");
            return 0;
        }
        int popValue = a[top--];
        return popValue;
    } 
  
    int peek() 
    { 
        if(top==-1){
            System.out.println(" Stack is empty");
            return -1;
    }
        return a[top];
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
