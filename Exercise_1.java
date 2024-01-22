/* Time Complexity
    push - O(1)
    Pop - O(1)
    Peek - O(1)
*/

/* Space Complexity
    O(Max) -> Max is the Maximum size of the array
*/
class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        return top == -1;
    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top > MAX) {
            System.err.println("Stack Overflow Error: Stack is full");
            return false;
        } else
            a[++top] = x;

        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top < 0) {
            System.err.println("Stack Underflow Error: Stack is empty");
            return 0;
        }

        return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top < 0) {
            System.err.println("Stack Underflow Error: Stack is empty");
            return 0;
        }

        return a[top--];
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
