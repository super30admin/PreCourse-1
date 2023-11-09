// Online Java Compiler
// Use this editor to write, compile and run your Java code online

/* Time and Space Complexity
 * Time complexity for all function in Stack class is o(1);
 * Space complexity of Stack Class is O(1);
 * 
 */

// Online Java Compiler
// Use this editor to write, compile and run your Java code online


class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top==-1)
        {
            return true;
        }
        else{
            return false;
        }
    } 

    Stack() 
    { 
       top =-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top == a.length-1)
        {
           return false;
        }
        else{
            top++;
            a[top]=x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty())
        {
            System.out.print("Underflow");
            return -1;
        }
        else{
             int x = a[top];
             top--;
             System.out.println("Popped Element =");
             return x;
        }
    } 
  
    int peek() 
    { 
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
        System.out.println(s.peek() + "Peek");
        System.out.println(s.pop() );
        System.out.println(s.pop() );
        System.out.println(s.pop() );
        System.out.println(s.pop() );
        
    } 
}