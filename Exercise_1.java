class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    boolean isEmpty() 
    { 
        //Write your code here 
        return top ==0;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = 0;
    } 
  
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        
        if(top <= MAX) {
            a[top] = x;
            top++;
            return true;
        } else {
            System.out.println("Stack Overflow");
            return false;
        }

    } 
  
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()) {
           System.out.println("Stack Underflow"); 
           return 0;
        }
        
        return a[--top];
    } 
  
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    int peek() 
    { 
        //Write your code here
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return 0;
        }
        return a[top-1];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20);
        s.pop();
        s.push(30); 
        s.pop();
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
