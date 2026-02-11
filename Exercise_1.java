class Stack { 
    // Time Complexcity : 
    // push() - o(1)
    // pop() - o(1)
    // peek() - o(1)
    // isEmpty() - o(1)
    // Space Complexity : o(MAX)

    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        return (top < 0);

    } 

    Stack() 
    { 
       top = -1 ;
    } 
  
    boolean push(int x) 
    { 
        if (top >= (MAX - 1)){
            System.out.println("Stack Overflow");
            return false;
        }
            a[++top] = x;
            return true;
    }
  
    int pop() 
    { 
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
            return a[top--];
    } 

    
    int peek() 
    { 
        if (isEmpty()){
            System.out.println("Stack is Empty");
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
