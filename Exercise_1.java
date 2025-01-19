import java.util.Arrays;

class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        return 0 == top;
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
        if( top+1 > MAX) {
            return false;
        }
        a[top] = x;
        top = top + 1;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == 0) {
            return 0;
        }
        int new_array[] = new int[MAX];
        int value = a[top-1];
        for(int i=0; i<top-1; i++) {
            new_array[i] = a[i];
        }
        a=new_array;
        top = top -1;
        return value;
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[top- 1];
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
