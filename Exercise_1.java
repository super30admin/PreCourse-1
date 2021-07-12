class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 

    // TC: O(1)
    boolean isEmpty() 
    { 
        return -1 == top;
    } 

    // TC: O(1)
    Stack() 
    { 
        top = -1;
    } 
    
    // TC: O(1)
    boolean push(int x) 
    { 
        if(MAX - 1 > top)
        {
            a[++top] = x;
            return true;
        }
        System.out.println(" Stack Overflow");
        return false;
    } 
  
    // TC: O(1)
    int pop() 
    { 
        int elem = 0;
        if(top > -1)
        {
            elem = a[top];
            top--;
        }
        else
        {
            System.out.println(" Stack Underflow");
        }

        return elem;
    } 
  
    // TC: O(1)
    int peek() 
    { 
        if(top > -1)
        {
            return a[top];
        }
        System.out.println(" Stack Underflow");
        return 0;
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
