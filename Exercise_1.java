class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(a.length==0){
            return true;
        }
        return false;
        //Write your code here 
    } 

    Stack() 
    { 
        top=-1;

        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        top=top+1;
        if(top>=1000){
            return false;
        }
        a[top]= x;
        return true;
        //Check for stack Overflow
        //Write your code here
    } 
  
    int pop() 
    { 
        if(top==0){
            return 0;
        }
        top=top-1;
        return a[top+1];
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    { 
        return a[top];
        //Write your code here
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
