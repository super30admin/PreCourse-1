/*
Time Complexity
Push Operation: O(1) - Inserting a node at the beginning of the linked list takes constant time.
Pop Operation: O(1) - Removing the top node takes constant time.
Peek Operation: O(1) - Accessing the top node takes constant time.
isEmpty Operation: O(1) - Checking if the stack is empty takes constant time.
Space Complexity
Push Operation: O(1) - Each push operation allocates a fixed amount of space for a new node.
Pop Operation: O(1) - The space complexity is constant as it only involves removing a node.
Peek Operation: O(1) - The space complexity is constant as it does not involve any space allocation.
isEmpty Operation: O(1) - The space complexity is constant as it only involves checking a condition.
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
    
	
    public boolean isEmpty() 
    { 
        // Stack is empty if root is null
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
