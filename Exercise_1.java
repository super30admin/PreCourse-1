import java.util.Arrays;

class Stack {
    static final int MAX = 2;
    int top; 
    int[] a; // Maximum size of Stack
  
    boolean isEmpty() 
    { 
        //Write your code here
        return (a[0] == -1);
    } 

    Stack() 
    { 
        //Initialize your constructor
        this.a = new int[MAX];
        Arrays.fill(a, -1);
        this.top = -1; // stores index of top-most element
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
         top += 1;
        if (top < MAX) { //while Stack has space

            a[top] = x;
            return true;
        }
        top -= 1;
        return false;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (!isEmpty()){
            int temp = a[top];
            top -= 1;
            return temp;
        }
        System.out.println("Stack Underflow");
        return 0;
    } 
  
    int peek() 
    { 
        //Write your code here
        if (!isEmpty()){
            return a[top];
        }
        return -1;
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        s.push(10);
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        s.push(20);
        System.out.println(s.peek());
        s.push(30);
        System.out.println(s.isEmpty());
        System.out.println(s.peek());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek());
    } 
}
