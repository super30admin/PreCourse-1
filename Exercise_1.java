//Time Complexity : O(1)
// Space Complexity :O(n)
class Stack {
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top == -1)
            return true;
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top >= (MAX - 1)){
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            //Write your code here
            // top is incremented;
            top++;
            // New element is pushed at the position top
            a[top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            //Write your code here
            //Element at the top position is deleted
            int x = a[top];
            // top is decremented
            top--;
            return x;
        }
    } 
  
    int peek() 
    {
        //Write your code here
        if(top < 0){
            System.out.println("Stack underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
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
