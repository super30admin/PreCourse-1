// Time complexity
// isEmpty: O(1)
// push: O(1)
// pop: O(1)
// peek: O(1)

// Space complexity
// O(n)

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
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
        StackNode poppedNode = root;
        root = root.next;
        return poppedNode.data;
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
