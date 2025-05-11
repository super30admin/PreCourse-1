class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top == -1)
            return true;
        else
            return false;
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
        if(top == MAX)
            return false;
        else
        {         
            if(top == -1)
            top++;
            a[top] = x;
            top++;
            return true;
        }
            
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top == -1)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write your code here
        else{
            int x = a[top-1];
            top--;
            return x;
           
        }
        
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top == -1){
            System.out.println("Stack Empty");
            return -1;
        }
            
        else
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
    } 
}
