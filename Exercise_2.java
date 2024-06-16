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
        return this.root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        if(this.root == null) {
            this.root = new StackNode(data);
        } else {
            StackNode temp = this.root;
            while(temp.next != null) {
                temp = temp.next;
            }
            StackNode newItemNode = new StackNode(data);
            temp.next = newItemNode;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(this.root == null) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            StackNode temp = this.root;
            while(temp.next != null && temp.next.next != null) {
                temp = temp.next;
            }
            StackNode lastItemNode = temp.next;
            temp.next = null;
            return lastItemNode.data;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(this.root == null) {
            return 0;
        } else {
            StackNode temp = this.root;
            while(temp.next != null) {
                temp = temp.next;
            }
            return temp.data;
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
