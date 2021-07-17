using System;
namespace ImplementStack{
  class Stack{
    private int MAX; 
    private int top; 
    private int[] a ; // Maximum size of Stack 
    
    public  boolean isEmpty() 
    { 
        if(top == -1)
          return 1;
        else
          return 0;
    }
    //Constructor
    public Stack() 
    { 
        top = -1;
        MAX = 1000;
        a = new int[MAX];
    } 
  
    public boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top == MAX -1) {
            Console.WriteLine("Stack Overflow");
            return;
        }
        //Write your code here
        else{
            a[++top] = x;
        }
    } 
  
    public int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top == -1){
            Console.WriteLine("Stack Underflow");
            return 0;
        }
        //Write your code here
        else{
            return a[top--];
        }
    } 
  
    public int peek() 
    { 
        if(top == -1){
            Console.WriteLine("Stack Underflow");
            return 0;
        }
        //Write your code here
        else{
            return a[top];
        }
    }  

  }

  // Driver code 
class Main { 
    public static void main(String[] args) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        Console.WriteLine(s.pop() + " Popped from stack"); 
    } 
  }
}