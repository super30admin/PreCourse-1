// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
public class StackAsLinkedList { 

    // root or the head node;
    StackNode root; 

    // Definition of a Node.
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data = data; 
        } 
    } 
    

    // If root is null then the Linked list is empty.
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return root == null;
    } 

    // If the root is empty making the new node as root
    // else swaping the root node to the new nodes next and making new node as root
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        if(root == null){
            root = newNode;
        }
        else{
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        } 
    } 

    // Firstly checking the case if the stack is empty.
    // Otherwise removing the root node and returning its data.
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int popped = root.data;
            root = root.next;
            return popped;
        } 
    } 

    // Returnig the root nodes data
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
