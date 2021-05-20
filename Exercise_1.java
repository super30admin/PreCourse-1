// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : No

/* Explanation: Store Stack element in a array by keeping track of last index using a variable (top here)
   To push new element - increment top and place the element in new index
   To pop - As last inserted would be stored in top, decrement top index or set array element to 0
   To peek - return array element at index top */

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top == -1);
    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        if(MAX == top+1)
        {
            System.out.println(" Stack Overflow");
            return false;
        }
        else{

            a[++top] = x;
            return true; 

        }
    } 
  
    int pop() 
    { 
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return a[top--];
        }

    } 
  
    int peek() 
    { 
        if(isEmpty()){
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
