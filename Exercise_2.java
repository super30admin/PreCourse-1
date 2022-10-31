//Time Complexity - O(n)
//Space Complexity - O(n)
public class StackAsLinkedList {

    StackNode root;
    int sizeOFStack =0;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data = data;
        }
        public int getData(){
            return data;

        }
        public void setData(int data){
            this.data=data;

        }
        public StackNode getNext(){
            return next;

        }
        public void setNext(StackNode next){
            this.next= next;

        }

    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        if(sizeOFStack == 0){
            return true;
        }
        return false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        newNode.setNext(root);
        root=newNode;
        sizeOFStack++;
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(isEmpty()){

            return 0;
        }
        StackNode newPop = root;
        root = root.getNext();
        sizeOFStack--;
        return newPop.getData();
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.

        if(isEmpty()){
            return 0;

        }
        else{
            return root.getData();
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