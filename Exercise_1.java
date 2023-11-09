// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : I didn't find this in leetcode
// Any problem you faced while coding this : No

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[];
  
    boolean isEmpty() 
    { 
        return top == 0;
    } 

    Stack() 
    { 
        top = 0;
        a = new int[MAX];
    } 
  
    boolean push(int x) 
    { 
        if(top < MAX) {
            a[top++] = x;
            return true;
        }
        return false;
    } 
  
    int pop() 
    { 
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        return a[top--];
    } 
  
    int peek() 
    { 
        return a[top];
    } 
} 
  
// Driver code 
class Exercise_1 { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
