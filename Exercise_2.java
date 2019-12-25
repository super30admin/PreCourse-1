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
       if (root == null) {
            return true;
        }
        return false; 
    } 
  
    public void push(int data) 
    { 
        StackNode stackNode = new StackNode(data);
        stackNode.next = root;
        root = stackNode;
    } 
  
    public int pop() 
    { 	
	if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int res = root.data;
        root = root.next;
        return res; 
    } 
  
    public int peek() 
    { 
         if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return root.data
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
