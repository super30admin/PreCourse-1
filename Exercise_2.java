//Time Complexity:O(1) for pushing but for popping it is O(N) because I'm traversing
// the linked list from root to remove the top of the stack
//Space Complexity:O(N) No of elements inserted into the stack

class StackAsLinkedList {

    StackNode root;
    StackNode top;


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
    StackAsLinkedList(){
        root = null;
        top = null;
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        if(root == null) return true;
        return false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        if(root != null)System.out.println("Root-"+root.data);
        if(top != null)System.out.println("top-"+top.data);
        StackNode newNode = new StackNode(data);
        if(root == null){
            root = newNode;
            top = newNode;
            return;
        }
        //Stack checking is not done
        top.next = newNode;
        top = top.next;


    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(root == null){
            System.out.println("Stack is Empty.");
            System.out.println("Stack Underflow.");
            return 0;
        }

        StackNode prevNode = root;

        if(prevNode == top){ //If only one element in stack
            top = null;
            root = null;
            return prevNode.data;
        }

        while(prevNode != null){
            if(prevNode.next == top){
                int x = top.data;
                top = prevNode;
                prevNode.next = null;
                return x;
            }
            prevNode = prevNode.next;
        }
        return -1;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(top == null){
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
        System.out.println("what");
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
