public class StackAsLinkedList { 
  
    StackNode root;

    StackAsLinkedList() {
        root = null;
    }
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
            next = null;
        }
    } 
    
	
    public boolean isEmpty() 
    { 
        if(root == null) {
            return true;
        } else {
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode sn = new StackNode(data);
        if(root == null) {
            root = sn;
        } else {
            StackNode itr = root;

            while(itr.next != null) {
                itr = itr.next;
            }
            itr.next = sn;
        }
    } 
  
    public int pop() 
    { 	
        int val = 0;
        if(root == null) {
            System.out.println("Stack Underflow");
        } else if(root.next == null) {
            val = root.data;
            root = null;
        } else {
            StackNode itr = root;

            while(itr.next.next != null) {
                itr = itr.next;
            }
            val = itr.next.data;
            itr.next = null;
        }

        return val;

	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        int val = 0;
        if(root == null) {
            System.out.println("Stack Empty");
        } else {
            StackNode itr = root;

            while(itr.next != null) {
                itr = itr.next;
            }
            val = itr.data;
        }

        return val;
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
