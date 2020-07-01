

class Stack { 
    static final int MAX = 1000; 
    int top; int pointer=0;
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    //Approach: I have used a pointer to keep track of the elements and the index in the array, also updating the top variable whenever a push or pop is done.
    boolean isEmpty() 
    { 
        //Write your code here 
    	return pointer == 0;
    } 

    Stack() 
    { 
        //Initialize your constructor
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if(pointer == 1000)
    		return false;
		a[pointer++] = x;
		top = x;
		return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if(isEmpty())
		{
    		System.out.println("Stack Underflow");
    		return 0;
		}else
		{
			int value = top;
			top = a[--pointer];
			return value;
		}
    } 
  
    int peek() 
    { 
        //Write your code here
    	return top;
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
 // Time Complexity : Push - O(1), pushing element at the pointer in the array 
    //Peek - O(1) - peek the top element , Pop - O(1) popping element at the pointer of the array
   // Space Complexity : O(1)
   // Did this code successfully run on Leetcode : NA
   // Any problem you faced while coding this : NA
}
