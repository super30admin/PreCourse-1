// Java program to implement stack using Array

// Time complexity = O(1) push, boolean, peak, pop all are O(1)
// Space Complexity O(n) - n is the number of items in stack
// Did this code successfully run on Leetcode :N/A
// Any problem you faced while coding this : No

class Stack1 {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    boolean isEmpty() {
        //Write your code here
        return (top < 0);
    }

    Stack1() {
        //Initialize your constructor
        top = -1;
    }

    boolean push(int x) {
        //Check for stack Overflow
        //if stack is full- stack overflow. Cannot insert element
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else { // if stack is not full increment the value of top by 1.
            a[++top] = x;
            System.out.println(x + " Pushed into stack");
            return true;
        }
    }

    int pop() {

        //Write your code here
        if (top < 0) { //If empty return 0 and print " Stack Underflow"
            System.out.println("Stack Underflow");
            return 0;
        } else { // otherwise decrement the value of top by 1
            int x = a[top--];
            return x;

        }
    }

    int peek() {
        //Write your code here
        if (top < 0) { // if stack is empty
            System.out.println("Stack UnderFlow");
            return 0;
        } else { //otherwise return the element stored at index top
            int x = a[top];
            return x;
        }
    }
    void print(){
        for (int i=top;i>-1;i--){
            System.out.println("" +a[i]);
        }
    }
}
  
// Driver code 
class Main1 {
    public static void main(String args[]) 
    { 
        Stack1 s = new Stack1();
        s.push( 10);
        s.push( 20);
        s.push( 30);
        s.push( 40);
        s.push( 50);
        s.push( 60);
        System.out.println( " Popped from stack " +  s.pop());
        System.out.println( " Top Element is " +   s.peek());
        System.out.println( " Elements present in stack: ");
        s.print();
    } 
}

