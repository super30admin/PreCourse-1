/*
isEmpty method:
Time complexity O(1)
Space complexity O(1)

push method:
Time complexity O(1)
Space complexity O(1)

pop method:
Time complexity O(1)
Space complexity O(1)

peek method:
Time complexity O(1)
Space complexity O(1)
*/

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
        this.top++;
        if(this.top > this.MAX)
            return false;

        a[this.top] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(this.isEmpty())
            return 0;
        int popElement = a[this.top];
        this.top--;
        return popElement;
    } 

    int peek() 
    { 
        //Write your code here
        return a[this.top];
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
