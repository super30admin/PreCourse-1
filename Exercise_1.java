// Time Complexity : O(n)
// Space Complexity : O(1)

class Stack {
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top < 0; //returns True if the value of top is less than 0, otherwise returns false
    } 

    Stack() 
    { 
        top = -1; //When new stack is created , top is set to -1
    } 
  
    boolean push(int x) 
    { 
        if(top < MAX - 1){
            a[++top] = x;
            return true;
        }
        System.out.println("Stack Overflow");
        return false;
    } 
  
    int pop() 
    {
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--];
    } 
  
    int peek() 
    { 
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
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
        System.out.println(s.pop() + " Popped from stack\n");
        System.out.println("Top element is " + s.peek() +"\n");
        System.out.println(s.pop() + " Popped from stack\n");
        System.out.println(s.pop() + " Popped from stack\n");
        System.out.println(s.pop() + " Popped from stack\n");
    } 
}
