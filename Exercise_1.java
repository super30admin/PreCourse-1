// Time Complexity : O(1)
// Space Complexity : O(1)
class Stack {

    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        return top == 0;
    } 

    Stack() 
    { 
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
       if(top < MAX -1) {
           a[++top] = x;
           return true;
       }
       return false;
    }
  
    int pop() 
    {
        if(top == 0) {
            System.out.print("Stack Underflow");
            return -1;
        }

        int output = a[top];
        top--;
        return output;
    } 
  
    int peek() 
    {
        if(top == 0) {
            return -1;
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
