
/*
 * Time Complexity: O(1) (isEmpty, peek, push)
 * Time Complexity: O(n) (pop)
 *
 * Space Complexity: O(1)
 * */
class StackAsLinkedList {
  
    StackNode root; //represents head of the singlyLinked list

    /*
    Represents the last node of the singly linked list
    this is used to push new elements to the stack
    by adding a top node element to the stack, we can do the push(), peek() and operations in O(1) time
    */ 
    StackNode top; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
       return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode stackNode = new StackNode(data);
        if(root == null){
            root = stackNode;
            top = root;
        }else{
            //
            top.next = stackNode;
            top = stackNode;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 

        if(root == null){
            System.out.println("Stack Underflow");
            return 0;
        }


        StackNode node = root;
        StackNode prevNode = null;

        while(node.next != null){
            prevNode = node;
            node = node.next;
        }

        if(prevNode != null){
            prevNode.next = null;
        }
        top = prevNode;
        return node.data;

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.

        if(root == null){
            System.out.println("Stack Underflow");
            return -1;
        }

        return top.data;
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
