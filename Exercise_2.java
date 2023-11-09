/*
 * In stack Implementation, a stack contains a top pointer, which is “head” of the stack 
 * where pushing and popping items happens at the head of the list. 
 * First node have null in link field and second node link have first node address in 
 * link field and so on and last node address in “top” pointer.
 */

/* Time Complexity: O(1) as not performing any kind of traversal over the list.
*
*      isEmpty() - O(1)
*
*      push(x) - O(1)
*
*      pop() - O(1)
*
*      peek() - O(1)

* Space Complexity: O(N) where N is the number of elements inserted into the stack
*/

class StackAsLinkedList { 
	  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data)  { 
            this.data = data;
        } 
    } 
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
    	if(root == null)
    		return true;
    	else
    		return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode current = new StackNode(data);
    	
    	if(isEmpty()) {
    		root = current;
    		System.out.println("Pushed Element: " + current.data);
    	} else {
        	current.next = root;
        	root = current;
        	System.out.println("Pushed Element: " + current.data);
    	}
    	 
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	} else {
    		StackNode first = root;
    		root = root.next;
    		System.out.println("Popped Element: " + first.data);
    		return first.data;
    	}
    	
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(!isEmpty()) {
    		return root.data;
    	} else {
    		System.out.println("Stack is Empty");
    		return -1;
    	}
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
}
