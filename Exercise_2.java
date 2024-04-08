public class StackAsLinkedList { 
	  
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
		if(root==null) return true;
		return false;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
		    StackNode curr=root;				
			StackNode node= new StackNode(data);	
			node.next=curr;
			root=node;
    } 
  
    public int pop() 
    { 
		if(root==null){
			System.out.println("Stack Underflow");
			return 0;
		}
		StackNode node=root;
		root=root.next;
		return node.data;
    } 
  
    public int peek() 
    { 
        if(root==null) return 0;
        return root.data;
		
    } 
  
	//Driver code
    public static void main(String[] args) 
    {   
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        System.out.println(sll.pop() + " popped from stack");         
        sll.push(20); 
        System.out.println(sll.pop() + " popped from stack");   
        sll.push(30);
        System.out.println(sll.pop() + " popped from stack");   
        System.out.println("Top element is " + sll.peek()); 
    } 
} 