class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
  // isEmpty -> Constant time
  // push -> contant time
  // Pop -> Constant Time
  // peek -> Constant time
  // space constant for all the methods
  // its ran on leetcode
  // not much difficulty
    static final int MAX = 1000; 
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
        if(top < MAX){
            a[++top] = x;
            return true;
           
        }
        else{
            return false;
        }

    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == -1){
            System.out.println("stack underflow");
            return 0;
        }
        else{
            int popval = a[top];
            top--;
            return popval;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top == -1){
            return 0;
        }
        else{
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
    } 
}
