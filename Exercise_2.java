//Time complexity : O(1) for push, pop, peek, isEmpty
//space complexity : O(1) 
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
        root == null ? true : false;
    } 
  
    public void push(int data) 
    { 
   	StackNode node = new StackNode(data);
	StackNode prevRoot = this.root;
	this.root = node;
	this.root.next = prevRoot;	
    } 
  
    public int pop() 
    { 	
	if (this.isEmpty())  {
    	  return 0;
    	} else {
    	  StackNode node = this.root;
    	  this.root = this.root.next;
    	  return node.data;
    	}    
    } 
  
    public int peek() 
    { 
        if (this.isEmpty())  {
    	  return 0;
    	} 
	return this.root.data;
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
