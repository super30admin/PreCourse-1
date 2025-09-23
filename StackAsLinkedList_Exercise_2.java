// Time Complexity : O(1) for push, O(1) for pop, O(1) for peek
// Space Complexity : O(n) as we occupy a memory worth n elements pushed/added to linked list

public class StackAsLinkedList { 
    StackNode head; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
        } 
    } 
	
    public boolean isEmpty() 
    { 
        return head == null;
    } 
  
    public void push(int data) 
    { 
        StackNode newNode = new StackNode(data);
        newNode.next = head;
        head = newNode;
    } 
  
    public int pop() 
    { 	
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int value = head.data;
        head = head.next;
        return value;
    } 
  
    public int peek() 
    { 
        return this.head.data;
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
