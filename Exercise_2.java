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
        if(root==null){
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        if(root==null){
            root = newNode;
        }
        else{
            StackNode temp = root;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
       if(this.isEmpty()){
           System.out.println("Stack Underflow");
           return 0;
       }
       StackNode temp = root;
       StackNode prev = null;
       while(temp.next!=null){
           prev = temp;
           temp = temp.next;
       }
       if(prev==null){
           this.root = null;
       }
       else{
           prev.next = null;
       }
       return temp.data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            return 0;
        }
        else{
            StackNode temp = root;
            while(temp.next!=null){
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
        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek()); 
    } 
} 
