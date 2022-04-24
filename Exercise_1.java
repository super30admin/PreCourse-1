class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top<0);//Write your code here 
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
        }//Write your code here
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
            System.out.println("Stack Underflow"); //Write your code here
            return 0;
        }
        else {
            int x = a[top];
            return x;
        } 
    } 
    void print(){
        for(int i = top;i>-1;i--){
          System.out.print(" "+ a[i]);
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
