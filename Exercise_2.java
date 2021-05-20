// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : No

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
        return (root.next == null);
    } 
  
    public void push(int data) 
    { 
        // Create a new StackNode and make new node as head, pointing it to old one

        StackNode temp = root;
        root = new StackNode(data);
        root.next = temp;
    } 
  
    public int pop() 
    { 	
        // pop the root as it is last inserted node and point root to next one in the linked list
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int temp = root.data;
            root = root.next;
            return temp;
        }
	} 
  
    public int peek() 
    { 
        // As the last inserted is at the root(head), return it

        if(isEmpty()){
            return 0;
        }
        else{
            
            return root.data;
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
