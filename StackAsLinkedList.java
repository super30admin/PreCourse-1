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
        System.out.println(data + " pushed into stack"); 
    } 
  
    public int pop() 
    { 	
        if (isEmpty()) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        int popped = root.data; // Store the data of the root
        root = root.next; // Move the root pointer to the next node
        return popped; 
    }

    public int peek() 
    { 
        if (isEmpty()) { 
            System.out.println("Stack is empty"); 
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
