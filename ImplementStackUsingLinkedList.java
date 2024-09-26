package PreCourse_1;

// Time complexity is O(1) for push, pop and peek operations & space complexity is O(1).
/* Approach : To overcome disadvantages of creating stack using array, linked list is used where size can be grown dynamically.
 * Create a Node class with val and next pointer and a top node.
 * if top node is null then stack is empty, otherwise, create a new node and make it as top.
 * to pop an element, create a temp node and put the next pointer of node to be deleted to temp node and move node to next node. data in temp will be deleted.
 * when top is not empty, returning top.data is peeking operation. 
 */
public class ImplementStackUsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		ImplementStackUsingLinkedList sll = new ImplementStackUsingLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
	}
	
	 StackNode top; 
	  
	
	    
		
	    public boolean isEmpty() 
	    { 
	        //Write your code here for the condition if stack is empty. 
	    	return (top==null);
	    } 
	  
	    public void push(int x) 
	    { 
	    	
	    	//Write code to push data to the stack. 
	    	if(top == null) {
	    		StackNode newNode = new StackNode(x);
	    		top = newNode;
	    	}
    		System.out.println("inserting data" + x);
    		StackNode newNode = new StackNode(x);
    		newNode.next = top;
    		top = newNode;
	    		
	    } 
	  
	    public int pop() 
	    { 	
		//If Stack Empty Return 0 and print "Stack Underflow"
	        //Write code to pop the topmost element of stack.
		//Also return the popped element 
	    	if(top == null) {
	    		System.out.println("heap overflow");
	    	}
    		System.out.println("removing top");
    		
    		int temp = top.data;
    		top = top.next;
    		return temp;
	    	
	    } 
	  
	    public int peek() 
	    { 
	        //Write code to just return the topmost element without removing it.
	    	if(top == null) {
	    		System.out.println("heap overflow");
	    	}
    		System.out.println("peeking");
    		
			return top.data;
	    } 
	    
	    static class StackNode { 
	        int data; 
	        StackNode next; 
	  
	        StackNode(int data) 
	        { 
	            //Constructor here 
	        	 this.data = data;
	        } 
	    } 
	  
}
