package precourse1;
import java.util.EmptyStackException;
// time complexity: push: O(1), pop: O(1), show: O(n), peek: O(1)
// space complexity: O(n)
public class StackAsLinkedList { 
	  
    StackNode root; 
    int size;
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
        	this.data= data;
        	this.next= null;
        } 
    } 
    
    public boolean isEmpty() {
		return size == 0;  
    } 
  
    public void push(int data) { 
    	StackNode temp= new StackNode(data);
    	temp.next= root;
    	root= temp;
    	size++;
    } 
  
    public int pop() {
    	int p;
		if(isEmpty()) {
			System.out.println("Stack is empty"); 
			throw new EmptyStackException();
		}
    	p= root.data;
    	root = root.next;
    	size--;
	    return p;
    } 
  
    public int size() {
    	return size;
    }
    
    public int peek() {
    	if(isEmpty()) {
			System.out.println("Stack is empty"); 
			throw new EmptyStackException();
		}
    	return root.data;
    } 
    
    public void showStack() {
    	StackNode temp = root;
    	while(temp!= null) {
    		System.out.println(temp.data + " ");	
    		temp = temp.next;
    	}
    }
  
	//Driver code
    public static void main(String[] args) { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
        System.out.println(sll.pop() + " popped from stack"); 
        
        System.out.println("Top element is " + sll.peek()); 
    } 
} 