
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
        if(root == null)
        	return true;
        return false;
    } 
  
    public void push(int data) 
    { 
        StackNode node1 = new StackNode(data);
        if(root == null) {
        	root = node1;
        	System.out.print(data + " pushed to stack\n");
        }
        else {
        	StackNode temp = root;
        	root = node1;
        	node1.next = temp;	
        	System.out.print(data + " pushed to stack\n");
        }
        
    } 
  
    public int pop() 
    { 	
    	int pop = Integer.MIN_VALUE;
    	if(root == null) {
    		System.out.print("Stack Underflow");
    		return 0;
    	}
    	
    	else {
    		pop = root.data;
    		root = root.next;
    		return pop;
    	}
	
    } 
  
    public int peek() 
    { 
        if(root == null) {
        	System.out.print("Stack Underflow");
        	return 0;
        }
        else
        {
        	
         	return root.data;
        }
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
    	StackAsLinkedList sll = StackAsLinkedList StackLL(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack\n"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
