public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return root == null; 
    } 
  
    public void push(int data) 
    { 
        StackAsLinkedList.StackNode temp = new StackAsLinkedList.StackNode(data);
        temp.data = data;
        temp.next = root;
        root = temp; 
    } 
  
    public int pop() 
    { 	
	if (isEmpty()) 
    	{
			System.out.println("Stack is empty");
			return 0;
	}
	int value = root.data;
	root = root.next; 
	return value;
    } 
  
    public int peek() 
    { 
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
