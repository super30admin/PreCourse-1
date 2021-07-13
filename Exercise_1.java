class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top==-1)  {
            System.out.println("Stack is empty.");
            return true;
        }
        else return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
        
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top==MAX-1){
            // System.out.println("Stack Overflow");
            return false;
        } else {
            //Write your code here
            a[++top] = x;
            System.out.println("Pushing "+x+" at index: "+top+" a["+top+"]:" +a[top]);
            return true;    
        }
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top<0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        System.out.println("Popping: "+a[top]);
        return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top<0) {
            System.out.println("Stack is empty!");
            return 0;   
        }
        System.out.println("Peek: "+a[top]);
        return a[top];
    } 
} 
  
// Driver code 
public class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack();
        s.isEmpty();
        s.push(10); 
        s.push(20);
        s.isEmpty();
        s.push(30); 
        // System.out.println(s.pop() + " Popped from stack"); 
        s.peek();
        s.pop();
        s.pop();
        s.pop();
        //Adding false conditions for Underflow
        s.pop();
        //or peek
        s.peek();
        
    } 
}
