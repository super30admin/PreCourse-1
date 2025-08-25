class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 
  
 // Time Complexity: O(1)
 // Space Complexity: O(1)
    public boolean isEmpty() 
    { 
        if(top== -1) {
        	return true;
        }
        return false;
    } 
    
 // Time Complexity: O(1)
 // Space Complexity: O(1)
    public boolean isFull() {
    	if(top== MAX-1) {
    		return true;
    	}
    	return false;
    }

    Stack() 
    { 
        this.top= -1;
    } 
  
    
 // Time Complexity: O(1)
 // Space Complexity: O(1)
    boolean push(int x) 
    { 
        if(isFull()) {
        	System.out.println("Stack Overflow");
        	return false;
        }
        a[++top]= x;
        System.out.println("Pushed");
        return true;
        
    } 
  
 // Time Complexity: O(1)
 // Space Complexity: O(1)
    int pop() 
    { 
        if(isEmpty()) {
        	System.out.println("Stack Underflow");
        	return 0;
        }
        
        return a[top--];
    } 
  
    
 // Time Complexity: O(1)
 // Space Complexity: O(1)
    int peek() 
    { 
        if(isEmpty()) {
        	return 0;
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
    } 
}
