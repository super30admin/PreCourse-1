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
    
	
    public boolean isEmpty() { 
        return root == null;
    } 
  
    public void push(int data) { 
        StackNode tempNode = new StackNode(data);
        tempNode.next = root;
        root = tempNode;
    } 
  
    public int pop() { 	
        if(root == null) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            StackNode currentRoot = root;
            root = root.next;
            return currentRoot.data;
        }
    } 
  
    public int peek() { 
        if(isEmpty()){
            System.out.println("The stack doesn't have any values");
            return 0;
        } else {
            return root.data;
        }
    } 
  
	//Driver code
    public static void main(String[] args) { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
