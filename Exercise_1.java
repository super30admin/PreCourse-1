class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(this.top==-1)return true;
        return false;
    } 

    Stack() 
    { 
        top=-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top>=MAX-1){
            System.out.println("Stack is Full - Stack Overflow");
            return false;
        }
        else{
        //Write your code here
        this.a[++top]=x;
        System.out.println("Element pushed into the stack");
        return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top==-1){
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write your code here

        else{
            int x=a[top--];
            return x;
        }
    } 
  
    int peek() 
    { 
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
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
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.peek());

    } 
}
