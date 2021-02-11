package precourse1;

public class ImpStackUsingLinkedList { 
	  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
        	this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return (root == null) ? true : false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
    	StackNode sn = new StackNode(data);
    	
    	if(root == null) {
    		root = sn;
    		System.out.println(data + " pushed to stack");
    	}else {
    		StackNode temp = root;
    		root = sn;
    		root.next = temp;
    		System.out.println(data + " pushed to stack");
    	}
    	
    } 
  
    public int pop() 
    { 	
    	int poppedNode = -1;
    	if(root == null) {
    		System.out.println("Stack underflow");
    	}else {
    		poppedNode = root.data;
    		root = root.next;
    	}
    	return poppedNode;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(root == null) {
    		System.out.println("Stack underflow");
    		return -1;
    	}else {
    		return root.data;
    	}
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
    	ImpStackUsingLinkedList isul = new ImpStackUsingLinkedList(); 
  
    	isul.push(10); 
    	isul.push(20); 
    	isul.push(30); 
        System.out.println(isul.isEmpty());
        System.out.println("Top element is " + isul.peek()); 
        System.out.println(isul.pop() + " popped from stack"); 
        System.out.println("Top element is " + isul.peek()); 
        System.out.println(isul.pop() + " popped from stack"); 
        System.out.println("Top element is " + isul.peek()); 
  
        System.out.println(isul.pop() + " popped from stack"); 
        System.out.println(isul.isEmpty());
        System.out.println("Top element is " + isul.peek()); 
    } 
} 