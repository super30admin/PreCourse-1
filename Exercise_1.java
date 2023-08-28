class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
  
    static final int MAX = 1000;  // Random size given to the array
    int top; // Variable to store the last index until which elements are added to the array
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    // Method to evaluate whether the array a[] is empty or not
    // Returns true if empty else false
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

    // Constructor for class Stack
    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  
    // Method to push/add data into the array a[] at the next available index of the array.
    // top variable comes to rescue here as we do neet to traverse to the end of array as we know where exactly
    // the element needs to be added.
    // Time Complexity: O(1)
    boolean push(int x) 
    { 
        //Check for stack Overflow
        top +=1;
        if (top>=MAX)
        {
            return false;
        } 
        a[top] = x;
        return true;
    } 

    // Method to remove the last element of the array (which was pushed) 
    // top variable comes to rescue here as we do neet to traverse to the end of array as we know where exactly
    // the element needs to be removed.
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
    // Method to get the last eements of the array(which was pushed)
    //top variable comes to rescue here as we do neet to traverse to the end of array as we know where exactly
    // which is the last elemet.
    int peek() 
    { 
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
