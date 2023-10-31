//Time complexity for push: O(1)
//Time complexity for pop: O(1)
//Time complexity for peek: O(1)
//Space complexity for push: O(1)
//Space complexity for pop: O(1)
//Space complexity for peek: O(1)
class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;

    //store the index to the topmost element of the stack
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        return top == -1;
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
        if(top == MAX-1) {
            System.out.println("Stack Overflow");
            return false;
        }

        //Insert data at the top of the stack
        top++;
        a[top] = x;

        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        //Retrieve data from the top of the stack and move pointer 1 index behind
        int ans = peek();
        a[top] = 0;
        top--;

        return ans;
    } 
  
    int peek() 
    { 
        //Write your code here
        //If empty return -1 and print " Stack is empty"
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        //return top most element from the stack
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
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
