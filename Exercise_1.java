//push operation : time complexity to check : O(1) and space : O(1)
//pop operation : time complexity to check : O(1) and space : O(1)
//empty check operation : time complexity to check : O(1) and space : O(1)
//peek operation : time complexity to check : O(1) and space : O(1)
public class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    
    //check top is -1 else return false as empty check
    boolean isEmpty() 
    { 
        //Write your code here 
    	if(top==-1) {
    		return true;
    	}
    	else
    		return false;

    } 

    Stack() 
    { 
        //Initialize your constructor 
    	this.top=-1;
    	
    } 
    // check for stack overflow , if not assign top increment 1 and add data (x) to it
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top==MAX-1){
            System.out.println("stack overflow");
            return false;
        }
        else{
            a[++top] = x;
            System.out.println("Pushed: " + x);
        }
        return true;
    } 
  
    // check if top is -1, else decrement top to reduce the pointer and return the value at that array location
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top==-1){
            System.out.print("stack empty");
            return -1;
            
        }
        return a[top--];
     
        
    }  
    // check if top is -1 as there will be no element if -1,else return the stack top thru using top pointer
    int peek() 
    { 
    	if(top==-1) {
    		return -1;
    	}
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
        System.out.println(s.peek() + " Peek from stack"); 
        
    } 
}
