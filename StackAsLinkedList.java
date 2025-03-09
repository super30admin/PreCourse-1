//Space Complexity: O(N)
//// Time complexity: O(1) for all operations
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
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode; 
    } 
  
    public int pop() 
    { 	
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int po = root.data;
        root = root.next;
        return po; 
    } 
  
    public int peek() 
    { 
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
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
