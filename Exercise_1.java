// Time complexity O(1)
// Space complexity o(n)
// top is index of array that will be used to perform stack operations on an array a.

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
        top = 0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	System.out.println(top + "is top");
        if (top < MAX) {
            a[++top] = x;
            System.out.println(x + "is pushed to stack");
            return true;
        } else {
            System.out.println("Stack Overflow");
            return false;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top--];
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        int peekItem = top < 0 ? 0 : a[top];
        return peekItem;
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
