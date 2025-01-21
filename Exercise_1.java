class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        return top < 0;
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
        if (top >= MAX -1) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top--]; //returns the top element and decrements the top index
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if (isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        } else {
            return a[top]; //returns the top element
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
