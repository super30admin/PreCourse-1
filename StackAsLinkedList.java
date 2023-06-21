/*
 * Time Complexity: push, pop and peek are O(1)
 * Space Complexity is O(N) as the size grows proprtional to the nu
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
        if(root == null){
            System.out.println("Stack underflow");
            return 0;
        }
        
        int value = root.data;
        root = root.next;
        return value;
    } 
  
    public int peek() 
    { 
        if(this.root != null)
            return this.root.data;

        System.out.println("stack is empty");
        return -1;
        
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
        sll.pop();
        sll.pop();
        sll.pop();
  
        // System.out.println("Top element is " + sll.peek()); 
    } 
} 
