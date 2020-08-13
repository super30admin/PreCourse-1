class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return a.length==0;

    } 

    Stack() 
    { 
        top=-1;
    } 
  
    boolean push(int x) 
    { 
        if (top>MAX)
        {
            System.out.println("Stack Overflow, cannot push anymore");
            return false;
        }
        else
        {
            a[++top]=x;
            System.out.println(x+" pushed");
            return true;
        }
    } 
  
    int pop() 
    { 
       
        if(top==-1)
        {
            System.out.println("Stack overflow");
            return 0;
        }
        else
        {
            return a[top--];
        }
    } 
  
    int peek() 
    { 
        if(top==-1)
        {
            System.out.println("Stack overflow");
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
