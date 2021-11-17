//Push
// Time Complexity : O(1)
// Space Complexity : O(1)

//Pop
// Time Complexity : O(1)
// Space Complexity : O(1)

//Peek
// Time Complexity : O(1)
// Space Complexity : O(1)

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
        //Initialize your constructor 
    	top =-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	
    	if(top>=a.length-1) {
    		System.out.println("Stack Overflow");
    		return false;
    		}
    	else {
    		top++;
    		a[top] = x;
    		return true;
    	}
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	int x = 0;
    	if(top == -1) {
    		System.out.println("Stack UnderFlow");
    		
    	}
    	else {
    		x = a[top];
    		top--;
    	}
    	return x;
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
