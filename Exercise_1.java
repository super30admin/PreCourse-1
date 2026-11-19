// Time Complexity :
 //   isEmpty() : O(1)
 //   push(data) : O(1)
 //   pop() : O(1)
 //   peek() : O(1)

// Space Complexity :
 //   isEmpty() : O(1)
 //   push(data) : O(1)
 //   pop() : O(1)
 //   peek() : O(1)

// Did this code successfully run on Leetcode : Not available
// Any problem you faced while coding this : It was unclear what to return if peek() is called when stack is empty.



class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top == -1){
            return true;
        }
        return false;
    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x) 
    {   
        if(top == 999){ //the last index in 0-indexed array.
         //Overflow
         return false;
        }
        top++;
        a[top] = x;
        return true;
    } 
  
    int pop() 
    {  
        //If empty return 0 and print " Stack Underflow"
        if(top == -1){
            System.out.println("Stack Underflow");
            return 0;
        }
        int pop = a[top];
        top--;
        return pop;
        
    } 
  
    int peek() 
    { 
        if(top == -1){
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
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
