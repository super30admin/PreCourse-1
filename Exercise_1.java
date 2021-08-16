//Time complexity:  O(1)
//Space complexity: O(N)
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //If the value of the top is less than 0, it means that the stack is empty
        if(top < 0) {
            return true;
        }
        else{
            return false;
        }

    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //If the value of top pointer is greater than value of MAX, the stack is full and if we try to insert it should say stack overflow.
        if(top > MAX) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return a[top--];
        }
    } 
  
    //Peek function will return the value at the top of the stack
    int peek() 
    { 
        if(top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return a[top];
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
        System.out.println(s.peek() + " is at the top of the stack"); 
        System.out.println("Stack Empty: " + s.isEmpty());
    } 
}
