public class StackAsLinkedList { 
  
    StackNode root; 
  
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
        StackNode newNode = new StackNode(data);
        if(isEmpty)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    } 
  
    public int pop() 
    { 	
	  if(isEmpty())
      {
        Console.Writeline("Stack Underflow");
        return 0;
      }
      else
      {
        head = head.next;
        return 1;
      }

    } 
  
    public int peek() 
    { 
        if(isEmpty())
      {
        Console.Writeline("Stack Underflow");
        return 0;
      }
      else
      {
        return head.data;
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
