// Time Complexity :
/*  isEmpty() : O(1)
 *  push(int x): O(1)
 *  pop(): O(1)
 *  peek(): O(1)
 */
// Space Complexity : O(n)

// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : Had to go through how to calculate space complexity

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        // If top is -1 return true else false
        if (top<0) {
            return true;
        }else{
            return false;
        }

    
    } 

    Stack() 
    { 
        // Assigning top index as -1
        top=-1;
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        // if top is at max, give out error
        if (top==MAX){
            System.out.println("Stack Overflow");
            return false;
        }else{
            // Else increment top by one and insert input element
            top++;
            a[top]= x;
            return true;
        }
       
    } 
  
    int pop() 
    { 
        // If array is empty, throw error
        if (top<0) {
            System.out.println("Stack Underflow");
            return 0;
        }else{
            //Else, return the top value and decrement top pointer
            int popVal= a[top];
            a[top]=0;
            top--;
            return popVal;
        } 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    { 
        //Write your code here
        // if top is at max, give out error
        if (top<0) {
            System.out.println("Stack Underflow");
            return 0;
        }else{
             //Else, return the top value
            int popVal= a[top];
            return popVal;
        } 
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        System.out.println("The stack is empty: "+s.isEmpty());
        s.push(10); 
       
        s.push(20);
         
        s.push(30); 
      
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println("The stack is empty: "+s.isEmpty());
        System.out.println("Peeking the top element: "+ s.peek());
        System.out.println(s.pop() + " Popped from stack"); 


    } 
}
