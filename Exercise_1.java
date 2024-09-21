class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top == -1) {
        	return true;
        }
        else return false;
    } 

    Stack() 
    { 
        int top=-1;
    } 
  
    boolean push(int x) 
    { 
        if(top<1000) {
        	top++;
        	a[top] = x;
        	return true;
        }
        else return false;
    } 
  
    int pop() 
    { 
    	if(top==-1) {
    		System.out.println("Stack Underflow");
     		return 0;
    	}
    	else {
    		return a[top--];
   
    	}
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    { 
        if(top == -1) {
        	return -1;
        }
        else return a[top];
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
