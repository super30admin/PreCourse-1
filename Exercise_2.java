class StackAsLinkedList { 
  
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
        return root == null;
    } 
  
    public void push(int data) 
    { 
        if (root == null) {
            root = new StackNode(data);
            return;
        }

        StackNode curr = root;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = new StackNode(data);
    } 
  
    public int pop() 
    { 	
        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }

        StackNode curr = root;
        StackNode prev = null;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }

        int value = curr.data;
        
        if (prev != null) {
            prev.next = null;
        }

        return value;
    } 
  
    public int peek() 
    { 
        if (root == null) {
            return 0;
        }

        StackNode curr = root;
        while (curr.next != null) {
            curr = curr.next;
        }

        return curr.data;
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
