//Time Complexity : O(1) Push and pop takes only one cycle.
//Space Complexity : O(1) No additional space used.
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //top==-1 means no element is present in the stack, in that case return true else false
        if(top == -1){
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
        //check if stack is full, if its full print a message saying its full else put the element in stack
        if (top == MAX-1){
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
        }
        return true;
    }
        
        
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--];
    } 
  
    int peek() 
    { 
        if(isEmpty()) {
            return -1;
        }
        return a[top];
    } 

  
// Driver code 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
