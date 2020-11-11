//StackAsLinkedList
public class Exercise_2 {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            // Constructor here
            this.data = data;

        }
    }

    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int data) {
        // Write code to push data to the stack.
        StackNode newStackNode = new StackNode(data);
        if (root == null) {
            //If nothing is present in the list make the current element the root node
            root = newStackNode;
        } else {
            //If List is not empty, push the incoming element at the start of the list
            StackNode temp = root;
            root = newStackNode;
            newStackNode = temp;
        }
        System.out.println(data + " pushed to the stack");
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        //Initialize a minValue with the lowest most value
        int minValue = Integer.MIN_VALUE;
        if (root == null) {
            //If there is no element in list
            System.out.println("Stack Underflow");
            return 0;
        } else {
            //if value present remove the data in the front of the list because stack is LIFO
            minValue = root.data;
            //make the 2nd element in the list the root element
            root = root.next;
        }
        return minValue;
    }

    public int peek() {
        if (root == null) {
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        } else {
            // return the topmost element without removing it.
            return root.data;
        }
    }

    // Driver code
    public static void main(String[] args) {

        Exercise_2 sll = new Exercise_2();
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
