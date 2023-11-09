public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
            this.next = null;
        } 
    } 

    StackAsLinkedList() {
      this.root = null
    }
    
    /*
    Time Complexity: O(1)
    Space Complexity: O(1)
    */
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return root == null;
    } 
  
    /*
    Time Complexity: O(1)
    Space Complexity: O(1)
    */
    public void push(int data) { 
      StackNode node = new StackNode(data);
      if(root == null){
        root = node;
      } else {
        node.next = root;
        root = node;
      }
    } 
  
    /*
    Time Complexity: O(1)
    Space Complexity: O(1)
    */
    public int pop() { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
      //Write code to pop the topmost element of stack.
	    //Also return the popped element 
      if(root == null){
        System.out.println("Stack Underflow");
        return 0;
      }

      int data = root.data;
      root = root.next;
      return data;
    } 
  
    /*
    Time Complexity: O(1)
    Space Complexity: O(1)
    */
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
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
