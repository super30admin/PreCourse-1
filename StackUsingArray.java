package precourse1;
import java.util.EmptyStackException;
//time complexity: push: O(1), pop: O(1), peek: O(1)
//space complexity: O(n)
public class StackUsingArray { 
	public static final int MAX = 1000; 
    int top = -1;
    int a[];
    int size;

    StackUsingArray(int size) 
    { 
    	this.size = MAX;
    	a = new int[size];
    	System.out.println("length= " + a.length); 
    }
  
    boolean isEmpty() 
    {
		if(top == -1) {
			return true;
		}
		else {
			return false;
		}
    }
    
    boolean isFull() 
    {
		if(top == size) {
			return true;
		}
		else {
			return false;
		}
    } 

  
    int push(int x) 
    {
    	if(isFull()) {
    		System.out.println("Stack is full"); 
    		throw new StackOverflowError("Stack is full");
    	}
	    a[++top] = x;
	    return x;
	 
    }
    
    int peek() 
    { 
        return a[top];
    } 

    public int pop() 
    {
    	int p;
		if(isEmpty()) {
			System.out.println("Stack is empty"); 
			throw new EmptyStackException();
		}
    	p= a[top];
    	a[top--] = Integer.MIN_VALUE;
	    return p;
    } 
  
// Driver code 

    public static void main(String args[]) 
    { 
    	StackUsingArray s = new StackUsingArray(10); 
        
        // To check empty stack exception
        // System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.push(10) + " Pushed to stack");
        System.out.println(s.push(20) + " Pushed to stack"); 
        System.out.println(s.push(30) + " Pushed to stack"); 
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        
    } 
}