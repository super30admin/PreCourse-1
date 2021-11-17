// Time Complexity : for push operation : constant time, for pop operation: constant time, peek : constant time, for isEmpty : constant time
//spac complexity: O(n) ,n being the number of elements stored in the stack. As we are storing each element in a node and node has data to store element and a pointer to next Node
//considering each node takes constant space storage, for storing n elements we need O(n) order space. 

public class StackAsLinkedList {

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
        if(root == null) //if root is null then stack is emplty
            return true;
        else
            return false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode temp = new StackNode(data); //create a temp node to store the data
        temp.next = root; // point the current not next to root
        root = temp; // make the temp node root as we root always points to top of the stack
    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(root == null){ // check of stack is empty
            System.out.print("Stack Underflow");
            return 0;
        }
        else {
            int temp = root.data; // store the value of the root node into a temp variable
            root = root.next; // point root to the element next to it.
            return temp;

        }
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        return root.data; //return the data in root node as root points to top of stock
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
