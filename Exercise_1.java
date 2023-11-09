class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top < 1);
        //Write your code here 
    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if (top > (MAX - 1))
        {
            System.out.println("Stack is fullll");
            return false;

        }
        else
        {   top++;
            a[top] = x;
            
            System.out.println("Element is pushed into the stack ");
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if( top < 0)
        {
            System.out.println("Stack is empty");
        }

        int data;
        data = a[top];
        a[top] = 0;

        top--;
        return data;
    } 
  
    int peek() 
    { 
        //Write your code here
        if( a[top] < 0)
        {
            System.out.println("Stack is empty");
        }
        int data = a[top];
        return data;
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
