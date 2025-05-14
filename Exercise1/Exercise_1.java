package Exercise1;
// Time Complexity : push- O(1) , pop- O(1), peek- O(1), isEmpty- O(1)
// Space Complexity : O(MAX)
// Did this code successfully run on Leetcode :  I have done a similar question but not the same one
// Any problem you faced while coding this : No problem as such
class Stack {

    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Exercise1.Stack
  
    boolean isEmpty() 
    {
        // if the top is -1 it is empty
        if(top == -1) {
            return true;
        }
        return false;
    } 

    Stack() 
    {
        /* initialaizing the top as -1 */
        top = -1;
    } 
  
    boolean push(int x) 
    { 

        top++;
        //checking top is crossed the array index
        if(top == MAX) {
            System.out.println("Stack Overlow!!");
            return false;
        } else {
            // else push the element on the top of stack
            a[top] = x;
        }
        return true;
    } 
  
    int pop() 
    {
        int temp;
        //If empty return 0 and print " Stack Underflow"
        if(top == -1)  {
            System.out.println("Stack Underflow!!");
            return 0;
        } else {
            temp = a[top];
            top--;
        }
        return temp;
    } 
  
    int peek() 
    {
        // the top points to the top of the stack
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
