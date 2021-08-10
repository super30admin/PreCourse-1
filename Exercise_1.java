// Exercise_1 : Implement Stack using Array.
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        return this.top == -1;

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
        if(this.top == MAX-1){
            return false;
        }
        this.top++;
        this.top = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(this.top == -1){
            System.out.println(" Stack Underflow");
            return 0;
        }
        int temp = this.top;
        top--;
        return temp;

    } 
  
    int peek() 
    { 
        //Write your code here
        return this.top;
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
