class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file

  // Time complexity push,pop,peek,isEmpty = o(1)
//Space complexity = o(MAX)  //size of array  
    static final int MAX = 1000; 
    int top = -1; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top == -1){
            return true;
        }
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        System.out.println("In constructor");
    } 
  
    boolean push(int x) 
    { 
        
        //Write your code here
        if(top == MAX){ //Check for stack Overflow
            return false;
        }
        top++;
        a[top] = x;
        return true;
    } 
  
    int pop() 
    { 
        
        //Write your code here
        if(top == -1){
            System.out.println("Underflow"); //If empty return 0 and print " Stack Underflow"
            return 0;
        }
        else{
            int topElement = a[top];
            a[top] = 0;
            top--;
            return topElement;
        }
    } 
  
    int peek() 
    { 
        if(top == -1){
            return -1; //stack underflow
        }
        if(top == MAX){
            return MAX; // stack overflow 
        }
        return a[top];
    } 

    void display(){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
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
