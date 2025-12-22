class Stack {
 
    // Time Complexity Except Push is O(1) , Push O(n)
    // Space Complexity = O(n)
    const int MAX = 1000;
    int top;
    int[] arr = new int[MAX]; // Maximum size of Stack 

    public bool isEmpty()
    {
        //Write your code here 
        return top == -1;
    }

    public Stack()
    {
        //Initialize  constructor 
        top = -1;
    }

    public void Resize()
    {
        int capacity = arr.Length * 2;
        int[] newarr = new int[capacity];
        Array.Copy(arr, newarr, arr.Length);
        arr = newarr;
        
    }
    public void push(int x)
    {
        if (top == arr.Length - 1)
        {
            Resize();
        }
        arr[++top] = x;
       
    }

    public int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        if (isEmpty())
        {
            Console.Write(" Stack Underflow");
            return 0;
        }
        return arr[top--];
    }

    public int peek()
    {
        if (isEmpty())
        {
            return 0;
        }
        return arr[top];
    } 
} 
  
// Driver code 
class Program { 
    public static void Main(String[] args) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        Console.Write(s.pop() + " Popped from stack"); 
    } 
}
