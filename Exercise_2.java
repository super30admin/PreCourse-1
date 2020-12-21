//Time Complexity: O(1)
//Space Complexity: O(N)
public class StackAsLinkedList { 
	  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
           this.data = data; 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
    	//Write your code here for the condition if stack is empty.
    	return root == null;
    } 
  
    public void push(int data) 
    { 
      //Write code to push data to the stack. 
    	StackNode createNode = new StackNode(data);
    	createNode.next = root;
    	root = createNode; //This element is the root of our linkedList
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	if(root == null) {
    		System.out.println("Stack Underflow"); //No element to return
    		return 0;
    	}
    		StackNode popNode = root;
    		root = root.next;
    		return popNode.data;                  //Will return the root element
    	}
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	return root.data;                         //Peek is used to check the topmost element.
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