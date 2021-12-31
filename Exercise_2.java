 //Time Complexity is O(1).
 //Space Complexity is O(n)

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
    
    public boolean isEmpty() 
    { 
        return head == null;
    } 
  
    public void push(int data) 
    { 
        StackNode temp = new StackNode(data);
        temp.next = head;
        head = temp;
    } 
  
    public int pop() 
    { 
        int tempval = head.data;
        head = head.next;
        return tempval;
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
