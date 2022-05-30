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
        //Check if root is null
        if(root == null) {
            return true;
        }

        return false;
    } 
  
    public void push(int data) 
    { 
        StackNode node = new StackNode(data);
        node.next = root;
        root = node;    
    } 
  
    public int pop() 
    { 	
        if(root == null) {
            System.out.println("Stack underflow");
            return 0;
        }
        StackNode output = root;
        root = root.next;
        return output.data;
    } 
  
    public int peek() 
    { 
        if(root == null) {
            System.out.println("Stack underflow");
            return 0;
        }

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
