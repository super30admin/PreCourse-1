//Time complexity:  O(1)
//Space complexity: O(N)
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
    
	//If the value at the root is null, means the stack is empty.
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        if(root == null) {
            return true;
        } 
        else {
            return false;
        }
    } 
  
    //Create a new node. If the value at the root is null, push the node into the stack 
    //If the root is not null meaning stack already has elements in it, create a tmp pointer, assign the root to the tmp
    //now the newly inserted node will act as root 
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode node = new StackNode(data);
        if(root == null) {
            root = node;
        } 
        else {
            StackNode tmp = root;
            root = node;
            node.next = tmp;
        }
        System.out.println("Element " + data + " pushed in to the stack");
    } 
  
    //If the value at the root is null, means the stack is empty.
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    //Write code to pop the topmost element of stack.
	//Also return the popped element 
        int element = 0;
        if(root == null) {
            System.out.println("Stack Underflow");
        }
        else {
            element = root.data;
            root = root.next;
        }
        return element;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        int element = 0;
        if(root == null) {
            System.out.println("Stack Underflow");
        }
        else {
            element = root.data;
        }
        return element;
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
