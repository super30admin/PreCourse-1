class Stack { 
    //Please read sample.java file before starting.
  //Time Comlexity= O(n)
  //Space Complexity= O(1)
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top<0);
    } 

    Stack() 
    { 
        top = -1;//Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow"); //Check for stack Overflow
            return false;
        }
        else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    } 
  
    int pop() 
    { 
        if (top < 0) {
            System.out.println("Stack Underflow");//If empty return 0 and print " Stack Underflow"
            return 0;
        }
        else {
            int x = a[top--];//Write your code here
            return x;
        }
    } 
  
    int peek() 
    { 
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        } 
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
