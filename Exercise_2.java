//T(C) : O(1)
//S(C) : O(n)


public class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        //in empty linked list-- root is null
        if (root == null) {
            return true;
        }
        else {
            return false;
        }
    }
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        //create a node object
        StackNode node = new StackNode(data);
//if root is null make root point to node object we created
        if (root == null) {
            root = node;
        }
        //else if root != null then store root in another node
        // call this node transition that takes root object reference
        //we are inserting the node at head
        // and pointing root to this node
        //connect transition node to
        // end of the newly created root node

        else {
            StackNode transition = root;
            root = node;
            node.next = transition;
        }
        System.out.println(data + " pushed to stack");
    }

    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
	//Also return the popped element
        int pop_elem = -1;
        if (root == null) {
            System.out.println("empty stack");
        }
        else {
            pop_elem = root.data;
            root = root.next;
        }
        return pop_elem;
    } 
  
    public int peek() 
    {
        int top_elem_data = -1;
        //Write code to just return the topmost element without removing it.
        if (root == null) {
            System.out.println("empty stack");
            return -1;
        }
        else {
            top_elem_data = root.data;
            return top_elem_data;
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
