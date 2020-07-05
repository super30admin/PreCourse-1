class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top == -1) return treu;
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        this.top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top == MAX-1){
            System.out.println("STACK OVERFLOW");
            return false;
        } else{
            a[++top] = x;
        }
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top ==  -1){
            System.out.println("STACK UNDERFLOW");
            return 0;
        } else{
            return a[top--];
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top > -1 && top < MAX) return a[top];
        return -1;
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
