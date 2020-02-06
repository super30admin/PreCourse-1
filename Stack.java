class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        return top == -1;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 

    int size() {
        return top + 1;
    }
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if (size() == MAX) return false;
        a[++top] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (size() == 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int p = a[top];
        a[top] = -1;
        top--;
        return p;
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[top];
    }  
  
    // Driver code 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Size " + s.size()); 
        System.out.println(s.peek() + " Peek");
    } 
}
