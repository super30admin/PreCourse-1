public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next;
        StackNode(int data) 
        { 
            
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if (root == null){
             return true;
        }
        return false;
    } 
  
    public void push(int data) 
    {
        StackNode m = new StackNode(data);
        if (m == null) {
            System.out.print("Overflow");
            return;
        }
        m.data = data;
        m.next = root;
        root = m;
    } 
  
    public int pop() 
    {
        if (root == null) {
            System.out.print("Stack Underflow");
            return 0;
        }
        StackNode m = root;
        int y = m.data;
        root = (root).next;
        return y;
    }
  
    public int peek() 
    {
        if (root == null) {
            System.out.printf("Stack Underflow");
            return 0;
        }
        else {
            StackNode m = root;
            int y = m.data;
            return y;
        }
    } 
  
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
