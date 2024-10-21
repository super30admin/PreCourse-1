class Stack { 
    
  //Time Complexity:O(1) and Space Complexity:O(n)
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return true;
        }
        else{
            System.out.println("Stack is not empty");
            return false;
        }

    } 

    Stack() 
    { 
        top=-1;
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        if(top==MAX-1)
        {
            System.out.println("Stack overflow");
            return false;

        }
        else{
            a[++top]=x;
            return true;
        }
        //Check for stack Overflow
        //Write your code here
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty())
        {
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            int x=a[top--];
            return x;
        }
    } 
  
    int peek() 
    { 
        return a[top];
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
