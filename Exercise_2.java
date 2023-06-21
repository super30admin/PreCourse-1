/*
 * Time Complexity : O(1) for push, pop, isEmpty and peek
 * Space Complexity: O(N) for number of nodes in the linkedlist
 */
class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
            next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return (root == null);
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
         StackNode newNode = new StackNode(data);
         newNode.next = root;
         root = newNode;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }

        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        int poppedElement = root.data;
        root = root.next;
        return poppedElement;

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.

        if(root == null){
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
