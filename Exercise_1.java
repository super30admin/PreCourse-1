// Time Complexity: O(1)
// Space Complexity: O(n)
// Approach: Use top to denote the top of the stack
// While pushing, keep incrementing top, and popping keep decrementing top
class Stack { 
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 5; 
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
        if (top == MAX-1) {
            System.out.println("Stack Overflow");
            return false;
        }
        a[++top] = x;
        return true;
    } 
  
    int pop() 
    { 
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        }

        return a[top--];
    } 
  
    int peek() 
    { 
        if (!isEmpty()) return a[top];
        else return 0;
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
        s.push(40); 
        s.push(50);
        s.push(60);
        System.out.println(s.pop() + " Popped from stack"); 
        s.push(60);
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
