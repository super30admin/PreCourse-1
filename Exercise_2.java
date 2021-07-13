public class StackAsLinkedList { 
  
    StackNode root; 
    // StackNode top;
    
    static class StackNode { 
        int data; 
        StackNode next; 
        
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
            // StackNode link = null;
        } 
        
    } 
    
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        if(root==null) {
            System.out.println("StackAsLinkedList is empty.");
        }
        return true;
        
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode newRootNode = new StackNode(data);
        //If there are elements in stackLinkedList, 
        //link the newNode to root node & reset root node 
        if(root!=null){
            newRootNode.next = root;
            root = newRootNode;
            System.out.println("Push("+data+"): Pushed successfully!");
        } else {
            //Else point top to newNode
            root = newRootNode;
            System.out.println("Push("+data+"): StackAsLinkedList was empty, created new node as root");
        }
    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
	    if(root==null){
	        System.out.println("Stack Underflow (No elements in StackAsLinkedList)."); 
	        return 0;
	    } else{
            //Write code to pop the topmost element of stack.
            StackNode curr = root;
            root = curr.next;
            System.out.println("Pop() : "+curr.data);
	        //Also return the popped element 
	        return curr.data;
	    }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root!=null){
            System.out.println("Peek(): "+root.data);
            return root.data;    
        } 
        else{
            System.out.println("Peek(): No elements in StackAsLinkedList!");
            return 0;
        }

    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
        sll.peek(); 
        sll.push(10); 
        sll.peek();
        sll.push(20);
        sll.peek();
        sll.push(30); 
  
        // System.out.println(sll.pop() + " popped from stack"); 
        sll.pop();
        sll.peek();
        sll.pop();
        sll.peek();
        sll.pop();
        sll.peek();
        
        //Edge cases
        System.out.println("\n------ Checking edge cases ------");
        System.out.println(sll.pop() + " popped from StackAsLinkedList"); 
        sll.isEmpty();
        System.out.println(sll.peek());
    } 
} 
