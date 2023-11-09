 
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
   
    boolean isEmpty() 
    { 
        //Write your code here 
        return (top<0);
    } 

    Stack() 
    { 
    top =-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
         if (top >= (MAX - 1)) { //length of array is always less as it starts with 0
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top] = x;
            System.out.println(x + " pushed to stack");
            return true;
        }
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
          if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
         if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
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
 

//Time Complexity  : O(1) as one operations will be performed at a time. Either push, pop, or peek
//Space Complexity : O(n) where n is the size of the elements in array. As n number of elements can we inserted and that much space can be utilized.
// approach is brute force we are just incrementing and decrementing the top according to operations needed to be performed.
// Didnt solved in leetcode but solved using online compiler
