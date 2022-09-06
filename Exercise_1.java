// Time Complexity :
//push() 	O(1)
//pop()   	O(1)
//isEmpty() 	O(1)
//size()	O(1)
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return (top <0 );
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        If(top > = (MAX-1)){
            System.out.println("stack overflow");
            return false;
        }
        //Write your code here
        a[++top] =x;
        System.out.println(x + " pushed into stack");
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        If(top < 0)
        {
            return 0;
        }
        //Write your code here
        else{
            int x = a[top--]; //assign x the value of a[top] and decrement the top
            return x;
        }
        
    } 
  
    int peek() 
    { 
        //Write your code here
        // stack underflow 
        if(top<0){
            System.out.println("stack underflow");
            return 0;
        }
        else{
            int x = a[top];
            return x;
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
