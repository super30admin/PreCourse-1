class Stack { 
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        return top==-1;
    } 

    Stack() 
    {
        //Initialize your constructor
        top = -1;
    }
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top==MAX){
            System.out.println("Stack Overflow");
            return false;
        }
        //Write your code here
        else{
            top++;
            a[top] = x;
            System.out.println(x + " was added at index " + top);
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            return a[top--];
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty()){
            System.out.println("Empty stack");
        }
        return a[top];
    } 
    public void printStack() {
        for (int i = 0; i <= top; i++) {
          System.out.println(a[i]);
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
        s.printStack();
         
    } 
}
