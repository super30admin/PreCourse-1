// Time Complexity : O(1)
// Space Complexity : O(n) // n represents number of elements stored in the stack
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
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        /*
            Here for pushing data in to the stack using linked list, we will have pointer root
            which is basically our head, so we will be checking for two scenarios:
            1. If the stack is empty then insert the first element, so using linked list if we
                want to insert 6
               eg: So if stack is empty, root will be pointing to null.
                    null
                      ↑
                    root

                    Now, if want to insert 6, we will add the new node and root will point to the node
                    6 -> null
                    ↑
                   root

             2. If the stack is not empty and there are elements, we will break it down in to two steps

               First, when we create a new node and put element 9, we need to make its next pointer pointing
               to the root so it is connected to the stack.
                eg: insert 9 in above example

                 node.next
                 ` ↓
                 9 -> 6 -> null
                      ↑
                     root

                Second is to update the root to the new node so it wil the at the top of the stack

                 9 -> 6 -> null
                 ↑
                 root
         */
        StackNode node = new StackNode(data);
        if (root == null)
        {
            root = node;
        }
        else {
            node.next = root;
            root = node;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    // Write code to pop the topmost element of stack.
	//Also return the popped element
        /*
            To pop the element from a stack we need to check two scenarios:
            1. If the stack is empty, meaning root is pointing to null, so return 0.
                    null
                      ↑
                    root

            2. If the stack has elements,
                9 -> 6 -> 1 -> null
                ↑
                root

                we will need to get the data of the node to which root is pointing, and then we
                need to change the root to point to the next node

                9    6 -> 1 -> null
                     ↑
                    root

                one we point to the root to the next node, the connection from the previous node breaks
         */
        if (root == null)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int popElement = root.data;
            root = root.next;
            return popElement;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        /*
            Here root.data will give the top most element in the stack and as we are not moving
            the pointer of root, it will not remove the element
         */
        if (root == null)
        {
            System.out.println("No Element in the Stack");
            return 0;
        }
        else {
            return root.data;
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
