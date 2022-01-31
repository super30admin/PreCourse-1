class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if (top == -1) {
            return true;
        }
        return false;
    } 

    Stack() 
    {
        top = -1;
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
       if (top + 1 == MAX ) {
           System.out.println(" Stack Overflow");
           return false;
        }

       top = top + 1;
       a[top] = x;


       return true;
    } 
  
    int pop() 
    {
        if (top < 0){
            System.out.println(" Stack Underflow");
            return 0;
        }

        int result = a[top];
        top = top - 1 ;
        return result;
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    {
        if (top <= 0){
            return 0;
        }
        return a[top-1];
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
        System.out.println(s.peek() + " is the peek from stack");
    } 
}


 /* time complexity to push and pop is O(1)
       space complexity 0(1)
     */
