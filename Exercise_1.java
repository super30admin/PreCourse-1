class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    
    //isEmpty is to check if stack is empty or not 
    boolean isEmpty() 
    { 
        //Write your code here 
        //If stack has no elements => top < 0 ,return true
        if(top<=0){
            return true;
        }
        //else if top>0 return false
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
        //initialize top as -1 to indicate stack is empty
        top=-1; 
    } 
  
    boolean push(int x) 
    {   //if full return Stackoverflow and false
        if(top==MAX){
                System.out.println("Stack Overflow");
                return false;
        }
        //Check for stack Overflow
        //Write your code here
        else{
            a[++top]=x;
            return true;
        }
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
         //If stack is not empty return the data and remove it after returning by decreasing top by 1
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
         //Write your code here
        //If stack is empty return 0 and print "Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        //If stack is not empty return data
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
    } 
}
