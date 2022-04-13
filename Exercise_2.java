// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : NO

class StackAsLinkedList { 
  
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
        //Check whether root is null, if root is null return true
        if(root == null)
            return true;
        return false;
    } 
  
    public void push(int data) 
    {
        //Creating a new node
        StackNode node = new StackNode(data);
        //Attach new node to root
        node.next = root;
        //Make new node as root
        root = node; 
    } 
  
    public int pop() 
    { 
        //Before pop, checking stack underflow condition
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        //Retrieve the root node value
        int val = root.data;
        //Make next node as root
        root = root.next;
        //Return the retrieved value
        return val;	
    } 
  
    public int peek() 
    {
        //Check whether stack is empty or not.
        if(isEmpty())
            return 0;
        //Return the root node value
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
