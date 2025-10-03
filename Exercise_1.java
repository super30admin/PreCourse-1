//Time Complexity: O(1) for isEmpty, push,pop,peek
//Space Complexity: O(MAX)

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return (top==-1);//if empty, top will be -1
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        if(top>=MAX-1){
            return false;//Stack Overflow
        }
        else{
            a[++top]=x;
            return true;
        }
        //Check for stack Overflow
        //Write your code here
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            System.err.println("Stack Underflow");
            return 0;
        }
        else {
            return a[top--];
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty()){
            return -1;
        }
        else{
            return a[top];
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
