
// push timeComplexity - O(n) // n is current size of the stack
// Pop timeComplexity - O(n)
// peek timeComplexity - O(n)
// isEmpty timeComplexity - O(1)
// Space complexity - O(n)

// Any problem you faced while coding this :
// In push() Method : Haven't return after checking "root == null" because this method return type is void
// so at the the time of adding 1st element was again pointing 1st element from the last line (currentNode.next = newNode;) of the Push() method.
// So It turns into infinite loop from the time of pushing 2nd element.
// because 1st element next again pointing to 1st element

class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            this.data = data;
            next = null;
        }
    }

    public boolean isEmpty()
    {
        if(root == null)
            return true;
        return false;
    }

    public void push(int data)
    {
        StackNode newNode = new StackNode(data);

        // If Stack is empty
        if(root == null){
            root = newNode;
            return;
        }

        StackNode currentNode = root;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public int pop()
    {
        // If Stack Empty Return 0 and print "Stack Underflow"
        if(root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }

        // If There is only one element in the stack
        if(root.next == null){
            int topElement = root.data;
            root = null;
            return topElement;
        }

        StackNode currentNode = root;
        while (currentNode.next.next != null){
            currentNode = currentNode.next;
        }

        int topElement = currentNode.next.data;
        currentNode.next = null;
        return topElement;
    }

    public int peek()
    {
        // If Stack is empty
        if(root == null)
            return -1;

        StackNode currentNode = root;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }

        return currentNode.data;
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
