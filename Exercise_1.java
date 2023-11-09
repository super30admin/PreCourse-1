class Stack { 
    /*
     * Time Complexity:: isEmpty() = O(1), push() = O(1), pop() = O(1), peek() = O(1)
     * Space Complexity:: O(MAX) where MAX is the maximum length of the array
     * 
     * Approach:: Used "top" to maintain the top of the stack. It always 
     * points to the index in the array where the last element was pushed/popped.
     */
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        if (top == -1)
            return true;
        else
            return false; 
    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        if (top == a.length)
            return false;
        a[++top] = x;
        return true;
    } 
  
    int pop() 
    { 
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int value = a[top--];
        return value;
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
    } 
}
