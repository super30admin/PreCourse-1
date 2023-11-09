/*
 Time Complexity :
    1. push method: O(1)/ worst case O(N)
    2. pop methods: O(1)
    3. peek method: O(1)
s*/

/*
 Space Complexity :
    1. push method: O(1)
    2. pop method: O(1)
    3. peek method: O(1)
*/

// Did this code successfully run on Leetcode :N/A
// Any problem you faced while coding this : No

/*
 Stack is a data structure that works on LIFO principle i.e. Last In First Out.
 1. We always add element at top in case of stack and always pop it from the top.
 2. Peek method gonna give the first element of the stack
 3. Whenever we add an element at top in push method we will increment the count of the elements in the stack
 4. Whenever we pop an element the stack size would be one less
 */

class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
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
        //Check for stack Overflow
        //Write your code here
        if(top == MAX-1){
            System.out.println("Can not add an element, Stack Overflow!");
            return false;
        }else{
            top++;
            a[top] = x;
        }
        return true;

    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            return 0;
        }else{
            int poppedValue = a[top];
            top--;
            return poppedValue;
        }

    }

    int peek()
    {
        //Write your code here
        if(!isEmpty()){
            return a[top];
        }else{
            return -1;
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
        System.out.println(s.peek() + " Peek element from Stack");
    }
}
