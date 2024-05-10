//push(int x) : O(1) 
//pop() : O(1)
//peek() : O(1)
//isEmpty() : O(1)
//Final Time complexity - O(1)
//Space Complexity : O(n) where n will be the maximum size of the stack
//problem faced while coding this : Managing stack overflow manually
//Leetcode : Yes

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        //we check if the top is less than 0 as that indicates that the stack is empty.
        return (top < 0);
    } 

    Stack() 
    { 
        //Initialize your constructor 
        //initalize top to be -1 whe we create a new stack. 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        //check if top is pointing to the maximum index that is allowed. If it does, then there is a stack overflow. 
        //Return false to show that we cannot push an element more. 
        if (top >= (MAX - 1)) { 
            System.out.println("There is Stack Overflow"); 
            return false; 
        } 
        //If stack is not full, we increment the top pointer and then push the element to the stack. 
        else { 
            a[++top] = x; 
            System.out.println(x + " is pushed into stack"); 
            return true; 
        } 
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        //If stack is empty, then we cannot pop an element hence return false. 
        if (isEmpty()) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        //If stack is not empty, remove the element by decrementing the top pointer
        else { 
            int x = a[top--]; 
        //return the top element
            return x; 
        } 
    } 
  
    int peek() 
    { 
        //Write your code here
        //if stack is empty, then there is not top element to return.
        if (isEmpty()) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        // return the element which is at the top. 
        else { 
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
