// Time Complexity : Insertion , Deletion : O(1).
//                   Search O(N), where N is the length of the the array
// Space Complexity :O(N) where N is the length of the array.
// Did this code successfully run on Leetcode :N/A
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Stack {

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
        //Initialize your constructor
        top = -1;

    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top == a.length-1){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            a[++top] = x;
            System.out.println(a[top] + "is pushed to stack");
        }
        return true;
    } 
  
    int pop() 
    {
        int ret = top;
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{

            top = top - 1;
        }
        return a[ret];

    } 
  
    int peek() 
    { 
        //Write your code here
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top];
    }

} 
  
// Driver code 
class Main {
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20);
        s.peek();
        s.push(30);
        s.peek();
        System.out.println(s.pop() + " Popped from stack");
        s.peek();
        s.push(40);
        s.push(50);
        s.peek();
        s.pop();
        s.peek();
    } 
}
