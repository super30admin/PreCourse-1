//Time complexity for push(), pop(), isEmpty() and peek() - O(1)
class Stack { 
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top<0;
        //Write your code here 
    } 

    Stack() 
    { 
        top = -1;
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top>=MAX-1){
            System.out.println("You cannot PUSH,- stack Overflow-");
            return false;
        }
        else{
            a[++top]=x;
            System.out.println("Successfully pushed "+x+" into the stack");
            return true;
        }

    } 
  
    int pop() 
    { 
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int curr = a[--top];
            return curr;
        }
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    { 
        //Write your code here
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