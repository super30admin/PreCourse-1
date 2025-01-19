class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
           this.data =data;
           this.next =next;
        }
    } 

	
    public boolean isEmpty() 
    { 
       return root == null;
    } 
  
    public void push(int data) 
    { 
        StackNode node = new StackNode(data);
        node.next = root;
        root = node;
    } 
  
    public int pop() 
    {
        if(root == null)
        {
            throw new RuntimeException("Stack Underflow has occurred");
        }
        else {
	        int data = root.data;
            root = root.next;
            return data;
     }
    } 
  
    public int peek() 
    {
        if(root == null)
        {
            throw new RuntimeException("Stack Underflow has occurred");
        }
        else{
            return root.data;
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
