/**
 * Time complexity = O(n)
 * Space complexity = O(n)
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
        }
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        return  root == null;
    } 
  
    public void push(int data) 
    {
        StackNode newNode = new StackNode(data);
        // If the Linked List is empty,
        // then make the new node as head
        if(root == null) root = newNode;
        else {
            StackNode currentNode= root;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }

    }
  
    public int pop() 
    {
        if (root == null) return 0;
        else if(root.next == null){
            int data = root.data;
            root = null;
            return  data;
        }
        else {
            StackNode currentNode = root;
            StackNode previousNode = root;
            while (currentNode.next != null) {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            int data = currentNode.data;
            previousNode.next = null;
            return  data;
        }
    } 
  
    public int peek() {
        if (root == null) return 0;
        else {
            StackNode currentNode = root;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            return currentNode.data;
        }
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
