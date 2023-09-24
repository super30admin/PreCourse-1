//Time Complexity: O(1)
//Space Complexity: O(1)
class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
            this.next = null;
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
        StackNode Node = new StackNode(data);
        if (root == null) {
            root = Node;
        } else {
            Node.next = root;
            root = Node;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(isEmpty()!=true){
        int t = root.data;
        root = root.next;
        return t;
    }
        else{
        System.out.println("Stack Underflow");
        return 0;
    }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()!=true){
        int t = root.data;
        return t;
    }
        else{
        System.out.println("Stack Underflow");
        return 0;
    }

    } 
     
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        //System.out.println(sll.pop() + " popped from stack"); 
  
        
        
    while (sll.isEmpty()==false) {
        System.out.print(sll.pop() + " ");
    }
    } 
} 
