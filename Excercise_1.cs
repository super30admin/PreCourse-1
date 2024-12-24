class Stack { 
    
    private const int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    public Stack()
    {
       top = -1; 
    }

    bool isEmpty() 
    { 
        if (top == -1)
        {
            Console.Writeline("Stack is empty");
            return true;
        }
        return false;
    }   
  
    bool push(int x) 
    { 
        if(top == MAX -1)
        {
            Console.Writeline("Stack overflow");
            return false;
        }
        else
        {
            a[++top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        if(top == -1)
        {
            Console.Writeline("Stack underflow");
            return 0;
        }
        else
        {
            Console.Writeline("{0} Popped from stack", a[top]);
            return a[top--];
        }
    } 
  
    int peek() 
    { 
        //Write your code here
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
