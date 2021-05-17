class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack
    int size = a.length;
  
    boolean isEmpty() 
    { 
        //Write your code here
        return (top == -1); //if there is no element in the stack return false
    } 

    Stack() 
    { 
        //Initialize your constructor
        this.top = top;


    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if (top !=  size-1) {   //if top is not the max element in the stack
              top++;
              a[top] = x;
              System.out.println("Pushing element to the stack" + a[top]);
              return true;
        }
        else {
            return false;
        }

    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(!isEmpty()) {    //checking if the stack is not empty
            int elementToReturn = top;
            top--;
            System.out.println("Return top element" + a[elementToReturn]);
            return a[elementToReturn];
        }
        else {
            System.out.println("Stack underflow");
            return 0;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if (!this.isEmpty()) {   //checking the stack is not empty and returning the topmost element
            return a[top];
        }
        else {
            System.out.println("Stack is empty");
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
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + "Top element");
        s.push(40);
        System.out.println(s.pop() + " Popped from stack");
    } 
}
