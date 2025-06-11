// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Couldn't find
// Any problem you faced while coding this : I had to brush my skills before doing it
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top == -1)
        return  true;
        else return false;

    } 

    Stack() 
    { 
        this.top = -1;
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        if(top == MAX-1){
            System.out.println("Stack Overflow");
        }
        else{
            top = top+1;
            a[top] = x;
            return true;
        }
        return false;
        //Check for stack Overflow
        //Write your code here
    } 
  
    int pop() 
    { 
        if(top == -1){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return a[top--];
        }
    } 
  
    int peek() 
    { 
        return a[top];
        //Write your code here
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
