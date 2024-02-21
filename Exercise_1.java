class Stack { 
    /*Time Complexity:
     * isEmpty(), push(), pop(), peek() : O(1) since every method got run in one iteration
     * Space Complexity:
     * It is O(n); where, n is the max size of the stack
     * 
     * Couldn't able to find the exact same problem in leetcode. However it worked in my local.
     * Output : 30 Popped from stack
     * 
     * Felt bit counfusing to play arount with top element.
     * 
     * 
     */
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    Stack() 
    { 
        //Initialized the constructor with no elements in the stack
        top = -1;
    } 

    boolean isEmpty() 
    { 
        return (top<0);
    } 
  
    boolean push(int x) 
    { 
        if ( top >= (MAX -1)){   //Checked for stack Overflow
            System.out.println("stack Overflow");
            return false;
        }else{
           a[++top] = x;   // Added an element to the stack
           return true;
        }
    } 
  
    int pop() 
    { 
       
        if (top<0){  // empty returned 0 and checked " Stack Underflow"
            System.out.println("stack Underflow");
            return 0;
        }else{
            int x = a[top--];   //removed a topmost element from the stack
            return x;
        }
    } 
  
    int peek() 
    { 
        if (top<0){ // empty returned 0 and checked " Stack Underflow"
            System.out.println("stack Underflow");
            return 0;
        }else{
            return a[top];   //Just looked at the top most element in the stack
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
