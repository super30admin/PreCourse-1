class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top==0) { System.out.println("Stack is Empty"); return true;}
        else return false;

    } 

    Stack() 
    { 
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here

        if(top>=MAX-1) { System.out.println("Stack Overflow"); return false;}
        else {top=top+1; a[top]=x; System.out.println("Pushed "+x+" into the stack"); return true;}
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top<0) {System.out.println("Stack Underflow"); return 0;}
        else{
            int temp = a[top];
            top--;
            return temp;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
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
        System.out.println("Top of the stack is " + s.peek());
        System.out.println(s.pop() + " has been popped from stack");
        System.out.println("Top of the stack is " + s.peek());
    } 
}
