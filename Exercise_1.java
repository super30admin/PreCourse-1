class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    
    /**
     * Time complexity: O(1)  
     * Space complexity: O(1)
     */
    boolean isEmpty() 
    { 
        return top < 0;
    } 

    /**
     * Time complexity: O(1)  
     * Space complexity: O(1)
     */
    Stack() 
    { 
        //Initialize your constructor 
        this.top = -1;
    } 
    
    /**
     * Time complexity: O(1)  
     * Space complexity: O(1)
     * @param x to be pushed
     * @return true if the push is successful
     */
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if (top < MAX) {
            a[++top] = x;
            return true;
        }
        return false;
    } 
  
    /**
     * Time complexity: O(1)  
     * Space complexity: O(1)
     * @return -1 If empty, 
     */
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if (top < 0) {
            System.out.println(" Stack Underflow");
            return -1;
        }
        int poppedElement = a[top];
        a[top--] = 0;
        return poppedElement;
    } 
  
    int peek() 
    { 
        if(top < 0) return -1;
        return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        System.out.println(s.isEmpty());
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.isEmpty());
    } 
}
