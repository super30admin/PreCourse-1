// Time Complexity : O(1)
// Space Complexity : O(1) (stack size is fixed)

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return this.top == -1;
    } 

    Stack() 
    { 
        this.top = -1;
    } 
  
    boolean push(int x) 
    { 
        if (this.top == MAX) {
            System.out.println("Stack Overflow");
            return false;
        }
        this.a[++top] = x;
        return true;
    } 
  
    int pop() 
    { 
        if (this.top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return this.a[top--];
    } 
  
    int peek() 
    { 
        return this.a[top];
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
