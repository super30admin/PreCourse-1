import java.util.Arrays;

/**
 * Space complexity of this solution is O(1)
 */
class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int[] a = new int[MAX]; // Maximum size of Stack

    /**
     * Time complexity of isEmpty() operation is O(1)
     */
    boolean isEmpty() 
    { 
        //Write your code here
        return top == 0 && a[top] == 0;
    } 

    Stack() 
    { 
        //Initialize your constructor
    }

    /**
     * Time complexity of push() operation is O(1)
     */
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top+1 == a.length)
            return false;
        else{
            a[top] = x;
            top = top + 1;
            return true;
        }
    }

    /**
     * Time complexity of pop() operation is O(1)
     */
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            return 0;
        }else{
            int poppedVal = a[top-1];
            a[top - 1] = 0;
            top = top -1;
            return poppedVal;
        }
    }

    /**
     * Time complexity of peek() operation is O(1)
     */
    int peek() 
    { 
        //Write your code here
        return a[top-1];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String[] args)
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30);
        System.out.println(Arrays.toString(s.a));
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(Arrays.toString(s.a));
        System.out.println(s.peek() + " Top element from stack");
        System.out.println(Arrays.toString(s.a));
    } 
}
