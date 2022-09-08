// Time Complexity :
//Push is O(N)
//Pop is O(N)
//Peek is O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Static class was not able to access non static functions hence I made my own class
class StackNode{
    int val;
    StackNode next;
    StackNode (int x){val = x;}
}

public class StackAsLinkedList {
    int size;
    StackNode head;
    StackNode top = head;

    StackAsLinkedList() {
        size = 0;
        head = new StackNode(0);
    }
    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        if (head.next == null){
            return true;
        }
        else
            return false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode currnode = head;
        if(currnode.next == null){
            currnode = new StackNode(data);
            head.next = currnode;
            currnode.next = null;
            top = currnode;
            size++;
        }
        else{
            currnode = new StackNode(data);
            StackNode temp = head;
            for(int i = 0; i <= size; i++){
                if(temp.next == null){
                    temp.next = currnode;
                    currnode.next = null;
                    top = currnode;
                }
                else{
                    temp = temp.next;
                }
            }
            size++;
        }
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(head.next == null){
            //System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int popedelement = top.val;
            StackNode temp = head;
            //System.out.println(temp.val);
            for(int i = 0; i < size; i++){
                //System.out.println(temp.val);
                if(temp.next == top){
                    top = temp;
                    temp.next = null;
                    size--;
                }
                else{
                    temp = temp.next;
                }
            }
            //System.out.println(top.val);
            return popedelement;
        }
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if (isEmpty()){
            System.out.println("Stack empty");
            return 0;
        }
        else{
            return top.val;
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

