// Time Complexity: O(1)
// Space Complexity: O(n)
// Approach: Store it in a reversed linked list, and keep adding elements to the front of the linkedlist

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
        return root == null;
    } 
  
    public void push(int data) 
    { 
        StackNode node = new StackNode(data);
        node.next = root;
        root = node;
    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	    //Also return the popped element 
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int poppedNode = root.data;
            root = root.next;
            return poppedNode;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) return 0;
        else return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
