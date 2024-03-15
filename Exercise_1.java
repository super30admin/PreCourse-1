/*
 * Time Complexity: 
 * 1. isEmpty - O(1)
 * 2. push - O(1)
 * 3. pop - O(1)
 * 4. peek - O(1)
 * 
 * Space complexity - O(MAX)
 */
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top < 0;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top == MAX) {
            return false;
        }
        a[++top] = x;
        return true;
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--];
        //Write your code here
    } 
  
    int peek() 
    { 
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
        System.out.println("Peek: " + s.peek());
        System.out.println("isEmpty: " + s.isEmpty());

    } 
}
