// Time Complexity : For N elements - pop() takes O(N), push() takes O(N), peek() and isEmpty() is constant
// Space Complexity : Note we are setting an initial static array of siZe 1000. For N elements - pop() occupies no space, push() occupies O(N) space, peek() and isEmpty() doesn't occupy space


class Stack { 
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Check if array a is empty
        // we check for logical emptyness rather than physical emptyness 
        if (top == -1) {
            return true;
        }
        else {
            return false;
        }
        
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
        // Overflow occurs when we are stacking more than the size of the stack which here is MAX
        // so we can check if top > MAX - 1 then we run into an overflow
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            top = top + 1;
            a[top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int ele = a[top];
            a[top] = 0;
            top = top - 1;
            return ele;
        }
        
    } 
  
    int peek() 
    { 
        //Write your code here
        if (top > -1) {
            return a[top];
        } else {
            return 0;
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
