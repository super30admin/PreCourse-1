class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if (top == -1) {
			return true;
		} else {
			return false;
		}
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if (top <= MAX) {      
			top = top + 1;
			a[top] = x;
			System.out.println("Element is pushed"+x);
			return true;
		} else if (top > MAX) {
			System.out.println("stack Overflow");
			return false;
		} else {
			return false;
		}
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top == -1) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int poppedElement = top;
			top = top - 1;
			System.out.println("popped element"+a[poppedElement]);
			return a[poppedElement];
		}
    } 
  
    int peek() 
    { 
        //Write your code here
        int peekedElement = top;
		System.out.println("peeked element"+a[peekedElement]);
		return a[peekedElement];
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
