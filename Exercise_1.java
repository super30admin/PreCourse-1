import java.util.*;
//push - O(1)
//pop - O(1)
//isEmpty() - O(1)
// peek - O(1)

class Stack { 
    ArrayList<Integer> stack;

    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { if(stack.size()==0)
        return true;
        else return false;
        //Write your code here 
    } 

    Stack() 
    { stack = new ArrayList<>();
        //Initialize your constructor 
    } 
  
    boolean push(final int x) {
        return stack.add(x);
        // Check for stack Overflow
        // Write your code here
    }

    int pop() {
        if(stack.isEmpty()){
            System.out.println("No lements to pop");
            return -1;
        }
        return stack.remove(stack.size() - 1);
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
    }

    int peek() {
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.get(stack.size() - 1);
        // Write your code here
    }
}

// Driver code
class Exercise_1 {
    public static void main(final String args[]) {
        final Stack s = new Stack();
        s.push(10); 
        s.push(20); 
        s.push(30); 
        s.push(30); 
        s.push(90); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.isEmpty());
        System.out.println(s.peek());

    } 
}
