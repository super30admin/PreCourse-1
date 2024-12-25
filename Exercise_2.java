class StackAsLinkedList {

    StackNode head;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            this.data = data;
            //Constructor here
        }
    }


    public boolean isEmpty()
    {
        return head == null;
    }

    public void push(int data)
    {
        StackNode newNode = new StackNode(data);
        if(isEmpty()){
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public int pop()
    {
        if(!isEmpty()){
            int val = head.data;
            if(head.next != null){
                head = head.next;
            }else{
                head = null;
            }
            return val;
        }
        return -1;
    }

    public int peek()
    {
        return head.data;
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
