/* Implement Stack using Singly linked list
 * 
 * Time Complexity : O(1) for push/pop/empty
 * Space Complexity : O(n) --> number of nodes
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No
 * 
 * Example: (root)--> tempNode --> SecondNode --> FirstNode --> NULL
 * Algorithm:
 * 1. Maintain a pointer "root" for the current top index in the singly linked list
 * 2. Push: Create new temp node --> Next Node would be NULL in the beginning and afterwords last created node --> Make Newly created node a root
 * 3. Pop: Check empty? not then store top(root) and root will be root.next and return top
 * 4. Empty: Check if root is Null ? Yes : No 
 * 5. Peek: root.data is top of the stack 
 * 
*/
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
        System.out.println("Stack is Empty!");
        return root == null;
    } 
  
    public void push(int data) 
    { 
       //Create new temp node and update references: (root)tempNode --> SecondNode --> FirstNode --> NULL
       StackNode tempNode = new StackNode(data);
       //Next Node would be NULL in the beginning and afterwords last created node
       tempNode.next = root;
       //Make Newly created node a root
       root = tempNode;
    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
        if(root == null)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        
        //Write code to pop the topmost element of stack.
        int topNode = root.data;
        root = root.next;

	    //Also return the popped element 
        return topNode;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null)
        {
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
