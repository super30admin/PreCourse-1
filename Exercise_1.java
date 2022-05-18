/*Approach using Arrays:
 * Simulate a stack with an array.
 * We only need to keep track of the top element of the stack.
 * because all operations happen at the end of the array (top of the stack - 
 * LIFO(Last In First Out) or FILO(First In Last Out).).
 */


/* Time Complexity: O(1) Constant as no loops are being used.
*
*      isEmpty() - O(1)
*
*      push(x) - O(1)
*
*      pop() - O(1)
*
*      peek() - O(1)

* Space Complexity: O(1) since we have allocated 1000 as the size of the integer array
*/

class Stack { 
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    Stack() 
    { 
       this.top = -1;
    } 
    
   boolean isEmpty() { 
        if(top == -1)
        	return true;
        else
        	return false;
    } 
  
    boolean push(int x) { 
        //Check for stack Overflow
    	int arraySize = MAX-1;
        if(!(top >= arraySize)) {
        	top++;
        	a[top] = x;
        	System.out.println("Element Pushed: " + x);
        	return true;
        } else {
        	System.out.println("Stack Overflow");
        	return false;
        }
    } 
  
    int pop() { 
        //If empty return 0 and print " Stack Underflow"
    	if(!isEmpty()) {
    		int y = top;
    		top--;
    		System.out.println("Element Popped: " + a[y]);
    		return a[y];
    	} else {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
        
    }																			 
  
    int peek() { 
        if(!isEmpty()) {
        	int x = a[top];
        	return x;
        } else {
        	System.out.println("Stack Underflow");
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
