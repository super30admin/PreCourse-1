/*Time complexity
Push - O(n), where n is the no of nodes as we have to traverse from root to end node to add a new node
Pop - O(n),  where n is the no of nodes as we have to traverse from root to end node to delete the last node
isEmpty() - O(1), As we only have to check if root is null
peek() - O(n), where n is the no of nodes as we have to traverse from root to end node to reach last node ie top of stack
*/

/*Space complexity
O(n) as the size of the linkedlist depends on the number of pushes made into stack.
*/

// Did this code successfully run on Leetcode : Could not find exact question on leetcode but worked successfully with varying edge cases on local compiler.

// Any problem you faced while coding this : Took some time to think about traversing and connecting nodes together in the linked list as the concept was a bit rusty.

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data=data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if(root==null)
        {
            return true;
        }
        else
            return false;
    } 
  
    public void push(int data) 
    { 
        StackNode stacknode= new StackNode(data);
        if(root==null){
            root=stacknode;
        }
        else if(root.next==null)
        {
            root.next=stacknode;
        }
        else{
            StackNode node = root.next;
            while (node.next!=null)
            {
                node=node.next;
            }
            node.next=stacknode;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if(root==null){
        System.out.println("Stack Underflow");
        return 0;
    }
    else if(root.next==null)
        {
            int popVal=root.data;
            root=null;
            return popVal;
        }
    else{
        StackNode node = root;
        while (node.next.next!=null)
        {
            node=node.next;
        }
        int popVal=node.next.data;
        node.next=null;
        return popVal;
    }    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root==null){
            System.out.println("Stack Empty");
            return 0;
        }
        else if(root.next==null)
            {
                return root.data;
            }
        else{
            StackNode node = root.next;
            while (node.next!=null)
            {
                node=node.next;
            }
            return node.data;
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