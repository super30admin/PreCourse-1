public class StackAsLinkedList { 
      
    StackNode root =  null; 
  
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
        if(null == root) {
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        StackNode currentNode = new StackNode(data);
        currentNode.next = root;
        root = currentNode;
        
    } 
  
    public int pop() 
    {   
    //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    //Also return the popped element 
        if(null == root) {
            System.out.println("Stack Underflow !!!!");
            return 0;
        }
        int top = root.data;
        root = root.next;
        return top;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(null == root) {
            System.out.println("Stack is empty !!!!");
            return 0;
        }
        return root.data;
    } 
    
    public void showStack() {
        StackNode temp = root;
        System.out.print("\ntop:-> ");
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("end");
        System.out.println("\n");
    }
  
    //Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        sll.showStack();
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println("Top element is " + sll.peek()); 
        
        sll.showStack();
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println("Top element is " + sll.peek());
        
        sll.showStack();
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println("Top element is " + sll.peek());
        
        sll.showStack();
    } 
} 