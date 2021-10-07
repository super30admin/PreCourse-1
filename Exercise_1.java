// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this : no

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top == 0;
    } 

    Stack() 
    { 
        int top=0;
    } 
  
    boolean push(int x) 
    { 
        if(top == 1000)
        {
            System.out.println("Stack Overflow")
            return false;
        }
        a[top] = x;
        top = top + 1;
        return true;
    }
  
    int pop() 
    { 
        int x = 0;
        if (! isEmpty())
        {
            top = top - 1;
            x = a[top] 
            a[top] = 0;
        }
        else{
            System.out.println("Stack Underflow")
        }
        return x;
    } 
  
    int peek() 
    { 
        if (! isEmpty())
            return a[top-1];
        else 
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
    } 
}
