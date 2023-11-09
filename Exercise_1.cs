class Stack { 
    // Did this code successfully run on Leetcode :
    // Any problem you faced while coding this :
        static int MAX = 1000; 
        int top; 
        int[] a = new int[MAX]; // Maximum size of Stack 
      
        // Time Complexity : O(1)
        // Space Complexity : O(1)
        public bool IsEmpty() 
        { 
            //Write your code here 
            return top == -1;
        } 
    
        public Stack() 
        { 
            //Initialize your constructor 
            top = -1;
        } 
      
        // Time Complexity : O(1)
        // Space Complexity : O(1)
        public bool Push(int x) 
        { 
            //Check for stack Overflow
            //Write your code here
            if(++top < MAX){
                a[top] = x;
                return true;
            } else{
                top--;
                System.Console.WriteLine("Stack Overflow");
                return false;
            }
        } 
      
        // Time Complexity : O(1)
        // Space Complexity : O(1)
        public int Pop() 
        { 
            //If empty return 0 and print " Stack Underflow"
            //Write your code here
            if(top<0)
            {
                System.Console.WriteLine("Stack Underflow");
                return 0;
            } else {
                int temp = a[top];
                top --;
                return temp;
            }
        } 
        
        // Time Complexity : O(1)
        // Space Complexity : O(1)
        public int Peek() 
        { 
            //Write your code here
            return IsEmpty() ? 0 : a[top];
        } 
    } 
      
    // Driver code 
    class Main { 
        public static void main(String[] args) 
        { 
            Stack s = new Stack(); 
            s.Push(10); 
            s.Push(20); 
            s.Push(30); 
            System.Console.WriteLine(s.Pop() + " Popped from stack"); 
        } 
    }