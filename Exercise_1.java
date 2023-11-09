// Time Complexity
// For the all operation it is O(1).

//Space Complexity
// O(N) It is the size of the stack.
class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top == -1) return true;
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
        //Write your code here

        if(top == MAX - 1){ // If the stack is full
            System.out.println(x+" cannot be pushed.");
            System.out.println("Stack Overflow.");
            return false;
        }

        if(top == -1){ // If first element is pushed in to the stack
            top = 0;
            a[top] = x;
            System.out.println(x+" pushed in the stack");
            return true;
        }

        a[++top] = x;
        System.out.println(x+" pushed in the stack");

        return true;

    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here

        if(top == -1){
            System.out.println("Stack Underflow.");
            return 0;
        }

        return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top == -1){
            System.out.println("Stack is Empty.");
            return 0;
        }

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

        //Test cases
        //1) Stack empty and then popping
//        s.pop();

        //2) Stack full and then pushing
//        s.push(10);
//        s.push(20);
//        s.push(30);

        //3) IsEmpty check
//        System.out.println(s.isEmpty());

        //4) Peek check
//        s.push(10);
//        s.push(20);
//        s.push(30);
//        System.out.println(s.peek());
    } 
}
