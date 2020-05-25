// Time Complexity : O(1)
// Space Complexity : O(n) where n is the max size of the stack
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this : No
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    int size;
  
    boolean isEmpty() 
    { 
        return size == 0; 
    } 

    Stack() 
    { 
        size = 0; 
    } 
  
    boolean push(int x) 
    { 
        if(size == MAX) {
        	System.out.println("Stack size exceeded! Stack Overflow");
        	return false;
        }
        
        a[size] = x;
        size += 1;
        return true;
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(this.isEmpty()) {
        	System.out.println("Stack Underflow");
        	return 0;
        }
        int temp = a[size];
        a[size] = 0;
        return temp;
    } 
  
    int peek() 
    { 
        return a[size];
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
