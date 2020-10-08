public class StackAsLinkedList { 
  
    StackNode root; 
  
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
        return (root == null);
    } 
  
    public void push(int data) 
    { 
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
        System.out.println("Pushed element "+ root.data +" on the stack");

    } 
  
    public int pop() 
    {
        if(root == null){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            int val = root.data;
            root = root.next;
            return val;
        }
    } 
  
    public int peek() 
    {
        if(root == null){
            System.out.println("Stack underflow");
            return 0;
        }
        else {
            return root.data;
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
