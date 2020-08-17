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
    
    StackAsLinkedList() {
        this.root = null;
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
        StackNode node = new StackNode(data);
        node.next = root;
        root = node;
    } 
  
    public int pop() 
    { 	
        if (isEmpty()) {
            System.out.print("Stack Underflow");
            return 0;
        }
        int x = root.data;
        root = root.next;
        return x;
    } 
  
    public int peek() 
    { 
        if (isEmpty()) {
            System.out.print("Stack Underflow");
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
