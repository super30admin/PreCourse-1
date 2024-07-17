public class StackAsLinkedList { 
  // Time Complexity: O(1) for all operations
    // Space Complexity: O(n) where n is the size of the stack
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
        StackNode t = new StackNode(data);
        t.next = root;
        root = t; 
    } 
  
    public int pop() 
    { 	
        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }

       int item = root.data;
       root = root.next;

       return item;
    } 
  
    public int peek() 
    { 
        if (root == null) {
            System.out.println("Stack Underflow");
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
