//Space Complexity = O(n)
//Time Complexity = O(1)

public class StackAsLinkedList { 
  
    StackNode root;
    
    StackAsLinkedList()
    {
    	this.root = null;
    }
    
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
        	this.data = data; 
        } 
    } 
	
    public boolean isEmpty() 
    { 
    	return (root == null);
    } 
  
    public void push(int data) 
    { 
    	StackNode temp = new StackNode(data);
    	temp.next = root;
    	root = temp;
    } 
  
    public int pop() 
    { 	
    	if (root == null) 
    	{
            System.out.print("\nStack Underflow");
            return 0;
        }
    	
    	int x = root.data; 
    	root = (root).next;
    	return x;
    } 
  
    public int peek() 
    { 

    	if (!isEmpty()) 
    	{
            return root.data;
        }
        else 
        {
            return -1;
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
