public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data)    //constructor for Node
        { 
            this.data = data;
            next=null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if(root==null) {
            return true;
        }
        else {
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        StackNode node = new StackNode(data);
        node.next=root;
        root=node;
    } 
  
    public int pop() 
    { 	
	    if(root==null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int top= root.data;
            root=root.next;
            return top;
        }
    } 
  
    public int peek() 
    { 
        if(!isEmpty()){
            return root.data;
        }else{
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
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
