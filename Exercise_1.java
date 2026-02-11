//T.C - O(1) , S.C - O(n)
// Your code here along with comments explaining your approach
/*
* I take a top variable which keeps track of the top element of stack and I increment and decrement it depending
* upon push or pop operation*/
class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        return top == 0;
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
        if(top == MAX)
            return false;
        a[top++] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == 0) {
            System.out.println("Stack underflow");
            return 0;
        }
        return a[--top];
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top == 0)
            return 0;
        return a[top - 1];
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
