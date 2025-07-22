/* Time Complexity:
 push(): O(1)
 pop(): O(1)
 peek(): O(1)
 isEmpty(): O(1)

// Space Complexity: O(n) where n is the number of elements in the stack */

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
    	StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
    } 
  
    public int pop() 
    { 	
    	 if (isEmpty()) {
             System.out.println("Stack Underflow");
             return 0;
         }
         int popped = root.data;
         root = root.next;
         return popped;
    } 
  
    public int peek() 
    { 
    	 if (isEmpty()) {
             System.out.println("Stack is empty");
             return 0;
         }
         return root.data;
    } 
  
	//Driver code
 class Exercise_2 { 
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(40); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
    }
} 
