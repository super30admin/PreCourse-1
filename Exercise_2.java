public class StackAsLinkedList {
  
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
        return null == root;
    } 
  
    public void push(int data) 
    {
        //Write code to push data to the stack.
        StackNode new_node = new StackNode(data);
        if(null == root){
            root = new_node;
            return;
        }
        StackNode temp = root;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        StackNode temp = root;
        while(temp.next != null && temp.next.next != null) {
            temp = temp.next;
        }
        StackNode pop_node = temp.next;
        temp.next = null;
        return pop_node.data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        StackNode temp = root;
        while(temp.next != null) {
            temp = temp.next;
        }
        StackNode pop_node = temp;
        return pop_node.data;
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
