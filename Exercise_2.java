// Time Complexity :    O(1) //push, pop, peek
// Space Complexity :   O(1)
//  Yes, It's run successfully
// No I don't face any problem.



class StackAsLinkedList {

    StackNode root;
    StackNode temp;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            //Constructor here
            this.data = data;
            this.next = null;
        }
    }

    StackAsLinkedList() {
        root = null;
    }

    public boolean isEmpty() {
        //Write your code here for the condition if stack is empty.
        if (root == null) {
            return true;
        }
        return false;
    }

    public void push(int data) {
        //Write code to push data to the stack.
        if (isEmpty()) { // if stack is empty then we have to assign new element to root
            root = new StackNode(data);
        }
        else {
            temp = new StackNode(data); // create a new node and assign value
            temp.next = root; // assign new node's next value to root value
            root = temp; // update the root value to the new node
        }
    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element

        if (isEmpty()) { // check if stack is empty
            System.out.println("Stack Underflow");
            return 0;
        }
        int poppedElement = root.data; // pop the element
        root = root.next; //remove the popped element from the list

        return poppedElement;
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) { //check if stack is empty
            System.out.println("Stack is Empty");
            return 0;
        }
        return root.data;
    }
}


public class Exercise_2{

	//Driver code
    public static void main(String[] args)
    {
        StackAsLinkedList sll = new StackAsLinkedList();
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());

        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
    }
}
