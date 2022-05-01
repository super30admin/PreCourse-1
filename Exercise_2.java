class StackAsLinkedList { 

    // Time complexity is O(1)
    // Space complexity is O(n)
    // I'm confused with the space compelexity it should be O(1) or O(n) since we are not using any extra space for push pop etc
    // this will act as a pointer!
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
    StackAsLinkedList() {
        this.root = null;
    }

    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        // if my pointer comes on 
        return (root == null);
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	    //Also return the popped element 
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int returnData = root.data;
        root = root.next;
        return returnData;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) return -1;
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
