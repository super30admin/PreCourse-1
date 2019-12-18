import java.util.Arrays;
public class HelloWorld{

     public static void main(String []args){
        
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.peek() + " Peeked from stack");
        System.out.println(s.pop() + " Popped from stack");
        s.pop();
        System.out.println("Stack Empty?"+s.isEmpty());
     }
}
class Stack { 
    static final int MAX = 1000; 
    int top=0;
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top==0)
            return true;
        else
            return false;
            
        //Write your code here 
    } 

    Stack() 
    { 
        
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        if(top>999)
        {
            System.out.println("Stack is full");
            return false;
        }
        else
        {
            a[top]=x;
            top++;
            System.out.println("push"+Arrays.toString(a));
            return true;
        }
        
        
        //Check for stack Overflow
        //Write your code here
    } 
  
    int pop() 
    { 
        if(top<1)
        {
            return Integer.MIN_VALUE;
        }
        else
        {
            top--;
            int num= a[top];
           
            return num;
        }
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    { 
        if(top<1)
        {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else
        {
            return a[top-1];
        }
        //Write your code here
    } 
} 

// Time Complexity: Here, I am not using any for loops, just inserting element at end of array and fetching from the end. So its O(1)

// Space Complexity: Don't know how to calculate space complexity 