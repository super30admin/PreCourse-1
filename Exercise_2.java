 class StackAsLinkedList { 
  
    StackNode root; 
    StackNode lastNode;
    // StackNode secondLastNode;
  
    // Static class which creates a node with data to be stored along with the address of next element
    static class StackNode { 
        int data; 
        StackNode next; 
  
        // Constructor of StackNode class
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
            this.next = null;
        } 
    } 
    
    // Method which checks whether the Linked List is empty or not
    // returns true if its empty else false
	// Time Complexity: O(1)
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if (root == null)
        {
            return true;
        }
        return false;
    } 
  
    // Time Complexity: O(1)
    // Method to insert element in the end of the Linked List
    //lastNode points to last element of the linked list thus we can reach the last element in O(1) time
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        if (root == null)
        {
            root = new StackNode(data);
            root.next = null;
            lastNode = root;
        }
        else {
            StackNode newNode = new StackNode(data);
            lastNode.next = newNode;
            //secondLastNode = lastNode;
            lastNode = newNode;  
        }
    } 
  
    // Time Complexity: O(n) where n is number of elements in the Linked List
    // Method to remove/pop last element of the Linked List
    // In this we cannot use lastNode variable as we dont have the address of the
    // second last node thus we need to traverse the entire linked list
    public int pop() 
    { 	
        if (root == null)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else if (root.next==null)
        {
            int dataNew = root.data;
            root = null;  
            return dataNew;
        }
        else {
          StackNode temp = root;

          while (temp.next.next!=null)
          {
            temp = temp.next;
          }
          int dataNew = temp.next.data;
          temp.next = null;
          lastNode = temp;
          return dataNew;
        }
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
    } 
  
    // Time Complexity: O(1)
    // Method to give last element of the Linked List
    // lastNode variable as it points to lasNode thus we can get the value in O(1) time.
    public int peek() 
    { 
        if (root==null)
        {
            return 0;
        }
        //Write code to just return the topmost element without removing it.
        return lastNode.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
        System.out.println(sll.pop() + " popped from stack"); 

        
    } 
} 
