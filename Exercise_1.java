class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
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
        //Write your code here
        if(top == MAX - 1){
             System.out.println("Stack overflow");
            return false;
        }else{
            top++;
            a[top] = x;
        }
    return true;

    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            System.out.println("Stack underflow");
            return 0;
        }else{
            int element = a[top];
            top--;
            return element;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty()){
            return 0;
        }else{
            return a[top];
        }
    } 
} 
  
// Driver code 
class StackUsingArray { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        System.out.println("Is stack is empty " + s.isEmpty());
        s.push(10); 
        System.out.println(s.peek() + " Peek element");
        s.push(20); 
        s.push(30);
         System.out.println("Is stack is empty " + s.isEmpty());
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.peek() + " Peek element");
    } 
}
