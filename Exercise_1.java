import java.util.*;

class StackArr { 
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    //Time complexity is O(1) as no loops are involved
    //Space complexity is O[1] as well 

    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        //Maintained a variable top that gets to current array index
        //Array Index cannot be less than 0 hence that qualifies for Empty check condition
        if(top<0){
            return true;
        }else{
            return false;
        } 
    } 

    StackArr() 
    { 
        //Initialize your constructor 
        top = -1;

    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Pushed element to the current top condition
        if(top >= MAX-1){
            System.out.print("Stack Overflow");
            return false;
        }else{
            a[++top] = x;
            System.out.print("Top " + top);
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Popped element from the current top condition
        if(top<0){
            System.out.print("Stack Underflow");
            return 0;
        }else{
            int x = a[top--];
            return x;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        //Consoles the element at the current top condition 
        if(top<0){
            System.out.print("Stack Underflow");
            return 0;
        }else{
            int x = a[top];
            return x;
        }
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        StackArr s = new StackArr(); 
        // Test Case 1
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");
        // Test Case 2
        s.push(10); 
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
    } 
}

