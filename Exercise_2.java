public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data; 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if(root == null)
            return true;
        else
            return false;     
    } 
  
    public void push(int data) 
    { 
        StackNode oldRoot = root;
        root = new StackNode(data);
        root.data = data;
        root.next = oldRoot; 
    } 
  
    public int pop() 
    { 	
        if(isEmpty()){
            System.out.println("Stack Underflow!");
            return 0;
        }
        int data  = root.data;
        root = root.next;
        return data;
    } 
  
    public int peek() 
    { 
        if(!isEmpty()){
            return root.data;
        }
        else 
            return -1;

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
