// Time Complexity for all operations : O(n)
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
        if (null == this.root) {
            return true;
        }
        
        return false; 
    } 
  
    public void push(int data) 
    { 
        if (this.isEmpty()) {
            root = new StackNode(data);
        } else {
            StackNode temp = root;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = new StackNode(data);
        } 
    } 
  
    public int pop() 
    { 	
        if (this.isEmpty()) {
    	    System.out.println("Stack Underflow");
            return 0;
        } else if (root.next == null) {
            int value = root.data;
            root = null;
            return value;
        } else {
            StackNode temp = root;
            StackNode previous = temp;
            int value = 0;
            while (temp.next != null) {
                previous = temp;
                temp = temp.next;
            }
            value = temp.data;
            previous.next = null;
            return value;
        }
    } 
  
    public int peek() 
    { 
        if (this.isEmpty()) {
            System.out.println("Stack is empty nothing to peek");
            return 0;
        }
        
        StackNode temp = this.root;
        int top = 0;
        while (temp != null) {
            top = temp.data;
            temp = temp.next;
        }
        return top;
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
