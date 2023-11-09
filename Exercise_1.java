class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
//Time Complexity: isEmpty: O(n), Push: O(1), Pop: 0(1), Peek: O(1)
//Space coplexity: O(n)
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    public Stack() 
    { 
        //Initialize your constructor 
    	top = -1;
    }
    
    boolean isEmpty() 
    { 
        //Write your code here 
    	for(int i = 0;i<a.length;i++) {
    		if(a[i] != 0) {
    			return false;
    		}
    	}
    	return true;
    } 

  
    boolean push(int x) 
    { 
        //Check for stack Overflow
    	if(top == MAX-1) {
    		System.out.println("Stack Overflow");
    		return false;
    	}
    	//Write your code here
    	else {
    		top ++;
    		a[top] = x;
    	}
    	return false;
    } 
  
    int pop() 
    { 
    	int value = 0;
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if(!this.isEmpty()) {
    		value = a[top];
    		top--;
    		return value;
    	}
    	else {
    		System.out.println("Stack Underflow");
    	}
    	return 0;
    } 
  
    int peek() 
    { 
        //Write your code here
    	if(!this.isEmpty()) {
    		return a[top];
    	}
    	else {
    		System.out.println("sdgf");
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
