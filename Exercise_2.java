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
        return root == null;
    }  
  
    public void push(int data) 
    { 
        StackNode newNode = new StackNode(data);
        if(isEmpty()) {
            root = newNode;
        }
        else {
            StackNode curNode = root;
            while(curNode.next != null) {
                curNode = curNode.next;
            }
            curNode.next = newNode;
        }
         
    } 
  
    public int pop() 
    {   
        //If Stack Empty Return 0 and print "Stack Underflow"
        if(root == null) {
            System.out.println("Stack Underflow.");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        //Also return the popped element 
        else {
            StackNode curNode = root;
            StackNode prevNode = root;
            while(curNode.next != null) {
                prevNode = curNode;
                curNode = curNode.next;
            }
            prevNode.next = null;
            return curNode.data;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        //If Stack Empty Return 0 and print "Stack Underflow"
        if(root == null) {
            System.out.println("Stack Underflow.");
            return 0;
        }
        else {
            StackNode curNode = root;
            while(curNode.next != null) {
                curNode = curNode.next;
            }
            return curNode.data;
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