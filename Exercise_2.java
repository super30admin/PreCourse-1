public class StackAsLinkedList { 
  private StackNode root;


    public StackAsLinkedList(){
        this.root = null;
    }
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
        return (root == null);
    }

    public void push(int data)
    {
        StackNode node = new StackNode(data);

        node.next = root;
        root = node;

    }

    public int pop()
    {
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;//If Stack Empty Return 0 and print "Stack Underflow"
        }else{
           int root = peek();
           this.root = (this.root).next;
           return root;

        }
       
    } 
	 public int peek()
    {
        if(!isEmpty()){
            return root.data;
        }else
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
