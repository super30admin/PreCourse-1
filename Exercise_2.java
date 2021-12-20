// Time Complexity : Push: O(1), Pop : O(1), Peek: O(1)
// Space Complexity : O(n)
// Problems faced: I was not familiar with the linked list
//implementation of a stack and hence had to learn about it online first

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
        StackNode temp = new StackNode(data);
        temp.data = data;
        temp.next = root;
        root = temp;  
    } 
  
    public int pop() 
    { 	
    if(root == null) {
        System.out.println("Stack Underflow");
        return 0;
    }
    else {
        int temp = root.data;
        root = root.next;
        return temp;
    } 
    } 
  
    public int peek() 
    { 
        if(!isEmpty()) {
    		return root.data;
    	}else {
    		return 0;
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
