
/* Implement Stack using Array
 * Time Complexity : O(1) for push/pop/empty
 * Space Complexity : O(n) --> Max size
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No
 * 
 * Example: Stack=[1,2,3,4,5]
 * Algorithm:
 * 1. Maintain a pointer "top" for the current index in array
 * 2. Push --> Check overflow? not then add to array
 * 3. Pop --> Check empty? not then store top and top-- and return top
 * 4. Empty --> Check index of top --> less than 0 then True, else False
 * 
*/
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int stack[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top < 0)
        {
            System.out.println("Empty Stack!");
            return true;
        }

        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top >= (MAX-1))
        {
            System.out.println("stack Overflow!");
            return false;
        }

        stack[++top] = x;
        
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top < 0)
        {
            System.out.println("Empty Stack!");
            return 0;
        }

        int topElement = stack[top];
        top--;

        return topElement;
    } 
  
    int peek() 
    { 
        if(top < 0)
        {
            System.out.println("Empty Stack!");
            return 0;
        }

        return stack[top];
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
