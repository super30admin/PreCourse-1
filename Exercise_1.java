//time complexity for all the methods is O(1)
//space complexity for all the methods is O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    
    //if top is -1 , stack is empty else not
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top==-1)
         return true;
        return false;
    } 
    

    //initializing top to -1
    Stack() 
    { 
        //Initialize your constructor 
        top=-1;
    } 
    

    //if top is greater than equal to size of array , cannot push elements else elements can be pushed after incrementing top
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top>=MAX)
         return false;
        a[++top]=x;
        return true;
    } 
    
    //if top is -1 , cannot pop elements else elements can be popped by decrementing top
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            System.out.println(" Stack Underflow");
            return 0;     
        }

        return a[top--];
    } 
    
    //if top is -1 , cannot return top element else it can be returned
    int peek() 
    { 
        //Write your code here
        if(isEmpty())
            return -1;
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
