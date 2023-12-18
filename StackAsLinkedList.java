public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data)
        {
            this.data=data;
        } 
    } 
    
	
    public boolean isEmpty() 
    {
        return (root==null);
    } 
  
    public void push(int data) 
    {
        StackNode node = new StackNode(data);
        if(root==null){
            root=node;
        }
        else{
            node.next=root;
            root=node;
            System.out.println("Root node is: " + root.data);
        }
    }

  
    public int pop() {
        //storing the top value
        if (isEmpty()) {
            return 0;
        } else {
            int result = root.data;
            root = root.next;
            return result;
        }
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
