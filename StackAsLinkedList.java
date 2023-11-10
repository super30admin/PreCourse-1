// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

/*
Implemented stack operations using a LinkedList data structure
 */
public class StackAsLinkedList {
  
    StackNode head;
  
    static class StackNode { 
        int data; 
        StackNode next;
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
        } 
    }

    StackAsLinkedList() {
        this.head = null;
    }
	
    public boolean isEmpty() 
    { 
        return head == null;
    } 
  
    public void push(int data) 
    { 
        StackNode node = new StackNode(data);
        node.next = head;
        head = node;
    }

    //If Stack Empty Return 0 and print "Stack Underflow"
    //Write code to pop the topmost element of stack.
    //Also return the popped element
    public int pop() 
    {
        if(head == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int val = head.data;
        head = head.next;
        return val;
    }

    //Write code to just return the topmost element without removing it.
    public int peek() 
    { 
        return head.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList();
        System.out.println(sll.pop() + " popped from stack");
        sll.push(10); 
        sll.push(20); 
        sll.push(30);

        System.out.println("Top element is " + sll.peek());

        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());
    } 
} 
