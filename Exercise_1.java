import java.util.Arrays;

class Stack { 
    // Time complexity for push, pop and peek is 1 as there is no loop
    // Space complexity is 1
    // Code ran succefully on leetcode with modifications done for the leetcode problem
    /* While popping an element, I was copying top-1 elements to array a,
     which caused problem in overall length to be top-1 instead of MAX, figured it out while running code in leetcode */
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top == -1){
            return true;
        }
        return false;
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
        if(top < MAX-1){
            a[++top] = x;
            return true;
        }
        return false;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(!isEmpty()){
            int popElement = a[top];
            top--;
            return popElement;
        }
        System.out.println("Stack Underflow");
        return 0;
    } 
  
    int peek() 
    { 
        //Write your code here
        if(!isEmpty()){
            return a[0];
        }
        return -1;
        
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
