//Time complexity = O(1)
//Space complexity =O(1)
//successfully executed

 class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top==0){
            return true;
        }
        else{
            return false;
        }
    } 

    Stack() 
    { 
        //Initialize your constructor 
        this.top=0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top == MAX ){
            System.out.println("stack overflow");
            return false;
        }
        else{
            top++;
             a[top]=x;
             return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top==0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            int x= top;
            top--;
            return a[x];

        }
    } 
  
    int peek() 
    { 
        //Write your code here
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
