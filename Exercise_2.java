// Time Complexity : O(n)
// Space Complexity : O(1)
// Any problem you faced while coding this : 
//1. Difficulty remembering the concepts of pop and peek.
 
 class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode sn = new StackNode(data);
        if(root == null) root = sn;
        else {
            StackNode currentNode = root;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = sn;
        }
        
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if(isEmpty()) return 0;
    else {
        StackNode currentNode = root;
        while(currentNode.next.next != null){
            currentNode = currentNode.next;
        }
        StackNode output = currentNode.next;
        currentNode.next = null;
        return output.data;
    }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        StackNode currentNode = root;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
        return currentNode.data;
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
