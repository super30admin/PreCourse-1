class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
  
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    // Time Complexity: O(1)
    boolean isEmpty() 
    { 
        //Write your code here 
        if (top ==-1)
        {
            return true;
        }
        else {
            return false;
        }
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  
    // Time Complexity: O(1)
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        top +=1;
        if (top>=MAX)
        {
            return false;
        } 
        a[top] = x;
        return true;
    } 

  // Time Complexity: O(1)
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top==-1)
        {
           System.out.println(" Stack Underflow");
           return 0;
        }
        else 
        {
          int popped_item = a[top];
          a[top]=0;
          top-=1;
          return popped_item;
        }
    } 
  
    // Time Complexity: O(1)
    int peek() 
    { 
        //Write your code here
        if (top ==-1)
        {
            return 0;
        }
        else {
            return a[top];
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
        System.out.println(s.peek()+ " Top element of the stack");
        System.out.println(s.isEmpty()+"  is Empty.");
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.isEmpty()+"  is Empty.");
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.peek()+ " Top element of the stack");
    } 
}
