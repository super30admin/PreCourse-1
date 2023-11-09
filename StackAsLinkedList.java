// Time Complexity : O(n)
// Space Complexity : O(n)

class StackAsLinkedList { 
  
    StackNode root; 
    StackNode currentNode;
    StackNode previousNode;
  
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
        if (root == null) {
            root = new StackNode(data);
            currentNode = root;
        } else {
            currentNode.next = new StackNode(data);
            currentNode = currentNode.next;
        }
    } 
  
    public int pop() 
    { 	
        currentNode = root;
        previousNode = currentNode;
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            while (currentNode.next != null){
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            int poppedElement = currentNode.data;
            previousNode.next = null;
            currentNode = previousNode;
            return poppedElement;
        }
    } 
  
    public int peek() 
    {
        if (isEmpty()){
            return 0;
        } else {
            return currentNode.data;
        }  
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
