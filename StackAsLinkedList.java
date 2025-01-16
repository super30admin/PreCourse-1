/*
Space Complexity
O(n) n is the number of elements in the stack

Time Complexity
isEmpty     O(1)
push(int data) O(1)
pop()       O(1)
peek()      O(1)
*/
public class StackAsLinkedList {

    StackNode root;

    StackAsLinkedList(){
        root=null;
    }

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data=data;
            this.next=null;
        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        if(root==null){
            System.out.println("Stack Underflow");
            return true;
        }
        return false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode newNode=new StackNode(data);
        if(newNode==null){
            System.out.println("Stack Overflow");
            return;
        }
        newNode.next=root;
        System.out.println(newNode.data+" is pushed onto the stack");
        root=newNode;
    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(isEmpty()){
            return 0;
        }
        StackNode temp= root;
        root=root.next;
        return temp.data;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            return 0;
        }
        return root.data;
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
