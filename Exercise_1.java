// Time Complexity :push-O(1) pop- O(1) peek-O(1)
// Space Complexity :push-O(1) pop- O(1) peek-O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top < 0 ?  true : false ;
    } 

    Stack() 
    { 
        top = -1; //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
    	//Check Overflow
       if (top >= MAX-1) {
    	   System.out.println("Stack Overflow");
    	   return false;
       }
       
       //Write your code here
        a[++top] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
    	if (top < 0) {
     	   System.out.println("Stack Underflow");
        }
        //Write your code here
    	 return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
    	return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(50); 
        System.out.println(s.peek() + " Peek of stack"); 
        s.push(80); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
