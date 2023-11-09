/*Time complexity
Push - O(1)
Pop - O(1)
All other operations like isEmpty(), peek() will have O(1) as time taken to execute will not vary with input size or the input itself
*/

/*Space complexity
O(1) as the size of the stack is fixed and we do not require additional space for operations
*/

// Did this code successfully run on Leetcode : Could not find exact question on leetcode but worked successfully with varying edge cases on local compiler.

// Any problem you faced while coding this : Took some time to think about the edge case where the value of top approaches MAX

class Stack { 

    static final int MAX = 1000; 
    int top=-1; // represents the index corresponding to element at the top of stack
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if (top == -1) {
            return true;
        } else
            return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        if (top < MAX-1) {
            a[top + 1] = x;
            top++;
            return true;
        }

        else
            System.out.println("Stack full");
            return false;

    } 
  
    int pop() 
    { 
        // If empty return 0 and print " Stack Underflow"
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            top--;
            return a[top + 1];
        }

    }
  
    int peek() 
    {
        if (!isEmpty())
            return a[top];
        else
            System.out.println("Stack empty");
        return 0;
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

