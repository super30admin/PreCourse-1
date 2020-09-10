//Time Complexity : O(1) since this is unsorted array
//Space Complexity : O(n) 
//Did this code successfully run on Leetcode : haven't tried
//Any problem you faced while coding this : No

//Your code here along with comments explaining your approach : given with each method

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    
    Stack() 
    { 
        //Initialize your constructor 
    	top = -1;
    } 
    
    boolean push(int x) 
    { 	
    	//top value can not exceed MAX value, therefore check if top is more than MAX
        //Check for stack Overflow
    	if (top >= (MAX-1)) { 
    		System.out.println("Stack Overflow");
    		return false;
    	} else {
            a[++top] = x;
            System.out.println("top: " + top);
            return true;
    	}

    } 
    
    boolean isEmpty() 
    // we are initializing top as -1, taking top as reference check if stack is empty or not
    // we are increasing value of top in push so if stack is empty value of top will be less than 0, else more than 0
    { 
        if (top < 0 ) {
        	return true;
        }else {
        	return false;
        }
    } 
  
    int pop() 
    { 	
    	// If top is less than 0 then that means there is array is empty. Check if array is empty or not before popping
        //If empty return 0 and print " Stack Underflow"
        if(top < 0 ) {
        	System.out.println("Stack Underflow");
        	return 0;
        }else {
        	int x = a[top--];
        	return x;
        }
    } 
  
    int peek() 
    { 	
    	// If top is less than 0 then that means there is array is empty. Check if array is empty or not before peeking
    	if (top < 0) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}else {
    		int x = a[top];
    		return x;
    	}
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
    	
    	Stack s = new Stack(); 
        System.out.println(s.isEmpty());
        s.push(0); 
        System.out.println(s.isEmpty());
        s.push(1); 
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.peek());
        System.out.println(s.pop());
        long startTime = System.nanoTime();
        s.push(4);
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
        
        long startTime1 = System.nanoTime();
        s.pop();
        long endTime1   = System.nanoTime();
        long totalTime1 = endTime1 - startTime1;
        System.out.println(totalTime1);

    } 
}



