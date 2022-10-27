class StackAsLinkedList {
    int size;
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next;

        public StackNode(int data) {
            this.data = data;
        }
    }

    //TC : O(1)
    //SC : O(1)
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        if(size==0)
            return true;
        return false;
    }
    //TC : O(1)
    //SC : O(1)
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode node = new StackNode(data);
        if(size == 0){
            root = node;
            size++;
            return;
        }
        node.next = root;
        root = node;
        size++;
    }
    //TC : O(1)
    //SC : O(1)
    public int pop() 
    {

	//If Stack Empty Return 0 and print "Stack Underflow"
        if(size==0){
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        int popElement = root.data;
        root = root.next;
	//Also return the popped element
        return popElement;
    }
    //TC : O(1)
    //SC : O(1)
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(size ==0)
            return 0;
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
