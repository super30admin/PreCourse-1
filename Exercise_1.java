class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        return top < 0;
    } 

    Stack() 
    { 
        this.top = -1;
    }
  
    boolean push(int x) 
    {
        //Check for stack Overflow
        if(top >= MAX-1) {
            return false;
        }

        //Write your code here
        top++;
        a[top] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()) {
            System.out.println(" Stack Underflow");
            return 0;
        }

        //Write your code here
        int result = a[top];
        a[top] = 0;
        top--;
        return result;
    } 
  
    int peek() 
    {
        if(isEmpty()) {
            System.out.println(" Stack Underflow");
            return 0;
        }
        //Write your code here
        return a[top];
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

    //Time Complexity for each operation: O(1)
    //Space Complexity: Size of Array + 1 (for TOP)
}
