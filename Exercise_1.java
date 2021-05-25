class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if (top == -1) {
            return true;
        }

        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if (top >= MAX - 1) {
            return false;
        }
        //Write your code here
        a[++top] = x;
        return true;

        // Time Complexity: O(1)
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write your code here
        int popped = a[top];
        left_shift();
        top--;
        return popped;

        // Time Complexity: O(n)
    }
  
    int peek() 
    { 
        //Write your code here
        if (top >= 0) {
            return a[top];
        }

        return 0;

        // Time Complexity: O(1)
    }

    // Unitility method to left shift the elements of the array
    void left_shift() {
        for (int i=1;i<top;i++) {
            a[i-1] = a[i];
        }
    }
} 

// Space Complexity: O(n)
  
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
