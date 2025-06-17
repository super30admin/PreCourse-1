// Time Complexity : O(1)
// Space Complexity : O(1) - Maximum size of Stack 
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
        if(isEmpty()) {
            System.err.println("Stack Underflow");
            return 0;
        }
        int result = root.data;
        root = root.next;
        return result;
    } 
  
    public int peek() 
    { 
        if(isEmpty()){
            System.out.println("Empty stack");
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
