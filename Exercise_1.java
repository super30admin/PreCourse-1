// Time Complexity : push, pop, peek, isEmpty = O(1)
// Space Complexity : push, pop, peek, isEmpty = O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Stack { 
    static final int MAX = 2; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top == -1; 
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
        if(top<MAX-1){
            top++;
            a[top]=x;
            return true;
        }else{
            System.out.println("Stack overflow, cannot push elements");
            return false;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            return a[top--];
        }

    } 
  
    int peek() 
    { 
        //Write your code here
        return a[top];
    }  
} 
  
//Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.isEmpty());
    } 
}
