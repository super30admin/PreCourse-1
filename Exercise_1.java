/*
 * Time Complexity for push, pop and peek is O(1) 
 * space complexity is also O(1) this has a constant size array of 100 so O(1) space complexity
 */

class Stack { 
    //Please read sample.java file before starting.
   //Kindly include Time and Space complexity at top of each file


    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return a.length == 0;// checking the array length for emptiness
    } 

    Stack() 
    { 
        top =  -1;  // initializing the top index to -1 as it does not point to any data initially
    } 
  
    int push(int x) 
    {   
        top++;
        if(top >= MAX){
            // checking the overflow
            System.out.println("stack overflow");
            return 0;
        }

        a[top] = x; 
        return x;
    } 
  
    int pop() 
    { 
        if(top <0){
            // checking if the stack is empty
            System.out.println("Stack Underflow");
            return 0;
        }
        
            int value = a[top];
            top--;
            return value;

    } 
  
    int peek() 
    { 
        if(top >-1 && top < MAX)
            return a[top];
        
        System.out.println("Stack is empty");
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
        System.out.println(s.peek());
        
    } 
}
