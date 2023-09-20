public class Stack
{
        // Time Complexity : O(1)
        // Space Complexity : O(1)
        // Did this code successfully run on Leetcode :
        // Any problem you faced while coding this : No problems as such but needed to refresh my knowledge on Arrays and Stack

        public static int MAX = 1000;
        public int top;
        public int[] a = new int[MAX];

        public Stack()
        {
            top = -1;
        }
        public bool IsEmpty()
        {
            return top == -1;
           
        }

        public bool Push(int x)
        {
            if (top > MAX)
            {
                Console.WriteLine("Stack overflow");
                return false;
            }
            else
            {
                a[++top] = x;
                return true;
            }
        }

        public int Pop()
        {
            if (top == -1)
            {
                Console.WriteLine("Stack underflow");
                return 0;
            }
            else
            {
                return a[top--];
            }
        }

        public int Peek()
        {
            if (top == -1)
            {
                Console.WriteLine("Stack empty");
                return 0;
            }
            else
            {
                return a[top];
            }
        }
}

// Driver code 
public class Program
{
    public static void Main(string[] args)
    {
            Stack s = new Stack();
            s.Push(10);
            s.Push(20);
            s.Push(30);
            Console.WriteLine(s.Pop().ToString() + "Popped from stack");
    }
}
