class Stack { 
    // Time Complexity : O(1) 
    // Space Complexity : O(1) 
    // Did this code successfully run on Leetcode : didnt find the exact problem 
    // Any problem you faced while coding this : improved by repurposing the isEmpty() method 

    static final int MAX = 1000; 
    int top; 
    int topVal; // new variable to store the top value for peek() & pop()
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top < 0){
            System.out.println("Empty stack"); 
			return true;
		}
		return false;
    } 

    Stack() 
    { 
        this.top = -1; // intialized top(negative index) for indicating empty stack
		this.topVal = -1; 
    } 
  
    boolean push(int x) 
    { 
        if(top < MAX-1){ //checking for top is not MAX - 1  then proceede  else Stack overflow 
			top++;
			a[top] = x;
			return true;
		} else {
            System.out.println("Stack Overflow");
        }
		return false;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
			topVal = a[top];
			a[top] = 0; //intializing the value of the popped index to 0
			top--;
        }
		return topVal;
    } 
  
    int peek() 
    { 
        if(!isEmpty()){
			return a[top];
		}else return -1;
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
