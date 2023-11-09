class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top = -1;
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top == -1)
            return true;
        return false;
    } 

    public Stack()
    { 
        //Initialize your constructor
        top = -1;
        //a[top++];
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top < MAX) {
            top++;
            a[top] = x;
            System.out.println("Pushed element is : " + x);
            return true;
        }
        System.out.println("Stack is full");
        return false;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int poppedElement = top;
        top--;
        System.out.println("The popped element is : " + a[poppedElement]);
        return a[poppedElement];
    } 
  
    int peek() 
    { 
        //Write your code here
        if (!isEmpty()) {
            System.out.println("The top element is : " + a[top]);
            return a[top];
        }
        System.out.println("Stack is empty");
        return -1;
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
        s.push(40);
        s.peek();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.peek();
    } 
}
