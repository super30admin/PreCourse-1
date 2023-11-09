//Time and space complexities
//Time Complexity : isEmpty(): O(1) , Push() : O(1) , Pop() : O(1), Peek() : O(1)
//Space Complexity : O(N) (as we are creating a new stack )

class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.next = null;
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    {
        if(root == null )
            return true;
        else
            return false;
    } 
  
    public void push(int data) 
    { 
        StackNode node = new StackNode(data);
        if(root == null) {
            root = node;
        }
        else {
            node.next = root;
            root = node;
        }

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty())
        {
            System.out.println("Stack Undeflow");
            return 0;
        }

	//Also return the popped element
        else{
            int temp = root.data;
            root = root.next;
            return temp;
        }
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
