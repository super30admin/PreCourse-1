//TC 0(1)

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 

    Stack() 
    { 
        top=-1; // initializing top pointer
    } 

    boolean isEmpty() 
    { 
        //Write your code here
        return top==-1;
    } 
  
    boolean push(int x) 
    { 
        if(top==MAX){    //Check for stack Overflow
            System.out.println("Couldn't be pushed due to stack overflow");
        }
        top++;
        a[top]=x;
        return a[top]==x;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top==-1){
            System.out.println("Stack underflow");
            return 0;
        }
        //Write your code here
        top--;
        return a[top+1];
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top==-1){
            System.out.println("Stack underflow");
            return -1;
        }
        return a[top];
    } 
} 
  
// Driver code 
public class Exercise_1 { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");
        s.pop();
        s.pop();
        System.out.println(s.isEmpty());
    } 
}
