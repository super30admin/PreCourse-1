public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return (root == null); 
    } 
  
    public void push(int data) 
    {
        StackNode node = new StackNode();
        node.data = data;
        node.next = root;

        root = node;

    } 
  
    public int pop() 
    {
        StackNode node = new StackNode();

        if (root == null)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            root = root.next;
        }

        return root.data;
    } 
  
    public int peek() 
    { 
        return root.data;
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
