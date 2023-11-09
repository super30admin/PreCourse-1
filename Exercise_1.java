class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top == -1;
    } 

    Stack() 
    { 
       top = -1; //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
       if(top>=MAX-1){
        System.out.println("stack is overflow");   //Check for stack Overflow
        return true;                                  //Write your code here

       } else{
        a[++top] =x;
          return false;

       }
       
    } 
  
    int pop() 
    { 
      if(isEmpty()){
        System.out.println("stack underflow");    //If empty return 0 and print " Stack Underflow"
        return 0;                                 //Write your code here

      }else{
        return(a[top--]);
      }
        
       
    } 
  
    int peek() 
    { 
        if(isEmpty()){
        System.out.println("stack is Empty");    //Write your code here
        return 0;
        }else{
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
