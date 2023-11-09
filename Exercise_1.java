class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 100;
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        return (top < 0);
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top < MAX) {
            a[++top] = x;
            System.out.println("Pushed element: " + x);
            return true;
        }
        else {
            System.out.println("Stack overflow: " + x);
            return false;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top < 0)
            System.out.println("Stack underflow");
        else {
            int x = a[top--];
            System.out.println("Popped element: " + x);
            return x;
        }
        return 0;
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top < 0)
            System.out.println("Stack underflow");
        else {
            System.out.println("Return element: " + a[top]);
            return a[top];
        }
        return 0;
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
