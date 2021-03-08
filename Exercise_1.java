class Stack { 
    static final int MAX = 1000; 
    public int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return top == 0;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top=0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top == 1000){
            System.out.println("Stack Overflow");
            return false;
        }
        a[top] = x;
        top++;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int pop = a[top-1];
        a[top-1] = 0;
        top--;
        return pop;
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[top-1];
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
        System.out.println(s.peek() + " Peek from stack"); 
    } 
}
