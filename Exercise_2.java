public class Exercise_2 { 
	  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
        	this.data=data;
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    {
    	//condition if stack is empty. 
    	if (root==null)
		   return true; 
    	else
    		return false;     
    } 
  
    public void push(Exercise_2 sll, int data) 
    {
    	StackNode node =new StackNode(data);
    	node.next=null;
   
        // If the Linked List is empty, 
        // then make the new node as head 
    	
        if (sll.root==null){
        	sll.root=node;
        }
        else{
        StackNode currNode=sll.root;

        	while(currNode.next!=null){
        		currNode=currNode.next;
        }
    	currNode.next=node;
        }
    } 
  
    public int pop() 
    {
    	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	StackNode currNode=root;
    	while (currNode.next.next!=null){
    		currNode=currNode.next;
    	}
    	int x=currNode.next.data;
    	currNode.next=null;
		return x;
    } 
  
    public int peek() 
    {
    	StackNode currNode=root;
    	while (currNode.next.next!=null){
    		currNode=currNode.next;
    	}
    	int x=currNode.next.data;
    	return x;
    } 
  

    public static void main(String[] args) 
    { 
  
    	Exercise_2 sll = new Exercise_2(); 
  
        sll.push(sll,10); 
        sll.push(sll,20); 
        sll.push(sll,30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
