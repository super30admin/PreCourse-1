//Time Complexity: O(1)
// Space Complexity: O(n)
class Stack {
    static final int MAX = 1000;
    int top; 
    int[] a = new int[MAX]; // Maximum size of Stack
  
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
        if(top >= MAX-1)
            return false;
        else
            a[++top] = x;

        return true;

    } 
  
    int pop() 
    {
        if(isEmpty())
            return -1;
        else
            return a[top--];
    } 
  
    int peek() 
    { 
        if(isEmpty())
            return -1;
        else
            return a[top];
    }

    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
