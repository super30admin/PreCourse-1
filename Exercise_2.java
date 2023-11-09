public class Exercise_2 { 

// Time Complexity : O(n)
// Space Complexity : O(n) n -> number of elements in LinkedList
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class StackAsLinkedList { 
  
    StackNode root; 
  
     static class StackNode { 
        int data; 
        StackNode next; 
    } 

    StackAsLinkedList() { this.root = null; }
    
	
    public boolean isEmpty() 
    { 
        return root == null; 
    } 
  
    public void push(int data) 
    { 
        StackNode temp = new StackNode();
 
        if (temp == null) {
            System.out.print("\n  Stack Overflow");
            return;
        }
 
        temp.data = data;
 
        temp.next = root;
 
        root = temp;
    } 
  
    public int pop() 
    { 	
	
    if (root == null) {
        System.out.print("\nStack Underflow");
        return 0;
    }

     root = (root).next;
     return root.data;
    } 
  
    public int peek() 
    {   
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
}
