//T(C) : O(1)
//S(C) : O(n)

class Stack {
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if (top==0) {
            return true;
        }

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
        //checking for stack overflow
        //if top exceeds max size then we have overflow
        if (top >= (MAX -1)){
        System.out.println("stack overflow");
        return false;
        }
        else {
            a[++top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        //again we will use top to check for underflow
        if (top==0){
            System.out.println("stack underflow");
            return 0;
        }
        else {
            top--;
            int popped_val = a[top];
            return popped_val;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if (top<0){
            System.out.println("stack underflow");
            return 0;
        }
        else {
            int peeked_val = a[top];
            return peeked_val;
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
        System.out.println(s.peek());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek());
    } 
}
