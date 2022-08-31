class Stack { 
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    // Time Complexity : O(1)
    // Space Complexity : O(MAX) or O(n)
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        //Approch: Check if the top is pointing to 0th position in array and return boolean based on that.
        if(top == 0) {
            return true;
        } else {
            return false;
        }
    } 

    Stack() 
    { 
        //Initialize your constructor 
        //Initializing top to 0th position of array.
        top = 0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        //Check if top is not pointing to last position of array. 
        //If not pointing to last position, assign value to that position and increment top.
        if(top < MAX-1) {
            a[top] = x;
            top++;
            return true;
        } else {
            return false;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        //Check if top is not pointing to 0th position, then get value of at position top-1 and decrease top.
        if(top > 0) {
            int popped = a[top-1];
            top--;
            return popped;
        } else {
            System.out.println("Stack Underflow");
            return 0;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        //Check if top is pointing at 0th position, and then retrun value at top-1 position in array.
        if(top > 0) {
            return a[top-1];
        }else {
            return a[top];
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
