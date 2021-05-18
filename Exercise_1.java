// Time Complexity : O(1)
// Space Complexity : O(1)

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top == -1) return true;
        return false;
    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x) 
    {
        //Check if top pointer is pointing the last element in stack to avoid overflow
        if(top == MAX-1) {
            return false;
        } 
        else {
            top++;
            a[top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //Check if the stack is empty i.e. top pointer is -1 to prevent underflow
        if(top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top--];
        }
    } 
  
    int peek() 
    { 
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
