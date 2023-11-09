class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(this.top==-1){
            return true;
        }
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        this.top=-1; 
    } 
  
    boolean push(int x) 
    {
        if(top>= MAX){
            return false;
        }

        this.top++;
        this.a[this.top]=x;
        return true;

        //Check for stack Overflow
        //Write your code here

    } 
  
    int pop() 
    { 
        if(this.top<0)
        {
            System.out.println("Stack Underflow");
            return 0;

        }
        int te= this.a[this.top];
        this.top--;
        return te;
        //If empty return 0 and print " Stack Underflow"
        //Write your code here

    } 
  
    int peek() 
    { 
        //Write your code here
        return a[this.top];
    } 
} 
  
// Driver code 
public class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
