// Time Complexity :push O(n), pop(n), peek O(1)
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top < 0);   //if top points to less than zero index 
    } 

    Stack() 
    { 
        top = -1;          //initiate an empty stack with pointing top at -1 index
    } 
  
    boolean push(int x) 
    { 
       
        if(top < a.length-1) {    //Check for stack Overflow, if not increment top and insert new element. 
            a[++top] = x;
            return true;
        }
        return false;

    } 
  
    int pop() 
    { 
       
        if(isEmpty()) {           // If stack empty returns zero
            System.out.println(" Stack Underflow");
            return 0;
        }
            int value = a[top--];  //else returns top element and points the top to previous element.
            return value;
    } 
  
    int peek() 
    { 
        if(isEmpty()) {            //If stack empty return 0
            System.out.println(" Stack Underflow");
            return 0;
         }
        return a[top];            //else return top element
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
