public class StackAsLinkedList { 
    // Time Complexity: O(1) -> push, pop, peek functions
    // Additional TC: O(n) -> toString (additional function I have added to iterate all elements of the stack)
    // Space Complexity: O(n)  -> (looks similar to array but linkedlist takes extra space per node for reference of next objects)
    //Did this code successfully run on Leetcode : Yes (works on Compilers)
    // Any problem you faced while coding this : Not as such
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here - assinging the data to the node
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //checking if root is pointing to null
        return (root == null);
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        //calling constructor to create a new node and making it point to the root
        StackNode node = new StackNode(data);
        if(root != null)
            node.next = root;
        //now making root to point to the latest node that we just created
        root = node;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
	//returning 0 and printing if the stack is empty
	if(root == null)
	{
	    System.out.println("Stack Underflow");
        return 0;
	}
	//putting the data into temporary variable
	int element = root.data;
	// pointing root to the next element of the root
	root = root.next;
	//returning the stored element that is data of root
	return element;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        // returning the top most that is being pointed by root element
        if(root != null)
        {
            return (root.data);
        }
        //returning 0 and printing if the stack is empty
        System.out.println("Stack Empty");
        return 0;
    } 

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        //creating a node to iterate and pointing it to root
        StackNode node = root;
        //checking till the node is null i.e. the last element
        while(node!=null){
            sb.append(node.data);
            node = node.next;
            if(node != null) sb.append(", ");
        }
        sb.append("]");
        //returning the string version
        return sb.toString();
    }
  
	//Driver code
    public static void main(String[] args) 
    { 
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
        //additional fucntion to see the Stack
        System.out.println("Stack: " + sll);
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek());
    } 
} 
