// implement stack using linkedlist
/**
// Time Complexity :
push - O(1)
peek - O(1) 
pop - O(n) where n is the number of stack nodes need to be visited inorder to reach the 2nd last node.


// Space Complexity :
Total space complexity = Auxilary space + space used towards input.
O(n) - where n is the number of nodes in stack.

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
**/
public class StackAsLinkedList { 
  
    StackNode root; 
    StackNode top;
  
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
        StackNode nodeToInsert = new StackNode(data);
        
        if (top == null)
        {
            top = nodeToInsert;
            root = top;
            return;
        }
        
        top.next = nodeToInsert;
        top = top.next;
    } 
    
    public int pop() 
    { 	
        if (isEmpty())
        {
            System.out.println("Stack underflow");
            return 0;
        }
	
        
        StackNode poppedNode = null;
        
        if (root == top)
        {
            poppedNode = top;
            top = null;
            root = null;
            return poppedNode.data;
        }
        
        StackNode current = root;
        
        while (current != null)
        {
            if (current.next == top)
            {
                poppedNode = top;
                current.next = null;
                top = current;
                break;
            }
            
            current = current.next;
        }
        
        return poppedNode.data;
    } 
  
    public int peek() 
    { 
        if (isEmpty())
        {
            System.out.println("Stack underflow");
            return 0;
        }
        
        return top.data;
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
        
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
        
         System.out.println(sll.pop() + " popped from stack"); 
    } 
} 























