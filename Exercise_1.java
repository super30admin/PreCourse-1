/**
 *  Time Complexity
 *
 *      isEmpty() - O(1)
 *
 *      push(x) - O(1)
 *
 *      pop() - O(1)
 *
 *      peek() - O(1)
 *
 *  Space Complexity - O(1) since we have allocated 1000 as the size of the integer array
 */


class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top == -1;
    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        if(top == MAX-1) {
            System.out.println("Stack Overflow")
            return false;
        }
        else {
            a[++top] = x;
            return true;
        }

    } 
  
    int pop() 
    { 
        
        if(top == -1) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            int val = a[top];
            top--;
            return val;
        }

    } 
  
    int peek() 
    { 
        if(top == -1) {
            System.out.println("Stack underflow");
            return 0;
        } else {
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
