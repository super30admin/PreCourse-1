class Stack { 
    static final int MAX = 10; 
    int top; 
    int size;
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(this.top == 0){
            return true;
        }
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        this.size = MAX;
        this.top = 0;
        this.a = new int[this.size];
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(this.top == this.size){
            throw new StackOverflowError("Stack is full");
        }
        this.a[this.top] = x;
        this.top++;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(this.isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        this.top--;
        int element = this.a[this.top];        
        return element;
    } 
  
    int peek() 
    { 
        //Write your code here
        if(this.isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        return this.a[this.top-1];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        for(int i=0; i<s.size; i++){
            s.push(i+1);
            System.out.println(s.peek() + " is the element at the top");
        }
        // s.push(1001);  //Gives the stack overflow error, comment it out to test the below test cases.     
        
        for(int i=0; i<s.size; i++){
            System.out.println(s.pop() + " Popped from stack"); 
        }
        System.out.println(s.pop() + " Popped from stack"); //Gives the stack underflow error
    } 
}
