public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if(root == null){
            return true;
        } else {
            return false;
        }
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        StackNode new_node = new StackNode(data);
        if(root == null){
            root = new_node;
        } else {
        StackNode temp = root;
        root = new_node;
        new_node.next = temp;
        }

        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	StackNode temp;
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    //Also return the popped element 
    if(root == null){
        System.out.println("Stack Underflow");
        return 0;
    } else {
        temp = root;
        root = root.next;
        temp.next = null;
    }
    return temp.data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null){
            return 0;
        } else {
            return root.data;
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
