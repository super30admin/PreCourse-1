/* 
Time Complexity => Push: O(1), Pop: O(1), Peek: O(1), isEmpty: O(1)
Space Complexity => Remains constant throughout so O(1)
This code runs successfully on Leetcode.
I did not face any problem while coding this.
*/
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
	return this.top == -1;
    } 

    Stack() 
    { 
        //Initialize your constructor
	this.top = -1; 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
	if(this.top + 1 == this.a.length){
		return false;
	}
	this.top++;
	this.a[this.top] = x;
	return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
	int rv = this.a[this.top];
	this.a[this.top] = 0;
	this.top--;
	return rv;
	
    } 
  
    int peek() 
    { 
        //Write your code here
	return this.a[this.top];
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
