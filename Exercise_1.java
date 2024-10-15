//Time Complexity: O(1) for push pop peek
//Space Complexity: O(MAX) length of array
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
	System.out.println("Top value is "+ top);
	return (top < 0);
    } 

    Stack() 
    { 
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
	if (top >= MAX-1) {
	    System.out.println("Out of Capacity");
	    return false;
	} else {
	    top++;
	    a[top] = x;
	    System.out.println(x + " Is pushed to Stack");
	    return true;
	}
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
	if (isEmpty()) {
	    System.out.println("Stack underflow");
	    return Integer.MIN_VALUE;
	} else {
	    int poppedElement = a[top];
	    top--;
	    return poppedElement;
	}
    } 
  
    int peek() 
    { 
        //Write your code here
	if (isEmpty()) {
	    System.out.println("Stanck is empty");
	    return Integer.MIN_VALUE;
	} else {
	    return a[top];
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
	System.out.println(s.pop() + " Popped from stack");
	System.out.println(s.pop() + " Popped from stack");
	System.out.println(s.pop() + " Popped from stack"); 
    } 
}
