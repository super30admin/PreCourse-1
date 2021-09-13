class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    // Time and Space Complexity for peek,pop operation is O(1)
    // Time and Space Complexity for push operation is O(n)
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
       if(top==-1){
           return true;
       }
       else
           return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
        top=-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top>= (MAX-1)){
           return false;
        }
        else {
            top = top + 1;
            a[top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
           int value= a[top];
           top= top-1;
           return value;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            int value = a[top];
            return value;
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
