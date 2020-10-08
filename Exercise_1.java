class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top == -1);
    } 

    Stack() 
    {
        this.top = -1;
    } 
  
    boolean push(int x) 
    { 
        if(top != MAX-1){
            a[++top] = x;
            System.out.println("Element "+ x + " got pushed to the stack");
            return true;
        }
        else{
            System.out.println("Stack overflow: Cannot push the element "+ x);
            return false;
        }
    }
  
    int pop() 
    { 
       if(isEmpty()){
           System.out.println("Stack underflow!");
           return 0;
       }
       else{
           int val = a[top];
           top--;
           return val;
       }
    } 
  
    int peek() 
    {
        if(isEmpty()){
            System.out.println("Stack underflow!");
        }
        else{
            return a[top];
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
