/* Time complexity : isEmpty() operation - O(1)
                     push() operation - O(1)
                     pop() operation - O(1)
                     peek() operation - O(1)

    Space Complexity : O(n), n = array size
*/

class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int[] a = new int[MAX]; // Maximum size of Stack
  
    boolean isEmpty() 
    { 
        //Write your code here
        return top == 0;
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = 0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top + 1 == MAX - 1){
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
            return 0;
        }
        int popped = peek();
        top--;
        return popped;
    } 
  
    int peek() 
    { 
        //Write your code here

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
//        System.out.println(s.peek() + " Top of the stack");
    } 
}
