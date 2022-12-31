// Time Complexity : All operations are O(1)
// Space Complexity : O(1)

// Implemented as a linkedlist. Push and pop operations are done at the beginning of the list.

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
    
    StackAsLinkedList()
    {
        this.root = null;
    }
    
    public boolean isEmpty() 
    { 
        return root == null;
    } 
  
    public void push(int data) 
    { 
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
    } 
  
    public int pop() 
    { 	
        if(root==null) //Stack Underflow
        {
            System.out.println("Stack Underflow"); 
            return -1;
        }
        int temp = root.data;
        root = root.next;
        return temp; 
    } 
  
    public int peek() 
    { 
        if(root==null)
            return -1;
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
