class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        return (top == -1);
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow and add the element to the top of the stack
        if (top == a.length-1) {
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow" and remove the element from the top
        if(top == -1) return 0; else return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top == -1) return 0; else return a[top];
        
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

/* Time complexity is constant time 
-- O(1) since we are incrementing, removing, checking single (top) element in an array

Space Complexity is O(1)
*/ 