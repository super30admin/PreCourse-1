/**
 * Space complexity is O(n). n is the number of elements.
 * 
 * Time complexity
 * O(1) for isEmpty peek and push
 * O(n) for pop as the entire list needs to be traversed.
 */


class StackAsLinkedList { 
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
        } 
    } 

    StackNode head;
    StackNode tail;
    StackAsLinkedList() {
        StackNode dummyNode = new StackNode(-1);
        dummyNode.next = null;
        head = dummyNode;
        tail = dummyNode;
    }
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        
        return head.next == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode node = new StackNode(data);
        tail.next = node;
        tail = node;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(head.next == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int result = tail.data;
        StackNode node = head;
        while(node.next != tail) {
            node = node.next;
        }
        node.next = null;
        tail = node;
        return result;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        return tail.data;
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
