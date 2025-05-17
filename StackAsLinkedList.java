
//TC-O(N) SC-(1)
public class StackAsLinkedList {

    StackNode root;

   class StackNode {
        int data;
       StackNode next;
        StackNode(int data)
        {
           this.data = data;
            this.next = null;
        }
    }


    public boolean isEmpty()
    {
        return root == null;
    }

    public void push(int data)
    {
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
    }

    public int pop()
    {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int popped = root.data;
            root = root.next;
            return popped;
        }
    }

    public int peek()
    {
         if (isEmpty()){
                System.out.println("Stack is empty");
                return 0;
            } else {
                return root.data;
            }
        }


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