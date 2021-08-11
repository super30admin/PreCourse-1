class StackAsLinkedList {
  
    StackNode root;
    StackNode tail;
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data=data;
            this.next=null;

        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
       return true;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode temp = new StackNode(data);
        if(root == null){
            root = temp;
            tail =temp;
        }else{
            tail.next=temp;
            tail = temp;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        StackNode current = root;
        while(current.next !=null){
            current =current.next;
        }
        return current.data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        StackNode current = root;
        return current.data;
    }
    public void printStack(){

        StackNode current = root;
        while(current !=null){
            System.out.println("Stack as Linked List: "+current.data);
            current=current.next;
        }

    }

	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList();
        sll.push(10); 
        sll.push(20); 
        sll.push(30);
        sll.printStack();
  
        System.out.println(sll.pop() + " popped from stack"); 
        sll.peek();
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
