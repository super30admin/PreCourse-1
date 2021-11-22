/*
 * Question 1:  Implement Stack using Array
 * 
 * Time Complexity:
 * 1. isEmpty - O(1)
 * 2. Push operation - O(1)
 * 3. Pop operation - o(1)
 * 4. Peek operation - O(1)
 * 
 * 
 * Space Complexity:
 * 1. isEmpty - O(1)
 * 2. Push operation - O(1)
 * 3. Pop operation - o(1)
 * 4. Peek operation - O(1)
 * 
 * 
 * This code will run successfully on Leetcode
 * 
 * Any problems you face while coding this - No
 * 
 * Approach: 
 * Using a pointer top to implement FIFO pattern. top is initialized to -1. 
 * on every push operation top will be incremented first and then element will be inserted.
 * 
 * 1. for is empty operation, result will be true if top = -1 as it shows stack is empty
 * 2. for push operation, if stack is full (ie if top == max -1) then false is return else 
 * 	  top is incremented and then element is inserted into stack
 * 3. for pop operation if stack is empty(ie is top = -1) then 0 is returned and 
 * 	  message "stack underflow" is printed on console else element currently pointed by top 
 * 	  is returned and top is decremented by 1 which shows this element is also removed from stack
 * 4. for peek operation if stack is empty(ie is top = -1) then 0 is returned and 
 * 	  message "stack underflow" is printed on console else element currently pointed by top 
 * 	  is returned and top remains same that shows, current element is not removed from stack
 */


class Stack { 
    
    static final int MAX = 5; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(this.top == -1)return true;
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor \
    	this.top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if(this.top ==  this.MAX-1) {
    		//code for overflow
    		System.out.println("Stack is full");
    		return false;
    	}else {
    		this.a[++this.top] = x;
    		return true;
    	}
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
    	if(this.top == -1) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}else {
    		//Write your code here
    		return this.a[this.top--];
    	}
        
    } 
  
    int peek() 
    { 
    	if(this.top == -1) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}else {
    		//Write your code here
    		return this.a[this.top];
    	}
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        System.out.println("10 is " + s.push(10));
        System.out.println("20 is " + s.push(20));
        System.out.println("30 is " + s.push(30));
        System.out.println("40 is " + s.push(40));
        System.out.println("50 is " + s.push(50));
        System.out.println("60 is " + s.push(60));
        System.out.println(s.pop() + " Popped from stack"); 
        
    } 
}

