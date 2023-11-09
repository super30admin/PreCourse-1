//Complexity:
//Time Complexity : O(n)
//Space Complexity : O(n)

class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            //Initializing with gicen data.
            this.data = data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        //If root is pointing to null, the list is empty.
        if(root == null) {
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        //If list is empty, new node is assigned to root element.
        //Else traversing through list and adding new node after lst element.
        StackNode node = new StackNode(data);
        if(isEmpty()) {
            root = node;
        } else {
            StackNode ne = root;
            while(root.next != null) {
                root = root.next;
            }
            root.next = node;
            root = ne;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //If empty, printing stack underflow.
        //else assigning a root to two nodes, one one will traverse to last one and second node will traverse until second last. Last node value will be returned and is assigned to null.
        int returnVal = 0;
        if(isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            StackNode node1 = root;
            StackNode node2 = root;
            while(node1.next != null) {
                if(node1 == root){
                    node1 = node1.next;
                } else {
                    node1 = node1.next;
                    node2 = node2.next;
                }

            }
            returnVal = node1.data;
            node1 = null;
            node2.next = null;
        }
        return returnVal;

	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        //Traverse through list until last node by checking next node variable in node and return the value of last.
        StackNode newNode = root;
        while(newNode.next != null) {
            newNode = newNode.next;
        }
        return newNode.data;
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
