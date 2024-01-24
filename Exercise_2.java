// time complexity O(1) since it involves pointer updation and accessing. space complexity is O(n) size of stack 'n'.
//the approach - stack as linkedlist - StackNode class represents a node in the linkedlist that has a data and reference to next node. root represents the top elements. 
//push operation adds new node at the top of stack by updating pointer.
// pop operation removes the root node by just moving pointer to next.
//peek operation returns root data without removing.
public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return root == null;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
        //Write code to push data to the stack. 
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
    int topmost = root.data;
    root = root.next;
    return topmost;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        int topmost = root.data;
        return topmost;

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
