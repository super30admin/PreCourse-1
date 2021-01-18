class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top == -1); 
    } 

    Stack() 
    { 
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
      if (top == MAX - 1) {
        System.out.println("Stack Overflow");
        return false;
      }
      top++;
      a[top] = x;
      return true;
    } 
  
    int pop() {
      if (top == -1) {
        System.out.println("Stack Underflow");
        return 0;
      }
      int ret = a[top];
      top--;
      return ret;
    }
  
    int peek()
    {
        if (top == -1 || top == MAX)
          return -1;
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

