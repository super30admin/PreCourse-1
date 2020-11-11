
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top < 0){
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
        if(top >= MAX){
            //If the top is greater than MAX than thats overflow
            System.out.println("Stack Overflow");
            return false;
        }else{
            //Write your code here
            //Increment the top
            top++;
            a[top] = x; // push the element in the array
            //Initially it will start with 0 since we are initializing top by -1
            System.out.println(x+" pushed in stack");
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top < 0){ // If the top is less than 0 (i.e -1) it wil be underflow
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int x = a[top];
            top--;
            //this will return the last value inserted in the stack
            return x;
        }
    } 
  
    int peek() 
    { 
        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }else{  
        //this will return the last value inserted in the stack
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
