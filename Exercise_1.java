//Time Complexity -> O(1) for each function operation (isEmpty(), push(), pop(), peek())
//Space Complexity -> O(n) n = MAX size of the array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach
/* First i declared a variable called top which tracks the index of topmost element in the stack
 * Push function adds an element to the stack. If the stack is full (top==MAX-1) then the stack becomes overflow else i just increment the top and store the element x at a[top]
 * Pop function removes the top element from stack. Checked the condition of case where there is stack with no elements. If that is the case we can't pop anything and so it is stack underfloe. Else we return a[top] and decrement top.
 * Peek is just to return the top element. If the stack is not empty we return a[top] else return -1
 * isEmpty function i check if the stack is empty. If it is then return true else return false.
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
        return top==-1;

    } 

    Stack() 
    { 
        //Initialize your constructor 
        top=-1;

    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top==MAX-1){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            a[++top] = x;
            return true;
        }
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top==-1){
            return -1;
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

        //debug code
        /*System.out.println("After operations: ");
        for(int i=0;i<=s.top;i++){
        System.out.println(s.a[i] + " ");}

        System.out.println();*/
    }
}
