class StackAsLinkedList {
  
    StackNode root,recentNode;
  
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
        if(root!= null)
            return false;
        return true;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode newnode = new StackNode(data);
        newnode.next = null;
        if(root == null){
            root = newnode;
            recentNode = newnode;
        }
        else{
            recentNode.next = newnode;
            recentNode = newnode;
        }

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(root == null){
            System.out.println("Stack Empty");
            return 0;
        }
        if(root.next == null){
            int data = root.data;
            root = null;
            return data;
        }
        StackNode currentNode = root;

        StackNode prev=null;
        while(currentNode.next !=  null){
                prev = currentNode;
                currentNode = currentNode.next;
        }
        prev.next = null;
        return currentNode.data;

    } 
  
    public int peek() 
    {
        if(root == null){
            System.out.println("Stack Underflow");
            return 0;
        }
        StackNode currentNode = root;
        while(currentNode.next!=null){
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    public static void main(String[] args){

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.isEmpty() + " ? isEmpty");
        System.out.println(sll.peek() + " peeked from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.peek() + " peeked from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.peek() + " peeked from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.peek() + " peeked from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.isEmpty() + " ? isEmpty");

        //System.out.println("Top element is " + sll.peek());
    }

}

