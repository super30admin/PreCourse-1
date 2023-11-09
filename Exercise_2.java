public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            data = this.data;
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
        StackNode current = new StackNode(data);
        current.next = root;

        root = current;
    } 
  
    public int pop() 
    { 	
        if (top != null) {
            int result = top.data;
            top = top.next;
            return result;
        }

        return 0;
    } 
  
    public int peek() 
    { 
        if (top != null) {
            return top.data;
        }

        return 0;
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
