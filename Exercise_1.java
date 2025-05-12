//Time COmplexity: O(1);
//Space COmplexity: O(n);

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if (top < 0) {
            System.out.println("Empty");
        }
        //Write your code here 
        return false;
    } 

    Stack() 
    { 
        top=-1;
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        if (top == MAX-1) {
            System.out.println("overflow");
        }
        else
        {
            top = top+1;
            a[top] = x;
        }
        return true;
        //Check for stack Overflow
        //Write your code here
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if (top<=0) {
            System.out.println("Underflow");
        }
        else{
            top = top-1;
        }
        return a[top+1];
        //Write your code here
    } 
  
    int peek() 
    { 
        return a[top];
        //Write your code here
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
