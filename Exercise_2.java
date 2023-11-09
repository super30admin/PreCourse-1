// Time Complexity : O(n)
// Space Complexity : O(n)
// Any problem you faced while coding this : Setting pointers properly.


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
        //If stack is empty.
        return root == null;

    } 
  
    public void push(int data) 
    { 
       //Using temp node
       StackNode newNode = new StackNode(data);
       if (root == null) {
            root = newNode;
       }
       else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
       }
      
       System.out.println(data + " Pushed");
       
    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	    //Also return the popped element 

        int poppedElement = 0;

        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            poppedElement = root.data;
            root = root.next;
        }
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
