// Exercise_1 : Implement Stack using Array.

class StackAsArray { 
    static final int MAX = 1000; 
    int top; // taking top variable as size of the array
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top==0)
        {
            return true;
        } 
        return false;
    } 

    StackAsArray() 
    { 
        //Initialize your constructor 
        top=0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top>=MAX)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        //Write your code here
        a[top]=x;
        System.out.println("Pushed value "+a[top]);
        top++;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print "Stack Underflow"
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write your code here
        int result=a[top-1];
        a[top-1]=0;
        top--;
        return result;
    } 
  
    int peek() 
    { 
        // if stack is empty
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write your code here
        int result=a[top-1];
        return result; 
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        StackAsArray s = new StackAsArray(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
