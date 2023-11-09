class StackAsLinkedList { 
  
    /*
     * Time Complexity:: isEmpty() = O(1), push() = O(1), pop() = O(1), peek() = O(1)
     * Space Complexity:: O(N) where N is the length of StackAsLinkedList 
     * 
     * Approach:: push() will add to the beginning of the linked list, 
     * pop() will pop the beginning of the linked list,  
     * peek() will return the beginning of the linked list
     */
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
        if (root == null) 
            return true;
        else 
            return false;
    } 
  
    public void push(int data) 
    { 
        if (root == null) {
            root = new StackNode(data);
        } else {
            StackNode node = new StackNode(data);
            node.next = root;
            root = node;
        }
    } 
  
    public int pop() 
    { 	
        if (root == null) {
            System.out.println("Stack underflow");
            return 0;
        }
        int val = root.data;
        root = root.next;
        return val;
    } 
  
    public int peek() 
    { 
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
