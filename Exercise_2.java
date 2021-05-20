public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data; 
            this.next = null;
        } 
    } 
    
    
    public boolean isEmpty() 
    { 
        if(root==null)
            return false;
        else
            return true;
    } 
  
    public void push(int data) 
    { 
        StackNode temp = new StackNode(data);
        temp.next = root;
        root = temp;
    } 
  
    public int pop() 
    {   
        if(root==null)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        int x = root.data;
        root = root.next;
        return x;
    } 
  
    public int peek() 
    { 
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