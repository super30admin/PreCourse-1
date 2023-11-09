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
        top = -1;
    } 
  
    void push(int x)
    { 
        //Check for stack Overflow
        //Write your code here
        if(MAX-1==top){
            System.out.println("Stack overflow");
        }else{
            top++;
            a[top] = x;
            System.out.println("Pushed element: "+x);
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            System.out.println("Stack Underflow ");
            return 0;
        }else{
            int i = a[top];
            top --;
            return i;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(!isEmpty()){
            return a[top];
        } else{
            System.out.println("Sack is empty");
            return 0;
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
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
    } 
}
