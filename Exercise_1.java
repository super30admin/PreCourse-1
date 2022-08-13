// Time complexity
// isEmpty: O(1)
// push: O(1)
// pop: O(1)
// peek: O(1)

// Space complexity
// O(MAX)

class Stack { 
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
        if (top == MAX - 1) {
            return false;
        }
        top++;
        a[top] = x;
        return true;
    } 
  
    int pop() 
    {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int poppedElement = a[top];
        a[top] = 0;
        top--;
        return poppedElement;
    } 
  
    int peek() 
    {
        if (isEmpty()) {
            return 0;
        } 
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
