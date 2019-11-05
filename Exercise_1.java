class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        
        if(top==-1){
        	System.out.println("Stack Underflow");
            return true;
            }
        else{
            return false;
        }
        
    } 

    Stack() 
    { 
        //Initialize your constructor
        this.top = -1;
        
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top==MAX-1){ // As indexing is from 0 to 999
            System.out.println("Stack Overflow");
            return false;
        }
        else{
        	top++;
            a[top] = x;
           // System.out.println(x);
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            
            return 0;
        }
        else{
        	int res = a[top];
        	a[top]=0; // Setting the top element to 0 as we are popping the element
            top--; // Decrementing top 
            return res;
           
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(!isEmpty()){
            return a[top]; //Returning only the top element without decrementing the top variable
        }
        else{
            System.out.println("Stack Empty"); 
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
        
    } 
}
