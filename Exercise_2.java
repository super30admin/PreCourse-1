public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
        //Constructor here
            this.data =data;
            this.next = null;
        } 
    } 
    
 //	Time Complexity: O(1)
 //	Space Complexity: O(1)
 //	since we are just checking a condition and returning a boolean value
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if (root == null){
            return true;
        }
        return false;
    } 
  
 //	Time Complexity: O(1)
 //	Space Complexity: O(1)
 //	since we are creating a new node and assigning it to the root, which is a constant time operation
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode node = new StackNode(data);
      node.next  = root;
      root = node;
    } 
  
 //	Time Complexity: O(1)
 //	Space Complexity: O(1)
 //	since we are checking if the root is null and then popping the element from the top, which is a constant time operation
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if (root == null){
        System.out.println("Stack Underflow");
        return 0;
    }
    StackNode node = root;
    int val  = node.data;
    root = root.next;
    return val;
    } 
  
 //	Time Complexity: O(1)
 //	Space Complexity: O(1)
 //	since we are just returning the data of the root, which is a constant time operation
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (root == null){
            System.out.println("Stack Underflow");
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
