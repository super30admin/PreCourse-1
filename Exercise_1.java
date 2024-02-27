class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; //size
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top == -1); 
    } 

    Stack() 
    { 
        this.top = -1;
    } 
  
    boolean push(int x) 
    { 
        a[++top] = x;
        System.out.println("Element pushed " + x);
        return true;
    } 
  
    int pop() 
    { 
        if(!isEmpty()){
            int val = a[top];
            top--;
            return val;
        }else{
            System.out.println("Stack underflow");
            return 0;
        }
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    { 
        return a[top];
    } 
} 
  
// Driver code 
class Exercise_1 { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
