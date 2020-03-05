import java.util.Arrays;

class Stack {
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top<0)
            return true;
        else
            return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top=-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top>=(MAX-1))
            return false;
        else{
            top++;
            a[top]=x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int temp = a[top];
            a=Arrays.copyOf(a,a.length-2);
            top--;
            return temp;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top<0){
            System.out.println("No elements in stack");
            return 0;
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
