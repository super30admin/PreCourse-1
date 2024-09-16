public class StackAsLinkedList {
    StackNode root;
    StackNode head;

    public boolean isEmpty() 
    { 
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode sn = new StackNode(data);
        if(root == null) {
            root = sn;
            head = sn;
        } else {
            root.next = sn;
            root = sn;
        }
    } 
  
    public int pop() 
    {
        int result = 0;
	    //If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return result;
        }


        //Write code to pop the topmost element of stack.
        result = root.data;

        if(root == head) {
            root = null;
            head = null;
        } else {
            StackNode node = head;
            while(node != null && node.next != root) {
                node = node.next;
            }
            if(node != null) {
                node.next = null;
                root = node;
            }
        }
        return result;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        //If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty()) {
            System.out.println("Stack Underflow");
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


class StackNode {
    int data;
    StackNode next;

    StackNode(int data)
    {
        this.data = data;
        this.next = null;
    }
}