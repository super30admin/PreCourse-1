
public class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  //O(1) - time complexity and space complexity
    boolean isEmpty() 
    { 
        //Write your code here 
    	if(top==-1)
    		return true;
    	else
    		return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
    	top=-1;
    } 
  //O(1) - time complexity and space complexity
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if(top==MAX-1) {
    		
    		System.out.println("Stack overflow");
    		return false;
    	}
    	top=top+1;
    	a[top]=x;
    	System.out.println(x+"pushed"); 
    	return true;
    		
    
    } 
  //O(1) - time complexity and space complexity
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if(isEmpty()) {
    		System.out.print("Stack Underflow");
    		return 0;
    		}
    	int result = a[top];
    	top--;
    	return result;
    } 
  
  //O(1) - time complexity and space complexity
    int peek() 
    { 
        //Write your code here
    	if(isEmpty()) {
    		System.out.print("Stack Underflow");
    		return 0;
    		}
    	int result = a[top];
    	return result;
    } 

  
// Driver code 
    public static void main(String args[]) 
    { 
        Stack s = new Stack();  
       
     
       System.out.println(s.push(10)); 
    System.out.println(s.push(20)); 
      System.out.println(s.push(30)); 
       System.out.println(s.pop() + " Popped from stack"); 
    } 
}