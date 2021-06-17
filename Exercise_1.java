class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top==0;
        //Write your code here 
    } 

    Stack() 
    { 
        //Initialize your constructor 
        
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top==MAX-1){
            System.out.println("Overflow condition");
        }
        //Write your code here
        //inserting
        a[++top]=x;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top==0){
            System.out.println("Underflow condition");
        }
        //Write your code here
        //removing
        return a[top--];
    } 
  
    int peek() 
    { 
        //null check
        if(top==0){ System.out.println("array is empty so no element to return");}
        //Write your code here
        else return a[top];
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
