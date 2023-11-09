// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : I didn't find this in leetcode
// Any problem you faced while coding this : No

class StackAsLinkedList { 
  
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
        StackNode temp = new  StackNode(data);

        temp.next = root;
        root = temp;

    } 
  
    public int pop() 
    { 	

        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int poppedElement = root.data;
        root = root.next;
        return poppedElement;
	
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
