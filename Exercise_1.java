/**
 * The space complexity for this Stack is size of the array. Since the size is not parametrized but instead defined in the class, it is O(1).
 * 
 * Time complexity
 * 
 * isEmpty is O(1), as it is just a comparision.
 * accessing an element in array is O(1), so peek is constant time.
 * push and pop are also constant time.
 * 
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
        if(top == MAX-1) {
            System.out.println("Stack Overflow");
            return false;
        }
        a[++top] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        }

        return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top > -1) {
            return a[top];
        }
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
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
