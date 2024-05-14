/**
 *
 * Time Complexity:
 * O(1) --> isEmpty(), push(), pop(), peek()
 *
 * Space Complexity:
 * O(1) --> isEmpty(), push(), pop(), peek()
 *
 */

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
//        Stack is empty if top equals to -1
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
//        check if max elements in the stack is reached if not add it to the last
        if(top==MAX-1)
            return false;
        //Write your code here
        a[++top] =x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write your code here
//        return last added element
        return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
//        If no eleemnts are there return -1 else return last element
        return top==-1?-1:a[top];
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
