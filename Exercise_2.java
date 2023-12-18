public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
           this.data = data;
            next = null;
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
        StackNode temp = new StackNode(data);
        if(temp == null)
            {
                System.out.println("Stack Overflow");
            } 
        temp.data = data;
        temp.next = root;
        root = temp;    
    } 
  
    public int pop() 
    { 	
	    if(isEmpty())
            {
                System.out.println("Stack Underflow");
                return 0;
            }
        int x = root.data;
        root = (root).next;
        return x;
    } 
  
    public int peek() 
    { 
         if(!isEmpty())
            return root.data;
        else
            {
                System.out.println("Stack is empty");
                return -1;
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
