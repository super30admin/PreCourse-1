// Time Complexity:
// push() - O(1)
// pop()  - O(1)
// peek() - O(1)
// isEmpty() - O(1)
// Space Complexity: O(MAX), where MAX = 1000
class Stack { 
//Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return top == -1 ? true : false;
    } 

    public Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top >= MAX-1){
            return false;
        }

        a[++top] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        int data = a[top];
        a[top--] = 0;
        return data;
    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty()){
            System.out.println("Empty Stack");
            return -1;
        }
        return a[top];
    } 
} 
  
// Driver code 
class StackUsingArray { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
