// Operation:          push   pop    peek
// Time Complexity:     1      1      1
// Space Complexity:    n      n      n
// Yes, this code ran successfully
// No, I didn't face any problem in this problem

class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];                         // Maximum size of Stack
  
    boolean isEmpty() 
    {
        //Write your code here
        if(top > -1)                                // Stack is not Empty
            return false ;
        return true ;                               // Stack is Empty
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = -1 ;                                  // Initializing top to -1
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        top++ ;
        if(top > MAX)                               // Stack is full
        {
            top-- ;
            return false ;
        }
        else                                        // Stack is not full
        {
            a[top] = x ;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top < 0)                                 // Stack is Empty
        {
            System.out.println(" Stack Underflow");
            return 0 ;
        }
        else                                        // Stack is not Empty
        {
            int temp = a[top] ;
            top-- ;
            return temp ;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(!isEmpty())
            return a[top] ;                         // returning top element
        else
        {
            System.out.println("Stack is Empty");   // Stack is Empty
            return -1;
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
        System.out.println(s.pop() + " popped from stack");
        System.out.println("Top Element is "+s.peek());
    } 
}
