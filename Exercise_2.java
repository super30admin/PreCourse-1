public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data=data; 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if(root==null) return true;
          return false; 
    } 
  
    public void push(int data) 
    { 
        Node newNode= new Node(x);
    if(root==null) {
        root=newNode;
    }
    newNode.next=root;
    root=newNode; 
    } 
  
    public int pop() 
    { 	
	if(root==null) {
        System.out.println("Stack is empty");
        return 0;
    }else {
        int popped=root.data;
        root= root.next;
        return popped;
    }
    } 
  
    public int peek() 
    { 
        if(root==null) {
        System.out.println("Stack empty");
        return 0;
    }
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
