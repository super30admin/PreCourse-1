class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        return top<0;
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top>=a.length) {
            System.out.println("Stack Overflow");
            return false;
        }
        a[++top] = x;
        return true;
        //Write your code here
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--];
        //Write your code here
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top<0)return -1;
        else return a[top];
    } 
} 
  
// Driver code 
class Exercise_1 {
    public static void main(String args[]) 
    { 
        Stack s = new Stack();
        s.push(10); 
        s.push(20); 
        s.push(30);
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
