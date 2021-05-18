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
        if(root == null) return true;

        return false; 
    } 
  
    public void push(int data) 
    { 
        //Insert a new node at the start of Linked List
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
    } 
  
    public int pop() 
    {
        if(root.next == null) {
            System.out.println("Stack Underflow");
            return 0;
        } else {

            //Delete node from the start of Linked List
            StackNode popNode = root;
            root = root.next;
            return popNode.data;
        }
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
