class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if ( this.top == -1 ) {
            return true;
        }
        else {
            return false;   
        }
        
    } 

    Stack() 
    { 
        //Initialize your constructor 
        this.top = -1; //Initialize top to -1 to denote that it's empty currently we'll push after post increment top
        
    } 
  
    boolean push(int x) //return type boolean to confirm if push process is success
    { 
        //Check for stack Overflow
         //Write your code here
        
        if (this.top == MAX) {   // we would reach this condition when a[Max - 1] is filled since we do ++top
            System.out.println("Stack Overflow"); 
            return false;
        }
        else {
            a[++top] = x; // increment top then Push element 
            return true;
        }
       
        
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
       if (this.top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top--]; // post decrement operator helps us to perform pop operation here, after 0th element id popped stack is empty 
            return x;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if (this.top < 0) { //Check if stack is empty
            System.out.println("Stack Underflow");
            return 0;
        }
        else { // if not return the top element
            int x = a[top];
            return x;
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
